/**
 */
package JavaExchange.impl;

import JavaExchange.GenericType2GenericTypeRule__Marker;
import JavaExchange.JavaExchangePackage;
import JavaExchange.Type2Type;
import JavaExchange.TypeRef2TypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type2 Generic Type Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl#getCONTEXT__SRC__srcRef <em>CONTEXT SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl#getCREATE__SRC__srcType <em>CREATE SRC src Type</em>}</li>
 *   <li>{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl#getCONTEXT__TRG__trgRef <em>CONTEXT TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl#getCREATE__TRG__trgType <em>CREATE TRG trg Type</em>}</li>
 *   <li>{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl#getCONTEXT__CORR__a2a <em>CONTEXT CORR a2a</em>}</li>
 *   <li>{@link JavaExchange.impl.GenericType2GenericTypeRule__MarkerImpl#getCREATE__CORR__b2b <em>CREATE CORR b2b</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericType2GenericTypeRule__MarkerImpl extends TGGRuleApplicationImpl implements GenericType2GenericTypeRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcRef() <em>CONTEXT SRC src Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcRef()
	 * @generated
	 * @ordered
	 */
	protected JvmParameterizedTypeReference contexT__SRC__srcRef;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcType() <em>CREATE SRC src Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcType()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType creatE__SRC__srcType;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgRef() <em>CONTEXT TRG trg Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgRef()
	 * @generated
	 * @ordered
	 */
	protected JvmParameterizedTypeReference contexT__TRG__trgRef;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgType() <em>CREATE TRG trg Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgType()
	 * @generated
	 * @ordered
	 */
	protected JvmGenericType creatE__TRG__trgType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__a2a() <em>CONTEXT CORR a2a</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__a2a()
	 * @generated
	 * @ordered
	 */
	protected TypeRef2TypeRef contexT__CORR__a2a;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__b2b() <em>CREATE CORR b2b</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__b2b()
	 * @generated
	 * @ordered
	 */
	protected Type2Type creatE__CORR__b2b;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenericType2GenericTypeRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference getCONTEXT__SRC__srcRef() {
		if (contexT__SRC__srcRef != null && contexT__SRC__srcRef.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcRef = (InternalEObject)contexT__SRC__srcRef;
			contexT__SRC__srcRef = (JvmParameterizedTypeReference)eResolveProxy(oldCONTEXT__SRC__srcRef);
			if (contexT__SRC__srcRef != oldCONTEXT__SRC__srcRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF, oldCONTEXT__SRC__srcRef, contexT__SRC__srcRef));
			}
		}
		return contexT__SRC__srcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference basicGetCONTEXT__SRC__srcRef() {
		return contexT__SRC__srcRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcRef(JvmParameterizedTypeReference newCONTEXT__SRC__srcRef) {
		JvmParameterizedTypeReference oldCONTEXT__SRC__srcRef = contexT__SRC__srcRef;
		contexT__SRC__srcRef = newCONTEXT__SRC__srcRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF, oldCONTEXT__SRC__srcRef, contexT__SRC__srcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getCREATE__SRC__srcType() {
		if (creatE__SRC__srcType != null && creatE__SRC__srcType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcType = (InternalEObject)creatE__SRC__srcType;
			creatE__SRC__srcType = (JvmGenericType)eResolveProxy(oldCREATE__SRC__srcType);
			if (creatE__SRC__srcType != oldCREATE__SRC__srcType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE, oldCREATE__SRC__srcType, creatE__SRC__srcType));
			}
		}
		return creatE__SRC__srcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType basicGetCREATE__SRC__srcType() {
		return creatE__SRC__srcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcType(JvmGenericType newCREATE__SRC__srcType) {
		JvmGenericType oldCREATE__SRC__srcType = creatE__SRC__srcType;
		creatE__SRC__srcType = newCREATE__SRC__srcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE, oldCREATE__SRC__srcType, creatE__SRC__srcType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference getCONTEXT__TRG__trgRef() {
		if (contexT__TRG__trgRef != null && contexT__TRG__trgRef.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgRef = (InternalEObject)contexT__TRG__trgRef;
			contexT__TRG__trgRef = (JvmParameterizedTypeReference)eResolveProxy(oldCONTEXT__TRG__trgRef);
			if (contexT__TRG__trgRef != oldCONTEXT__TRG__trgRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF, oldCONTEXT__TRG__trgRef, contexT__TRG__trgRef));
			}
		}
		return contexT__TRG__trgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference basicGetCONTEXT__TRG__trgRef() {
		return contexT__TRG__trgRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgRef(JvmParameterizedTypeReference newCONTEXT__TRG__trgRef) {
		JvmParameterizedTypeReference oldCONTEXT__TRG__trgRef = contexT__TRG__trgRef;
		contexT__TRG__trgRef = newCONTEXT__TRG__trgRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF, oldCONTEXT__TRG__trgRef, contexT__TRG__trgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType getCREATE__TRG__trgType() {
		if (creatE__TRG__trgType != null && creatE__TRG__trgType.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgType = (InternalEObject)creatE__TRG__trgType;
			creatE__TRG__trgType = (JvmGenericType)eResolveProxy(oldCREATE__TRG__trgType);
			if (creatE__TRG__trgType != oldCREATE__TRG__trgType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE, oldCREATE__TRG__trgType, creatE__TRG__trgType));
			}
		}
		return creatE__TRG__trgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmGenericType basicGetCREATE__TRG__trgType() {
		return creatE__TRG__trgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgType(JvmGenericType newCREATE__TRG__trgType) {
		JvmGenericType oldCREATE__TRG__trgType = creatE__TRG__trgType;
		creatE__TRG__trgType = newCREATE__TRG__trgType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE, oldCREATE__TRG__trgType, creatE__TRG__trgType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef getCONTEXT__CORR__a2a() {
		if (contexT__CORR__a2a != null && contexT__CORR__a2a.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__a2a = (InternalEObject)contexT__CORR__a2a;
			contexT__CORR__a2a = (TypeRef2TypeRef)eResolveProxy(oldCONTEXT__CORR__a2a);
			if (contexT__CORR__a2a != oldCONTEXT__CORR__a2a) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A, oldCONTEXT__CORR__a2a, contexT__CORR__a2a));
			}
		}
		return contexT__CORR__a2a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef basicGetCONTEXT__CORR__a2a() {
		return contexT__CORR__a2a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__a2a(TypeRef2TypeRef newCONTEXT__CORR__a2a) {
		TypeRef2TypeRef oldCONTEXT__CORR__a2a = contexT__CORR__a2a;
		contexT__CORR__a2a = newCONTEXT__CORR__a2a;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A, oldCONTEXT__CORR__a2a, contexT__CORR__a2a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type getCREATE__CORR__b2b() {
		if (creatE__CORR__b2b != null && creatE__CORR__b2b.eIsProxy()) {
			InternalEObject oldCREATE__CORR__b2b = (InternalEObject)creatE__CORR__b2b;
			creatE__CORR__b2b = (Type2Type)eResolveProxy(oldCREATE__CORR__b2b);
			if (creatE__CORR__b2b != oldCREATE__CORR__b2b) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B, oldCREATE__CORR__b2b, creatE__CORR__b2b));
			}
		}
		return creatE__CORR__b2b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type basicGetCREATE__CORR__b2b() {
		return creatE__CORR__b2b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__b2b(Type2Type newCREATE__CORR__b2b) {
		Type2Type oldCREATE__CORR__b2b = creatE__CORR__b2b;
		creatE__CORR__b2b = newCREATE__CORR__b2b;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B, oldCREATE__CORR__b2b, creatE__CORR__b2b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				if (resolve) return getCONTEXT__SRC__srcRef();
				return basicGetCONTEXT__SRC__srcRef();
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				if (resolve) return getCREATE__SRC__srcType();
				return basicGetCREATE__SRC__srcType();
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				if (resolve) return getCONTEXT__TRG__trgRef();
				return basicGetCONTEXT__TRG__trgRef();
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				if (resolve) return getCREATE__TRG__trgType();
				return basicGetCREATE__TRG__trgType();
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A:
				if (resolve) return getCONTEXT__CORR__a2a();
				return basicGetCONTEXT__CORR__a2a();
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B:
				if (resolve) return getCREATE__CORR__b2b();
				return basicGetCREATE__CORR__b2b();
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
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				setCONTEXT__SRC__srcRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				setCREATE__SRC__srcType((JvmGenericType)newValue);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				setCONTEXT__TRG__trgRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				setCREATE__TRG__trgType((JvmGenericType)newValue);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A:
				setCONTEXT__CORR__a2a((TypeRef2TypeRef)newValue);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B:
				setCREATE__CORR__b2b((Type2Type)newValue);
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
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				setCONTEXT__SRC__srcRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				setCREATE__SRC__srcType((JvmGenericType)null);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				setCONTEXT__TRG__trgRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				setCREATE__TRG__trgType((JvmGenericType)null);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A:
				setCONTEXT__CORR__a2a((TypeRef2TypeRef)null);
				return;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B:
				setCREATE__CORR__b2b((Type2Type)null);
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
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				return contexT__SRC__srcRef != null;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				return creatE__SRC__srcType != null;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				return contexT__TRG__trgRef != null;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				return creatE__TRG__trgType != null;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CONTEXT_CORR_A2A:
				return contexT__CORR__a2a != null;
			case JavaExchangePackage.GENERIC_TYPE2_GENERIC_TYPE_RULE_MARKER__CREATE_CORR_B2B:
				return creatE__CORR__b2b != null;
		}
		return super.eIsSet(featureID);
	}

} //GenericType2GenericTypeRule__MarkerImpl
