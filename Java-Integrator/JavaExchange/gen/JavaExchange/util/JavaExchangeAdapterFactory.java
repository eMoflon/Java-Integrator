/**
 */
package JavaExchange.util;

import JavaExchange.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see JavaExchange.JavaExchangePackage
 * @generated
 */
public class JavaExchangeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JavaExchangePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExchangeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JavaExchangePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaExchangeSwitch<Adapter> modelSwitch =
		new JavaExchangeSwitch<Adapter>() {
			@Override
			public Adapter caseSimplePackage2SimplePackage(SimplePackage2SimplePackage object) {
				return createSimplePackage2SimplePackageAdapter();
			}
			@Override
			public Adapter caseSimpleClass2SimpleClass(SimpleClass2SimpleClass object) {
				return createSimpleClass2SimpleClassAdapter();
			}
			@Override
			public Adapter caseSimpleField2SimpleField(SimpleField2SimpleField object) {
				return createSimpleField2SimpleFieldAdapter();
			}
			@Override
			public Adapter caseSimpleMethod2SimpleMethod(SimpleMethod2SimpleMethod object) {
				return createSimpleMethod2SimpleMethodAdapter();
			}
			@Override
			public Adapter caseSimpleParam2SimpleParam(SimpleParam2SimpleParam object) {
				return createSimpleParam2SimpleParamAdapter();
			}
			@Override
			public Adapter caseTypeRef2TypeRef(TypeRef2TypeRef object) {
				return createTypeRef2TypeRefAdapter();
			}
			@Override
			public Adapter caseType2Type(Type2Type object) {
				return createType2TypeAdapter();
			}
			@Override
			public Adapter caseFieldType2FieldTypeRule__Marker(FieldType2FieldTypeRule__Marker object) {
				return createFieldType2FieldTypeRule__MarkerAdapter();
			}
			@Override
			public Adapter caseGenericType2GenericTypeRule__Marker(GenericType2GenericTypeRule__Marker object) {
				return createGenericType2GenericTypeRule__MarkerAdapter();
			}
			@Override
			public Adapter caseParamType2ParamTypeRule__Marker(ParamType2ParamTypeRule__Marker object) {
				return createParamType2ParamTypeRule__MarkerAdapter();
			}
			@Override
			public Adapter casePrimitiveType2PrimitiveTypeRule__Marker(PrimitiveType2PrimitiveTypeRule__Marker object) {
				return createPrimitiveType2PrimitiveTypeRule__MarkerAdapter();
			}
			@Override
			public Adapter caseSecondTypeRef2SecondTypeRefRule__Marker(SecondTypeRef2SecondTypeRefRule__Marker object) {
				return createSecondTypeRef2SecondTypeRefRule__MarkerAdapter();
			}
			@Override
			public Adapter caseSimpleClass2SimpleClassRule__Marker(SimpleClass2SimpleClassRule__Marker object) {
				return createSimpleClass2SimpleClassRule__MarkerAdapter();
			}
			@Override
			public Adapter caseSimpleField2SimpleFieldRule__Marker(SimpleField2SimpleFieldRule__Marker object) {
				return createSimpleField2SimpleFieldRule__MarkerAdapter();
			}
			@Override
			public Adapter caseSimpleMethod2SimpleMethodRule__Marker(SimpleMethod2SimpleMethodRule__Marker object) {
				return createSimpleMethod2SimpleMethodRule__MarkerAdapter();
			}
			@Override
			public Adapter caseSimplePackage2SimplePackageRule__Marker(SimplePackage2SimplePackageRule__Marker object) {
				return createSimplePackage2SimplePackageRule__MarkerAdapter();
			}
			@Override
			public Adapter caseSimpleParam2SimpleParamRule__Marker(SimpleParam2SimpleParamRule__Marker object) {
				return createSimpleParam2SimpleParamRule__MarkerAdapter();
			}
			@Override
			public Adapter caseTGGRuleApplication(TGGRuleApplication object) {
				return createTGGRuleApplicationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimplePackage2SimplePackage <em>Simple Package2 Simple Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimplePackage2SimplePackage
	 * @generated
	 */
	public Adapter createSimplePackage2SimplePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleClass2SimpleClass <em>Simple Class2 Simple Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleClass2SimpleClass
	 * @generated
	 */
	public Adapter createSimpleClass2SimpleClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleField2SimpleField <em>Simple Field2 Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleField2SimpleField
	 * @generated
	 */
	public Adapter createSimpleField2SimpleFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleMethod2SimpleMethod <em>Simple Method2 Simple Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleMethod2SimpleMethod
	 * @generated
	 */
	public Adapter createSimpleMethod2SimpleMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleParam2SimpleParam <em>Simple Param2 Simple Param</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleParam2SimpleParam
	 * @generated
	 */
	public Adapter createSimpleParam2SimpleParamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.TypeRef2TypeRef <em>Type Ref2 Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.TypeRef2TypeRef
	 * @generated
	 */
	public Adapter createTypeRef2TypeRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.Type2Type <em>Type2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.Type2Type
	 * @generated
	 */
	public Adapter createType2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.FieldType2FieldTypeRule__Marker <em>Field Type2 Field Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker
	 * @generated
	 */
	public Adapter createFieldType2FieldTypeRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.GenericType2GenericTypeRule__Marker <em>Generic Type2 Generic Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker
	 * @generated
	 */
	public Adapter createGenericType2GenericTypeRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.ParamType2ParamTypeRule__Marker <em>Param Type2 Param Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker
	 * @generated
	 */
	public Adapter createParamType2ParamTypeRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker <em>Primitive Type2 Primitive Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker
	 * @generated
	 */
	public Adapter createPrimitiveType2PrimitiveTypeRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker <em>Second Type Ref2 Second Type Ref Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker
	 * @generated
	 */
	public Adapter createSecondTypeRef2SecondTypeRefRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker <em>Simple Class2 Simple Class Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker
	 * @generated
	 */
	public Adapter createSimpleClass2SimpleClassRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker <em>Simple Field2 Simple Field Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker
	 * @generated
	 */
	public Adapter createSimpleField2SimpleFieldRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker <em>Simple Method2 Simple Method Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker
	 * @generated
	 */
	public Adapter createSimpleMethod2SimpleMethodRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker <em>Simple Package2 Simple Package Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimplePackage2SimplePackageRule__Marker
	 * @generated
	 */
	public Adapter createSimplePackage2SimplePackageRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker <em>Simple Param2 Simple Param Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker
	 * @generated
	 */
	public Adapter createSimpleParam2SimpleParamRule__MarkerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link runtime.TGGRuleApplication <em>TGG Rule Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see runtime.TGGRuleApplication
	 * @generated
	 */
	public Adapter createTGGRuleApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JavaExchangeAdapterFactory
