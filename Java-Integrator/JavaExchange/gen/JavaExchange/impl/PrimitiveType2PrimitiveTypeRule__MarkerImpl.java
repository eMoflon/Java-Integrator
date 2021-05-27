/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.PrimitiveType2PrimitiveTypeRule__Marker;
import JavaExchange.Type2Type;
import JavaExchange.TypeRef2TypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmPrimitiveType;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type2 Primitive Type Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl#getCONTEXT__SRC__srcRef <em>CONTEXT SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl#getCREATE__SRC__srcType <em>CREATE SRC src Type</em>}</li>
 *   <li>{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl#getCONTEXT__TRG__trgRef <em>CONTEXT TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl#getCREATE__TRG__trgType <em>CREATE TRG trg Type</em>}</li>
 *   <li>{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl#getCREATE__CORR__T2T <em>CREATE CORR T2T</em>}</li>
 *   <li>{@link JavaExchange.impl.PrimitiveType2PrimitiveTypeRule__MarkerImpl#getCONTEXT__CORR__TR2TR <em>CONTEXT CORR TR2TR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveType2PrimitiveTypeRule__MarkerImpl extends TGGRuleApplicationImpl implements PrimitiveType2PrimitiveTypeRule__Marker {
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
	protected JvmPrimitiveType creatE__SRC__srcType;

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
	protected JvmPrimitiveType creatE__TRG__trgType;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__T2T() <em>CREATE CORR T2T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__T2T()
	 * @generated
	 * @ordered
	 */
	protected Type2Type creatE__CORR__T2T;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__TR2TR() <em>CONTEXT CORR TR2TR</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__TR2TR()
	 * @generated
	 * @ordered
	 */
	protected TypeRef2TypeRef contexT__CORR__TR2TR;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveType2PrimitiveTypeRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF, oldCONTEXT__SRC__srcRef, contexT__SRC__srcRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF, oldCONTEXT__SRC__srcRef, contexT__SRC__srcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmPrimitiveType getCREATE__SRC__srcType() {
		if (creatE__SRC__srcType != null && creatE__SRC__srcType.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcType = (InternalEObject)creatE__SRC__srcType;
			creatE__SRC__srcType = (JvmPrimitiveType)eResolveProxy(oldCREATE__SRC__srcType);
			if (creatE__SRC__srcType != oldCREATE__SRC__srcType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE, oldCREATE__SRC__srcType, creatE__SRC__srcType));
			}
		}
		return creatE__SRC__srcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmPrimitiveType basicGetCREATE__SRC__srcType() {
		return creatE__SRC__srcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcType(JvmPrimitiveType newCREATE__SRC__srcType) {
		JvmPrimitiveType oldCREATE__SRC__srcType = creatE__SRC__srcType;
		creatE__SRC__srcType = newCREATE__SRC__srcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE, oldCREATE__SRC__srcType, creatE__SRC__srcType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF, oldCONTEXT__TRG__trgRef, contexT__TRG__trgRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF, oldCONTEXT__TRG__trgRef, contexT__TRG__trgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmPrimitiveType getCREATE__TRG__trgType() {
		if (creatE__TRG__trgType != null && creatE__TRG__trgType.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgType = (InternalEObject)creatE__TRG__trgType;
			creatE__TRG__trgType = (JvmPrimitiveType)eResolveProxy(oldCREATE__TRG__trgType);
			if (creatE__TRG__trgType != oldCREATE__TRG__trgType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE, oldCREATE__TRG__trgType, creatE__TRG__trgType));
			}
		}
		return creatE__TRG__trgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmPrimitiveType basicGetCREATE__TRG__trgType() {
		return creatE__TRG__trgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgType(JvmPrimitiveType newCREATE__TRG__trgType) {
		JvmPrimitiveType oldCREATE__TRG__trgType = creatE__TRG__trgType;
		creatE__TRG__trgType = newCREATE__TRG__trgType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE, oldCREATE__TRG__trgType, creatE__TRG__trgType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type getCREATE__CORR__T2T() {
		if (creatE__CORR__T2T != null && creatE__CORR__T2T.eIsProxy()) {
			InternalEObject oldCREATE__CORR__T2T = (InternalEObject)creatE__CORR__T2T;
			creatE__CORR__T2T = (Type2Type)eResolveProxy(oldCREATE__CORR__T2T);
			if (creatE__CORR__T2T != oldCREATE__CORR__T2T) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T, oldCREATE__CORR__T2T, creatE__CORR__T2T));
			}
		}
		return creatE__CORR__T2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type basicGetCREATE__CORR__T2T() {
		return creatE__CORR__T2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__T2T(Type2Type newCREATE__CORR__T2T) {
		Type2Type oldCREATE__CORR__T2T = creatE__CORR__T2T;
		creatE__CORR__T2T = newCREATE__CORR__T2T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T, oldCREATE__CORR__T2T, creatE__CORR__T2T));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef getCONTEXT__CORR__TR2TR() {
		if (contexT__CORR__TR2TR != null && contexT__CORR__TR2TR.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__TR2TR = (InternalEObject)contexT__CORR__TR2TR;
			contexT__CORR__TR2TR = (TypeRef2TypeRef)eResolveProxy(oldCONTEXT__CORR__TR2TR);
			if (contexT__CORR__TR2TR != oldCONTEXT__CORR__TR2TR) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR, oldCONTEXT__CORR__TR2TR, contexT__CORR__TR2TR));
			}
		}
		return contexT__CORR__TR2TR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef basicGetCONTEXT__CORR__TR2TR() {
		return contexT__CORR__TR2TR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__TR2TR(TypeRef2TypeRef newCONTEXT__CORR__TR2TR) {
		TypeRef2TypeRef oldCONTEXT__CORR__TR2TR = contexT__CORR__TR2TR;
		contexT__CORR__TR2TR = newCONTEXT__CORR__TR2TR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR, oldCONTEXT__CORR__TR2TR, contexT__CORR__TR2TR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				if (resolve) return getCONTEXT__SRC__srcRef();
				return basicGetCONTEXT__SRC__srcRef();
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				if (resolve) return getCREATE__SRC__srcType();
				return basicGetCREATE__SRC__srcType();
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				if (resolve) return getCONTEXT__TRG__trgRef();
				return basicGetCONTEXT__TRG__trgRef();
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				if (resolve) return getCREATE__TRG__trgType();
				return basicGetCREATE__TRG__trgType();
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T:
				if (resolve) return getCREATE__CORR__T2T();
				return basicGetCREATE__CORR__T2T();
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR:
				if (resolve) return getCONTEXT__CORR__TR2TR();
				return basicGetCONTEXT__CORR__TR2TR();
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
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				setCONTEXT__SRC__srcRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				setCREATE__SRC__srcType((JvmPrimitiveType)newValue);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				setCONTEXT__TRG__trgRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				setCREATE__TRG__trgType((JvmPrimitiveType)newValue);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T:
				setCREATE__CORR__T2T((Type2Type)newValue);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR:
				setCONTEXT__CORR__TR2TR((TypeRef2TypeRef)newValue);
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
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				setCONTEXT__SRC__srcRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				setCREATE__SRC__srcType((JvmPrimitiveType)null);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				setCONTEXT__TRG__trgRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				setCREATE__TRG__trgType((JvmPrimitiveType)null);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T:
				setCREATE__CORR__T2T((Type2Type)null);
				return;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR:
				setCONTEXT__CORR__TR2TR((TypeRef2TypeRef)null);
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
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				return contexT__SRC__srcRef != null;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_SRC_SRC_TYPE:
				return creatE__SRC__srcType != null;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				return contexT__TRG__trgRef != null;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_TRG_TRG_TYPE:
				return creatE__TRG__trgType != null;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CREATE_CORR_T2T:
				return creatE__CORR__T2T != null;
			case JavaExchangePackage.PRIMITIVE_TYPE2_PRIMITIVE_TYPE_RULE_MARKER__CONTEXT_CORR_TR2TR:
				return contexT__CORR__TR2TR != null;
		}
		return super.eIsSet(featureID);
	}

} //PrimitiveType2PrimitiveTypeRule__MarkerImpl
