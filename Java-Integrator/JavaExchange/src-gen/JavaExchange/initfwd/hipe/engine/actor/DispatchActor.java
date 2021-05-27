package JavaExchange.initfwd.hipe.engine.actor;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Consumer;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.stream.ActorMaterializer;
import akka.stream.javadsl.*;
import static akka.pattern.Patterns.ask;

import hipe.engine.util.HiPEMultiUtil;
import hipe.engine.util.IncUtil;
import hipe.engine.message.NewInput;
import hipe.engine.message.NoMoreInput;
import hipe.engine.message.input.ObjectAdded;
import hipe.engine.message.input.ObjectDeleted;
import hipe.engine.message.input.ReferenceAdded;
import hipe.engine.message.input.ReferenceDeleted;		
import hipe.engine.message.input.AttributeChanged;
import hipe.engine.message.input.NotificationContainer;

import hipe.generic.actor.junction.util.HiPEConfig;

public class DispatchActor extends AbstractActor {
	
	private int counter = 0;
	public long time = 0;
				
	private Map<String, ActorRef> name2actor;
	
	private Map<Object, Consumer<Object>> type2addConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2setConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2addEdgeConsumer = HiPEMultiUtil.createMap();
	private Map<Object, Consumer<Notification>> feature2removeEdgeConsumer = HiPEMultiUtil.createMap();
	
	private IncUtil incUtil;
	
	private ActorMaterializer materializer;
	
	public DispatchActor(Map<String, ActorRef> name2actor, IncUtil incUtil) {
		this.name2actor = name2actor;
		this.incUtil = incUtil;
		
		initializeAdd();
		initializeSet();
		initializeAddEdge();
		initializeRemoveEdge();
	
		materializer = ActorMaterializer.create(getContext());
	}
	
