/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.xtext.simplejava.simpleJava.SimpleParam;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Type2 Param Type Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__SRC__srcParam <em>CONTEXT SRC src Param</em>}</li>
 *   <li>{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__TRG__trgParam <em>CONTEXT TRG trg Param</em>}</li>
 *   <li>{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__CORR__SPa2SPa <em>CONTEXT CORR SPa2 SPa</em>}</li>
 *   <li>{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker()
 * @model
 * @generated
 */
public interface ParamType2ParamTypeRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC src Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC src Param</em>' reference.
	 * @see #setCONTEXT__SRC__srcParam(SimpleParam)
	 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker_CONTEXT__SRC__srcParam()
	 * @model required="true"
	 * @generated
	 */
	SimpleParam getCONTEXT__SRC__srcParam();

	/**
	 * Sets the value of the '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__SRC__srcParam <em>CONTEXT SRC src Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC src Param</em>' reference.
	 * @see #getCONTEXT__SRC__srcParam()
	 * @generated
	 */
	void setCONTEXT__SRC__srcParam(SimpleParam value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src Ref</em>' reference.
	 * @see #setCREATE__SRC__srcRef(JvmParameterizedTypeReference)
	 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker_CREATE__SRC__srcRef()
	 * @model required="true"
	 * @generated
	 */
	JvmParameterizedTypeReference getCREATE__SRC__srcRef();

	/**
	 * Sets the value of the '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src Ref</em>' reference.
	 * @see #getCREATE__SRC__srcRef()
	 * @generated
	 */
	void setCREATE__SRC__srcRef(JvmParameterizedTypeReference value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg Param</em>' reference.
	 * @see #setCONTEXT__TRG__trgParam(SimpleParam)
	 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker_CONTEXT__TRG__trgParam()
	 * @model required="true"
	 * @generated
	 */
	SimpleParam getCONTEXT__TRG__trgParam();

	/**
	 * Sets the value of the '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__TRG__trgParam <em>CONTEXT TRG trg Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg Param</em>' reference.
	 * @see #getCONTEXT__TRG__trgParam()
	 * @generated
	 */
	void setCONTEXT__TRG__trgParam(SimpleParam value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg Ref</em>' reference.
	 * @see #setCREATE__TRG__trgRef(JvmParameterizedTypeReference)
	 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker_CREATE__TRG__trgRef()
	 * @model required="true"
	 * @generated
	 */
	JvmParameterizedTypeReference getCREATE__TRG__trgRef();

	/**
	 * Sets the value of the '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg Ref</em>' reference.
	 * @see #getCREATE__TRG__trgRef()
	 * @generated
	 */
	void setCREATE__TRG__trgRef(JvmParameterizedTypeReference value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR SPa2 SPa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR SPa2 SPa</em>' reference.
	 * @see #setCONTEXT__CORR__SPa2SPa(SimpleParam2SimpleParam)
	 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker_CONTEXT__CORR__SPa2SPa()
	 * @model required="true"
	 * @generated
	 */
	SimpleParam2SimpleParam getCONTEXT__CORR__SPa2SPa();

	/**
	 * Sets the value of the '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCONTEXT__CORR__SPa2SPa <em>CONTEXT CORR SPa2 SPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR SPa2 SPa</em>' reference.
	 * @see #getCONTEXT__CORR__SPa2SPa()
	 * @generated
	 */
	void setCONTEXT__CORR__SPa2SPa(SimpleParam2SimpleParam value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR TR2TR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR TR2TR</em>' reference.
	 * @see #setCREATE__CORR__TR2TR(TypeRef2TypeRef)
	 * @see JavaExchange.JavaExchangePackage#getParamType2ParamTypeRule__Marker_CREATE__CORR__TR2TR()
	 * @model required="true"
	 * @generated
	 */
	TypeRef2TypeRef getCREATE__CORR__TR2TR();

	/**
	 * Sets the value of the '{@link JavaExchange.ParamType2ParamTypeRule__Marker#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR TR2TR</em>' reference.
	 * @see #getCREATE__CORR__TR2TR()
	 * @generated
	 */
	void setCREATE__CORR__TR2TR(TypeRef2TypeRef value);

} // ParamType2ParamTypeRule__Marker
