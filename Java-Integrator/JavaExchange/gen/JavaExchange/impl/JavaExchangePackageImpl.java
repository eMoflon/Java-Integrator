/**
 */
package JavaExchange.impl;

import JavaExchange.FieldType2FieldTypeRule__Marker;
import JavaExchange.GenericType2GenericTypeRule__Marker;
import JavaExchange.JavaExchangeFactory;
import JavaExchange.JavaExchangePackage;
import JavaExchange.ParamType2ParamTypeRule__Marker;
import JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker;
import JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker;
import JavaExchange.SimpleClass2SimpleClass;
import JavaExchange.SimpleClass2SimpleClassRule__Marker;
import JavaExchange.SimpleField2SimpleField;
import JavaExchange.SimpleField2SimpleFieldRule__Marker;
import JavaExchange.SimpleMethod2SimpleMethod;
import JavaExchange.SimpleMethod2SimpleMethodRule__Marker;
import JavaExchange.SimplePackage2SimplePackage;
import JavaExchange.SimplePackage2SimplePackageRule__Marker;
import JavaExchange.SimpleParam2SimpleParam;
import JavaExchange.SimpleParam2SimpleParamRule__Marker;
import JavaExchange.Type2Type;
import JavaExchange.TypeRef2TypeRef;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.xtext.simplejava.simpleJava.SimpleJavaPackage;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaExchangePackageImpl extends EPackageImpl implements JavaExchangePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePackage2SimplePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleClass2SimpleClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleField2SimpleFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMethod2SimpleMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParam2SimpleParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeRef2TypeRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass type2TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldType2FieldTypeRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericType2GenericTypeRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramType2ParamTypeRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveType2PrimitiveTypeRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondTypeRef2SecondTypeRefRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleClass2SimpleClassRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleField2SimpleFieldRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleMethod2SimpleMethodRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simplePackage2SimplePackageRule__MarkerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleParam2SimpleParamRule__MarkerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see JavaExchange.JavaExchangePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JavaExchangePackageImpl() {
		super(eNS_URI, JavaExchangeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JavaExchangePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JavaExchangePackage init() {
		if (isInited) return (JavaExchangePackage)EPackage.Registry.INSTANCE.getEPackage(JavaExchangePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJavaExchangePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JavaExchangePackageImpl theJavaExchangePackage = registeredJavaExchangePackage instanceof JavaExchangePackageImpl ? (JavaExchangePackageImpl)registeredJavaExchangePackage : new JavaExchangePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		RuntimePackage.eINSTANCE.eClass();
		SimpleJavaPackage.eINSTANCE.eClass();
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theJavaExchangePackage.createPackageContents();

		// Initialize created meta-data
		theJavaExchangePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJavaExchangePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JavaExchangePackage.eNS_URI, theJavaExchangePackage);
		return theJavaExchangePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplePackage2SimplePackage() {
		return simplePackage2SimplePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePackage2SimplePackage_Source() {
		return (EReference)simplePackage2SimplePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePackage2SimplePackage_Target() {
		return (EReference)simplePackage2SimplePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleClass2SimpleClass() {
		return simpleClass2SimpleClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClass_Source() {
		return (EReference)simpleClass2SimpleClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClass_Target() {
		return (EReference)simpleClass2SimpleClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleField2SimpleField() {
		return simpleField2SimpleFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleField_Source() {
		return (EReference)simpleField2SimpleFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleField_Target() {
		return (EReference)simpleField2SimpleFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMethod2SimpleMethod() {
		return simpleMethod2SimpleMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethod_Source() {
		return (EReference)simpleMethod2SimpleMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethod_Target() {
		return (EReference)simpleMethod2SimpleMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParam2SimpleParam() {
		return simpleParam2SimpleParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParam_Source() {
		return (EReference)simpleParam2SimpleParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParam_Target() {
		return (EReference)simpleParam2SimpleParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeRef2TypeRef() {
		return typeRef2TypeRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeRef2TypeRef_Source() {
		return (EReference)typeRef2TypeRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeRef2TypeRef_Target() {
		return (EReference)typeRef2TypeRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType2Type() {
		return type2TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType2Type_Source() {
		return (EReference)type2TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType2Type_Target() {
		return (EReference)type2TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType2FieldTypeRule__Marker() {
		return fieldType2FieldTypeRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField() {
		return (EReference)fieldType2FieldTypeRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef() {
		return (EReference)fieldType2FieldTypeRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField() {
		return (EReference)fieldType2FieldTypeRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef() {
		return (EReference)fieldType2FieldTypeRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF() {
		return (EReference)fieldType2FieldTypeRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR() {
		return (EReference)fieldType2FieldTypeRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericType2GenericTypeRule__Marker() {
		return genericType2GenericTypeRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef() {
		return (EReference)genericType2GenericTypeRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType2GenericTypeRule__Marker_CREATE__SRC__srcType() {
		return (EReference)genericType2GenericTypeRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef() {
		return (EReference)genericType2GenericTypeRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType2GenericTypeRule__Marker_CREATE__TRG__trgType() {
		return (EReference)genericType2GenericTypeRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a() {
		return (EReference)genericType2GenericTypeRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericType2GenericTypeRule__Marker_CREATE__CORR__b2b() {
		return (EReference)genericType2GenericTypeRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamType2ParamTypeRule__Marker() {
		return paramType2ParamTypeRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam() {
		return (EReference)paramType2ParamTypeRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef() {
		return (EReference)paramType2ParamTypeRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam() {
		return (EReference)paramType2ParamTypeRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef() {
		return (EReference)paramType2ParamTypeRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa() {
		return (EReference)paramType2ParamTypeRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR() {
		return (EReference)paramType2ParamTypeRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType2PrimitiveTypeRule__Marker() {
		return primitiveType2PrimitiveTypeRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef() {
		return (EReference)primitiveType2PrimitiveTypeRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType() {
		return (EReference)primitiveType2PrimitiveTypeRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef() {
		return (EReference)primitiveType2PrimitiveTypeRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType() {
		return (EReference)primitiveType2PrimitiveTypeRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T() {
		return (EReference)primitiveType2PrimitiveTypeRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR() {
		return (EReference)primitiveType2PrimitiveTypeRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondTypeRef2SecondTypeRefRule__Marker() {
		return secondTypeRef2SecondTypeRefRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2() {
		return (EReference)secondTypeRef2SecondTypeRefRule__MarkerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleClass2SimpleClassRule__Marker() {
		return simpleClass2SimpleClassRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass() {
		return (EReference)simpleClass2SimpleClassRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage() {
		return (EReference)simpleClass2SimpleClassRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass() {
		return (EReference)simpleClass2SimpleClassRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage() {
		return (EReference)simpleClass2SimpleClassRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC() {
		return (EReference)simpleClass2SimpleClassRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP() {
		return (EReference)simpleClass2SimpleClassRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleField2SimpleFieldRule__Marker() {
		return simpleField2SimpleFieldRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass() {
		return (EReference)simpleField2SimpleFieldRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField() {
		return (EReference)simpleField2SimpleFieldRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass() {
		return (EReference)simpleField2SimpleFieldRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField() {
		return (EReference)simpleField2SimpleFieldRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC() {
		return (EReference)simpleField2SimpleFieldRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF() {
		return (EReference)simpleField2SimpleFieldRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleMethod2SimpleMethodRule__Marker() {
		return simpleMethod2SimpleMethodRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass() {
		return (EReference)simpleMethod2SimpleMethodRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod() {
		return (EReference)simpleMethod2SimpleMethodRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass() {
		return (EReference)simpleMethod2SimpleMethodRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod() {
		return (EReference)simpleMethod2SimpleMethodRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC() {
		return (EReference)simpleMethod2SimpleMethodRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM() {
		return (EReference)simpleMethod2SimpleMethodRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimplePackage2SimplePackageRule__Marker() {
		return simplePackage2SimplePackageRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage() {
		return (EReference)simplePackage2SimplePackageRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage() {
		return (EReference)simplePackage2SimplePackageRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP() {
		return (EReference)simplePackage2SimplePackageRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleParam2SimpleParamRule__Marker() {
		return simpleParam2SimpleParamRule__MarkerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod() {
		return (EReference)simpleParam2SimpleParamRule__MarkerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam() {
		return (EReference)simpleParam2SimpleParamRule__MarkerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod() {
		return (EReference)simpleParam2SimpleParamRule__MarkerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam() {
		return (EReference)simpleParam2SimpleParamRule__MarkerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM() {
		return (EReference)simpleParam2SimpleParamRule__MarkerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa() {
		return (EReference)simpleParam2SimpleParamRule__MarkerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaExchangeFactory getJavaExchangeFactory() {
		return (JavaExchangeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simplePackage2SimplePackageEClass = createEClass(SIMPLE_PACKAGE2_SIMPLE_PACKAGE);
		createEReference(simplePackage2SimplePackageEClass, SIMPLE_PACKAGE2_SIMPLE_PACKAGE__SOURCE);
		createEReference(simplePackage2SimplePackageEClass, SIMPLE_PACKAGE2_SIMPLE_PACKAGE__TARGET);

		simpleClass2SimpleClassEClass = createEClass(SIMPLE_CLASS2_SIMPLE_CLASS);
		createEReference(simpleClass2SimpleClassEClass, SIMPLE_CLASS2_SIMPLE_CLASS__SOURCE);
		createEReference(simpleClass2SimpleClassEClass, SIMPLE_CLASS2_SIMPLE_CLASS__TARGET);

		simpleField2SimpleFieldEClass = createEClass(SIMPLE_FIELD2_SIMPLE_FIELD);
		createEReference(simpleField2SimpleFieldEClass, SIMPLE_FIELD2_SIMPLE_FIELD__SOURCE);
		createEReference(simpleField2SimpleFieldEClass, SIMPLE_FIELD2_SIMPLE_FIELD__TARGET);

		simpleMethod2SimpleMethodEClass = createEClass(SIMPLE_METHOD2_SIMPLE_METHOD);
		createEReference(simpleMethod2SimpleMethodEClass, SIMPLE_METHOD2_SIMPLE_METHOD__SOURCE);
		createEReference(simpleMethod2SimpleMethodEClass, SIMPLE_METHOD2_SIMPLE_METHOD__TARGET);

		simpleParam2SimpleParamEClass = createEClass(SIMPLE_PARAM2_SIMPLE_PARAM);
		createEReference(simpleParam2SimpleParamEClass, SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE);
		createEReference(simpleParam2SimpleParamEClass, SIMPLE_PARAM2_SIMPLE_PARAM__TARGET);

		typeRef2TypeRefEClass = createEClass(TYPE_REF2_TYPE_REF);
		createEReference(typeRef2TypeRefEClass, TYPE_REF2_TYPE_REF__SOURCE);
		createEReference(typeRef2TypeRefEClass, TYPE_REF2_TYPE_REF__TARGET);

		type2TypeEClass = createEClass(TYPE2_TYPE);
		createEReference(type2TypeEClass, TYPE2_TYPE__SOURCE);
		createEReference(type2TypeEClass, TYPE2_TYPE__TARGET);

		fieldType2FieldTypeRule__MarkerEClass = createEClass(FIELD_TYPE2_FIELD_TYPE_RULE_MARKER);
		createEReference(fieldType2FieldTypeRule__MarkerEClass, FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD);
		createEReference(fieldType2FieldTypeRule__MarkerEClass, FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF);
		createEReference(fieldType2FieldTypeRule__MarkerEClass, FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD);
		createEReference(fieldType2FieldTypeRule__MarkerEClass, FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF);
		createEReference(fieldType2FieldTypeRule__MarkerEClass, FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF);
		createEReference(fieldType2FieldTypeRule__MarkerEClass, FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR);

		genericType2GenericTypeRule__MarkerEClass = createEClass(GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER);
		createEReference(genericType2GenericTypeRule__MarkerEClass, GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF);
		createEReference(genericType2GenericTypeRule__MarkerEClass, GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE);
		createEReference(genericType2GenericTypeRule__MarkerEClass, GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF);
		createEReference(genericType2GenericTypeRule__MarkerEClass, GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE);
		createEReference(genericType2GenericTypeRule__MarkerEClass, GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A);
		createEReference(genericType2GenericTypeRule__MarkerEClass, GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B);

		paramType2ParamTypeRule__MarkerEClass = createEClass(PARAM_TYPE2_PARAM_TYPE_RULE_MARKER);
		createEReference(paramType2ParamTypeRule__MarkerEClass, PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM);
		createEReference(paramType2ParamTypeRule__MarkerEClass, PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF);
		createEReference(paramType2ParamTypeRule__MarkerEClass, PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM);
		createEReference(paramType2ParamTypeRule__MarkerEClass, PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF);
		createEReference(paramType2ParamTypeRule__MarkerEClass, PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA);
		createEReference(paramType2ParamTypeRule__MarkerEClass, PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR);

		primitiveType2PrimitiveTypeRule__MarkerEClass = createEClass(PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER);
		createEReference(primitiveType2PrimitiveTypeRule__MarkerEClass, PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF);
		createEReference(primitiveType2PrimitiveTypeRule__MarkerEClass, PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE);
		createEReference(primitiveType2PrimitiveTypeRule__MarkerEClass, PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF);
		createEReference(primitiveType2PrimitiveTypeRule__MarkerEClass, PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE);
		createEReference(primitiveType2PrimitiveTypeRule__MarkerEClass, PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T);
		createEReference(primitiveType2PrimitiveTypeRule__MarkerEClass, PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR);

		secondTypeRef2SecondTypeRefRule__MarkerEClass = createEClass(SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR);
		createEReference(secondTypeRef2SecondTypeRefRule__MarkerEClass, SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2);

		simpleClass2SimpleClassRule__MarkerEClass = createEClass(SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER);
		createEReference(simpleClass2SimpleClassRule__MarkerEClass, SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS);
		createEReference(simpleClass2SimpleClassRule__MarkerEClass, SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE);
		createEReference(simpleClass2SimpleClassRule__MarkerEClass, SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS);
		createEReference(simpleClass2SimpleClassRule__MarkerEClass, SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE);
		createEReference(simpleClass2SimpleClassRule__MarkerEClass, SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC);
		createEReference(simpleClass2SimpleClassRule__MarkerEClass, SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP);

		simpleField2SimpleFieldRule__MarkerEClass = createEClass(SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER);
		createEReference(simpleField2SimpleFieldRule__MarkerEClass, SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS);
		createEReference(simpleField2SimpleFieldRule__MarkerEClass, SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD);
		createEReference(simpleField2SimpleFieldRule__MarkerEClass, SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS);
		createEReference(simpleField2SimpleFieldRule__MarkerEClass, SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD);
		createEReference(simpleField2SimpleFieldRule__MarkerEClass, SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC);
		createEReference(simpleField2SimpleFieldRule__MarkerEClass, SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF);

		simpleMethod2SimpleMethodRule__MarkerEClass = createEClass(SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER);
		createEReference(simpleMethod2SimpleMethodRule__MarkerEClass, SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS);
		createEReference(simpleMethod2SimpleMethodRule__MarkerEClass, SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD);
		createEReference(simpleMethod2SimpleMethodRule__MarkerEClass, SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS);
		createEReference(simpleMethod2SimpleMethodRule__MarkerEClass, SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD);
		createEReference(simpleMethod2SimpleMethodRule__MarkerEClass, SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC);
		createEReference(simpleMethod2SimpleMethodRule__MarkerEClass, SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM);

		simplePackage2SimplePackageRule__MarkerEClass = createEClass(SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER);
		createEReference(simplePackage2SimplePackageRule__MarkerEClass, SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE);
		createEReference(simplePackage2SimplePackageRule__MarkerEClass, SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE);
		createEReference(simplePackage2SimplePackageRule__MarkerEClass, SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP);

		simpleParam2SimpleParamRule__MarkerEClass = createEClass(SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER);
		createEReference(simpleParam2SimpleParamRule__MarkerEClass, SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD);
		createEReference(simpleParam2SimpleParamRule__MarkerEClass, SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM);
		createEReference(simpleParam2SimpleParamRule__MarkerEClass, SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD);
		createEReference(simpleParam2SimpleParamRule__MarkerEClass, SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM);
		createEReference(simpleParam2SimpleParamRule__MarkerEClass, SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM);
		createEReference(simpleParam2SimpleParamRule__MarkerEClass, SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		SimpleJavaPackage theSimpleJavaPackage = (SimpleJavaPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleJavaPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		RuntimePackage theRuntimePackage = (RuntimePackage)EPackage.Registry.INSTANCE.getEPackage(RuntimePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fieldType2FieldTypeRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		genericType2GenericTypeRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		paramType2ParamTypeRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		primitiveType2PrimitiveTypeRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		secondTypeRef2SecondTypeRefRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		simpleClass2SimpleClassRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		simpleField2SimpleFieldRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		simpleMethod2SimpleMethodRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		simplePackage2SimplePackageRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());
		simpleParam2SimpleParamRule__MarkerEClass.getESuperTypes().add(theRuntimePackage.getTGGRuleApplication());

		// Initialize classes, features, and operations; add parameters
		initEClass(simplePackage2SimplePackageEClass, SimplePackage2SimplePackage.class, "SimplePackage2SimplePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplePackage2SimplePackage_Source(), theSimpleJavaPackage.getSimplePackage(), null, "source", null, 0, 1, SimplePackage2SimplePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePackage2SimplePackage_Target(), theSimpleJavaPackage.getSimplePackage(), null, "target", null, 0, 1, SimplePackage2SimplePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleClass2SimpleClassEClass, SimpleClass2SimpleClass.class, "SimpleClass2SimpleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleClass2SimpleClass_Source(), theSimpleJavaPackage.getSimpleClass(), null, "source", null, 0, 1, SimpleClass2SimpleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClass2SimpleClass_Target(), theSimpleJavaPackage.getSimpleClass(), null, "target", null, 0, 1, SimpleClass2SimpleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleField2SimpleFieldEClass, SimpleField2SimpleField.class, "SimpleField2SimpleField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleField2SimpleField_Source(), theSimpleJavaPackage.getSimpleField(), null, "source", null, 0, 1, SimpleField2SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleField2SimpleField_Target(), theSimpleJavaPackage.getSimpleField(), null, "target", null, 0, 1, SimpleField2SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleMethod2SimpleMethodEClass, SimpleMethod2SimpleMethod.class, "SimpleMethod2SimpleMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleMethod2SimpleMethod_Source(), theSimpleJavaPackage.getSimpleMethod(), null, "source", null, 0, 1, SimpleMethod2SimpleMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMethod2SimpleMethod_Target(), theSimpleJavaPackage.getSimpleMethod(), null, "target", null, 0, 1, SimpleMethod2SimpleMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleParam2SimpleParamEClass, SimpleParam2SimpleParam.class, "SimpleParam2SimpleParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParam2SimpleParam_Source(), theSimpleJavaPackage.getSimpleParam(), null, "source", null, 0, 1, SimpleParam2SimpleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParam2SimpleParam_Target(), theSimpleJavaPackage.getSimpleParam(), null, "target", null, 0, 1, SimpleParam2SimpleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeRef2TypeRefEClass, TypeRef2TypeRef.class, "TypeRef2TypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeRef2TypeRef_Source(), theTypesPackage.getJvmParameterizedTypeReference(), null, "source", null, 0, 1, TypeRef2TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeRef2TypeRef_Target(), theTypesPackage.getJvmParameterizedTypeReference(), null, "target", null, 0, 1, TypeRef2TypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(type2TypeEClass, Type2Type.class, "Type2Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType2Type_Source(), theTypesPackage.getJvmType(), null, "source", null, 0, 1, Type2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getType2Type_Target(), theTypesPackage.getJvmType(), null, "target", null, 0, 1, Type2Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldType2FieldTypeRule__MarkerEClass, FieldType2FieldTypeRule__Marker.class, "FieldType2FieldTypeRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField(), theSimpleJavaPackage.getSimpleField(), null, "CONTEXT__SRC__srcField", null, 1, 1, FieldType2FieldTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CREATE__SRC__srcRef", null, 1, 1, FieldType2FieldTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField(), theSimpleJavaPackage.getSimpleField(), null, "CONTEXT__TRG__trgField", null, 1, 1, FieldType2FieldTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CREATE__TRG__trgRef", null, 1, 1, FieldType2FieldTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF(), this.getSimpleField2SimpleField(), null, "CONTEXT__CORR__SF2SF", null, 1, 1, FieldType2FieldTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR(), this.getTypeRef2TypeRef(), null, "CREATE__CORR__TR2TR", null, 1, 1, FieldType2FieldTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(genericType2GenericTypeRule__MarkerEClass, GenericType2GenericTypeRule__Marker.class, "GenericType2GenericTypeRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__SRC__srcRef", null, 1, 1, GenericType2GenericTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericType2GenericTypeRule__Marker_CREATE__SRC__srcType(), theTypesPackage.getJvmGenericType(), null, "CREATE__SRC__srcType", null, 1, 1, GenericType2GenericTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__TRG__trgRef", null, 1, 1, GenericType2GenericTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericType2GenericTypeRule__Marker_CREATE__TRG__trgType(), theTypesPackage.getJvmGenericType(), null, "CREATE__TRG__trgType", null, 1, 1, GenericType2GenericTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a(), this.getTypeRef2TypeRef(), null, "CONTEXT__CORR__a2a", null, 1, 1, GenericType2GenericTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGenericType2GenericTypeRule__Marker_CREATE__CORR__b2b(), this.getType2Type(), null, "CREATE__CORR__b2b", null, 1, 1, GenericType2GenericTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramType2ParamTypeRule__MarkerEClass, ParamType2ParamTypeRule__Marker.class, "ParamType2ParamTypeRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam(), theSimpleJavaPackage.getSimpleParam(), null, "CONTEXT__SRC__srcParam", null, 1, 1, ParamType2ParamTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CREATE__SRC__srcRef", null, 1, 1, ParamType2ParamTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam(), theSimpleJavaPackage.getSimpleParam(), null, "CONTEXT__TRG__trgParam", null, 1, 1, ParamType2ParamTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CREATE__TRG__trgRef", null, 1, 1, ParamType2ParamTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa(), this.getSimpleParam2SimpleParam(), null, "CONTEXT__CORR__SPa2SPa", null, 1, 1, ParamType2ParamTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR(), this.getTypeRef2TypeRef(), null, "CREATE__CORR__TR2TR", null, 1, 1, ParamType2ParamTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveType2PrimitiveTypeRule__MarkerEClass, PrimitiveType2PrimitiveTypeRule__Marker.class, "PrimitiveType2PrimitiveTypeRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__SRC__srcRef", null, 1, 1, PrimitiveType2PrimitiveTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType(), theTypesPackage.getJvmPrimitiveType(), null, "CREATE__SRC__srcType", null, 1, 1, PrimitiveType2PrimitiveTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__TRG__trgRef", null, 1, 1, PrimitiveType2PrimitiveTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType(), theTypesPackage.getJvmPrimitiveType(), null, "CREATE__TRG__trgType", null, 1, 1, PrimitiveType2PrimitiveTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T(), this.getType2Type(), null, "CREATE__CORR__T2T", null, 1, 1, PrimitiveType2PrimitiveTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR(), this.getTypeRef2TypeRef(), null, "CONTEXT__CORR__TR2TR", null, 1, 1, PrimitiveType2PrimitiveTypeRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondTypeRef2SecondTypeRefRule__MarkerEClass, SecondTypeRef2SecondTypeRefRule__Marker.class, "SecondTypeRef2SecondTypeRefRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__SRC__srcRef", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__SRC__srcRef2", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType(), theTypesPackage.getJvmType(), null, "CONTEXT__SRC__srcType", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__TRG__trgRef", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2(), theTypesPackage.getJvmParameterizedTypeReference(), null, "CONTEXT__TRG__trgRef2", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType(), theTypesPackage.getJvmType(), null, "CONTEXT__TRG__trgType", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T(), this.getType2Type(), null, "CONTEXT__CORR__T2T", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR(), this.getTypeRef2TypeRef(), null, "CONTEXT__CORR__TR2TR", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2(), this.getTypeRef2TypeRef(), null, "CONTEXT__CORR__TR2TR2", null, 1, 1, SecondTypeRef2SecondTypeRefRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleClass2SimpleClassRule__MarkerEClass, SimpleClass2SimpleClassRule__Marker.class, "SimpleClass2SimpleClassRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass(), theSimpleJavaPackage.getSimpleClass(), null, "CREATE__SRC__srcClass", null, 1, 1, SimpleClass2SimpleClassRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage(), theSimpleJavaPackage.getSimplePackage(), null, "CONTEXT__SRC__srcPackage", null, 1, 1, SimpleClass2SimpleClassRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass(), theSimpleJavaPackage.getSimpleClass(), null, "CREATE__TRG__trgClass", null, 1, 1, SimpleClass2SimpleClassRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage(), theSimpleJavaPackage.getSimplePackage(), null, "CONTEXT__TRG__trgPackage", null, 1, 1, SimpleClass2SimpleClassRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC(), this.getSimpleClass2SimpleClass(), null, "CREATE__CORR__SC2SC", null, 1, 1, SimpleClass2SimpleClassRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP(), this.getSimplePackage2SimplePackage(), null, "CONTEXT__CORR__SP2SP", null, 1, 1, SimpleClass2SimpleClassRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleField2SimpleFieldRule__MarkerEClass, SimpleField2SimpleFieldRule__Marker.class, "SimpleField2SimpleFieldRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass(), theSimpleJavaPackage.getSimpleClass(), null, "CONTEXT__SRC__srcClass", null, 1, 1, SimpleField2SimpleFieldRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField(), theSimpleJavaPackage.getSimpleField(), null, "CREATE__SRC__srcField", null, 1, 1, SimpleField2SimpleFieldRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass(), theSimpleJavaPackage.getSimpleClass(), null, "CONTEXT__TRG__trgClass", null, 1, 1, SimpleField2SimpleFieldRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField(), theSimpleJavaPackage.getSimpleField(), null, "CREATE__TRG__trgField", null, 1, 1, SimpleField2SimpleFieldRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC(), this.getSimpleClass2SimpleClass(), null, "CONTEXT__CORR__SC2SC", null, 1, 1, SimpleField2SimpleFieldRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF(), this.getSimpleField2SimpleField(), null, "CREATE__CORR__SF2SF", null, 1, 1, SimpleField2SimpleFieldRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleMethod2SimpleMethodRule__MarkerEClass, SimpleMethod2SimpleMethodRule__Marker.class, "SimpleMethod2SimpleMethodRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass(), theSimpleJavaPackage.getSimpleClass(), null, "CONTEXT__SRC__srcClass", null, 1, 1, SimpleMethod2SimpleMethodRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod(), theSimpleJavaPackage.getSimpleMethod(), null, "CREATE__SRC__srcMethod", null, 1, 1, SimpleMethod2SimpleMethodRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass(), theSimpleJavaPackage.getSimpleClass(), null, "CONTEXT__TRG__trgClass", null, 1, 1, SimpleMethod2SimpleMethodRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod(), theSimpleJavaPackage.getSimpleMethod(), null, "CREATE__TRG__trgMethod", null, 1, 1, SimpleMethod2SimpleMethodRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC(), this.getSimpleClass2SimpleClass(), null, "CONTEXT__CORR__SC2SC", null, 1, 1, SimpleMethod2SimpleMethodRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM(), this.getSimpleMethod2SimpleMethod(), null, "CREATE__CORR__SM2SM", null, 1, 1, SimpleMethod2SimpleMethodRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simplePackage2SimplePackageRule__MarkerEClass, SimplePackage2SimplePackageRule__Marker.class, "SimplePackage2SimplePackageRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage(), theSimpleJavaPackage.getSimplePackage(), null, "CREATE__SRC__srcPackage", null, 1, 1, SimplePackage2SimplePackageRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage(), theSimpleJavaPackage.getSimplePackage(), null, "CREATE__TRG__trgPackage", null, 1, 1, SimplePackage2SimplePackageRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP(), this.getSimplePackage2SimplePackage(), null, "CREATE__CORR__SP2SP", null, 1, 1, SimplePackage2SimplePackageRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleParam2SimpleParamRule__MarkerEClass, SimpleParam2SimpleParamRule__Marker.class, "SimpleParam2SimpleParamRule__Marker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod(), theSimpleJavaPackage.getSimpleMethod(), null, "CONTEXT__SRC__srcMethod", null, 1, 1, SimpleParam2SimpleParamRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam(), theSimpleJavaPackage.getSimpleParam(), null, "CREATE__SRC__srcParam", null, 1, 1, SimpleParam2SimpleParamRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod(), theSimpleJavaPackage.getSimpleMethod(), null, "CONTEXT__TRG__trgMethod", null, 1, 1, SimpleParam2SimpleParamRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam(), theSimpleJavaPackage.getSimpleParam(), null, "CREATE__TRG__trgParam", null, 1, 1, SimpleParam2SimpleParamRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM(), this.getSimpleMethod2SimpleMethod(), null, "CONTEXT__CORR__SM2SM", null, 1, 1, SimpleParam2SimpleParamRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa(), this.getSimpleParam2SimpleParam(), null, "CREATE__CORR__SPa2SPa", null, 1, 1, SimpleParam2SimpleParamRule__Marker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JavaExchangePackageImpl
