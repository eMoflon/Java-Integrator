/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see JavaExchange.JavaExchangeFactory
 * @model kind="package"
 * @generated
 */
public interface JavaExchangePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "JavaExchange";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/JavaExchange/model/JavaExchange.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "JavaExchange";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JavaExchangePackage eINSTANCE = JavaExchange.impl.JavaExchangePackageImpl.init();

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimplePackage2SimplePackageImpl <em>Simple Package2 Simple Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimplePackage2SimplePackageImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimplePackage2SimplePackage()
	 * @generated
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Simple Package2 Simple Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Package2 Simple Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleClass2SimpleClassImpl <em>Simple Class2 Simple Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleClass2SimpleClassImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleClass2SimpleClass()
	 * @generated
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Simple Class2 Simple Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Class2 Simple Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleField2SimpleFieldImpl <em>Simple Field2 Simple Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleField2SimpleFieldImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleField2SimpleField()
	 * @generated
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Simple Field2 Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Field2 Simple Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleMethod2SimpleMethodImpl <em>Simple Method2 Simple Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleMethod2SimpleMethodImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleMethod2SimpleMethod()
	 * @generated
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Simple Method2 Simple Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Method2 Simple Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleParam2SimpleParamImpl <em>Simple Param2 Simple Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleParam2SimpleParamImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleParam2SimpleParam()
	 * @generated
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM = 4;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Simple Param2 Simple Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Simple Param2 Simple Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.TypeRef2TypeRefImpl <em>Type Ref2 Type Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.TypeRef2TypeRefImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getTypeRef2TypeRef()
	 * @generated
	 */
	int TYPE_REF2_TYPE_REF = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF2_TYPE_REF__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF2_TYPE_REF__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Type Ref2 Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF2_TYPE_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type Ref2 Type Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REF2_TYPE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.Type2TypeImpl <em>Type2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.Type2TypeImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getType2Type()
	 * @generated
	 */
	int TYPE2_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TYPE__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TYPE__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Type2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Type2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE2_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl <em>Field Type2 Field Type Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER = 7;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR SF2SF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR TR2TR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Field Type2 Field Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Field Type2 Field Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_TYPE2_FIELD_TYPE_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl <em>Generic Type2 Generic Type Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER = 8;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR a2a</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR b2b</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Generic Type2 Generic Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Generic Type2 Generic Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl <em>Param Type2 Param Type Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER = 9;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR SPa2 SPa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR TR2TR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Param Type2 Param Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Param Type2 Param Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE2_PARAM_TYPE_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl <em>Primitive Type2 Primitive Type Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER = 10;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR T2T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR TR2TR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Primitive Type2 Primitive Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Primitive Type2 Primitive Type Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl <em>Second Type Ref2 Second Type Ref Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER = 11;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Ref2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Ref2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR T2T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR TR2TR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR TR2TR2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2 = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Second Type Ref2 Second Type Ref Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 9;

	/**
	 * The number of operations of the '<em>Second Type Ref2 Second Type Ref Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl <em>Simple Class2 Simple Class Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER = 12;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CREATE CORR SC2SC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR SP2SP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simple Class2 Simple Class Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Simple Class2 Simple Class Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl <em>Simple Field2 Simple Field Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER = 13;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR SC2SC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR SF2SF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simple Field2 Simple Field Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Simple Field2 Simple Field Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl <em>Simple Method2 Simple Method Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER = 14;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR SC2SC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR SM2SM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simple Method2 Simple Method Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Simple Method2 Simple Method Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl <em>Simple Package2 Simple Package Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimplePackage2SimplePackageRule__Marker()
	 * @generated
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER = 15;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CREATE CORR SP2SP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Simple Package2 Simple Package Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Simple Package2 Simple Package Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl <em>Simple Param2 Simple Param Rule Marker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl
	 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER = 16;

	/**
	 * The feature id for the '<em><b>Protocol</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__PROTOCOL = RuntimePackage.TGG_RULE_APPLICATION__PROTOCOL;

	/**
	 * The feature id for the '<em><b>CONTEXT SRC src Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>CREATE SRC src Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>CONTEXT TRG trg Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>CREATE TRG trg Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>CONTEXT CORR SM2SM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>CREATE CORR SPa2 SPa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simple Param2 Simple Param Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER_FEATURE_COUNT = RuntimePackage.TGG_RULE_APPLICATION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Simple Param2 Simple Param Rule Marker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER_OPERATION_COUNT = RuntimePackage.TGG_RULE_APPLICATION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link JavaExchange.SimplePackage2SimplePackage <em>Simple Package2 Simple Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Package2 Simple Package</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackage
	 * @generated
	 */
	EClass getSimplePackage2SimplePackage();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimplePackage2SimplePackage#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackage#getSource()
	 * @see #getSimplePackage2SimplePackage()
	 * @generated
	 */
	EReference getSimplePackage2SimplePackage_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimplePackage2SimplePackage#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackage#getTarget()
	 * @see #getSimplePackage2SimplePackage()
	 * @generated
	 */
	EReference getSimplePackage2SimplePackage_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleClass2SimpleClass <em>Simple Class2 Simple Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Class2 Simple Class</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClass
	 * @generated
	 */
	EClass getSimpleClass2SimpleClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClass#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClass#getSource()
	 * @see #getSimpleClass2SimpleClass()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClass_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClass#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClass#getTarget()
	 * @see #getSimpleClass2SimpleClass()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClass_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleField2SimpleField <em>Simple Field2 Simple Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field2 Simple Field</em>'.
	 * @see JavaExchange.SimpleField2SimpleField
	 * @generated
	 */
	EClass getSimpleField2SimpleField();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleField#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.SimpleField2SimpleField#getSource()
	 * @see #getSimpleField2SimpleField()
	 * @generated
	 */
	EReference getSimpleField2SimpleField_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleField#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.SimpleField2SimpleField#getTarget()
	 * @see #getSimpleField2SimpleField()
	 * @generated
	 */
	EReference getSimpleField2SimpleField_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleMethod2SimpleMethod <em>Simple Method2 Simple Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Method2 Simple Method</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethod
	 * @generated
	 */
	EClass getSimpleMethod2SimpleMethod();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethod#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethod#getSource()
	 * @see #getSimpleMethod2SimpleMethod()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethod_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethod#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethod#getTarget()
	 * @see #getSimpleMethod2SimpleMethod()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethod_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleParam2SimpleParam <em>Simple Param2 Simple Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Param2 Simple Param</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParam
	 * @generated
	 */
	EClass getSimpleParam2SimpleParam();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParam#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParam#getSource()
	 * @see #getSimpleParam2SimpleParam()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParam_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParam#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParam#getTarget()
	 * @see #getSimpleParam2SimpleParam()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParam_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.TypeRef2TypeRef <em>Type Ref2 Type Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Ref2 Type Ref</em>'.
	 * @see JavaExchange.TypeRef2TypeRef
	 * @generated
	 */
	EClass getTypeRef2TypeRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.TypeRef2TypeRef#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.TypeRef2TypeRef#getSource()
	 * @see #getTypeRef2TypeRef()
	 * @generated
	 */
	EReference getTypeRef2TypeRef_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.TypeRef2TypeRef#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.TypeRef2TypeRef#getTarget()
	 * @see #getTypeRef2TypeRef()
	 * @generated
	 */
	EReference getTypeRef2TypeRef_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.Type2Type <em>Type2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type2 Type</em>'.
	 * @see JavaExchange.Type2Type
	 * @generated
	 */
	EClass getType2Type();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.Type2Type#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see JavaExchange.Type2Type#getSource()
	 * @see #getType2Type()
	 * @generated
	 */
	EReference getType2Type_Source();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.Type2Type#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see JavaExchange.Type2Type#getTarget()
	 * @see #getType2Type()
	 * @generated
	 */
	EReference getType2Type_Target();

	/**
	 * Returns the meta object for class '{@link JavaExchange.FieldType2FieldTypeRule__Marker <em>Field Type2 Field Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Type2 Field Type Rule Marker</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker
	 * @generated
	 */
	EClass getFieldType2FieldTypeRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__SRC__srcField <em>CONTEXT SRC src Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Field</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__SRC__srcField()
	 * @see #getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	EReference getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Ref</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__SRC__srcRef()
	 * @see #getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	EReference getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__TRG__trgField <em>CONTEXT TRG trg Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Field</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__TRG__trgField()
	 * @see #getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	EReference getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Ref</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__TRG__trgRef()
	 * @see #getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	EReference getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__CORR__SF2SF <em>CONTEXT CORR SF2SF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR SF2SF</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__CORR__SF2SF()
	 * @see #getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	EReference getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR TR2TR</em>'.
	 * @see JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__CORR__TR2TR()
	 * @see #getFieldType2FieldTypeRule__Marker()
	 * @generated
	 */
	EReference getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR();

	/**
	 * Returns the meta object for class '{@link JavaExchange.GenericType2GenericTypeRule__Marker <em>Generic Type2 Generic Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generic Type2 Generic Type Rule Marker</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker
	 * @generated
	 */
	EClass getGenericType2GenericTypeRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.GenericType2GenericTypeRule__Marker#getCONTEXT__SRC__srcRef <em>CONTEXT SRC src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Ref</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker#getCONTEXT__SRC__srcRef()
	 * @see #getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	EReference getGenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.GenericType2GenericTypeRule__Marker#getCREATE__SRC__srcType <em>CREATE SRC src Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Type</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker#getCREATE__SRC__srcType()
	 * @see #getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	EReference getGenericType2GenericTypeRule__Marker_CREATE__SRC__srcType();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.GenericType2GenericTypeRule__Marker#getCONTEXT__TRG__trgRef <em>CONTEXT TRG trg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Ref</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker#getCONTEXT__TRG__trgRef()
	 * @see #getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	EReference getGenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.GenericType2GenericTypeRule__Marker#getCREATE__TRG__trgType <em>CREATE TRG trg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Type</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker#getCREATE__TRG__trgType()
	 * @see #getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	EReference getGenericType2GenericTypeRule__Marker_CREATE__TRG__trgType();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.GenericType2GenericTypeRule__Marker#getCONTEXT__CORR__a2a <em>CONTEXT CORR a2a</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR a2a</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker#getCONTEXT__CORR__a2a()
	 * @see #getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	EReference getGenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.GenericType2GenericTypeRule__Marker#getCREATE__CORR__b2b <em>CREATE CORR b2b</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR b2b</em>'.
	 * @see JavaExchange.GenericType2GenericTypeRule__Marker#getCREATE__CORR__b2b()
	 * @see #getGenericType2GenericTypeRule__Marker()
	 * @generated
	 */
	EReference getGenericType2GenericTypeRule__Marker_CREATE__CORR__b2b();

	/**
	 * Returns the meta object for class '{@link JavaExchange.ParamType2ParamTypeRule__Marker <em>Param Type2 Param Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type2 Param Type Rule Marker</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker
	 * @generated
	 */
	EClass getParamType2ParamTypeRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__SRC__srcParam <em>CONTEXT SRC src Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Param</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__SRC__srcParam()
	 * @see #getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	EReference getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Ref</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__SRC__srcRef()
	 * @see #getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	EReference getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__TRG__trgParam <em>CONTEXT TRG trg Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Param</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__TRG__trgParam()
	 * @see #getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	EReference getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Ref</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__TRG__trgRef()
	 * @see #getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	EReference getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__CORR__SPa2SPa <em>CONTEXT CORR SPa2 SPa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR SPa2 SPa</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__CORR__SPa2SPa()
	 * @see #getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	EReference getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR TR2TR</em>'.
	 * @see JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__CORR__TR2TR()
	 * @see #getParamType2ParamTypeRule__Marker()
	 * @generated
	 */
	EReference getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR();

	/**
	 * Returns the meta object for class '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker <em>Primitive Type2 Primitive Type Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type2 Primitive Type Rule Marker</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker
	 * @generated
	 */
	EClass getPrimitiveType2PrimitiveTypeRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCONTEXT__SRC__srcRef <em>CONTEXT SRC src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Ref</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCONTEXT__SRC__srcRef()
	 * @see #getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	EReference getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCREATE__SRC__srcType <em>CREATE SRC src Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Type</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCREATE__SRC__srcType()
	 * @see #getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	EReference getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCONTEXT__TRG__trgRef <em>CONTEXT TRG trg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Ref</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCONTEXT__TRG__trgRef()
	 * @see #getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	EReference getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCREATE__TRG__trgType <em>CREATE TRG trg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Type</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCREATE__TRG__trgType()
	 * @see #getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	EReference getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCREATE__CORR__T2T <em>CREATE CORR T2T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR T2T</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCREATE__CORR__T2T()
	 * @see #getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	EReference getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCONTEXT__CORR__TR2TR <em>CONTEXT CORR TR2TR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR TR2TR</em>'.
	 * @see JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker#getCONTEXT__CORR__TR2TR()
	 * @see #getPrimitiveType2PrimitiveTypeRule__Marker()
	 * @generated
	 */
	EReference getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker <em>Second Type Ref2 Second Type Ref Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Second Type Ref2 Second Type Ref Rule Marker</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker
	 * @generated
	 */
	EClass getSecondTypeRef2SecondTypeRefRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__SRC__srcRef <em>CONTEXT SRC src Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Ref</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__SRC__srcRef()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__SRC__srcRef2 <em>CONTEXT SRC src Ref2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Ref2</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__SRC__srcRef2()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__SRC__srcType <em>CONTEXT SRC src Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Type</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__SRC__srcType()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__TRG__trgRef <em>CONTEXT TRG trg Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Ref</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__TRG__trgRef()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__TRG__trgRef2 <em>CONTEXT TRG trg Ref2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Ref2</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__TRG__trgRef2()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__TRG__trgType <em>CONTEXT TRG trg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Type</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__TRG__trgType()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__CORR__T2T <em>CONTEXT CORR T2T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR T2T</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__CORR__T2T()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__CORR__TR2TR <em>CONTEXT CORR TR2TR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR TR2TR</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__CORR__TR2TR()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__CORR__TR2TR2 <em>CONTEXT CORR TR2TR2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR TR2TR2</em>'.
	 * @see JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker#getCONTEXT__CORR__TR2TR2()
	 * @see #getSecondTypeRef2SecondTypeRefRule__Marker()
	 * @generated
	 */
	EReference getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker <em>Simple Class2 Simple Class Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Class2 Simple Class Rule Marker</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker
	 * @generated
	 */
	EClass getSimpleClass2SimpleClassRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__SRC__srcClass <em>CREATE SRC src Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Class</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__SRC__srcClass()
	 * @see #getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__SRC__srcPackage <em>CONTEXT SRC src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Package</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__SRC__srcPackage()
	 * @see #getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__TRG__trgClass <em>CREATE TRG trg Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Class</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__TRG__trgClass()
	 * @see #getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__TRG__trgPackage <em>CONTEXT TRG trg Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Package</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__TRG__trgPackage()
	 * @see #getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__CORR__SC2SC <em>CREATE CORR SC2SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR SC2SC</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__CORR__SC2SC()
	 * @see #getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__CORR__SP2SP <em>CONTEXT CORR SP2SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR SP2SP</em>'.
	 * @see JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__CORR__SP2SP()
	 * @see #getSimpleClass2SimpleClassRule__Marker()
	 * @generated
	 */
	EReference getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker <em>Simple Field2 Simple Field Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Field2 Simple Field Rule Marker</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker
	 * @generated
	 */
	EClass getSimpleField2SimpleFieldRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker#getCONTEXT__SRC__srcClass <em>CONTEXT SRC src Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Class</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker#getCONTEXT__SRC__srcClass()
	 * @see #getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	EReference getSimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker#getCREATE__SRC__srcField <em>CREATE SRC src Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Field</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker#getCREATE__SRC__srcField()
	 * @see #getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	EReference getSimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker#getCONTEXT__TRG__trgClass <em>CONTEXT TRG trg Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Class</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker#getCONTEXT__TRG__trgClass()
	 * @see #getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	EReference getSimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker#getCREATE__TRG__trgField <em>CREATE TRG trg Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Field</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker#getCREATE__TRG__trgField()
	 * @see #getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	EReference getSimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker#getCONTEXT__CORR__SC2SC <em>CONTEXT CORR SC2SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR SC2SC</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker#getCONTEXT__CORR__SC2SC()
	 * @see #getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	EReference getSimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleField2SimpleFieldRule__Marker#getCREATE__CORR__SF2SF <em>CREATE CORR SF2SF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR SF2SF</em>'.
	 * @see JavaExchange.SimpleField2SimpleFieldRule__Marker#getCREATE__CORR__SF2SF()
	 * @see #getSimpleField2SimpleFieldRule__Marker()
	 * @generated
	 */
	EReference getSimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker <em>Simple Method2 Simple Method Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Method2 Simple Method Rule Marker</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker
	 * @generated
	 */
	EClass getSimpleMethod2SimpleMethodRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCONTEXT__SRC__srcClass <em>CONTEXT SRC src Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Class</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCONTEXT__SRC__srcClass()
	 * @see #getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCREATE__SRC__srcMethod <em>CREATE SRC src Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Method</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCREATE__SRC__srcMethod()
	 * @see #getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCONTEXT__TRG__trgClass <em>CONTEXT TRG trg Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Class</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCONTEXT__TRG__trgClass()
	 * @see #getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCREATE__TRG__trgMethod <em>CREATE TRG trg Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Method</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCREATE__TRG__trgMethod()
	 * @see #getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCONTEXT__CORR__SC2SC <em>CONTEXT CORR SC2SC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR SC2SC</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCONTEXT__CORR__SC2SC()
	 * @see #getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCREATE__CORR__SM2SM <em>CREATE CORR SM2SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR SM2SM</em>'.
	 * @see JavaExchange.SimpleMethod2SimpleMethodRule__Marker#getCREATE__CORR__SM2SM()
	 * @see #getSimpleMethod2SimpleMethodRule__Marker()
	 * @generated
	 */
	EReference getSimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker <em>Simple Package2 Simple Package Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Package2 Simple Package Rule Marker</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackageRule__Marker
	 * @generated
	 */
	EClass getSimplePackage2SimplePackageRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__SRC__srcPackage <em>CREATE SRC src Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Package</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__SRC__srcPackage()
	 * @see #getSimplePackage2SimplePackageRule__Marker()
	 * @generated
	 */
	EReference getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__TRG__trgPackage <em>CREATE TRG trg Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Package</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__TRG__trgPackage()
	 * @see #getSimplePackage2SimplePackageRule__Marker()
	 * @generated
	 */
	EReference getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__CORR__SP2SP <em>CREATE CORR SP2SP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR SP2SP</em>'.
	 * @see JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__CORR__SP2SP()
	 * @see #getSimplePackage2SimplePackageRule__Marker()
	 * @generated
	 */
	EReference getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP();

	/**
	 * Returns the meta object for class '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker <em>Simple Param2 Simple Param Rule Marker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Param2 Simple Param Rule Marker</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker
	 * @generated
	 */
	EClass getSimpleParam2SimpleParamRule__Marker();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker#getCONTEXT__SRC__srcMethod <em>CONTEXT SRC src Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT SRC src Method</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker#getCONTEXT__SRC__srcMethod()
	 * @see #getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker#getCREATE__SRC__srcParam <em>CREATE SRC src Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE SRC src Param</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker#getCREATE__SRC__srcParam()
	 * @see #getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker#getCONTEXT__TRG__trgMethod <em>CONTEXT TRG trg Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT TRG trg Method</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker#getCONTEXT__TRG__trgMethod()
	 * @see #getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker#getCREATE__TRG__trgParam <em>CREATE TRG trg Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE TRG trg Param</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker#getCREATE__TRG__trgParam()
	 * @see #getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker#getCONTEXT__CORR__SM2SM <em>CONTEXT CORR SM2SM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CONTEXT CORR SM2SM</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker#getCONTEXT__CORR__SM2SM()
	 * @see #getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM();

	/**
	 * Returns the meta object for the reference '{@link JavaExchange.SimpleParam2SimpleParamRule__Marker#getCREATE__CORR__SPa2SPa <em>CREATE CORR SPa2 SPa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>CREATE CORR SPa2 SPa</em>'.
	 * @see JavaExchange.SimpleParam2SimpleParamRule__Marker#getCREATE__CORR__SPa2SPa()
	 * @see #getSimpleParam2SimpleParamRule__Marker()
	 * @generated
	 */
	EReference getSimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JavaExchangeFactory getJavaExchangeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimplePackage2SimplePackageImpl <em>Simple Package2 Simple Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimplePackage2SimplePackageImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimplePackage2SimplePackage()
		 * @generated
		 */
		EClass SIMPLE_PACKAGE2_SIMPLE_PACKAGE = eINSTANCE.getSimplePackage2SimplePackage();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PACKAGE2_SIMPLE_PACKAGE__SOURCE = eINSTANCE.getSimplePackage2SimplePackage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PACKAGE2_SIMPLE_PACKAGE__TARGET = eINSTANCE.getSimplePackage2SimplePackage_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleClass2SimpleClassImpl <em>Simple Class2 Simple Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleClass2SimpleClassImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleClass2SimpleClass()
		 * @generated
		 */
		EClass SIMPLE_CLASS2_SIMPLE_CLASS = eINSTANCE.getSimpleClass2SimpleClass();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS__SOURCE = eINSTANCE.getSimpleClass2SimpleClass_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS__TARGET = eINSTANCE.getSimpleClass2SimpleClass_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleField2SimpleFieldImpl <em>Simple Field2 Simple Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleField2SimpleFieldImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleField2SimpleField()
		 * @generated
		 */
		EClass SIMPLE_FIELD2_SIMPLE_FIELD = eINSTANCE.getSimpleField2SimpleField();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD__SOURCE = eINSTANCE.getSimpleField2SimpleField_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD__TARGET = eINSTANCE.getSimpleField2SimpleField_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleMethod2SimpleMethodImpl <em>Simple Method2 Simple Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleMethod2SimpleMethodImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleMethod2SimpleMethod()
		 * @generated
		 */
		EClass SIMPLE_METHOD2_SIMPLE_METHOD = eINSTANCE.getSimpleMethod2SimpleMethod();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD__SOURCE = eINSTANCE.getSimpleMethod2SimpleMethod_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD__TARGET = eINSTANCE.getSimpleMethod2SimpleMethod_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleParam2SimpleParamImpl <em>Simple Param2 Simple Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleParam2SimpleParamImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleParam2SimpleParam()
		 * @generated
		 */
		EClass SIMPLE_PARAM2_SIMPLE_PARAM = eINSTANCE.getSimpleParam2SimpleParam();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE = eINSTANCE.getSimpleParam2SimpleParam_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM__TARGET = eINSTANCE.getSimpleParam2SimpleParam_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.TypeRef2TypeRefImpl <em>Type Ref2 Type Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.TypeRef2TypeRefImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getTypeRef2TypeRef()
		 * @generated
		 */
		EClass TYPE_REF2_TYPE_REF = eINSTANCE.getTypeRef2TypeRef();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF2_TYPE_REF__SOURCE = eINSTANCE.getTypeRef2TypeRef_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_REF2_TYPE_REF__TARGET = eINSTANCE.getTypeRef2TypeRef_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.Type2TypeImpl <em>Type2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.Type2TypeImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getType2Type()
		 * @generated
		 */
		EClass TYPE2_TYPE = eINSTANCE.getType2Type();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE2_TYPE__SOURCE = eINSTANCE.getType2Type_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE2_TYPE__TARGET = eINSTANCE.getType2Type_Target();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl <em>Field Type2 Field Type Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getFieldType2FieldTypeRule__Marker()
		 * @generated
		 */
		EClass FIELD_TYPE2_FIELD_TYPE_RULE_MARKER = eINSTANCE.getFieldType2FieldTypeRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD = eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF = eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD = eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF = eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR SF2SF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF = eINSTANCE.getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR TR2TR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR = eINSTANCE.getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl <em>Generic Type2 Generic Type Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getGenericType2GenericTypeRule__Marker()
		 * @generated
		 */
		EClass GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER = eINSTANCE.getGenericType2GenericTypeRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF = eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__SRC__srcRef();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE = eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__SRC__srcType();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF = eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__TRG__trgRef();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE = eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__TRG__trgType();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR a2a</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A = eINSTANCE.getGenericType2GenericTypeRule__Marker_CONTEXT__CORR__a2a();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR b2b</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B = eINSTANCE.getGenericType2GenericTypeRule__Marker_CREATE__CORR__b2b();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl <em>Param Type2 Param Type Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getParamType2ParamTypeRule__Marker()
		 * @generated
		 */
		EClass PARAM_TYPE2_PARAM_TYPE_RULE_MARKER = eINSTANCE.getParamType2ParamTypeRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM = eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF = eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM = eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF = eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR SPa2 SPa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA = eINSTANCE.getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR TR2TR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR = eINSTANCE.getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl <em>Primitive Type2 Primitive Type Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getPrimitiveType2PrimitiveTypeRule__Marker()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__SRC__srcRef();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__SRC__srcType();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__TRG__trgRef();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__TRG__trgType();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR T2T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CREATE__CORR__T2T();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR TR2TR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR = eINSTANCE.getPrimitiveType2PrimitiveTypeRule__Marker_CONTEXT__CORR__TR2TR();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl <em>Second Type Ref2 Second Type Ref Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSecondTypeRef2SecondTypeRefRule__Marker()
		 * @generated
		 */
		EClass SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Ref2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2 = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcRef2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__SRC__srcType();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Ref2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2 = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgRef2();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__TRG__trgType();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR T2T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__T2T();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR TR2TR</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR TR2TR2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2 = eINSTANCE.getSecondTypeRef2SecondTypeRefRule__Marker_CONTEXT__CORR__TR2TR2();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl <em>Simple Class2 Simple Class Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleClass2SimpleClassRule__Marker()
		 * @generated
		 */
		EClass SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER = eINSTANCE.getSimpleClass2SimpleClassRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS = eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE = eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS = eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE = eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR SC2SC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC = eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR SP2SP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP = eINSTANCE.getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl <em>Simple Field2 Simple Field Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleField2SimpleFieldRule__Marker()
		 * @generated
		 */
		EClass SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER = eINSTANCE.getSimpleField2SimpleFieldRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS = eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__SRC__srcClass();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD = eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__SRC__srcField();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS = eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__TRG__trgClass();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Field</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD = eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__TRG__trgField();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR SC2SC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC = eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CONTEXT__CORR__SC2SC();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR SF2SF</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF = eINSTANCE.getSimpleField2SimpleFieldRule__Marker_CREATE__CORR__SF2SF();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl <em>Simple Method2 Simple Method Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleMethod2SimpleMethodRule__Marker()
		 * @generated
		 */
		EClass SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__SRC__srcClass();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__SRC__srcMethod();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__TRG__trgClass();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__TRG__trgMethod();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR SC2SC</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CONTEXT__CORR__SC2SC();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR SM2SM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM = eINSTANCE.getSimpleMethod2SimpleMethodRule__Marker_CREATE__CORR__SM2SM();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl <em>Simple Package2 Simple Package Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimplePackage2SimplePackageRule__Marker()
		 * @generated
		 */
		EClass SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER = eINSTANCE.getSimplePackage2SimplePackageRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE = eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE = eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR SP2SP</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP = eINSTANCE.getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP();

		/**
		 * The meta object literal for the '{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl <em>Simple Param2 Simple Param Rule Marker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl
		 * @see JavaExchange.impl.JavaExchangePackageImpl#getSimpleParam2SimpleParamRule__Marker()
		 * @generated
		 */
		EClass SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER = eINSTANCE.getSimpleParam2SimpleParamRule__Marker();

		/**
		 * The meta object literal for the '<em><b>CONTEXT SRC src Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD = eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__SRC__srcMethod();

		/**
		 * The meta object literal for the '<em><b>CREATE SRC src Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM = eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__SRC__srcParam();

		/**
		 * The meta object literal for the '<em><b>CONTEXT TRG trg Method</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD = eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__TRG__trgMethod();

		/**
		 * The meta object literal for the '<em><b>CREATE TRG trg Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM = eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__TRG__trgParam();

		/**
		 * The meta object literal for the '<em><b>CONTEXT CORR SM2SM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM = eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CONTEXT__CORR__SM2SM();

		/**
		 * The meta object literal for the '<em><b>CREATE CORR SPa2 SPa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA = eINSTANCE.getSimpleParam2SimpleParamRule__Marker_CREATE__CORR__SPa2SPa();

	}

} //JavaExchangePackage
