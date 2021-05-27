package JavaExchange.co.hipe.engine;

import java.io.File;
import java.io.IOException;

import java.text.DecimalFormat;
import java.lang.Thread;
import java.time.Duration;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import static akka.pattern.Patterns.ask;

import JavaExchange.co.hipe.engine.actor.NotificationActor;
import JavaExchange.co.hipe.engine.actor.DispatchActor;
import JavaExchange.co.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__CO_1_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__CO_8_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__CO_15_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__CO_22_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__CO_29_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__CO_39_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__CO_46_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__CO_53_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.SimplePackage2SimplePackageRule__CO_60_localSearch;
import JavaExchange.co.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__CO_64_localSearch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import hipe.engine.IHiPEEngine;
import hipe.engine.message.InitActor;
import hipe.engine.message.InitGenActor;
import hipe.engine.message.InitGenReferenceActor;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.NotificationMessage;
import hipe.engine.message.ExtractData;
import hipe.engine.message.production.ProductionResult;

import hipe.engine.util.IncUtil;
import hipe.engine.util.ProductionUtil;
import hipe.generic.actor.GenericObjectActor;
import hipe.generic.actor.GenericReferenceActor;
import hipe.generic.actor.GenericProductionActor;
import hipe.generic.actor.junction.*;
import hipe.generic.actor.junction.util.HiPEConfig;

import hipe.network.*;

public class HiPEEngine implements IHiPEEngine{

	private final ActorSystem system = ActorSystem.create("HiPE-Engine");
	private ActorRef dispatcher;
	private ActorRef notificationActor;

	private Map<String, NetworkNode> name2node = new HashMap<>();
	
	private Map<String, ActorRef> name2actor = new ConcurrentHashMap<>();
	private Map<String, InitGenReferenceActor<?,?>> name2initRefGen = new ConcurrentHashMap<>();
	private Map<String, Class<?>> classes = new ConcurrentHashMap<>();
	private Map<String, String> productionNodes2pattern = new ConcurrentHashMap<>();
	private boolean dirty = false;
	private HiPENetwork network;
	
	final private IncUtil incUtil = new IncUtil();
	final private ProductionUtil prodUtil = new ProductionUtil();
	
	private long time = 0;
	private int counter = 0;
	
	private Thread thread;
	
	public HiPEEngine(HiPENetwork network) {
		thread = Thread.currentThread();
		incUtil.registerWakeUpCall(this::wakeUp);
		
		this.network = network;
	}
	
	public HiPEEngine() {
		thread = Thread.currentThread();
		incUtil.registerWakeUpCall(this::wakeUp);
		
		loadNetwork();
	}
	