	private void initializeAdd() {
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmVoid(), obj -> {
			org.eclipse.xtext.common.types.JvmVoid _jvmvoid = (org.eclipse.xtext.common.types.JvmVoid) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmvoid), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationType(), obj -> {
			org.eclipse.xtext.common.types.JvmAnnotationType _jvmannotationtype = (org.eclipse.xtext.common.types.JvmAnnotationType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmannotationtype), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmInnerTypeReference(), obj -> {
			org.eclipse.xtext.common.types.JvmInnerTypeReference _jvminnertypereference = (org.eclipse.xtext.common.types.JvmInnerTypeReference) obj;
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField(), obj -> {
			JavaExchange.SimpleField2SimpleField _simplefield2simplefield = (JavaExchange.SimpleField2SimpleField) obj;
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleField_object").tell(new ObjectAdded<JavaExchange.SimpleField2SimpleField>(incUtil, _simplefield2simplefield), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleField _simplefield = (org.xtext.simplejava.simpleJava.SimpleField) obj;
			incUtil.newMessage();
			name2actor.get("SimpleField_object").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, _simplefield), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmEnumerationType(), obj -> {
			org.eclipse.xtext.common.types.JvmEnumerationType _jvmenumerationtype = (org.eclipse.xtext.common.types.JvmEnumerationType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmenumerationtype), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleClass _simpleclass = (org.xtext.simplejava.simpleJava.SimpleClass) obj;
			incUtil.newMessage();
			name2actor.get("SimpleClass_object").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, _simpleclass), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage(), obj -> {
			JavaExchange.SimplePackage2SimplePackage _simplepackage2simplepackage = (JavaExchange.SimplePackage2SimplePackage) obj;
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackage_object").tell(new ObjectAdded<JavaExchange.SimplePackage2SimplePackage>(incUtil, _simplepackage2simplepackage), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef(), obj -> {
			JavaExchange.TypeRef2TypeRef _typeref2typeref = (JavaExchange.TypeRef2TypeRef) obj;
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object").tell(new ObjectAdded<JavaExchange.TypeRef2TypeRef>(incUtil, _typeref2typeref), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmPrimitiveType(), obj -> {
			org.eclipse.xtext.common.types.JvmPrimitiveType _jvmprimitivetype = (org.eclipse.xtext.common.types.JvmPrimitiveType) obj;
			incUtil.newMessage();
			name2actor.get("JvmPrimitiveType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, _jvmprimitivetype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmprimitivetype), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmArrayType(), obj -> {
			org.eclipse.xtext.common.types.JvmArrayType _jvmarraytype = (org.eclipse.xtext.common.types.JvmArrayType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmarraytype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam(), obj -> {
			JavaExchange.SimpleParam2SimpleParam _simpleparam2simpleparam = (JavaExchange.SimpleParam2SimpleParam) obj;
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParam_object").tell(new ObjectAdded<JavaExchange.SimpleParam2SimpleParam>(incUtil, _simpleparam2simpleparam), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage(), obj -> {
			org.xtext.simplejava.simpleJava.SimplePackage _simplepackage = (org.xtext.simplejava.simpleJava.SimplePackage) obj;
			incUtil.newMessage();
			name2actor.get("SimplePackage_object").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, _simplepackage), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type(), obj -> {
			JavaExchange.Type2Type _type2type = (JavaExchange.Type2Type) obj;
			incUtil.newMessage();
			name2actor.get("Type2Type_object").tell(new ObjectAdded<JavaExchange.Type2Type>(incUtil, _type2type), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeParameter(), obj -> {
			org.eclipse.xtext.common.types.JvmTypeParameter _jvmtypeparameter = (org.eclipse.xtext.common.types.JvmTypeParameter) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmtypeparameter), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmDeclaredType(), obj -> {
			org.eclipse.xtext.common.types.JvmDeclaredType _jvmdeclaredtype = (org.eclipse.xtext.common.types.JvmDeclaredType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmdeclaredtype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass(), obj -> {
			JavaExchange.SimpleClass2SimpleClass _simpleclass2simpleclass = (JavaExchange.SimpleClass2SimpleClass) obj;
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClass_object").tell(new ObjectAdded<JavaExchange.SimpleClass2SimpleClass>(incUtil, _simpleclass2simpleclass), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleMethod _simplemethod = (org.xtext.simplejava.simpleJava.SimpleMethod) obj;
			incUtil.newMessage();
			name2actor.get("SimpleMethod_object").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, _simplemethod), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleParam _simpleparam = (org.xtext.simplejava.simpleJava.SimpleParam) obj;
			incUtil.newMessage();
			name2actor.get("SimpleParam_object").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, _simpleparam), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmGenericType(), obj -> {
			org.eclipse.xtext.common.types.JvmGenericType _jvmgenerictype = (org.eclipse.xtext.common.types.JvmGenericType) obj;
			incUtil.newMessage();
			name2actor.get("JvmGenericType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmGenericType>(incUtil, _jvmgenerictype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmgenerictype), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmComponentType(), obj -> {
			org.eclipse.xtext.common.types.JvmComponentType _jvmcomponenttype = (org.eclipse.xtext.common.types.JvmComponentType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmcomponenttype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod(), obj -> {
			JavaExchange.SimpleMethod2SimpleMethod _simplemethod2simplemethod = (JavaExchange.SimpleMethod2SimpleMethod) obj;
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethod_object").tell(new ObjectAdded<JavaExchange.SimpleMethod2SimpleMethod>(incUtil, _simplemethod2simplemethod), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference(), obj -> {
			org.eclipse.xtext.common.types.JvmParameterizedTypeReference _jvmparameterizedtypereference = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) obj;
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmType(), obj -> {
			org.eclipse.xtext.common.types.JvmType _jvmtype = (org.eclipse.xtext.common.types.JvmType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmtype), getSelf());
		});
	}
	
	private void initializeSet() {
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_11_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference_Type(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_6_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_16_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_36_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_41_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleFields(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_36_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleMethods(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_41_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_11_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage_SimpleClasses(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_31_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_47_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_6_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_16_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_31_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_1_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_36_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_41_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_31_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam_ParamType(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_11_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_target_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_source_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_1_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_6_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_16_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_47_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_FieldType(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_1_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod_Params(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_47_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleMethod_params_SimpleParam"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_11_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference_Type(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_6_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_16_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_36_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_41_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleFields(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_36_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleMethods(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_41_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_11_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage_SimpleClasses(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_31_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_47_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_6_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_16_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_31_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_1_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_36_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_41_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_31_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam_ParamType(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_11_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_target_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_source_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_1_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_6_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_16_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_21_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_47_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_FieldType(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_1_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod_Params(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_47_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleMethod_params_SimpleParam"), getSelf());
		});
	}

	@Override
	public void preStart() throws Exception {
		super.preStart();
	}

	@Override
	public void postStop() throws Exception {
		if(HiPEConfig.logWorkloadActivated) {
			DecimalFormat df = new DecimalFormat("0.#####");
	        df.setMaximumFractionDigits(5);
			System.err.println("DispatchNode" + ";"  + counter + ";" + df.format((double) time / (double) (1000 * 1000 * 1000)));
		}
	}

	@Override
	public Receive createReceive() {
		return receiveBuilder() //
				.match(NotificationContainer.class, this::handleNotificationContainer)
				.match(NoMoreInput.class, this::sendFinished) //
				.build();
	}

	private void sendFinished(NoMoreInput m) {
		incUtil.allMessagesInserted();
	}
	
	private void handleNotificationContainer(NotificationContainer nc) {
		counter++;
		long tic = System.nanoTime();
		nc.notifications.parallelStream().forEach(this::handleNotification);
		time += System.nanoTime() - tic;
	}
	
	private void handleNotification(Notification notification) {
		switch (notification.getEventType()) {
		case Notification.ADD:
			handleAdd(notification);
			break;
		case Notification.REMOVE:
			handleRemove(notification);
			break;
		case Notification.REMOVING_ADAPTER:
			handleRemoveAdapter(notification);
			break;	
		case Notification.SET:
			handleSet(notification);
			break;
		}
	}

	private void handleAdd(Notification notification) {
		if(notification.getFeature() == null) 
			handleAddedNode(notification.getNewValue());
		else
			handleAddedEdge(notification);
	}

	private void handleAddedNode(Object node) {
		if(node == null) 
			return;
			
		EObject obj = (EObject) node;
		if(type2addConsumer.containsKey(obj.eClass())) {
			type2addConsumer.get(obj.eClass()).accept(node);
		}
	}
	
	private void handleSet(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2setConsumer.containsKey(feature)) {
			feature2setConsumer.get(feature).accept(notification);
		}
	}

	private void handleAddedEdge(Notification notification) {
		//check for self-edges
		if(notification.getNotifier().equals(notification.getNewValue()))
			handleAddedNode(notification.getNewValue());
					
		Object feature = notification.getFeature();
		if(feature2addEdgeConsumer.containsKey(feature)) {
			feature2addEdgeConsumer.get(feature).accept(notification);
		}
	}

	private void handleRemove(Notification notification) {
		Object feature = notification.getFeature();
		if(feature2removeEdgeConsumer.containsKey(feature)) {
			feature2removeEdgeConsumer.get(feature).accept(notification);
		}
	}
	
	private void handleRemoveAdapter(Notification notification) {
		Object node = notification.getNotifier();
		if (node instanceof org.eclipse.xtext.common.types.JvmGenericType) {
			incUtil.newMessage();
			name2actor.get("JvmGenericType_object").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmGenericType>(incUtil, (org.eclipse.xtext.common.types.JvmGenericType) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmPrimitiveType) {
			incUtil.newMessage();
			name2actor.get("JvmPrimitiveType_object").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, (org.eclipse.xtext.common.types.JvmPrimitiveType) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmType) {
			incUtil.newMessage();
			name2actor.get("JvmType_object").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmType) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP0").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP1").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleField2SimpleField) {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleField_object").tell(new ObjectDeleted<JavaExchange.SimpleField2SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) node), getSelf());
		}
		if (node instanceof JavaExchange.TypeRef2TypeRef) {
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object").tell(new ObjectDeleted<JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.TypeRef2TypeRef) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleParam2SimpleParam) {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParam_object").tell(new ObjectDeleted<JavaExchange.SimpleParam2SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) node), getSelf());
		}
		if (node instanceof JavaExchange.Type2Type) {
			incUtil.newMessage();
			name2actor.get("Type2Type_object").tell(new ObjectDeleted<JavaExchange.Type2Type>(incUtil, (JavaExchange.Type2Type) node), getSelf());
		}
		if (node instanceof JavaExchange.SimplePackage2SimplePackage) {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackage_object").tell(new ObjectDeleted<JavaExchange.SimplePackage2SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleClass2SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClass_object").tell(new ObjectDeleted<JavaExchange.SimpleClass2SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleMethod2SimpleMethod) {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethod_object").tell(new ObjectDeleted<JavaExchange.SimpleMethod2SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleField) {
			incUtil.newMessage();
			name2actor.get("SimpleField_object").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleParam) {
			incUtil.newMessage();
			name2actor.get("SimpleParam_object").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
			incUtil.newMessage();
			name2actor.get("SimplePackage_object").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass_object").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
			incUtil.newMessage();
			name2actor.get("SimpleMethod_object").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) node), getSelf());
		}
	}
}

