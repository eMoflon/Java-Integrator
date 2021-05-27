/**
 */
package JavaExchange.util;

import JavaExchange.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see JavaExchange.JavaExchangePackage
 * @generated
 */
public class JavaExchangeSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaExchangePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExchangeSwitch() {
		if (modelPackage == null) {
			modelPackage = JavaExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE: {
				SimplePackage2SimplePackage simplePackage2SimplePackage = (SimplePackage2SimplePackage)theEObject;
				T result = caseSimplePackage2SimplePackage(simplePackage2SimplePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS: {
				SimpleClass2SimpleClass simpleClass2SimpleClass = (SimpleClass2SimpleClass)theEObject;
				T result = caseSimpleClass2SimpleClass(simpleClass2SimpleClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD: {
				SimpleField2SimpleField simpleField2SimpleField = (SimpleField2SimpleField)theEObject;
				T result = caseSimpleField2SimpleField(simpleField2SimpleField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD: {
				SimpleMethod2SimpleMethod simpleMethod2SimpleMethod = (SimpleMethod2SimpleMethod)theEObject;
				T result = caseSimpleMethod2SimpleMethod(simpleMethod2SimpleMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM: {
				SimpleParam2SimpleParam simpleParam2SimpleParam = (SimpleParam2SimpleParam)theEObject;
				T result = caseSimpleParam2SimpleParam(simpleParam2SimpleParam);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.TYPE_REF2_TYPE_REF: {
				TypeRef2TypeRef typeRef2TypeRef = (TypeRef2TypeRef)theEObject;
				T result = caseTypeRef2TypeRef(typeRef2TypeRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.TYPE2_TYPE: {
				Type2Type type2Type = (Type2Type)theEObject;
				T result = caseType2Type(type2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER: {
				FieldType2FieldTypeRule__Marker fieldType2FieldTypeRule__Marker = (FieldType2FieldTypeRule__Marker)theEObject;
				T result = caseFieldType2FieldTypeRule__Marker(fieldType2FieldTypeRule__Marker);
				if (result == null) result = caseTGGRuleApplication(fieldType2FieldTypeRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER: {
				GenericType2GenericTypeRule__Marker genericType2GenericTypeRule__Marker = (GenericType2GenericTypeRule__Marker)theEObject;
				T result = caseGenericType2GenericTypeRule__Marker(genericType2GenericTypeRule__Marker);
				if (result == null) result = caseTGGRuleApplication(genericType2GenericTypeRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER: {
				ParamType2ParamTypeRule__Marker paramType2ParamTypeRule__Marker = (ParamType2ParamTypeRule__Marker)theEObject;
				T result = caseParamType2ParamTypeRule__Marker(paramType2ParamTypeRule__Marker);
				if (result == null) result = caseTGGRuleApplication(paramType2ParamTypeRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER: {
				PrimitiveType2PrimitiveTypeRule__Marker primitiveType2PrimitiveTypeRule__Marker = (PrimitiveType2PrimitiveTypeRule__Marker)theEObject;
				T result = casePrimitiveType2PrimitiveTypeRule__Marker(primitiveType2PrimitiveTypeRule__Marker);
				if (result == null) result = caseTGGRuleApplication(primitiveType2PrimitiveTypeRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER: {
				SecondTypeRef2SecondTypeRefRule__Marker secondTypeRef2SecondTypeRefRule__Marker = (SecondTypeRef2SecondTypeRefRule__Marker)theEObject;
				T result = caseSecondTypeRef2SecondTypeRefRule__Marker(secondTypeRef2SecondTypeRefRule__Marker);
				if (result == null) result = caseTGGRuleApplication(secondTypeRef2SecondTypeRefRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER: {
				SimpleClass2SimpleClassRule__Marker simpleClass2SimpleClassRule__Marker = (SimpleClass2SimpleClassRule__Marker)theEObject;
				T result = caseSimpleClass2SimpleClassRule__Marker(simpleClass2SimpleClassRule__Marker);
				if (result == null) result = caseTGGRuleApplication(simpleClass2SimpleClassRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER: {
				SimpleField2SimpleFieldRule__Marker simpleField2SimpleFieldRule__Marker = (SimpleField2SimpleFieldRule__Marker)theEObject;
				T result = caseSimpleField2SimpleFieldRule__Marker(simpleField2SimpleFieldRule__Marker);
				if (result == null) result = caseTGGRuleApplication(simpleField2SimpleFieldRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER: {
				SimpleMethod2SimpleMethodRule__Marker simpleMethod2SimpleMethodRule__Marker = (SimpleMethod2SimpleMethodRule__Marker)theEObject;
				T result = caseSimpleMethod2SimpleMethodRule__Marker(simpleMethod2SimpleMethodRule__Marker);
				if (result == null) result = caseTGGRuleApplication(simpleMethod2SimpleMethodRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER: {
				SimplePackage2SimplePackageRule__Marker simplePackage2SimplePackageRule__Marker = (SimplePackage2SimplePackageRule__Marker)theEObject;
				T result = caseSimplePackage2SimplePackageRule__Marker(simplePackage2SimplePackageRule__Marker);
				if (result == null) result = caseTGGRuleApplication(simplePackage2SimplePackageRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER: {
				SimpleParam2SimpleParamRule__Marker simpleParam2SimpleParamRule__Marker = (SimpleParam2SimpleParamRule__Marker)theEObject;
				T result = caseSimpleParam2SimpleParamRule__Marker(simpleParam2SimpleParamRule__Marker);
				if (result == null) result = caseTGGRuleApplication(simpleParam2SimpleParamRule__Marker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Package2 Simple Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Package2 Simple Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplePackage2SimplePackage(SimplePackage2SimplePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Class2 Simple Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Class2 Simple Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleClass2SimpleClass(SimpleClass2SimpleClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field2 Simple Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field2 Simple Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleField2SimpleField(SimpleField2SimpleField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Method2 Simple Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Method2 Simple Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMethod2SimpleMethod(SimpleMethod2SimpleMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Param2 Simple Param</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Param2 Simple Param</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleParam2SimpleParam(SimpleParam2SimpleParam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Ref2 Type Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Ref2 Type Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeRef2TypeRef(TypeRef2TypeRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType2Type(Type2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field Type2 Field Type Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field Type2 Field Type Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldType2FieldTypeRule__Marker(FieldType2FieldTypeRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Type2 Generic Type Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Type2 Generic Type Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericType2GenericTypeRule__Marker(GenericType2GenericTypeRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type2 Param Type Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type2 Param Type Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType2ParamTypeRule__Marker(ParamType2ParamTypeRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Type2 Primitive Type Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Type2 Primitive Type Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveType2PrimitiveTypeRule__Marker(PrimitiveType2PrimitiveTypeRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Second Type Ref2 Second Type Ref Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Second Type Ref2 Second Type Ref Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondTypeRef2SecondTypeRefRule__Marker(SecondTypeRef2SecondTypeRefRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Class2 Simple Class Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Class2 Simple Class Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleClass2SimpleClassRule__Marker(SimpleClass2SimpleClassRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Field2 Simple Field Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Field2 Simple Field Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleField2SimpleFieldRule__Marker(SimpleField2SimpleFieldRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Method2 Simple Method Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Method2 Simple Method Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMethod2SimpleMethodRule__Marker(SimpleMethod2SimpleMethodRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Package2 Simple Package Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Package2 Simple Package Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimplePackage2SimplePackageRule__Marker(SimplePackage2SimplePackageRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Param2 Simple Param Rule Marker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Param2 Simple Param Rule Marker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleParam2SimpleParamRule__Marker(SimpleParam2SimpleParamRule__Marker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TGG Rule Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTGGRuleApplication(TGGRuleApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JavaExchangeSwitch
