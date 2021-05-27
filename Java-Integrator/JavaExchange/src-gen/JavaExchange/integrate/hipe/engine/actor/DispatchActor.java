package JavaExchange.integrate.hipe.engine.actor;

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
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmvoid), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmvoid), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleMethod _simplemethod = (org.xtext.simplejava.simpleJava.SimpleMethod) obj;
			incUtil.newMessage();
			name2actor.get("SimpleMethod_object_SP0").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, _simplemethod), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod_object_SP1").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, _simplemethod), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker(), obj -> {
			JavaExchange.SimpleClass2SimpleClassRule__Marker _simpleclass2simpleclassrule__marker = (JavaExchange.SimpleClass2SimpleClassRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__Marker_object").tell(new ObjectAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker>(incUtil, _simpleclass2simpleclassrule__marker), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef(), obj -> {
			JavaExchange.TypeRef2TypeRef _typeref2typeref = (JavaExchange.TypeRef2TypeRef) obj;
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object_SP0").tell(new ObjectAdded<JavaExchange.TypeRef2TypeRef>(incUtil, _typeref2typeref), getSelf());
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object_SP1").tell(new ObjectAdded<JavaExchange.TypeRef2TypeRef>(incUtil, _typeref2typeref), getSelf());
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object_SP2").tell(new ObjectAdded<JavaExchange.TypeRef2TypeRef>(incUtil, _typeref2typeref), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationType(), obj -> {
			org.eclipse.xtext.common.types.JvmAnnotationType _jvmannotationtype = (org.eclipse.xtext.common.types.JvmAnnotationType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmannotationtype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmannotationtype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker(), obj -> {
			JavaExchange.SimplePackage2SimplePackageRule__Marker _simplepackage2simplepackagerule__marker = (JavaExchange.SimplePackage2SimplePackageRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__Marker_object").tell(new ObjectAdded<JavaExchange.SimplePackage2SimplePackageRule__Marker>(incUtil, _simplepackage2simplepackagerule__marker), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker(), obj -> {
			JavaExchange.SimpleParam2SimpleParamRule__Marker _simpleparam2simpleparamrule__marker = (JavaExchange.SimpleParam2SimpleParamRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__Marker_object").tell(new ObjectAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker>(incUtil, _simpleparam2simpleparamrule__marker), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmInnerTypeReference(), obj -> {
			org.eclipse.xtext.common.types.JvmInnerTypeReference _jvminnertypereference = (org.eclipse.xtext.common.types.JvmInnerTypeReference) obj;
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP2").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP3").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP4").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP5").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvminnertypereference), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker(), obj -> {
			JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker _primitivetype2primitivetyperule__marker = (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__Marker_object").tell(new ObjectAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker>(incUtil, _primitivetype2primitivetyperule__marker), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmEnumerationType(), obj -> {
			org.eclipse.xtext.common.types.JvmEnumerationType _jvmenumerationtype = (org.eclipse.xtext.common.types.JvmEnumerationType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmenumerationtype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmenumerationtype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker(), obj -> {
			JavaExchange.ParamType2ParamTypeRule__Marker _paramtype2paramtyperule__marker = (JavaExchange.ParamType2ParamTypeRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__Marker_object").tell(new ObjectAdded<JavaExchange.ParamType2ParamTypeRule__Marker>(incUtil, _paramtype2paramtyperule__marker), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleField _simplefield = (org.xtext.simplejava.simpleJava.SimpleField) obj;
			incUtil.newMessage();
			name2actor.get("SimpleField_object_SP0").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, _simplefield), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField_object_SP1").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, _simplefield), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage(), obj -> {
			JavaExchange.SimplePackage2SimplePackage _simplepackage2simplepackage = (JavaExchange.SimplePackage2SimplePackage) obj;
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackage_object").tell(new ObjectAdded<JavaExchange.SimplePackage2SimplePackage>(incUtil, _simplepackage2simplepackage), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker(), obj -> {
			JavaExchange.GenericType2GenericTypeRule__Marker _generictype2generictyperule__marker = (JavaExchange.GenericType2GenericTypeRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__Marker_object").tell(new ObjectAdded<JavaExchange.GenericType2GenericTypeRule__Marker>(incUtil, _generictype2generictyperule__marker), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage(), obj -> {
			org.xtext.simplejava.simpleJava.SimplePackage _simplepackage = (org.xtext.simplejava.simpleJava.SimplePackage) obj;
			incUtil.newMessage();
			name2actor.get("SimplePackage_object_SP0").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, _simplepackage), getSelf());
			incUtil.newMessage();
			name2actor.get("SimplePackage_object_SP1").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, _simplepackage), getSelf());
			incUtil.newMessage();
			name2actor.get("SimplePackage_object_SP2").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, _simplepackage), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleClass _simpleclass = (org.xtext.simplejava.simpleJava.SimpleClass) obj;
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP0").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, _simpleclass), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP1").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, _simpleclass), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP2").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, _simpleclass), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP3").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, _simpleclass), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField(), obj -> {
			JavaExchange.SimpleField2SimpleField _simplefield2simplefield = (JavaExchange.SimpleField2SimpleField) obj;
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleField_object").tell(new ObjectAdded<JavaExchange.SimpleField2SimpleField>(incUtil, _simplefield2simplefield), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmPrimitiveType(), obj -> {
			org.eclipse.xtext.common.types.JvmPrimitiveType _jvmprimitivetype = (org.eclipse.xtext.common.types.JvmPrimitiveType) obj;
			incUtil.newMessage();
			name2actor.get("JvmPrimitiveType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, _jvmprimitivetype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmprimitivetype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmprimitivetype), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmArrayType(), obj -> {
			org.eclipse.xtext.common.types.JvmArrayType _jvmarraytype = (org.eclipse.xtext.common.types.JvmArrayType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmarraytype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmarraytype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker(), obj -> {
			JavaExchange.SimpleField2SimpleFieldRule__Marker _simplefield2simplefieldrule__marker = (JavaExchange.SimpleField2SimpleFieldRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__Marker_object").tell(new ObjectAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker>(incUtil, _simplefield2simplefieldrule__marker), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeParameter(), obj -> {
			org.eclipse.xtext.common.types.JvmTypeParameter _jvmtypeparameter = (org.eclipse.xtext.common.types.JvmTypeParameter) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmtypeparameter), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmtypeparameter), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmDeclaredType(), obj -> {
			org.eclipse.xtext.common.types.JvmDeclaredType _jvmdeclaredtype = (org.eclipse.xtext.common.types.JvmDeclaredType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmdeclaredtype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmdeclaredtype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass(), obj -> {
			JavaExchange.SimpleClass2SimpleClass _simpleclass2simpleclass = (JavaExchange.SimpleClass2SimpleClass) obj;
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClass_object_SP0").tell(new ObjectAdded<JavaExchange.SimpleClass2SimpleClass>(incUtil, _simpleclass2simpleclass), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClass_object_SP1").tell(new ObjectAdded<JavaExchange.SimpleClass2SimpleClass>(incUtil, _simpleclass2simpleclass), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam(), obj -> {
			JavaExchange.SimpleParam2SimpleParam _simpleparam2simpleparam = (JavaExchange.SimpleParam2SimpleParam) obj;
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParam_object").tell(new ObjectAdded<JavaExchange.SimpleParam2SimpleParam>(incUtil, _simpleparam2simpleparam), getSelf());
		});
		type2addConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam(), obj -> {
			org.xtext.simplejava.simpleJava.SimpleParam _simpleparam = (org.xtext.simplejava.simpleJava.SimpleParam) obj;
			incUtil.newMessage();
			name2actor.get("SimpleParam_object_SP0").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, _simpleparam), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam_object_SP1").tell(new ObjectAdded<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, _simpleparam), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmGenericType(), obj -> {
			org.eclipse.xtext.common.types.JvmGenericType _jvmgenerictype = (org.eclipse.xtext.common.types.JvmGenericType) obj;
			incUtil.newMessage();
			name2actor.get("JvmGenericType_object").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmGenericType>(incUtil, _jvmgenerictype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmgenerictype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmgenerictype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker(), obj -> {
			JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker _secondtyperef2secondtyperefrule__marker = (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__Marker_object").tell(new ObjectAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker>(incUtil, _secondtyperef2secondtyperefrule__marker), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker(), obj -> {
			JavaExchange.FieldType2FieldTypeRule__Marker _fieldtype2fieldtyperule__marker = (JavaExchange.FieldType2FieldTypeRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__Marker_object").tell(new ObjectAdded<JavaExchange.FieldType2FieldTypeRule__Marker>(incUtil, _fieldtype2fieldtyperule__marker), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmComponentType(), obj -> {
			org.eclipse.xtext.common.types.JvmComponentType _jvmcomponenttype = (org.eclipse.xtext.common.types.JvmComponentType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmcomponenttype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmcomponenttype), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference(), obj -> {
			org.eclipse.xtext.common.types.JvmParameterizedTypeReference _jvmparameterizedtypereference = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) obj;
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP2").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP3").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP4").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP5").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, _jvmparameterizedtypereference), getSelf());
		});
		type2addConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmType(), obj -> {
			org.eclipse.xtext.common.types.JvmType _jvmtype = (org.eclipse.xtext.common.types.JvmType) obj;
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmtype), getSelf());
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectAdded<org.eclipse.xtext.common.types.JvmType>(incUtil, _jvmtype), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker(), obj -> {
			JavaExchange.SimpleMethod2SimpleMethodRule__Marker _simplemethod2simplemethodrule__marker = (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) obj;
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__Marker_object").tell(new ObjectAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker>(incUtil, _simplemethod2simplemethodrule__marker), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod(), obj -> {
			JavaExchange.SimpleMethod2SimpleMethod _simplemethod2simplemethod = (JavaExchange.SimpleMethod2SimpleMethod) obj;
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethod_object").tell(new ObjectAdded<JavaExchange.SimpleMethod2SimpleMethod>(incUtil, _simplemethod2simplemethod), getSelf());
		});
		type2addConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type(), obj -> {
			JavaExchange.Type2Type _type2type = (JavaExchange.Type2Type) obj;
			incUtil.newMessage();
			name2actor.get("Type2Type_object_SP0").tell(new ObjectAdded<JavaExchange.Type2Type>(incUtil, _type2type), getSelf());
			incUtil.newMessage();
			name2actor.get("Type2Type_object_SP1").tell(new ObjectAdded<JavaExchange.Type2Type>(incUtil, _type2type), getSelf());
		});
	}
	
	private void initializeSet() {
		feature2setConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmMember_SimpleName(), notification -> {
			if(notification.getNotifier() instanceof org.eclipse.xtext.common.types.JvmGenericType) {
				incUtil.newMessage();
				name2actor.get("JvmGenericType_object").tell(new AttributeChanged<org.eclipse.xtext.common.types.JvmMember>(incUtil, (org.eclipse.xtext.common.types.JvmMember) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod_AccessType(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
				incUtil.newMessage();
				name2actor.get("SimpleMethod_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
				incUtil.newMessage();
				name2actor.get("SimpleMethod_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod_Name(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
				incUtil.newMessage();
				name2actor.get("SimpleMethod_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
				incUtil.newMessage();
				name2actor.get("SimpleMethod_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_Name(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
				incUtil.newMessage();
				name2actor.get("SimpleClass_object_SP3").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
				incUtil.newMessage();
				name2actor.get("SimpleClass_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
				incUtil.newMessage();
				name2actor.get("SimpleClass_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
				incUtil.newMessage();
				name2actor.get("SimpleClass_object_SP2").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_AccessType(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_Name(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmPrimitiveType_SimpleName(), notification -> {
			if(notification.getNotifier() instanceof org.eclipse.xtext.common.types.JvmPrimitiveType) {
				incUtil.newMessage();
				name2actor.get("JvmPrimitiveType_object").tell(new AttributeChanged<org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, (org.eclipse.xtext.common.types.JvmPrimitiveType) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmDeclaredType_PackageName(), notification -> {
			if(notification.getNotifier() instanceof org.eclipse.xtext.common.types.JvmGenericType) {
				incUtil.newMessage();
				name2actor.get("JvmGenericType_object").tell(new AttributeChanged<org.eclipse.xtext.common.types.JvmDeclaredType>(incUtil, (org.eclipse.xtext.common.types.JvmDeclaredType) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_IsStatic(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_IsFinal(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleField) {
				incUtil.newMessage();
				name2actor.get("SimpleField_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage_Name(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
				incUtil.newMessage();
				name2actor.get("SimplePackage_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
				incUtil.newMessage();
				name2actor.get("SimplePackage_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
				incUtil.newMessage();
				name2actor.get("SimplePackage_object_SP2").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
		feature2setConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam_Name(), notification -> {
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleParam) {
				incUtil.newMessage();
				name2actor.get("SimpleParam_object_SP1").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
			if(notification.getNotifier() instanceof org.xtext.simplejava.simpleJava.SimpleParam) {
				incUtil.newMessage();
				name2actor.get("SimpleParam_object_SP0").tell(new AttributeChanged<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), notification.getOldValue()), getSelf());
			}
		});
		
	}
	
	private void initializeAddEdge() {
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker, JavaExchange.SimpleClass2SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (JavaExchange.SimpleClass2SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC_SimpleClass2SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.ParamType2ParamTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "ParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.ParamType2ParamTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil,(JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getNewValue(), "ParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2addEdgeConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference_Type(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__TRG_22_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__SRC_34_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__TRG_64_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__SRC_76_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil,(org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__BWD_46_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_58_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__BWD_25_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_37_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, JavaExchange.SimpleMethod2SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (JavaExchange.SimpleMethod2SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM_SimpleMethod2SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.FieldType2FieldTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "FieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.FieldType2FieldTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil,(JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getNewValue(), "FieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleFields(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__TRG_140_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__SRC_152_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker, JavaExchange.SimpleClass2SimpleClass>(incUtil,(JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (JavaExchange.SimpleClass2SimpleClass) notification.getNewValue(), "SimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC_SimpleClass2SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, JavaExchange.SimpleClass2SimpleClass>(incUtil,(JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (JavaExchange.SimpleClass2SimpleClass) notification.getNewValue(), "SimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC_SimpleClass2SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackageRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackageRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__BWD_143_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_155_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__BWD_164_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_176_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, JavaExchange.Type2Type>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (JavaExchange.Type2Type) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T_Type2Type"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__CORR__b2b(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.GenericType2GenericTypeRule__Marker, JavaExchange.Type2Type>(incUtil,(JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (JavaExchange.Type2Type) notification.getNewValue(), "GenericType2GenericTypeRule__Marker_CREATE__CORR__b2b_Type2Type"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__BWD_4_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_16_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__BWD_122_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_134_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__BWD_46_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_58_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__BWD_193_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_205_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam_ParamType(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__TRG_43_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__SRC_55_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__SRC__srcType(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmGenericType>(incUtil,(JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmGenericType) notification.getNewValue(), "GenericType2GenericTypeRule__Marker_CREATE__SRC__srcType_JvmGenericType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__BWD_25_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_37_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.ParamType2ParamTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "ParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.ParamType2ParamTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "ParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.ParamType2ParamTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "ParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__BWD_122_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_134_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil,(JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmPrimitiveType) notification.getNewValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType_JvmPrimitiveType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__BWD_193_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_205_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_FieldType(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__TRG_1_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__SRC_13_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.FieldType2FieldTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "FieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "GenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__BWD_4_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_16_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__TRG__trgType(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmGenericType>(incUtil,(JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmGenericType) notification.getNewValue(), "GenericType2GenericTypeRule__Marker_CREATE__TRG__trgType_JvmGenericType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.FieldType2FieldTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "FieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "SimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleMethods(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__TRG_161_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__SRC_173_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceAdded<JavaExchange.ParamType2ParamTypeRule__Marker, JavaExchange.SimpleParam2SimpleParam>(incUtil,(JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (JavaExchange.SimpleParam2SimpleParam) notification.getNewValue(), "ParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa_SimpleParam2SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker, JavaExchange.SimpleMethod2SimpleMethod>(incUtil,(JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (JavaExchange.SimpleMethod2SimpleMethod) notification.getNewValue(), "SimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM_SimpleMethod2SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleParam2SimpleParamRule__Marker, JavaExchange.SimpleParam2SimpleParam>(incUtil,(JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (JavaExchange.SimpleParam2SimpleParam) notification.getNewValue(), "SimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa_SimpleParam2SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.GenericType2GenericTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil,(JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getNewValue(), "GenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a_TypeRef2TypeRef"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackageRule__Marker, JavaExchange.SimplePackage2SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackageRule__Marker) notification.getNotifier(), (JavaExchange.SimplePackage2SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP_SimplePackage2SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil,(JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmPrimitiveType) notification.getNewValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType_JvmPrimitiveType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.FieldType2FieldTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil,(JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getNewValue(), "FieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField_SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceAdded<JavaExchange.SimplePackage2SimplePackageRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil,(JavaExchange.SimplePackage2SimplePackageRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNewValue(), "SimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage_SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod_Params(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__TRG_190_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleMethod_params_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleMethod_params_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleMethod_params_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__SRC_202_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil,(org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNewValue(), "SimpleMethod_params_SimpleParam"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_target_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker, JavaExchange.SimpleField2SimpleField>(incUtil,(JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (JavaExchange.SimpleField2SimpleField) notification.getNewValue(), "SimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF_SimpleField2SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__BWD_143_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_155_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__BWD_164_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_176_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleClass2SimpleClassRule__Marker, JavaExchange.SimplePackage2SimplePackage>(incUtil,(JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (JavaExchange.SimplePackage2SimplePackage) notification.getNewValue(), "SimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP_SimplePackage2SimplePackage"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil,(JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getNewValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil,(JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNewValue(), "GenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil,(JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNewValue(), "SimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod_SimpleMethod"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceAdded<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil,(JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getNewValue(), "Type2Type_source_JvmType"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceAdded<JavaExchange.FieldType2FieldTypeRule__Marker, JavaExchange.SimpleField2SimpleField>(incUtil,(JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (JavaExchange.SimpleField2SimpleField) notification.getNewValue(), "FieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF_SimpleField2SimpleField"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceAdded<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, JavaExchange.Type2Type>(incUtil,(JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (JavaExchange.Type2Type) notification.getNewValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T_Type2Type"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceAdded<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil,(JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getNewValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2_TypeRef2TypeRef"), getSelf());
		});
		feature2addEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceAdded<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass_SimpleClass"), getSelf());
		});
		feature2addEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage_SimpleClasses(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__TRG_119_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__SRC_131_localSearch").tell(new ReferenceAdded<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil,(org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNewValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
		});
	}
	
	private void initializeRemoveEdge() {
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker, JavaExchange.SimpleClass2SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (JavaExchange.SimpleClass2SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC_SimpleClass2SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.ParamType2ParamTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "ParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.ParamType2ParamTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getOldValue(), "ParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference_Type(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__TRG_22_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__SRC_34_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__TRG_64_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__SRC_76_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__TRG_85_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__SRC_106_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference, org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "JvmParameterizedTypeReference_type_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__BWD_46_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_58_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_target_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__BWD_25_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_37_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_target_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, JavaExchange.SimpleMethod2SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (JavaExchange.SimpleMethod2SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM_SimpleMethod2SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.FieldType2FieldTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "FieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.FieldType2FieldTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getOldValue(), "FieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleFields(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__TRG_140_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__SRC_152_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleClass_simpleFields_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker, JavaExchange.SimpleClass2SimpleClass>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (JavaExchange.SimpleClass2SimpleClass) notification.getOldValue(), "SimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC_SimpleClass2SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, JavaExchange.SimpleClass2SimpleClass>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (JavaExchange.SimpleClass2SimpleClass) notification.getOldValue(), "SimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC_SimpleClass2SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackageRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackageRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__BWD_143_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_155_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__BWD_164_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_176_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_source_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, JavaExchange.Type2Type>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (JavaExchange.Type2Type) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T_Type2Type"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__CORR__b2b(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.GenericType2GenericTypeRule__Marker, JavaExchange.Type2Type>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (JavaExchange.Type2Type) notification.getOldValue(), "GenericType2GenericTypeRule__Marker_CREATE__CORR__b2b_Type2Type"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__BWD_4_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_16_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_source_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__BWD_122_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_134_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_source_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__BWD_46_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__FWD_58_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParam, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParam_source_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__BWD_193_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_205_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_target_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam_ParamType(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__TRG_43_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CC_49_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__SRC_55_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleParam, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleParam_paramType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__SRC__srcType(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmGenericType>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmGenericType) notification.getOldValue(), "GenericType2GenericTypeRule__Marker_CREATE__SRC__srcType_JvmGenericType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__BWD_25_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CC_28_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__FWD_37_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__BWD_67_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CC_70_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__FWD_79_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<JavaExchange.TypeRef2TypeRef, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.TypeRef2TypeRef) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "TypeRef2TypeRef_source_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.ParamType2ParamTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "ParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.ParamType2ParamTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "ParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.ParamType2ParamTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "ParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__BWD_122_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__FWD_134_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackage, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackage_target_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmPrimitiveType) notification.getOldValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType_JvmPrimitiveType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__BWD_193_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__FWD_205_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethod, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethod_source_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField_FieldType(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__TRG_1_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__SRC_13_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleField, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SimpleField_fieldType_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.FieldType2FieldTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "FieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "GenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__BWD_4_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CC_7_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__FWD_16_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleField, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleField_target_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__TRG__trgType(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmGenericType>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmGenericType) notification.getOldValue(), "GenericType2GenericTypeRule__Marker_CREATE__TRG__trgType_JvmGenericType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.FieldType2FieldTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "FieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "SimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass_SimpleMethods(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__TRG_161_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__SRC_173_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleClass, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleClass_simpleMethods_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa(), notification -> {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__CONSISTENCY_61_localSearch").tell(new ReferenceDeleted<JavaExchange.ParamType2ParamTypeRule__Marker, JavaExchange.SimpleParam2SimpleParam>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) notification.getNotifier(), (JavaExchange.SimpleParam2SimpleParam) notification.getOldValue(), "ParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa_SimpleParam2SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker, JavaExchange.SimpleMethod2SimpleMethod>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (JavaExchange.SimpleMethod2SimpleMethod) notification.getOldValue(), "SimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM_SimpleMethod2SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CONSISTENCY_208_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker, JavaExchange.SimpleParam2SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) notification.getNotifier(), (JavaExchange.SimpleParam2SimpleParam) notification.getOldValue(), "SimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa_SimpleParam2SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.GenericType2GenericTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getOldValue(), "GenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a_TypeRef2TypeRef"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackageRule__Marker, JavaExchange.SimplePackage2SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackageRule__Marker) notification.getNotifier(), (JavaExchange.SimplePackage2SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP_SimplePackage2SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmPrimitiveType) notification.getOldValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType_JvmPrimitiveType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.FieldType2FieldTypeRule__Marker, org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleField) notification.getOldValue(), "FieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField_SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__CONSISTENCY_187_localSearch").tell(new ReferenceDeleted<JavaExchange.SimplePackage2SimplePackageRule__Marker, org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackageRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimplePackage) notification.getOldValue(), "SimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage_SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod_Params(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__TRG_190_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleMethod_params_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleMethod_params_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__CC_196_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleMethod_params_SimpleParam"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__SRC_202_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimpleMethod, org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleParam) notification.getOldValue(), "SimpleMethod_params_SimpleParam"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_target_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_target_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker, JavaExchange.SimpleField2SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (JavaExchange.SimpleField2SimpleField) notification.getOldValue(), "SimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF_SimpleField2SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass_Target(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__BWD_143_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CC_146_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__FWD_155_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__BWD_164_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CC_167_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__FWD_176_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClass, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleClass2SimpleClass_target_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CONSISTENCY_137_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker, JavaExchange.SimplePackage2SimplePackage>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) notification.getNotifier(), (JavaExchange.SimplePackage2SimplePackage) notification.getOldValue(), "SimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP_SimplePackage2SimplePackage"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getOldValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR_TypeRef2TypeRef"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.GenericType2GenericTypeRule__Marker, org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) notification.getOldValue(), "GenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef_JvmParameterizedTypeReference"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__CONSISTENCY_158_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleMethod) notification.getOldValue(), "SimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod_SimpleMethod"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type_Source(), notification -> {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__CONSISTENCY_40_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__BWD_89_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CC_96_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_source_JvmType"), getSelf());
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__FWD_110_localSearch").tell(new ReferenceDeleted<JavaExchange.Type2Type, org.eclipse.xtext.common.types.JvmType>(incUtil, (JavaExchange.Type2Type) notification.getNotifier(), (org.eclipse.xtext.common.types.JvmType) notification.getOldValue(), "Type2Type_source_JvmType"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF(), notification -> {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__CONSISTENCY_19_localSearch").tell(new ReferenceDeleted<JavaExchange.FieldType2FieldTypeRule__Marker, JavaExchange.SimpleField2SimpleField>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) notification.getNotifier(), (JavaExchange.SimpleField2SimpleField) notification.getOldValue(), "FieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF_SimpleField2SimpleField"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T(), notification -> {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__CONSISTENCY_82_localSearch").tell(new ReferenceDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker, JavaExchange.Type2Type>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) notification.getNotifier(), (JavaExchange.Type2Type) notification.getOldValue(), "PrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T_Type2Type"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2(), notification -> {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__CONSISTENCY_117_localSearch").tell(new ReferenceDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker, JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) notification.getNotifier(), (JavaExchange.TypeRef2TypeRef) notification.getOldValue(), "SecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2_TypeRef2TypeRef"), getSelf());
		});
		feature2removeEdgeConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__CONSISTENCY_179_localSearch").tell(new ReferenceDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass_SimpleClass"), getSelf());
		});
		feature2removeEdgeConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage_SimpleClasses(), notification -> {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__TRG_119_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__CC_125_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__SRC_131_localSearch").tell(new ReferenceDeleted<org.xtext.simplejava.simpleJava.SimplePackage, org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) notification.getNotifier(), (org.xtext.simplejava.simpleJava.SimpleClass) notification.getOldValue(), "SimplePackage_simpleClasses_SimpleClass"), getSelf());
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
		if (node instanceof JavaExchange.SimpleField2SimpleField) {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleField_object").tell(new ObjectDeleted<JavaExchange.SimpleField2SimpleField>(incUtil, (JavaExchange.SimpleField2SimpleField) node), getSelf());
		}
		if (node instanceof JavaExchange.FieldType2FieldTypeRule__Marker) {
			incUtil.newMessage();
			name2actor.get("FieldType2FieldTypeRule__Marker_object").tell(new ObjectDeleted<JavaExchange.FieldType2FieldTypeRule__Marker>(incUtil, (JavaExchange.FieldType2FieldTypeRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.GenericType2GenericTypeRule__Marker) {
			incUtil.newMessage();
			name2actor.get("GenericType2GenericTypeRule__Marker_object").tell(new ObjectDeleted<JavaExchange.GenericType2GenericTypeRule__Marker>(incUtil, (JavaExchange.GenericType2GenericTypeRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleParam2SimpleParam) {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParam_object").tell(new ObjectDeleted<JavaExchange.SimpleParam2SimpleParam>(incUtil, (JavaExchange.SimpleParam2SimpleParam) node), getSelf());
		}
		if (node instanceof JavaExchange.ParamType2ParamTypeRule__Marker) {
			incUtil.newMessage();
			name2actor.get("ParamType2ParamTypeRule__Marker_object").tell(new ObjectDeleted<JavaExchange.ParamType2ParamTypeRule__Marker>(incUtil, (JavaExchange.ParamType2ParamTypeRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) {
			incUtil.newMessage();
			name2actor.get("PrimitiveType2PrimitiveTypeRule__Marker_object").tell(new ObjectDeleted<JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker>(incUtil, (JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) {
			incUtil.newMessage();
			name2actor.get("SecondTypeRef2SecondTypeRefRule__Marker_object").tell(new ObjectDeleted<JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker>(incUtil, (JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SimplePackage2SimplePackage) {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackage_object").tell(new ObjectDeleted<JavaExchange.SimplePackage2SimplePackage>(incUtil, (JavaExchange.SimplePackage2SimplePackage) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleClass2SimpleClassRule__Marker) {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClassRule__Marker_object").tell(new ObjectDeleted<JavaExchange.SimpleClass2SimpleClassRule__Marker>(incUtil, (JavaExchange.SimpleClass2SimpleClassRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleField2SimpleFieldRule__Marker) {
			incUtil.newMessage();
			name2actor.get("SimpleField2SimpleFieldRule__Marker_object").tell(new ObjectDeleted<JavaExchange.SimpleField2SimpleFieldRule__Marker>(incUtil, (JavaExchange.SimpleField2SimpleFieldRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleMethod2SimpleMethod) {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethod_object").tell(new ObjectDeleted<JavaExchange.SimpleMethod2SimpleMethod>(incUtil, (JavaExchange.SimpleMethod2SimpleMethod) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleMethod2SimpleMethodRule__Marker) {
			incUtil.newMessage();
			name2actor.get("SimpleMethod2SimpleMethodRule__Marker_object").tell(new ObjectDeleted<JavaExchange.SimpleMethod2SimpleMethodRule__Marker>(incUtil, (JavaExchange.SimpleMethod2SimpleMethodRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SimplePackage2SimplePackageRule__Marker) {
			incUtil.newMessage();
			name2actor.get("SimplePackage2SimplePackageRule__Marker_object").tell(new ObjectDeleted<JavaExchange.SimplePackage2SimplePackageRule__Marker>(incUtil, (JavaExchange.SimplePackage2SimplePackageRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleParam2SimpleParamRule__Marker) {
			incUtil.newMessage();
			name2actor.get("SimpleParam2SimpleParamRule__Marker_object").tell(new ObjectDeleted<JavaExchange.SimpleParam2SimpleParamRule__Marker>(incUtil, (JavaExchange.SimpleParam2SimpleParamRule__Marker) node), getSelf());
		}
		if (node instanceof JavaExchange.TypeRef2TypeRef) {
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object_SP0").tell(new ObjectDeleted<JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.TypeRef2TypeRef) node), getSelf());
		}
		if (node instanceof JavaExchange.TypeRef2TypeRef) {
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object_SP1").tell(new ObjectDeleted<JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.TypeRef2TypeRef) node), getSelf());
		}
		if (node instanceof JavaExchange.TypeRef2TypeRef) {
			incUtil.newMessage();
			name2actor.get("TypeRef2TypeRef_object_SP2").tell(new ObjectDeleted<JavaExchange.TypeRef2TypeRef>(incUtil, (JavaExchange.TypeRef2TypeRef) node), getSelf());
		}
		if (node instanceof JavaExchange.Type2Type) {
			incUtil.newMessage();
			name2actor.get("Type2Type_object_SP0").tell(new ObjectDeleted<JavaExchange.Type2Type>(incUtil, (JavaExchange.Type2Type) node), getSelf());
		}
		if (node instanceof JavaExchange.Type2Type) {
			incUtil.newMessage();
			name2actor.get("Type2Type_object_SP1").tell(new ObjectDeleted<JavaExchange.Type2Type>(incUtil, (JavaExchange.Type2Type) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleClass2SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClass_object_SP0").tell(new ObjectDeleted<JavaExchange.SimpleClass2SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) node), getSelf());
		}
		if (node instanceof JavaExchange.SimpleClass2SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass2SimpleClass_object_SP1").tell(new ObjectDeleted<JavaExchange.SimpleClass2SimpleClass>(incUtil, (JavaExchange.SimpleClass2SimpleClass) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleField) {
			incUtil.newMessage();
			name2actor.get("SimpleField_object_SP0").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleField) {
			incUtil.newMessage();
			name2actor.get("SimpleField_object_SP1").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleField>(incUtil, (org.xtext.simplejava.simpleJava.SimpleField) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleParam) {
			incUtil.newMessage();
			name2actor.get("SimpleParam_object_SP0").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleParam) {
			incUtil.newMessage();
			name2actor.get("SimpleParam_object_SP1").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleParam>(incUtil, (org.xtext.simplejava.simpleJava.SimpleParam) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
			incUtil.newMessage();
			name2actor.get("SimplePackage_object_SP0").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
			incUtil.newMessage();
			name2actor.get("SimplePackage_object_SP1").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimplePackage) {
			incUtil.newMessage();
			name2actor.get("SimplePackage_object_SP2").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimplePackage>(incUtil, (org.xtext.simplejava.simpleJava.SimplePackage) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP0").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP1").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP2").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleClass) {
			incUtil.newMessage();
			name2actor.get("SimpleClass_object_SP3").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleClass>(incUtil, (org.xtext.simplejava.simpleJava.SimpleClass) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
			incUtil.newMessage();
			name2actor.get("SimpleMethod_object_SP0").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) node), getSelf());
		}
		if (node instanceof org.xtext.simplejava.simpleJava.SimpleMethod) {
			incUtil.newMessage();
			name2actor.get("SimpleMethod_object_SP1").tell(new ObjectDeleted<org.xtext.simplejava.simpleJava.SimpleMethod>(incUtil, (org.xtext.simplejava.simpleJava.SimpleMethod) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmGenericType) {
			incUtil.newMessage();
			name2actor.get("JvmGenericType_object").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmGenericType>(incUtil, (org.eclipse.xtext.common.types.JvmGenericType) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmPrimitiveType) {
			incUtil.newMessage();
			name2actor.get("JvmPrimitiveType_object").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmPrimitiveType>(incUtil, (org.eclipse.xtext.common.types.JvmPrimitiveType) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP0").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP1").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP2").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP3").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP4").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmParameterizedTypeReference) {
			incUtil.newMessage();
			name2actor.get("JvmParameterizedTypeReference_object_SP5").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmParameterizedTypeReference>(incUtil, (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmType) {
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP0").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmType) node), getSelf());
		}
		if (node instanceof org.eclipse.xtext.common.types.JvmType) {
			incUtil.newMessage();
			name2actor.get("JvmType_object_SP1").tell(new ObjectDeleted<org.eclipse.xtext.common.types.JvmType>(incUtil, (org.eclipse.xtext.common.types.JvmType) node), getSelf());
		}
	}
}

