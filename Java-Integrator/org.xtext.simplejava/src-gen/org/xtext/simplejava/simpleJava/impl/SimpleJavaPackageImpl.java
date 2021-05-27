/**
 * generated by Xtext 2.25.0
 */
package org.xtext.simplejava.simpleJava.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimpleField;
import org.xtext.simplejava.simpleJava.SimpleJavaFactory;
import org.xtext.simplejava.simpleJava.SimpleJavaPackage;
import org.xtext.simplejava.simpleJava.SimpleMethod;
import org.xtext.simplejava.simpleJava.SimplePackage;
import org.xtext.simplejava.simpleJava.SimpleParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleJavaPackageImpl extends EPackageImpl implements SimpleJavaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simplePackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleClassEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleFieldEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleParamEClass = null;

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
   * @see org.xtext.simplejava.simpleJava.SimpleJavaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleJavaPackageImpl()
  {
    super(eNS_URI, SimpleJavaFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link SimpleJavaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleJavaPackage init()
  {
    if (isInited) return (SimpleJavaPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleJavaPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredSimpleJavaPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    SimpleJavaPackageImpl theSimpleJavaPackage = registeredSimpleJavaPackage instanceof SimpleJavaPackageImpl ? (SimpleJavaPackageImpl)registeredSimpleJavaPackage : new SimpleJavaPackageImpl();

    isInited = true;

    // Initialize simple dependencies
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theSimpleJavaPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleJavaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleJavaPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(SimpleJavaPackage.eNS_URI, theSimpleJavaPackage);
    return theSimpleJavaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimplePackage()
  {
    return simplePackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimplePackage_Name()
  {
    return (EAttribute)simplePackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSimplePackage_SimpleClasses()
  {
    return (EReference)simplePackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimpleClass()
  {
    return simpleClassEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleClass_Name()
  {
    return (EAttribute)simpleClassEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSimpleClass_SimpleFields()
  {
    return (EReference)simpleClassEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSimpleClass_SimpleMethods()
  {
    return (EReference)simpleClassEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimpleField()
  {
    return simpleFieldEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleField_AccessType()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleField_IsStatic()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleField_IsFinal()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSimpleField_FieldType()
  {
    return (EReference)simpleFieldEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleField_Name()
  {
    return (EAttribute)simpleFieldEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimpleMethod()
  {
    return simpleMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleMethod_AccessType()
  {
    return (EAttribute)simpleMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleMethod_Name()
  {
    return (EAttribute)simpleMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSimpleMethod_Params()
  {
    return (EReference)simpleMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSimpleParam()
  {
    return simpleParamEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSimpleParam_ParamType()
  {
    return (EReference)simpleParamEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSimpleParam_Name()
  {
    return (EAttribute)simpleParamEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleJavaFactory getSimpleJavaFactory()
  {
    return (SimpleJavaFactory)getEFactoryInstance();
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
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    simplePackageEClass = createEClass(SIMPLE_PACKAGE);
    createEAttribute(simplePackageEClass, SIMPLE_PACKAGE__NAME);
    createEReference(simplePackageEClass, SIMPLE_PACKAGE__SIMPLE_CLASSES);

    simpleClassEClass = createEClass(SIMPLE_CLASS);
    createEAttribute(simpleClassEClass, SIMPLE_CLASS__NAME);
    createEReference(simpleClassEClass, SIMPLE_CLASS__SIMPLE_FIELDS);
    createEReference(simpleClassEClass, SIMPLE_CLASS__SIMPLE_METHODS);

    simpleFieldEClass = createEClass(SIMPLE_FIELD);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__ACCESS_TYPE);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__IS_STATIC);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__IS_FINAL);
    createEReference(simpleFieldEClass, SIMPLE_FIELD__FIELD_TYPE);
    createEAttribute(simpleFieldEClass, SIMPLE_FIELD__NAME);

    simpleMethodEClass = createEClass(SIMPLE_METHOD);
    createEAttribute(simpleMethodEClass, SIMPLE_METHOD__ACCESS_TYPE);
    createEAttribute(simpleMethodEClass, SIMPLE_METHOD__NAME);
    createEReference(simpleMethodEClass, SIMPLE_METHOD__PARAMS);

    simpleParamEClass = createEClass(SIMPLE_PARAM);
    createEReference(simpleParamEClass, SIMPLE_PARAM__PARAM_TYPE);
    createEAttribute(simpleParamEClass, SIMPLE_PARAM__NAME);
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
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(simplePackageEClass, SimplePackage.class, "SimplePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimplePackage_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimplePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimplePackage_SimpleClasses(), this.getSimpleClass(), null, "simpleClasses", null, 0, -1, SimplePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleClassEClass, SimpleClass.class, "SimpleClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleClass_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleClass_SimpleFields(), this.getSimpleField(), null, "simpleFields", null, 0, -1, SimpleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleClass_SimpleMethods(), this.getSimpleMethod(), null, "simpleMethods", null, 0, -1, SimpleClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleFieldEClass, SimpleField.class, "SimpleField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleField_AccessType(), ecorePackage.getEString(), "accessType", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_IsStatic(), ecorePackage.getEBoolean(), "isStatic", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_IsFinal(), ecorePackage.getEBoolean(), "isFinal", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleField_FieldType(), theTypesPackage.getJvmParameterizedTypeReference(), null, "fieldType", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleField_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleMethodEClass, SimpleMethod.class, "SimpleMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleMethod_AccessType(), ecorePackage.getEString(), "accessType", null, 0, 1, SimpleMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleMethod_Params(), this.getSimpleParam(), null, "params", null, 0, -1, SimpleMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleParamEClass, SimpleParam.class, "SimpleParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSimpleParam_ParamType(), theTypesPackage.getJvmParameterizedTypeReference(), null, "paramType", null, 0, 1, SimpleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleParam_Name(), ecorePackage.getEString(), "name", null, 0, 1, SimpleParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimpleJavaPackageImpl