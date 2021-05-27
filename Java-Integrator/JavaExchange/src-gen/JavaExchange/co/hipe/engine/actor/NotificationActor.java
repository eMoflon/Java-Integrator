package JavaExchange.co.hipe.engine.actor;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;

import akka.actor.ActorRef;

import hipe.engine.actor.GenericNotificationActor;
import hipe.engine.util.IncUtil;

public class NotificationActor extends GenericNotificationActor {
	
	public NotificationActor(ActorRef dispatchActor, IncUtil incUtil) {
		super(dispatchActor, incUtil);
	}
	
	@Override
	protected void initializeExploration() {
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnyTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmVoid(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmIntAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmDoubleAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmByteAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.xtext.simplejava.simpleJava.SimpleMethod _simplemethod = (org.xtext.simplejava.simpleJava.SimpleMethod) obj;
			children.addAll(_simplemethod.getParams());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmConstraintOwner(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmConstraintOwner _jvmconstraintowner = (org.eclipse.xtext.common.types.JvmConstraintOwner) obj;
			children.addAll(_jvmconstraintowner.getConstraints());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmWildcardTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmWildcardTypeReference _jvmwildcardtypereference = (org.eclipse.xtext.common.types.JvmWildcardTypeReference) obj;
			children.addAll(_jvmwildcardtypereference.getConstraints());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmAnnotationReference _jvmannotationreference = (org.eclipse.xtext.common.types.JvmAnnotationReference) obj;
			children.addAll(_jvmannotationreference.getExplicitValues());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeParameterDeclarator(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmTypeParameterDeclarator _jvmtypeparameterdeclarator = (org.eclipse.xtext.common.types.JvmTypeParameterDeclarator) obj;
			children.addAll(_jvmtypeparameterdeclarator.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmAnnotationType _jvmannotationtype = (org.eclipse.xtext.common.types.JvmAnnotationType) obj;
			children.addAll(_jvmannotationtype.getAnnotations());
			if(_jvmannotationtype.getArrayType() != null)
				children.add(_jvmannotationtype.getArrayType());
			children.addAll(_jvmannotationtype.getSuperTypes());
			children.addAll(_jvmannotationtype.getMembers());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmLowerBound(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmLowerBound _jvmlowerbound = (org.eclipse.xtext.common.types.JvmLowerBound) obj;
			if(_jvmlowerbound.getTypeReference() != null)
				children.add(_jvmlowerbound.getTypeReference());
			return children;
		});
		explorationConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.xtext.simplejava.simpleJava.SimpleClass _simpleclass = (org.xtext.simplejava.simpleJava.SimpleClass) obj;
			children.addAll(_simpleclass.getSimpleFields());
			children.addAll(_simpleclass.getSimpleMethods());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleFieldRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmConstructor(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmConstructor _jvmconstructor = (org.eclipse.xtext.common.types.JvmConstructor) obj;
			children.addAll(_jvmconstructor.getAnnotations());
			children.addAll(_jvmconstructor.getLocalClasses());
			children.addAll(_jvmconstructor.getTypeParameters());
			children.addAll(_jvmconstructor.getParameters());
			children.addAll(_jvmconstructor.getExceptions());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getTypeRef2TypeRef(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmInnerTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmInnerTypeReference _jvminnertypereference = (org.eclipse.xtext.common.types.JvmInnerTypeReference) obj;
			children.addAll(_jvminnertypereference.getArguments());
			if(_jvminnertypereference.getOuter() != null)
				children.add(_jvminnertypereference.getOuter());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmDelegateTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackageRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmMultiTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmMultiTypeReference _jvmmultitypereference = (org.eclipse.xtext.common.types.JvmMultiTypeReference) obj;
			children.addAll(_jvmmultitypereference.getReferences());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeConstraint(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmTypeConstraint _jvmtypeconstraint = (org.eclipse.xtext.common.types.JvmTypeConstraint) obj;
			if(_jvmtypeconstraint.getTypeReference() != null)
				children.add(_jvmtypeconstraint.getTypeReference());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTempContainer(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.TempContainer _tempcontainer = (runtime.TempContainer) obj;
			children.addAll(_tempcontainer.getObjects());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmEnumerationType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmEnumerationType _jvmenumerationtype = (org.eclipse.xtext.common.types.JvmEnumerationType) obj;
			children.addAll(_jvmenumerationtype.getAnnotations());
			if(_jvmenumerationtype.getArrayType() != null)
				children.add(_jvmenumerationtype.getArrayType());
			children.addAll(_jvmenumerationtype.getSuperTypes());
			children.addAll(_jvmenumerationtype.getMembers());
			return children;
		});
		explorationConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleParam(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.xtext.simplejava.simpleJava.SimpleParam _simpleparam = (org.xtext.simplejava.simpleJava.SimpleParam) obj;
			if(_simpleparam.getParamType() != null)
				children.add(_simpleparam.getParamType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmOperation(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmOperation _jvmoperation = (org.eclipse.xtext.common.types.JvmOperation) obj;
			children.addAll(_jvmoperation.getAnnotations());
			children.addAll(_jvmoperation.getLocalClasses());
			children.addAll(_jvmoperation.getTypeParameters());
			children.addAll(_jvmoperation.getParameters());
			children.addAll(_jvmoperation.getExceptions());
			if(_jvmoperation.getReturnType() != null)
				children.add(_jvmoperation.getReturnType());
			if(_jvmoperation.getDefaultValue() != null)
				children.add(_jvmoperation.getDefaultValue());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmIdentifiableElement(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmCompoundTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmCompoundTypeReference _jvmcompoundtypereference = (org.eclipse.xtext.common.types.JvmCompoundTypeReference) obj;
			children.addAll(_jvmcompoundtypereference.getReferences());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmMember(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmMember _jvmmember = (org.eclipse.xtext.common.types.JvmMember) obj;
			children.addAll(_jvmmember.getAnnotations());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getFieldType2FieldTypeRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmFeature(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmFeature _jvmfeature = (org.eclipse.xtext.common.types.JvmFeature) obj;
			children.addAll(_jvmfeature.getAnnotations());
			children.addAll(_jvmfeature.getLocalClasses());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmStringAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmEnumAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmField _jvmfield = (org.eclipse.xtext.common.types.JvmField) obj;
			children.addAll(_jvmfield.getAnnotations());
			children.addAll(_jvmfield.getLocalClasses());
			if(_jvmfield.getType() != null)
				children.add(_jvmfield.getType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmExecutable(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmExecutable _jvmexecutable = (org.eclipse.xtext.common.types.JvmExecutable) obj;
			children.addAll(_jvmexecutable.getAnnotations());
			children.addAll(_jvmexecutable.getLocalClasses());
			children.addAll(_jvmexecutable.getTypeParameters());
			children.addAll(_jvmexecutable.getParameters());
			children.addAll(_jvmexecutable.getExceptions());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getType2Type(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClass(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmShortAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmPrimitiveType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmPrimitiveType _jvmprimitivetype = (org.eclipse.xtext.common.types.JvmPrimitiveType) obj;
			if(_jvmprimitivetype.getArrayType() != null)
				children.add(_jvmprimitivetype.getArrayType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmArrayType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmArrayType _jvmarraytype = (org.eclipse.xtext.common.types.JvmArrayType) obj;
			if(_jvmarraytype.getArrayType() != null)
				children.add(_jvmarraytype.getArrayType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmCharAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimplePackage2SimplePackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmUpperBound(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmUpperBound _jvmupperbound = (org.eclipse.xtext.common.types.JvmUpperBound) obj;
			if(_jvmupperbound.getTypeReference() != null)
				children.add(_jvmupperbound.getTypeReference());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmSynonymTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmSynonymTypeReference _jvmsynonymtypereference = (org.eclipse.xtext.common.types.JvmSynonymTypeReference) obj;
			children.addAll(_jvmsynonymtypereference.getReferences());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmGenericArrayTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmGenericArrayTypeReference _jvmgenericarraytypereference = (org.eclipse.xtext.common.types.JvmGenericArrayTypeReference) obj;
			if(_jvmgenericarraytypereference.getComponentType() != null)
				children.add(_jvmgenericarraytypereference.getComponentType());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getParamType2ParamTypeRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmBooleanAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmLongAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue _jvmannotationannotationvalue = (org.eclipse.xtext.common.types.JvmAnnotationAnnotationValue) obj;
			children.addAll(_jvmannotationannotationvalue.getValues());
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getProtocol(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			runtime.Protocol _protocol = (runtime.Protocol) obj;
			children.addAll(_protocol.getSteps());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParam(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmTypeParameter _jvmtypeparameter = (org.eclipse.xtext.common.types.JvmTypeParameter) obj;
			if(_jvmtypeparameter.getArrayType() != null)
				children.add(_jvmtypeparameter.getArrayType());
			children.addAll(_jvmtypeparameter.getConstraints());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmDeclaredType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmDeclaredType _jvmdeclaredtype = (org.eclipse.xtext.common.types.JvmDeclaredType) obj;
			children.addAll(_jvmdeclaredtype.getAnnotations());
			if(_jvmdeclaredtype.getArrayType() != null)
				children.add(_jvmdeclaredtype.getArrayType());
			children.addAll(_jvmdeclaredtype.getSuperTypes());
			children.addAll(_jvmdeclaredtype.getMembers());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmTypeAnnotationValue _jvmtypeannotationvalue = (org.eclipse.xtext.common.types.JvmTypeAnnotationValue) obj;
			children.addAll(_jvmtypeannotationvalue.getValues());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleField2SimpleField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleClass2SimpleClassRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmGenericType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmGenericType _jvmgenerictype = (org.eclipse.xtext.common.types.JvmGenericType) obj;
			children.addAll(_jvmgenerictype.getAnnotations());
			if(_jvmgenerictype.getArrayType() != null)
				children.add(_jvmgenerictype.getArrayType());
			children.addAll(_jvmgenerictype.getSuperTypes());
			children.addAll(_jvmgenerictype.getMembers());
			children.addAll(_jvmgenerictype.getTypeParameters());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmAnnotationTarget(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmAnnotationTarget _jvmannotationtarget = (org.eclipse.xtext.common.types.JvmAnnotationTarget) obj;
			children.addAll(_jvmannotationtarget.getAnnotations());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmEnumerationLiteral(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmEnumerationLiteral _jvmenumerationliteral = (org.eclipse.xtext.common.types.JvmEnumerationLiteral) obj;
			children.addAll(_jvmenumerationliteral.getAnnotations());
			children.addAll(_jvmenumerationliteral.getLocalClasses());
			if(_jvmenumerationliteral.getType() != null)
				children.add(_jvmenumerationliteral.getType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmFloatAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmCustomAnnotationValue(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmSpecializedTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmSpecializedTypeReference _jvmspecializedtypereference = (org.eclipse.xtext.common.types.JvmSpecializedTypeReference) obj;
			if(_jvmspecializedtypereference.getEquivalent() != null)
				children.add(_jvmspecializedtypereference.getEquivalent());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleParam2SimpleParamRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmComponentType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmComponentType _jvmcomponenttype = (org.eclipse.xtext.common.types.JvmComponentType) obj;
			if(_jvmcomponenttype.getArrayType() != null)
				children.add(_jvmcomponenttype.getArrayType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmFormalParameter(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmFormalParameter _jvmformalparameter = (org.eclipse.xtext.common.types.JvmFormalParameter) obj;
			children.addAll(_jvmformalparameter.getAnnotations());
			if(_jvmformalparameter.getParameterType() != null)
				children.add(_jvmformalparameter.getParameterType());
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmUnknownTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(runtime.impl.RuntimePackageImpl.eINSTANCE.getTGGRuleApplication(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmParameterizedTypeReference(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.eclipse.xtext.common.types.JvmParameterizedTypeReference _jvmparameterizedtypereference = (org.eclipse.xtext.common.types.JvmParameterizedTypeReference) obj;
			children.addAll(_jvmparameterizedtypereference.getArguments());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.eclipse.xtext.common.types.impl.TypesPackageImpl.eINSTANCE.getJvmType(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimplePackage(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.xtext.simplejava.simpleJava.SimplePackage _simplepackage = (org.xtext.simplejava.simpleJava.SimplePackage) obj;
			children.addAll(_simplepackage.getSimpleClasses());
			return children;
		});
		explorationConsumer.put(org.xtext.simplejava.simpleJava.SimpleJavaPackage.eINSTANCE.getSimpleField(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			org.xtext.simplejava.simpleJava.SimpleField _simplefield = (org.xtext.simplejava.simpleJava.SimpleField) obj;
			if(_simplefield.getFieldType() != null)
				children.add(_simplefield.getFieldType());
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSimpleMethod2SimpleMethod(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getGenericType2GenericTypeRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
		explorationConsumer.put(JavaExchange.JavaExchangePackage.eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker(), obj -> {
			Collection<EObject> children = new LinkedList<>();
			return children;
		});
	}
}

