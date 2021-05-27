package JavaExchange.integrate.hipe.engine;

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

import JavaExchange.integrate.hipe.engine.actor.NotificationActor;
import JavaExchange.integrate.hipe.engine.actor.DispatchActor;
import JavaExchange.integrate.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__TRG_1_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__BWD_4_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__CC_7_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__SRC_13_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__FWD_16_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.FieldType2FieldTypeRule__CONSISTENCY_19_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__TRG_22_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__BWD_25_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__CC_28_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__SRC_34_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__FWD_37_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.GenericType2GenericTypeRule__CONSISTENCY_40_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__TRG_43_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__BWD_46_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__CC_49_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__SRC_55_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__FWD_58_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.ParamType2ParamTypeRule__CONSISTENCY_61_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__TRG_64_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__CC_70_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__SRC_76_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__CC_96_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__TRG_119_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__BWD_122_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__CC_125_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__SRC_131_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__FWD_134_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__TRG_140_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__BWD_143_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__CC_146_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__SRC_152_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__FWD_155_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__TRG_161_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__BWD_164_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__CC_167_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__SRC_173_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__FWD_176_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch;
import JavaExchange.integrate.hipe.engine.actor.junction.SimplePackage2SimplePackageRule__CC_183_junction;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__TRG_190_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__BWD_193_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__CC_196_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__SRC_202_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__FWD_205_localSearch;
import JavaExchange.integrate.hipe.engine.actor.localsearch.SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch;

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
		classes.put("FieldType2FieldTypeRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__BWD_production", "FieldType2FieldTypeRule__BWD");
		classes.put("FieldType2FieldTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__CC_production", "FieldType2FieldTypeRule__CC");
		classes.put("FieldType2FieldTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__CONSISTENCY_production", "FieldType2FieldTypeRule__CONSISTENCY");
		classes.put("FieldType2FieldTypeRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__FWD_production", "FieldType2FieldTypeRule__FWD");
		classes.put("FieldType2FieldTypeRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__SRC_production", "FieldType2FieldTypeRule__SRC");
		classes.put("FieldType2FieldTypeRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("FieldType2FieldTypeRule__TRG_production", "FieldType2FieldTypeRule__TRG");
		classes.put("GenericType2GenericTypeRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__BWD_production", "GenericType2GenericTypeRule__BWD");
		classes.put("GenericType2GenericTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__CC_production", "GenericType2GenericTypeRule__CC");
		classes.put("GenericType2GenericTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__CONSISTENCY_production", "GenericType2GenericTypeRule__CONSISTENCY");
		classes.put("GenericType2GenericTypeRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__FWD_production", "GenericType2GenericTypeRule__FWD");
		classes.put("GenericType2GenericTypeRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__SRC_production", "GenericType2GenericTypeRule__SRC");
		classes.put("GenericType2GenericTypeRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("GenericType2GenericTypeRule__TRG_production", "GenericType2GenericTypeRule__TRG");
		classes.put("ParamType2ParamTypeRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__BWD_production", "ParamType2ParamTypeRule__BWD");
		classes.put("ParamType2ParamTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__CC_production", "ParamType2ParamTypeRule__CC");
		classes.put("ParamType2ParamTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__CONSISTENCY_production", "ParamType2ParamTypeRule__CONSISTENCY");
		classes.put("ParamType2ParamTypeRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__FWD_production", "ParamType2ParamTypeRule__FWD");
		classes.put("ParamType2ParamTypeRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__SRC_production", "ParamType2ParamTypeRule__SRC");
		classes.put("ParamType2ParamTypeRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("ParamType2ParamTypeRule__TRG_production", "ParamType2ParamTypeRule__TRG");
		classes.put("PrimitiveType2PrimitiveTypeRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__BWD_production", "PrimitiveType2PrimitiveTypeRule__BWD");
		classes.put("PrimitiveType2PrimitiveTypeRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__CC_production", "PrimitiveType2PrimitiveTypeRule__CC");
		classes.put("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_production", "PrimitiveType2PrimitiveTypeRule__CONSISTENCY");
		classes.put("PrimitiveType2PrimitiveTypeRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__FWD_production", "PrimitiveType2PrimitiveTypeRule__FWD");
		classes.put("PrimitiveType2PrimitiveTypeRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__SRC_production", "PrimitiveType2PrimitiveTypeRule__SRC");
		classes.put("PrimitiveType2PrimitiveTypeRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("PrimitiveType2PrimitiveTypeRule__TRG_production", "PrimitiveType2PrimitiveTypeRule__TRG");
		classes.put("SecondTypeRef2SecondTypeRefRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__BWD_production", "SecondTypeRef2SecondTypeRefRule__BWD");
		classes.put("SecondTypeRef2SecondTypeRefRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__CC_production", "SecondTypeRef2SecondTypeRefRule__CC");
		classes.put("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_production", "SecondTypeRef2SecondTypeRefRule__CONSISTENCY");
		classes.put("SecondTypeRef2SecondTypeRefRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__FWD_production", "SecondTypeRef2SecondTypeRefRule__FWD");
		classes.put("SecondTypeRef2SecondTypeRefRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__SRC_production", "SecondTypeRef2SecondTypeRefRule__SRC");
		classes.put("SecondTypeRef2SecondTypeRefRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("SecondTypeRef2SecondTypeRefRule__TRG_production", "SecondTypeRef2SecondTypeRefRule__TRG");
		classes.put("SimpleClass2SimpleClassRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__BWD_production", "SimpleClass2SimpleClassRule__BWD");
		classes.put("SimpleClass2SimpleClassRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__CC_production", "SimpleClass2SimpleClassRule__CC");
		classes.put("SimpleClass2SimpleClassRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__CONSISTENCY_production", "SimpleClass2SimpleClassRule__CONSISTENCY");
		classes.put("SimpleClass2SimpleClassRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__FWD_production", "SimpleClass2SimpleClassRule__FWD");
		classes.put("SimpleClass2SimpleClassRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__SRC_production", "SimpleClass2SimpleClassRule__SRC");
		classes.put("SimpleClass2SimpleClassRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleClass2SimpleClassRule__TRG_production", "SimpleClass2SimpleClassRule__TRG");
		classes.put("SimpleField2SimpleFieldRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__BWD_production", "SimpleField2SimpleFieldRule__BWD");
		classes.put("SimpleField2SimpleFieldRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__CC_production", "SimpleField2SimpleFieldRule__CC");
		classes.put("SimpleField2SimpleFieldRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__CONSISTENCY_production", "SimpleField2SimpleFieldRule__CONSISTENCY");
		classes.put("SimpleField2SimpleFieldRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__FWD_production", "SimpleField2SimpleFieldRule__FWD");
		classes.put("SimpleField2SimpleFieldRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__SRC_production", "SimpleField2SimpleFieldRule__SRC");
		classes.put("SimpleField2SimpleFieldRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleField2SimpleFieldRule__TRG_production", "SimpleField2SimpleFieldRule__TRG");
		classes.put("SimpleMethod2SimpleMethodRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__BWD_production", "SimpleMethod2SimpleMethodRule__BWD");
		classes.put("SimpleMethod2SimpleMethodRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__CC_production", "SimpleMethod2SimpleMethodRule__CC");
		classes.put("SimpleMethod2SimpleMethodRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__CONSISTENCY_production", "SimpleMethod2SimpleMethodRule__CONSISTENCY");
		classes.put("SimpleMethod2SimpleMethodRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__FWD_production", "SimpleMethod2SimpleMethodRule__FWD");
		classes.put("SimpleMethod2SimpleMethodRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__SRC_production", "SimpleMethod2SimpleMethodRule__SRC");
		classes.put("SimpleMethod2SimpleMethodRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleMethod2SimpleMethodRule__TRG_production", "SimpleMethod2SimpleMethodRule__TRG");
		classes.put("SimplePackage2SimplePackageRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__BWD_production", "SimplePackage2SimplePackageRule__BWD");
		classes.put("SimplePackage2SimplePackageRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__CC_production", "SimplePackage2SimplePackageRule__CC");
		classes.put("SimplePackage2SimplePackageRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__CONSISTENCY_production", "SimplePackage2SimplePackageRule__CONSISTENCY");
		classes.put("SimplePackage2SimplePackageRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimplePackage2SimplePackageRule__FWD_production", "SimplePackage2SimplePackageRule__FWD");
		classes.put("SimpleParam2SimpleParamRule__BWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__BWD_production", "SimpleParam2SimpleParamRule__BWD");
		classes.put("SimpleParam2SimpleParamRule__CC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__CC_production", "SimpleParam2SimpleParamRule__CC");
		classes.put("SimpleParam2SimpleParamRule__CONSISTENCY_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__CONSISTENCY_production", "SimpleParam2SimpleParamRule__CONSISTENCY");
		classes.put("SimpleParam2SimpleParamRule__FWD_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__FWD_production", "SimpleParam2SimpleParamRule__FWD");
		classes.put("SimpleParam2SimpleParamRule__SRC_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__SRC_production", "SimpleParam2SimpleParamRule__SRC");
		classes.put("SimpleParam2SimpleParamRule__TRG_production", GenericProductionActor.class);
		productionNodes2pattern.put("SimpleParam2SimpleParamRule__TRG_production", "SimpleParam2SimpleParamRule__TRG");
		
	}
	
	public void createJunctionNodes() {
		classes.put("FieldType2FieldTypeRule__TRG_1_localSearch", FieldType2FieldTypeRule__TRG_1_localSearch.class);
		classes.put("FieldType2FieldTypeRule__BWD_4_localSearch", FieldType2FieldTypeRule__BWD_4_localSearch.class);
		classes.put("FieldType2FieldTypeRule__CC_7_localSearch", FieldType2FieldTypeRule__CC_7_localSearch.class);
		classes.put("FieldType2FieldTypeRule__SRC_13_localSearch", FieldType2FieldTypeRule__SRC_13_localSearch.class);
		classes.put("FieldType2FieldTypeRule__FWD_16_localSearch", FieldType2FieldTypeRule__FWD_16_localSearch.class);
		classes.put("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch", FieldType2FieldTypeRule__CONSISTENCY_19_localSearch.class);
		classes.put("GenericType2GenericTypeRule__TRG_22_localSearch", GenericType2GenericTypeRule__TRG_22_localSearch.class);
		classes.put("GenericType2GenericTypeRule__BWD_25_localSearch", GenericType2GenericTypeRule__BWD_25_localSearch.class);
		classes.put("GenericType2GenericTypeRule__CC_28_localSearch", GenericType2GenericTypeRule__CC_28_localSearch.class);
		classes.put("GenericType2GenericTypeRule__SRC_34_localSearch", GenericType2GenericTypeRule__SRC_34_localSearch.class);
		classes.put("GenericType2GenericTypeRule__FWD_37_localSearch", GenericType2GenericTypeRule__FWD_37_localSearch.class);
		classes.put("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch", GenericType2GenericTypeRule__CONSISTENCY_40_localSearch.class);
		classes.put("ParamType2ParamTypeRule__TRG_43_localSearch", ParamType2ParamTypeRule__TRG_43_localSearch.class);
		classes.put("ParamType2ParamTypeRule__BWD_46_localSearch", ParamType2ParamTypeRule__BWD_46_localSearch.class);
		classes.put("ParamType2ParamTypeRule__CC_49_localSearch", ParamType2ParamTypeRule__CC_49_localSearch.class);
		classes.put("ParamType2ParamTypeRule__SRC_55_localSearch", ParamType2ParamTypeRule__SRC_55_localSearch.class);
		classes.put("ParamType2ParamTypeRule__FWD_58_localSearch", ParamType2ParamTypeRule__FWD_58_localSearch.class);
		classes.put("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch", ParamType2ParamTypeRule__CONSISTENCY_61_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__TRG_64_localSearch", PrimitiveType2PrimitiveTypeRule__TRG_64_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch", PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch", PrimitiveType2PrimitiveTypeRule__CC_70_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__SRC_76_localSearch", PrimitiveType2PrimitiveTypeRule__SRC_76_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch", PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch", PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch", SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch", SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch", SecondTypeRef2SecondTypeRefRule__CC_96_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch", SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch", SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch", SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__TRG_119_localSearch", SimpleClass2SimpleClassRule__TRG_119_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__BWD_122_localSearch", SimpleClass2SimpleClassRule__BWD_122_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__CC_125_localSearch", SimpleClass2SimpleClassRule__CC_125_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__SRC_131_localSearch", SimpleClass2SimpleClassRule__SRC_131_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__FWD_134_localSearch", SimpleClass2SimpleClassRule__FWD_134_localSearch.class);
		classes.put("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch", SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__TRG_140_localSearch", SimpleField2SimpleFieldRule__TRG_140_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__BWD_143_localSearch", SimpleField2SimpleFieldRule__BWD_143_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__CC_146_localSearch", SimpleField2SimpleFieldRule__CC_146_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__SRC_152_localSearch", SimpleField2SimpleFieldRule__SRC_152_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__FWD_155_localSearch", SimpleField2SimpleFieldRule__FWD_155_localSearch.class);
		classes.put("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch", SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__TRG_161_localSearch", SimpleMethod2SimpleMethodRule__TRG_161_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__BWD_164_localSearch", SimpleMethod2SimpleMethodRule__BWD_164_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__CC_167_localSearch", SimpleMethod2SimpleMethodRule__CC_167_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__SRC_173_localSearch", SimpleMethod2SimpleMethodRule__SRC_173_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__FWD_176_localSearch", SimpleMethod2SimpleMethodRule__FWD_176_localSearch.class);
		classes.put("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch", SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch.class);
		classes.put("SimplePackage2SimplePackageRule__CC_183_junction", SimplePackage2SimplePackageRule__CC_183_junction.class);
		classes.put("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch", SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__TRG_190_localSearch", SimpleParam2SimpleParamRule__TRG_190_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__BWD_193_localSearch", SimpleParam2SimpleParamRule__BWD_193_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__CC_196_localSearch", SimpleParam2SimpleParamRule__CC_196_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__SRC_202_localSearch", SimpleParam2SimpleParamRule__SRC_202_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__FWD_205_localSearch", SimpleParam2SimpleParamRule__FWD_205_localSearch.class);
		classes.put("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch", SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch.class);
	}
	
	public void createReferenceNodes() {
		
	}
	
	public void createObjectNodes() {
		classes.put("SimpleField2SimpleField_object",SimpleField2SimpleField_object.class);
		classes.put("FieldType2FieldTypeRule__Marker_object",FieldType2FieldTypeRule__Marker_object.class);
		classes.put("JvmGenericType_object",JvmGenericType_object.class);
		classes.put("GenericType2GenericTypeRule__Marker_object",GenericType2GenericTypeRule__Marker_object.class);
		classes.put("SimpleParam2SimpleParam_object",SimpleParam2SimpleParam_object.class);
		classes.put("ParamType2ParamTypeRule__Marker_object",ParamType2ParamTypeRule__Marker_object.class);
		classes.put("JvmPrimitiveType_object",JvmPrimitiveType_object.class);
		classes.put("PrimitiveType2PrimitiveTypeRule__Marker_object",PrimitiveType2PrimitiveTypeRule__Marker_object.class);
		classes.put("SecondTypeRef2SecondTypeRefRule__Marker_object",SecondTypeRef2SecondTypeRefRule__Marker_object.class);
		classes.put("SimplePackage2SimplePackage_object",SimplePackage2SimplePackage_object.class);
		classes.put("SimpleClass2SimpleClassRule__Marker_object",SimpleClass2SimpleClassRule__Marker_object.class);
		classes.put("SimpleField2SimpleFieldRule__Marker_object",SimpleField2SimpleFieldRule__Marker_object.class);
		classes.put("SimpleMethod2SimpleMethod_object",SimpleMethod2SimpleMethod_object.class);
		classes.put("SimpleMethod2SimpleMethodRule__Marker_object",SimpleMethod2SimpleMethodRule__Marker_object.class);
		classes.put("SimplePackage2SimplePackageRule__Marker_object",SimplePackage2SimplePackageRule__Marker_object.class);
		classes.put("SimpleParam2SimpleParamRule__Marker_object",SimpleParam2SimpleParamRule__Marker_object.class);
		classes.put("SimpleField_object_SP0",SimpleField_object_SP0.class);
		classes.put("SimpleField_object_SP1",SimpleField_object_SP1.class);
		classes.put("JvmParameterizedTypeReference_object_SP0",JvmParameterizedTypeReference_object_SP0.class);
		classes.put("JvmParameterizedTypeReference_object_SP1",JvmParameterizedTypeReference_object_SP1.class);
		classes.put("JvmParameterizedTypeReference_object_SP2",JvmParameterizedTypeReference_object_SP2.class);
		classes.put("JvmParameterizedTypeReference_object_SP3",JvmParameterizedTypeReference_object_SP3.class);
		classes.put("JvmParameterizedTypeReference_object_SP4",JvmParameterizedTypeReference_object_SP4.class);
		classes.put("JvmParameterizedTypeReference_object_SP5",JvmParameterizedTypeReference_object_SP5.class);
		classes.put("TypeRef2TypeRef_object_SP0",TypeRef2TypeRef_object_SP0.class);
		classes.put("TypeRef2TypeRef_object_SP1",TypeRef2TypeRef_object_SP1.class);
		classes.put("TypeRef2TypeRef_object_SP2",TypeRef2TypeRef_object_SP2.class);
		classes.put("Type2Type_object_SP0",Type2Type_object_SP0.class);
		classes.put("Type2Type_object_SP1",Type2Type_object_SP1.class);
		classes.put("SimpleParam_object_SP0",SimpleParam_object_SP0.class);
		classes.put("SimpleParam_object_SP1",SimpleParam_object_SP1.class);
		classes.put("JvmType_object_SP0",JvmType_object_SP0.class);
		classes.put("JvmType_object_SP1",JvmType_object_SP1.class);
		classes.put("SimplePackage_object_SP0",SimplePackage_object_SP0.class);
		classes.put("SimplePackage_object_SP1",SimplePackage_object_SP1.class);
		classes.put("SimplePackage_object_SP2",SimplePackage_object_SP2.class);
		classes.put("SimpleClass_object_SP0",SimpleClass_object_SP0.class);
		classes.put("SimpleClass_object_SP1",SimpleClass_object_SP1.class);
		classes.put("SimpleClass_object_SP2",SimpleClass_object_SP2.class);
		classes.put("SimpleClass_object_SP3",SimpleClass_object_SP3.class);
		classes.put("SimpleClass2SimpleClass_object_SP0",SimpleClass2SimpleClass_object_SP0.class);
		classes.put("SimpleClass2SimpleClass_object_SP1",SimpleClass2SimpleClass_object_SP1.class);
		classes.put("SimpleMethod_object_SP0",SimpleMethod_object_SP0.class);
		classes.put("SimpleMethod_object_SP1",SimpleMethod_object_SP1.class);
		
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
class FieldType2FieldTypeRule__Marker_object extends GenericObjectActor<JavaExchange.FieldType2FieldTypeRule__Marker> { }
class JvmGenericType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmGenericType> { }
class GenericType2GenericTypeRule__Marker_object extends GenericObjectActor<JavaExchange.GenericType2GenericTypeRule__Marker> { }
class SimpleParam2SimpleParam_object extends GenericObjectActor<JavaExchange.SimpleParam2SimpleParam> { }
class ParamType2ParamTypeRule__Marker_object extends GenericObjectActor<JavaExchange.ParamType2ParamTypeRule__Marker> { }
class JvmPrimitiveType_object extends GenericObjectActor<org.eclipse.xtext.common.types.JvmPrimitiveType> { }
class PrimitiveType2PrimitiveTypeRule__Marker_object extends GenericObjectActor<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker> { }
class SecondTypeRef2SecondTypeRefRule__Marker_object extends GenericObjectActor<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker> { }
class SimplePackage2SimplePackage_object extends GenericObjectActor<JavaExchange.SimplePackage2SimplePackage> { }
class SimpleClass2SimpleClassRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClassRule__Marker> { }
class SimpleField2SimpleFieldRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleField2SimpleFieldRule__Marker> { }
class SimpleMethod2SimpleMethod_object extends GenericObjectActor<JavaExchange.SimpleMethod2SimpleMethod> { }
class SimpleMethod2SimpleMethodRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleMethod2SimpleMethodRule__Marker> { }
class SimplePackage2SimplePackageRule__Marker_object extends GenericObjectActor<JavaExchange.SimplePackage2SimplePackageRule__Marker> { }
class SimpleParam2SimpleParamRule__Marker_object extends GenericObjectActor<JavaExchange.SimpleParam2SimpleParamRule__Marker> { }
class SimpleField_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleField> { }
class SimpleField_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleField> { }
class JvmParameterizedTypeReference_object_SP0 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP1 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP2 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP3 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP4 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class JvmParameterizedTypeReference_object_SP5 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmParameterizedTypeReference> { }
class TypeRef2TypeRef_object_SP0 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class TypeRef2TypeRef_object_SP1 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class TypeRef2TypeRef_object_SP2 extends GenericObjectActor<JavaExchange.TypeRef2TypeRef> { }
class Type2Type_object_SP0 extends GenericObjectActor<JavaExchange.Type2Type> { }
class Type2Type_object_SP1 extends GenericObjectActor<JavaExchange.Type2Type> { }
class SimpleParam_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleParam> { }
class SimpleParam_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleParam> { }
class JvmType_object_SP0 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmType> { }
class JvmType_object_SP1 extends GenericObjectActor<org.eclipse.xtext.common.types.JvmType> { }
class SimplePackage_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimplePackage> { }
class SimplePackage_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimplePackage> { }
class SimplePackage_object_SP2 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimplePackage> { }
class SimpleClass_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleClass_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleClass_object_SP2 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleClass_object_SP3 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleClass> { }
class SimpleClass2SimpleClass_object_SP0 extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClass> { }
class SimpleClass2SimpleClass_object_SP1 extends GenericObjectActor<JavaExchange.SimpleClass2SimpleClass> { }
class SimpleMethod_object_SP0 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleMethod> { }
class SimpleMethod_object_SP1 extends GenericObjectActor<org.xtext.simplejava.simpleJava.SimpleMethod> { }