	public void loadNetwork() {
		ResourceSet rs = new ResourceSetImpl();
		String cp = "";
		
		String path = getClass().getProtectionDomain().getCodeSource().getLocation().getPath().toString();
		// fix that is necessary if executed in an eclipse plugin context
		if(!path.contains("bin/"))
			path += "bin/";
		path += getClass().getPackageName().replace(".", "/") + "/" + "hipe-network.xmi";
		
		File file = new File(path);
		
		try {
			 cp = file.getCanonicalPath();
			 cp = cp.replace("%20", " ");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		URI uri = URI.createFileURI(cp);
		Resource r = rs.createResource(uri);

		try {
			r.load(null);
			network = (HiPENetwork) r.getContents().get(0);
		} catch(Exception e) {
			throw new RuntimeException("Network file could not be loaded via " + uri);	
		}
	}
	
	public boolean wakeUp() {
		thread.interrupt();
		return true;
	}
	
	public void initialize() throws InterruptedException {
		network.getNetworknode().stream().forEach(n -> name2node.put(n.getName(), n));
		
		createProductionNodes();
		createJunctionNodes();
		createReferenceNodes();
		createObjectNodes();

		initializeReferenceNodes();

		classes.keySet().parallelStream().forEach(name -> {
			name2actor.put(name, system.actorOf(Props.create(classes.get(name))));			
		});
		
		dispatcher = system.actorOf(
				Props.create(DispatchActor.class, () -> new DispatchActor(name2actor, incUtil)),
				"DispatchActor");
		
		notificationActor = system.actorOf(Props.create(NotificationActor.class, () -> new NotificationActor(dispatcher, incUtil)), "NotificationActor");
		
		name2actor.values().forEach(actor -> actor.tell(new InitActor(name2actor), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ObjectNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ReferenceNode).forEach(n -> name2actor.get(n.getName()).tell(name2initRefGen.get(n.getName()), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof AbstractJunctionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		network.getNetworknode().stream().filter(n -> n instanceof ProductionNode).forEach(n -> name2actor.get(n.getName()).tell(new InitGenActor(name2actor, n, prodUtil, incUtil), notificationActor));
		}
	
	public void createProductionNodes() {
		classes.put("FieldType2FieldTypeRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__CO_production", "FieldType2FieldTypeRule__CO");
		classes.put("GenericType2GenericTypeRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__CO_production", "GenericType2GenericTypeRule__CO");
		classes.put("ParamType2ParamTypeRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__CO_production", "ParamType2ParamTypeRule__CO");
		classes.put("PrimitiveType2PrimitiveTypeRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__CO_production", "PrimitiveType2PrimitiveTypeRule__CO");
		classes.put("SecondTypeRef2SecondTypeRefRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__CO_production", "SecondTypeRef2SecondTypeRefRule__CO");
		classes.put("SimpleClass2SimpleClassRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__CO_production", "SimpleClass2SimpleClassRule__CO");
		classes.put("SimpleField2SimpleFieldRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__CO_production", "SimpleField2SimpleFieldRule__CO");
		classes.put("SimpleMethod2SimpleMethodRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__CO_production", "SimpleMethod2SimpleMethodRule__CO");
		classes.put("SimplePackage2SimplePackageRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__CO_production", "SimplePackage2SimplePackageRule__CO");
		classes.put("SimpleParam2SimpleParamRule__CO_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__CO_production", "SimpleParam2SimpleParamRule__CO");
		
	}
	
	public void createJunctionNodes() {
		classes.put("FieldType2FieldTypeRule__CO_1_localSearch", FieldType2FieldTypeRule__CO_1_localSearch.class);
		classes.put("GenericType2GenericTypeRule__CO_8_localSearch", GenericType2GenericTypeRule__CO_8_localSearch.class);
		classes.put("ParamType2ParamTypeRule__CO_15_localSearch", ParamType2ParamTypeRule__CO_15_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__CO_22_localSearch", PrimitiveType2PrimitiveTypeRule__CO_22_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__CO_29_localSearch", SecondTypeRef2SecondTypeRefRule__CO_29_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__CO_39_localSearch", SimpleClass2SimpleClassRule__CO_39_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__CO_46_localSearch", SimpleField2SimpleFieldRule__CO_46_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__CO_53_localSearch", SimpleMethod2SimpleMethodRule__CO_53_localSearch.class);
		classes.put("SimplePackage2SimplePackageRule__CO_60_localSearch", SimplePackage2SimplePackageRule__CO_60_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__CO_64_localSearch", SimpleParam2SimpleParamRule__CO_64_localSearch.class);
	}
	
	public void createReferenceNodes() {
		
	}
	
	public void createObjectNodes() {
		classes.put("SimpleField2SimpleField_object",SimpleField2SimpleField_object.class);
		classes.put("SimpleField_object",SimpleField_object.class);
		classes.put("Type2Type_object",Type2Type_object.class);
		classes.put("JvmGenericType_object",JvmGenericType_object.class);
		classes.put("SimpleParam2SimpleParam_object",SimpleParam2SimpleParam_object.class);
		classes.put("SimpleParam_object",SimpleParam_object.class);
		classes.put("JvmPrimitiveType_object",JvmPrimitiveType_object.class);
		classes.put("JvmType_object",JvmType_object.class);
		classes.put("SimplePackage2SimplePackage_object",SimplePackage2SimplePackage_object.class);
		classes.put("SimplePackage_object",SimplePackage_object.class);
		classes.put("SimpleClass2SimpleClass_object",SimpleClass2SimpleClass_object.class);
		classes.put("SimpleClass_object",SimpleClass_object.class);
		classes.put("SimpleMethod2SimpleMethod_object",SimpleMethod2SimpleMethod_object.class);
		classes.put("SimpleMethod_object",SimpleMethod_object.class);
		classes.put("TypeRef2TypeRef_object_SP0",TypeRef2TypeRef_object_SP0.class);
		classes.put("TypeRef2TypeRef_object_SP1",TypeRef2TypeRef_object_SP1.class);
		classes.put("JvmParameterizedTypeReference_object_SP0",JvmParameterizedTypeReference_object_SP0.class);
		classes.put("JvmParameterizedTypeReference_object_SP1",JvmParameterizedTypeReference_object_SP1.class);
		
	}
	
	public void initializeReferenceNodes() {
	}
	
	/**
	 * delegate notifications to dispatcher actor
	 * @param notification
	 */			
	public void handleNotification(Notification notification) {
		try {
			dirty = true;
			ask(notificationActor, new NotificationMessage(notification), Duration.ofHours(24)).toCompletableFuture().get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}			
	}
	
	public Map<String, ProductionResult> extractData() throws InterruptedException {
		if(!dirty) {
			return java.util.Collections.synchronizedMap(new HashMap<>());
		}	
		
		long tic = System.nanoTime();
		counter++;
		
		dirty = false;
		
		notificationActor.tell(new NoMoreInput(), notificationActor);
		
		try {
			Thread.sleep(100000000);
		} catch(Exception e) {
		}
		
		Map<String, ProductionResult> productionResults = prodUtil.getProductionResults();
				
		incUtil.clean();
		prodUtil.clean();
		
		time += System.nanoTime() - tic;
		
		return productionResults;
	}
	
	public void terminate() {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("HiPEEngine" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
						
		system.terminate();	
	}
	
}

class SimpleField2SimpleField_object extends GenericObjectActor<JavaExchange.SimpleField2SimpleField> { }
class SimpleField_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleField> { }
class Type2Type_object extends GenericObjectActor<JavaExchange.Type2Type> { }
class JvmGenericType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmGenericType> { }
class SimpleParam2SimpleParam_object extends GenericObjectActor<JavaExchange.SimpleParam2SimpleParam> { }
class SimpleParam_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleParam> { }
class JvmPrimitiveType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmPrimitiveType> { }
class JvmType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmType> { }
class SimplePackage2SimplePackage_object extends GenericObjectActor<JavaExchange.SimplePackage2SimplePackage> { }
class SimplePackage_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimplePackage> { }
class SimpleClass2SimpleClass_object extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClass> { }
class SimpleClass_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleMethod2SimpleMethod_object extends GenericObjectActor<JavaExchange.SimpleMethod2SimpleMethod> { }
class SimpleMethod_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleMethod> { }
class TypeRef2TypeRef_object_SP0 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class TypeRef2TypeRef_object_SP1 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class JvmParameterizedTypeReference_object_SP0 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP1 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }


