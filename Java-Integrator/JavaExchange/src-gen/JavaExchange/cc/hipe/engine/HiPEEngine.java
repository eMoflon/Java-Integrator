package JavaExchange.cc.hipe.engine;

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

import JavaExchange.cc.hipe.engine.actor.NotificationActor;
import JavaExchange.cc.hipe.engine.actor.DispatchActor;
import JavaExchange.cc.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__CC_1_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__CONSISTENCY_7_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__CC_15_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__CONSISTENCY_21_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__CC_29_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__CONSISTENCY_35_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__CC_43_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__CONSISTENCY_49_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__CC_57_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__CONSISTENCY_67_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__CC_78_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__CONSISTENCY_84_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__CC_92_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__CONSISTENCY_98_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__CC_106_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__CONSISTENCY_112_localSearch;
import JavaExchange.cc.hipe.engine.actor.junction.SimplePackage2SimplePackageRule__CC_120_junction;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimplePackage2SimplePackageRule__CONSISTENCY_123_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__CC_128_localSearch;
import JavaExchange.cc.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__CONSISTENCY_134_localSearch;

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
		classes.put("FieldType2FieldTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__CC_production", "FieldType2FieldTypeRule__CC");
		classes.put("FieldType2FieldTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__CONSISTENCY_production", "FieldType2FieldTypeRule__CONSISTENCY");
		classes.put("GenericType2GenericTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__CC_production", "GenericType2GenericTypeRule__CC");
		classes.put("GenericType2GenericTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__CONSISTENCY_production", "GenericType2GenericTypeRule__CONSISTENCY");
		classes.put("ParamType2ParamTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__CC_production", "ParamType2ParamTypeRule__CC");
		classes.put("ParamType2ParamTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__CONSISTENCY_production", "ParamType2ParamTypeRule__CONSISTENCY");
		classes.put("PrimitiveType2PrimitiveTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__CC_production", "PrimitiveType2PrimitiveTypeRule__CC");
		classes.put("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_production", "PrimitiveType2PrimitiveTypeRule__CONSISTENCY");
		classes.put("SecondTypeRef2SecondTypeRefRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__CC_production", "SecondTypeRef2SecondTypeRefRule__CC");
		classes.put("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_production", "SecondTypeRef2SecondTypeRefRule__CONSISTENCY");
		classes.put("SimpleClass2SimpleClassRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__CC_production", "SimpleClass2SimpleClassRule__CC");
		classes.put("SimpleClass2SimpleClassRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__CONSISTENCY_production", "SimpleClass2SimpleClassRule__CONSISTENCY");
		classes.put("SimpleField2SimpleFieldRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__CC_production", "SimpleField2SimpleFieldRule__CC");
		classes.put("SimpleField2SimpleFieldRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__CONSISTENCY_production", "SimpleField2SimpleFieldRule__CONSISTENCY");
		classes.put("SimpleMethod2SimpleMethodRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__CC_production", "SimpleMethod2SimpleMethodRule__CC");
		classes.put("SimpleMethod2SimpleMethodRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__CONSISTENCY_production", "SimpleMethod2SimpleMethodRule__CONSISTENCY");
		classes.put("SimplePackage2SimplePackageRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__CC_production", "SimplePackage2SimplePackageRule__CC");
		classes.put("SimplePackage2SimplePackageRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__CONSISTENCY_production", "SimplePackage2SimplePackageRule__CONSISTENCY");
		classes.put("SimpleParam2SimpleParamRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__CC_production", "SimpleParam2SimpleParamRule__CC");
		classes.put("SimpleParam2SimpleParamRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__CONSISTENCY_production", "SimpleParam2SimpleParamRule__CONSISTENCY");
		
	}
	
	public void createJunctionNodes() {
		classes.put("FieldType2FieldTypeRule__CC_1_localSearch", FieldType2FieldTypeRule__CC_1_localSearch.class);
		classes.put("FieldType2FieldTypeRule__CONSISTENCY_7_localSearch", FieldType2FieldTypeRule__CONSISTENCY_7_localSearch.class);
		classes.put("GenericType2GenericTypeRule__CC_15_localSearch", GenericType2GenericTypeRule__CC_15_localSearch.class);
		classes.put("GenericType2GenericTypeRule__CONSISTENCY_21_localSearch", GenericType2GenericTypeRule__CONSISTENCY_21_localSearch.class);
		classes.put("ParamType2ParamTypeRule__CC_29_localSearch", ParamType2ParamTypeRule__CC_29_localSearch.class);
		classes.put("ParamType2ParamTypeRule__CONSISTENCY_35_localSearch", ParamType2ParamTypeRule__CONSISTENCY_35_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__CC_43_localSearch", PrimitiveType2PrimitiveTypeRule__CC_43_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_49_localSearch", PrimitiveType2PrimitiveTypeRule__CONSISTENCY_49_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__CC_57_localSearch", SecondTypeRef2SecondTypeRefRule__CC_57_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_67_localSearch", SecondTypeRef2SecondTypeRefRule__CONSISTENCY_67_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__CC_78_localSearch", SimpleClass2SimpleClassRule__CC_78_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__CONSISTENCY_84_localSearch", SimpleClass2SimpleClassRule__CONSISTENCY_84_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__CC_92_localSearch", SimpleField2SimpleFieldRule__CC_92_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__CONSISTENCY_98_localSearch", SimpleField2SimpleFieldRule__CONSISTENCY_98_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__CC_106_localSearch", SimpleMethod2SimpleMethodRule__CC_106_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__CONSISTENCY_112_localSearch", SimpleMethod2SimpleMethodRule__CONSISTENCY_112_localSearch.class);
		classes.put("SimplePackage2SimplePackageRule__CC_120_junction", SimplePackage2SimplePackageRule__CC_120_junction.class);
		classes.put("SimplePackage2SimplePackageRule__CONSISTENCY_123_localSearch", SimplePackage2SimplePackageRule__CONSISTENCY_123_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__CC_128_localSearch", SimpleParam2SimpleParamRule__CC_128_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__CONSISTENCY_134_localSearch", SimpleParam2SimpleParamRule__CONSISTENCY_134_localSearch.class);
	}
	
	public void createReferenceNodes() {
		
	}
	
	public void createObjectNodes() {
		classes.put("SimpleField2SimpleField_object",SimpleField2SimpleField_object.class);
		classes.put("SimpleField_object",SimpleField_object.class);
		classes.put("FieldType2FieldTypeRule__Marker_object",FieldType2FieldTypeRule__Marker_object.class);
		classes.put("JvmGenericType_object",JvmGenericType_object.class);
		classes.put("Type2Type_object",Type2Type_object.class);
		classes.put("GenericType2GenericTypeRule__Marker_object",GenericType2GenericTypeRule__Marker_object.class);
		classes.put("SimpleParam2SimpleParam_object",SimpleParam2SimpleParam_object.class);
		classes.put("SimpleParam_object",SimpleParam_object.class);
		classes.put("ParamType2ParamTypeRule__Marker_object",ParamType2ParamTypeRule__Marker_object.class);
		classes.put("JvmPrimitiveType_object",JvmPrimitiveType_object.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__Marker_object",PrimitiveType2PrimitiveTypeRule__Marker_object.class);
		classes.put("JvmType_object",JvmType_object.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__Marker_object",SecondTypeRef2SecondTypeRefRule__Marker_object.class);
		classes.put("SimplePackage2SimplePackage_object",SimplePackage2SimplePackage_object.class);
		classes.put("SimpleClass2SimpleClassRule__Marker_object",SimpleClass2SimpleClassRule__Marker_object.class);
		classes.put("SimpleField2SimpleFieldRule__Marker_object",SimpleField2SimpleFieldRule__Marker_object.class);
		classes.put("SimpleMethod_object",SimpleMethod_object.class);
		classes.put("SimpleMethod2SimpleMethod_object",SimpleMethod2SimpleMethod_object.class);
		classes.put("SimpleMethod2SimpleMethodRule__Marker_object",SimpleMethod2SimpleMethodRule__Marker_object.class);
		classes.put("SimplePackage2SimplePackageRule__Marker_object",SimplePackage2SimplePackageRule__Marker_object.class);
		classes.put("SimpleParam2SimpleParamRule__Marker_object",SimpleParam2SimpleParamRule__Marker_object.class);
		classes.put("JvmParameterizedTypeReference_object_SP0",JvmParameterizedTypeReference_object_SP0.class);
		classes.put("JvmParameterizedTypeReference_object_SP1",JvmParameterizedTypeReference_object_SP1.class);
		classes.put("JvmParameterizedTypeReference_object_SP2",JvmParameterizedTypeReference_object_SP2.class);
		classes.put("TypeRef2TypeRef_object_SP0",TypeRef2TypeRef_object_SP0.class);
		classes.put("TypeRef2TypeRef_object_SP1",TypeRef2TypeRef_object_SP1.class);
		classes.put("SimplePackage_object_SP0",SimplePackage_object_SP0.class);
		classes.put("SimplePackage_object_SP1",SimplePackage_object_SP1.class);
		classes.put("SimpleClass_object_SP0",SimpleClass_object_SP0.class);
		classes.put("SimpleClass_object_SP1",SimpleClass_object_SP1.class);
		classes.put("SimpleClass2SimpleClass_object_SP0",SimpleClass2SimpleClass_object_SP0.class);
		classes.put("SimpleClass2SimpleClass_object_SP1",SimpleClass2SimpleClass_object_SP1.class);
		
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
class FieldType2FieldTypeRule__Marker_object extends GenericObjectActor<JavaExchange.FieldType2FieldTypeRule__Marker> { }
class JvmGenericType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmGenericType> { }
class Type2Type_object extends GenericObjectActor<JavaExchange.Type2Type> { }
class GenericType2GenericTypeRule__Marker_object extends GenericObjectActor<JavaExchange.GenericType2GenericTypeRule__Marker> { }
class SimpleParam2SimpleParam_object extends GenericObjectActor<JavaExchange.SimpleParam2SimpleParam> { }
class SimpleParam_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleParam> { }
class ParamType2ParamTypeRule__Marker_object extends GenericObjectActor<JavaExchange.ParamType2ParamTypeRule__Marker> { }
class JvmPrimitiveType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmPrimitiveType> { }
class PrimitiveType2PrimitiveTypeRule__Marker_object extends GenericObjectActor<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker> { }
class JvmType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmType> { }
class SecondTypeRef2SecondTypeRefRule__Marker_object extends GenericObjectActor<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker> { }
class SimplePackage2SimplePackage_object extends GenericObjectActor<JavaExchange.SimplePackage2SimplePackage> { }
class SimpleClass2SimpleClassRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClassRule__Marker> { }
class SimpleField2SimpleFieldRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleField2SimpleFieldRule__Marker> { }
class SimpleMethod_object extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleMethod> { }
class SimpleMethod2SimpleMethod_object extends GenericObjectActor<JavaExchange.SimpleMethod2SimpleMethod> { }
class SimpleMethod2SimpleMethodRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleMethod2SimpleMethodRule__Marker> { }
class SimplePackage2SimplePackageRule__Marker_object extends GenericObjectActor<JavaExchange.SimplePackage2SimplePackageRule__Marker> { }
class SimpleParam2SimpleParamRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleParam2SimpleParamRule__Marker> { }
class JvmParameterizedTypeReference_object_SP0 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP1 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP2 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class TypeRef2TypeRef_object_SP0 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class TypeRef2TypeRef_object_SP1 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class SimplePackage_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimplePackage> { }
class SimplePackage_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimplePackage> { }
class SimpleClass_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleClass_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleClass2SimpleClass_object_SP0 extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClass> { }
class SimpleClass2SimpleClass_object_SP1 extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClass> { }


