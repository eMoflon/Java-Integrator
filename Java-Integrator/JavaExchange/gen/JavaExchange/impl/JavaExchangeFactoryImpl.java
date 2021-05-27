/**
 */
package JavaExchange.impl;

import JavaExchange.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaExchangeFactoryImpl extends EFactoryImpl implements JavaExchangeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JavaExchangeFactory init() {
		try {
			JavaExchangeFactory theJavaExchangeFactory = (JavaExchangeFactory)EPackage.Registry.INSTANCE.getEFactory(JavaExchangePackage.eNS_URI);
			if (theJavaExchangeFactory != null) {
				return theJavaExchangeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JavaExchangeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExchangeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE: return createSimplePackage2SimplePackage();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS: return createSimpleClass2SimpleClass();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD: return createSimpleField2SimpleField();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD: return createSimpleMethod2SimpleMethod();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM: return createSimpleParam2SimpleParam();
			case JavaExchangePackage.TYPE_REF2_TYPE_REF: return createTypeRef2TypeRef();
			case JavaExchangePackage.TYPE2_TYPE: return createType2Type();
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER: return createFieldType2FieldTypeRule__Marker();
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER: return createGenericType2GenericTypeRule__Marker();
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER: return createParamType2ParamTypeRule__Marker();
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER: return createPrimitiveType2PrimitiveTypeRule__Marker();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER: return createSecondTypeRef2SecondTypeRefRule__Marker();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER: return createSimpleClass2SimpleClassRule__Marker();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER: return createSimpleField2SimpleFieldRule__Marker();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER: return createSimpleMethod2SimpleMethodRule__Marker();
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER: return createSimplePackage2SimplePackageRule__Marker();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER: return createSimpleParam2SimpleParamRule__Marker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage2SimplePackage createSimplePackage2SimplePackage() {
		SimplePackage2SimplePackageImpl simplePackage2SimplePackage = new SimplePackage2SimplePackageImpl();
		return simplePackage2SimplePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass createSimpleClass2SimpleClass() {
		SimpleClass2SimpleClassImpl simpleClass2SimpleClass = new SimpleClass2SimpleClassImpl();
		return simpleClass2SimpleClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField2SimpleField createSimpleField2SimpleField() {
		SimpleField2SimpleFieldImpl simpleField2SimpleField = new SimpleField2SimpleFieldImpl();
		return simpleField2SimpleField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod2SimpleMethod createSimpleMethod2SimpleMethod() {
		SimpleMethod2SimpleMethodImpl simpleMethod2SimpleMethod = new SimpleMethod2SimpleMethodImpl();
		return simpleMethod2SimpleMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam2SimpleParam createSimpleParam2SimpleParam() {
		SimpleParam2SimpleParamImpl simpleParam2SimpleParam = new SimpleParam2SimpleParamImpl();
		return simpleParam2SimpleParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef createTypeRef2TypeRef() {
		TypeRef2TypeRefImpl typeRef2TypeRef = new TypeRef2TypeRefImpl();
		return typeRef2TypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type createType2Type() {
		Type2TypeImpl type2Type = new Type2TypeImpl();
		return type2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType2FieldTypeRule__Marker createFieldType2FieldTypeRule__Marker() {
		FieldType2FieldTypeRule__MarkerImpl fieldType2FieldTypeRule__Marker = new FieldType2FieldTypeRule__MarkerImpl();
		return fieldType2FieldTypeRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericType2GenericTypeRule__Marker createGenericType2GenericTypeRule__Marker() {
		GenericType2GenericTypeRule__MarkerImpl genericType2GenericTypeRule__Marker = new GenericType2GenericTypeRule__MarkerImpl();
		return genericType2GenericTypeRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType2ParamTypeRule__Marker createParamType2ParamTypeRule__Marker() {
		ParamType2ParamTypeRule__MarkerImpl paramType2ParamTypeRule__Marker = new ParamType2ParamTypeRule__MarkerImpl();
		return paramType2ParamTypeRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType2PrimitiveTypeRule__Marker createPrimitiveType2PrimitiveTypeRule__Marker() {
		PrimitiveType2PrimitiveTypeRule__MarkerImpl primitiveType2PrimitiveTypeRule__Marker = new PrimitiveType2PrimitiveTypeRule__MarkerImpl();
		return primitiveType2PrimitiveTypeRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondTypeRef2SecondTypeRefRule__Marker createSecondTypeRef2SecondTypeRefRule__Marker() {
		SecondTypeRef2SecondTypeRefRule__MarkerImpl secondTypeRef2SecondTypeRefRule__Marker = new SecondTypeRef2SecondTypeRefRule__MarkerImpl();
		return secondTypeRef2SecondTypeRefRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClassRule__Marker createSimpleClass2SimpleClassRule__Marker() {
		SimpleClass2SimpleClassRule__MarkerImpl simpleClass2SimpleClassRule__Marker = new SimpleClass2SimpleClassRule__MarkerImpl();
		return simpleClass2SimpleClassRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField2SimpleFieldRule__Marker createSimpleField2SimpleFieldRule__Marker() {
		SimpleField2SimpleFieldRule__MarkerImpl simpleField2SimpleFieldRule__Marker = new SimpleField2SimpleFieldRule__MarkerImpl();
		return simpleField2SimpleFieldRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod2SimpleMethodRule__Marker createSimpleMethod2SimpleMethodRule__Marker() {
		SimpleMethod2SimpleMethodRule__MarkerImpl simpleMethod2SimpleMethodRule__Marker = new SimpleMethod2SimpleMethodRule__MarkerImpl();
		return simpleMethod2SimpleMethodRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage2SimplePackageRule__Marker createSimplePackage2SimplePackageRule__Marker() {
		SimplePackage2SimplePackageRule__MarkerImpl simplePackage2SimplePackageRule__Marker = new SimplePackage2SimplePackageRule__MarkerImpl();
		return simplePackage2SimplePackageRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam2SimpleParamRule__Marker createSimpleParam2SimpleParamRule__Marker() {
		SimpleParam2SimpleParamRule__MarkerImpl simpleParam2SimpleParamRule__Marker = new SimpleParam2SimpleParamRule__MarkerImpl();
		return simpleParam2SimpleParamRule__Marker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExchangePackage getJavaExchangePackage() {
		return (JavaExchangePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JavaExchangePackage getPackage() {
		return JavaExchangePackage.eINSTANCE;
	}

} //JavaExchangeFactoryImpl
