/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.xtext.simplejava.simpleJava.SimpleField;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Type2 Field Type Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__SRC__srcField <em>CONTEXT SRC src Field</em>}</li>
 *   <li>{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__TRG__trgField <em>CONTEXT TRG trg Field</em>}</li>
 *   <li>{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__CORR__SF2SF <em>CONTEXT CORR SF2SF</em>}</li>
 *   <li>{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker()
 * @model
 * @generated
 */
public interface FieldType2FieldTypeRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC src Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC src Field</em>' reference.
	 * @see #setCONTEXT__SRC__srcField(SimpleField)
	 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker_CONTEXT__SRC__srcField()
	 * @model required="true"
	 * @generated
	 */
	SimpleField getCONTEXT__SRC__srcField();

	/**
	 * Sets the value of the '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__SRC__srcField <em>CONTEXT SRC src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC src Field</em>' reference.
	 * @see #getCONTEXT__SRC__srcField()
	 * @generated
	 */
	void setCONTEXT__SRC__srcField(SimpleField value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC src Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src Ref</em>' reference.
	 * @see #setCREATE__SRC__srcRef(JvmParameterizedTypeReference)
	 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker_CREATE__SRC__srcRef()
	 * @model required="true"
	 * @generated
	 */
	JvmParameterizedTypeReference getCREATE__SRC__srcRef();

	/**
	 * Sets the value of the '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src Ref</em>' reference.
	 * @see #getCREATE__SRC__srcRef()
	 * @generated
	 */
	void setCREATE__SRC__srcRef(JvmParameterizedTypeReference value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg Field</em>' reference.
	 * @see #setCONTEXT__TRG__trgField(SimpleField)
	 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker_CONTEXT__TRG__trgField()
	 * @model required="true"
	 * @generated
	 */
	SimpleField getCONTEXT__TRG__trgField();

	/**
	 * Sets the value of the '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__TRG__trgField <em>CONTEXT TRG trg Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg Field</em>' reference.
	 * @see #getCONTEXT__TRG__trgField()
	 * @generated
	 */
	void setCONTEXT__TRG__trgField(SimpleField value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg Ref</em>' reference.
	 * @see #setCREATE__TRG__trgRef(JvmParameterizedTypeReference)
	 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker_CREATE__TRG__trgRef()
	 * @model required="true"
	 * @generated
	 */
	JvmParameterizedTypeReference getCREATE__TRG__trgRef();

	/**
	 * Sets the value of the '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg Ref</em>' reference.
	 * @see #getCREATE__TRG__trgRef()
	 * @generated
	 */
	void setCREATE__TRG__trgRef(JvmParameterizedTypeReference value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR SF2SF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR SF2SF</em>' reference.
	 * @see #setCONTEXT__CORR__SF2SF(SimpleField2SimpleField)
	 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker_CONTEXT__CORR__SF2SF()
	 * @model required="true"
	 * @generated
	 */
	SimpleField2SimpleField getCONTEXT__CORR__SF2SF();

	/**
	 * Sets the value of the '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCONTEXT__CORR__SF2SF <em>CONTEXT CORR SF2SF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR SF2SF</em>' reference.
	 * @see #getCONTEXT__CORR__SF2SF()
	 * @generated
	 */
	void setCONTEXT__CORR__SF2SF(SimpleField2SimpleField value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR TR2TR</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR TR2TR</em>' reference.
	 * @see #setCREATE__CORR__TR2TR(TypeRef2TypeRef)
	 * @see JavaExchange.JavaExchangePackage#getFieldType2FieldTypeRule__Marker_CREATE__CORR__TR2TR()
	 * @model required="true"
	 * @generated
	 */
	TypeRef2TypeRef getCREATE__CORR__TR2TR();

	/**
	 * Sets the value of the '{@link JavaExchange.FieldType2FieldTypeRule__Marker#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR TR2TR</em>' reference.
	 * @see #getCREATE__CORR__TR2TR()
	 * @generated
	 */
	void setCREATE__CORR__TR2TR(TypeRef2TypeRef value);

} // FieldType2FieldTypeRule__Marker
