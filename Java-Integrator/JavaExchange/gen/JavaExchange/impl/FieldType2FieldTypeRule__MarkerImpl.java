/**
 */
package JavaExchange.impl;

import JavaExchange.FieldType2FieldTypeRule__Marker;
import JavaExchange.JavaExchangePackage;
import JavaExchange.SimpleField2SimpleField;
import JavaExchange.TypeRef2TypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.xtext.simplejava.simpleJava.SimpleField;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Type2 Field Type Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl#getCONTEXT__SRC__srcField <em>CONTEXT SRC src Field</em>}</li>
 *   <li>{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl#getCONTEXT__TRG__trgField <em>CONTEXT TRG trg Field</em>}</li>
 *   <li>{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl#getCONTEXT__CORR__SF2SF <em>CONTEXT CORR SF2SF</em>}</li>
 *   <li>{@link JavaExchange.impl.FieldType2FieldTypeRule__MarkerImpl#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldType2FieldTypeRule__MarkerImpl extends TGGRuleApplicationImpl implements FieldType2FieldTypeRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcField() <em>CONTEXT SRC src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcField()
	 * @generated
	 * @ordered
	 */
	protected SimpleField contexT__SRC__srcField;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcRef() <em>CREATE SRC src Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcRef()
	 * @generated
	 * @ordered
	 */
	protected JvmParameterizedTypeReference creatE__SRC__srcRef;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgField() <em>CONTEXT TRG trg Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgField()
	 * @generated
	 * @ordered
	 */
	protected SimpleField contexT__TRG__trgField;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgRef() <em>CREATE TRG trg Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgRef()
	 * @generated
	 * @ordered
	 */
	protected JvmParameterizedTypeReference creatE__TRG__trgRef;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__SF2SF() <em>CONTEXT CORR SF2SF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__SF2SF()
	 * @generated
	 * @ordered
	 */
	protected SimpleField2SimpleField contexT__CORR__SF2SF;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__TR2TR() <em>CREATE CORR TR2TR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__TR2TR()
	 * @generated
	 * @ordered
	 */
	protected TypeRef2TypeRef creatE__CORR__TR2TR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FieldType2FieldTypeRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField getCONTEXT__SRC__srcField() {
		if (contexT__SRC__srcField != null && contexT__SRC__srcField.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcField = (InternalEObject)contexT__SRC__srcField;
			contexT__SRC__srcField = (SimpleField)eResolveProxy(oldCONTEXT__SRC__srcField);
			if (contexT__SRC__srcField != oldCONTEXT__SRC__srcField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD, oldCONTEXT__SRC__srcField, contexT__SRC__srcField));
			}
		}
		return contexT__SRC__srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField basicGetCONTEXT__SRC__srcField() {
		return contexT__SRC__srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcField(SimpleField newCONTEXT__SRC__srcField) {
		SimpleField oldCONTEXT__SRC__srcField = contexT__SRC__srcField;
		contexT__SRC__srcField = newCONTEXT__SRC__srcField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD, oldCONTEXT__SRC__srcField, contexT__SRC__srcField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference getCREATE__SRC__srcRef() {
		if (creatE__SRC__srcRef != null && creatE__SRC__srcRef.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcRef = (InternalEObject)creatE__SRC__srcRef;
			creatE__SRC__srcRef = (JvmParameterizedTypeReference)eResolveProxy(oldCREATE__SRC__srcRef);
			if (creatE__SRC__srcRef != oldCREATE__SRC__srcRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF, oldCREATE__SRC__srcRef, creatE__SRC__srcRef));
			}
		}
		return creatE__SRC__srcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference basicGetCREATE__SRC__srcRef() {
		return creatE__SRC__srcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcRef(JvmParameterizedTypeReference newCREATE__SRC__srcRef) {
		JvmParameterizedTypeReference oldCREATE__SRC__srcRef = creatE__SRC__srcRef;
		creatE__SRC__srcRef = newCREATE__SRC__srcRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF, oldCREATE__SRC__srcRef, creatE__SRC__srcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField getCONTEXT__TRG__trgField() {
		if (contexT__TRG__trgField != null && contexT__TRG__trgField.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgField = (InternalEObject)contexT__TRG__trgField;
			contexT__TRG__trgField = (SimpleField)eResolveProxy(oldCONTEXT__TRG__trgField);
			if (contexT__TRG__trgField != oldCONTEXT__TRG__trgField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD, oldCONTEXT__TRG__trgField, contexT__TRG__trgField));
			}
		}
		return contexT__TRG__trgField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField basicGetCONTEXT__TRG__trgField() {
		return contexT__TRG__trgField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgField(SimpleField newCONTEXT__TRG__trgField) {
		SimpleField oldCONTEXT__TRG__trgField = contexT__TRG__trgField;
		contexT__TRG__trgField = newCONTEXT__TRG__trgField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD, oldCONTEXT__TRG__trgField, contexT__TRG__trgField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference getCREATE__TRG__trgRef() {
		if (creatE__TRG__trgRef != null && creatE__TRG__trgRef.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgRef = (InternalEObject)creatE__TRG__trgRef;
			creatE__TRG__trgRef = (JvmParameterizedTypeReference)eResolveProxy(oldCREATE__TRG__trgRef);
			if (creatE__TRG__trgRef != oldCREATE__TRG__trgRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF, oldCREATE__TRG__trgRef, creatE__TRG__trgRef));
			}
		}
		return creatE__TRG__trgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference basicGetCREATE__TRG__trgRef() {
		return creatE__TRG__trgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgRef(JvmParameterizedTypeReference newCREATE__TRG__trgRef) {
		JvmParameterizedTypeReference oldCREATE__TRG__trgRef = creatE__TRG__trgRef;
		creatE__TRG__trgRef = newCREATE__TRG__trgRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF, oldCREATE__TRG__trgRef, creatE__TRG__trgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField2SimpleField getCONTEXT__CORR__SF2SF() {
		if (contexT__CORR__SF2SF != null && contexT__CORR__SF2SF.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__SF2SF = (InternalEObject)contexT__CORR__SF2SF;
			contexT__CORR__SF2SF = (SimpleField2SimpleField)eResolveProxy(oldCONTEXT__CORR__SF2SF);
			if (contexT__CORR__SF2SF != oldCONTEXT__CORR__SF2SF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF, oldCONTEXT__CORR__SF2SF, contexT__CORR__SF2SF));
			}
		}
		return contexT__CORR__SF2SF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField2SimpleField basicGetCONTEXT__CORR__SF2SF() {
		return contexT__CORR__SF2SF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__SF2SF(SimpleField2SimpleField newCONTEXT__CORR__SF2SF) {
		SimpleField2SimpleField oldCONTEXT__CORR__SF2SF = contexT__CORR__SF2SF;
		contexT__CORR__SF2SF = newCONTEXT__CORR__SF2SF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF, oldCONTEXT__CORR__SF2SF, contexT__CORR__SF2SF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef getCREATE__CORR__TR2TR() {
		if (creatE__CORR__TR2TR != null && creatE__CORR__TR2TR.eIsProxy()) {
			InternalEObject oldCREATE__CORR__TR2TR = (InternalEObject)creatE__CORR__TR2TR;
			creatE__CORR__TR2TR = (TypeRef2TypeRef)eResolveProxy(oldCREATE__CORR__TR2TR);
			if (creatE__CORR__TR2TR != oldCREATE__CORR__TR2TR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR, oldCREATE__CORR__TR2TR, creatE__CORR__TR2TR));
			}
		}
		return creatE__CORR__TR2TR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef basicGetCREATE__CORR__TR2TR() {
		return creatE__CORR__TR2TR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__TR2TR(TypeRef2TypeRef newCREATE__CORR__TR2TR) {
		TypeRef2TypeRef oldCREATE__CORR__TR2TR = creatE__CORR__TR2TR;
		creatE__CORR__TR2TR = newCREATE__CORR__TR2TR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR, oldCREATE__CORR__TR2TR, creatE__CORR__TR2TR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD:
				if (resolve) return getCONTEXT__SRC__srcField();
				return basicGetCONTEXT__SRC__srcField();
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				if (resolve) return getCREATE__SRC__srcRef();
				return basicGetCREATE__SRC__srcRef();
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD:
				if (resolve) return getCONTEXT__TRG__trgField();
				return basicGetCONTEXT__TRG__trgField();
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				if (resolve) return getCREATE__TRG__trgRef();
				return basicGetCREATE__TRG__trgRef();
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF:
				if (resolve) return getCONTEXT__CORR__SF2SF();
				return basicGetCONTEXT__CORR__SF2SF();
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
				if (resolve) return getCREATE__CORR__TR2TR();
				return basicGetCREATE__CORR__TR2TR();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD:
				setCONTEXT__SRC__srcField((SimpleField)newValue);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				setCREATE__SRC__srcRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD:
				setCONTEXT__TRG__trgField((SimpleField)newValue);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				setCREATE__TRG__trgRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF:
				setCONTEXT__CORR__SF2SF((SimpleField2SimpleField)newValue);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
				setCREATE__CORR__TR2TR((TypeRef2TypeRef)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD:
				setCONTEXT__SRC__srcField((SimpleField)null);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				setCREATE__SRC__srcRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD:
				setCONTEXT__TRG__trgField((SimpleField)null);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				setCREATE__TRG__trgRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF:
				setCONTEXT__CORR__SF2SF((SimpleField2SimpleField)null);
				return;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
				setCREATE__CORR__TR2TR((TypeRef2TypeRef)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_FIELD:
				return contexT__SRC__srcField != null;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				return creatE__SRC__srcRef != null;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_FIELD:
				return contexT__TRG__trgField != null;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				return creatE__TRG__trgRef != null;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CONTEXT_CORR_SF2SF:
				return contexT__CORR__SF2SF != null;
			case JavaExchangePackage.FIELD_TYPE2_FIELD_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
				return creatE__CORR__TR2TR != null;
		}
		return super.eIsSet(featureID);
	}

} //FieldType2FieldTypeRule__MarkerImpl
