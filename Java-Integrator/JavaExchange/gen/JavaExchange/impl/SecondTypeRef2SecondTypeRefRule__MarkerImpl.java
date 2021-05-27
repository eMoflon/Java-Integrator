/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SecondTypeRef2SecondTypeRefRule__Marker;
import JavaExchange.Type2Type;
import JavaExchange.TypeRef2TypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Second Type Ref2 Second Type Ref Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__SRC__srcRef <em>CONTEXT SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__SRC__srcRef2 <em>CONTEXT SRC src Ref2</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__SRC__srcType <em>CONTEXT SRC src Type</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__TRG__trgRef <em>CONTEXT TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__TRG__trgRef2 <em>CONTEXT TRG trg Ref2</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__TRG__trgType <em>CONTEXT TRG trg Type</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__CORR__T2T <em>CONTEXT CORR T2T</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__CORR__TR2TR <em>CONTEXT CORR TR2TR</em>}</li>
 *   <li>{@link JavaExchange.impl.SecondTypeRef2SecondTypeRefRule__MarkerImpl#getCONTEXT__CORR__TR2TR2 <em>CONTEXT CORR TR2TR2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondTypeRef2SecondTypeRefRule__MarkerImpl extends TGGRuleApplicationImpl implements SecondTypeRef2SecondTypeRefRule__Marker {
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
	 * The cached value of the '{@link #getCONTEXT__SRC__srcRef2() <em>CONTEXT SRC src Ref2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcRef2()
	 * @generated
	 * @ordered
	 */
	protected JvmParameterizedTypeReference contexT__SRC__srcRef2;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcType() <em>CONTEXT SRC src Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcType()
	 * @generated
	 * @ordered
	 */
	protected JvmType contexT__SRC__srcType;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__trgRef2() <em>CONTEXT TRG trg Ref2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgRef2()
	 * @generated
	 * @ordered
	 */
	protected JvmParameterizedTypeReference contexT__TRG__trgRef2;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgType() <em>CONTEXT TRG trg Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgType()
	 * @generated
	 * @ordered
	 */
	protected JvmType contexT__TRG__trgType;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__T2T() <em>CONTEXT CORR T2T</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__T2T()
	 * @generated
	 * @ordered
	 */
	protected Type2Type contexT__CORR__T2T;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__TR2TR2() <em>CONTEXT CORR TR2TR2</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__TR2TR2()
	 * @generated
	 * @ordered
	 */
	protected TypeRef2TypeRef contexT__CORR__TR2TR2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondTypeRef2SecondTypeRefRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF, oldCONTEXT__SRC__srcRef, contexT__SRC__srcRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF, oldCONTEXT__SRC__srcRef, contexT__SRC__srcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference getCONTEXT__SRC__srcRef2() {
		if (contexT__SRC__srcRef2 != null && contexT__SRC__srcRef2.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcRef2 = (InternalEObject)contexT__SRC__srcRef2;
			contexT__SRC__srcRef2 = (JvmParameterizedTypeReference)eResolveProxy(oldCONTEXT__SRC__srcRef2);
			if (contexT__SRC__srcRef2 != oldCONTEXT__SRC__srcRef2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2, oldCONTEXT__SRC__srcRef2, contexT__SRC__srcRef2));
			}
		}
		return contexT__SRC__srcRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference basicGetCONTEXT__SRC__srcRef2() {
		return contexT__SRC__srcRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcRef2(JvmParameterizedTypeReference newCONTEXT__SRC__srcRef2) {
		JvmParameterizedTypeReference oldCONTEXT__SRC__srcRef2 = contexT__SRC__srcRef2;
		contexT__SRC__srcRef2 = newCONTEXT__SRC__srcRef2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2, oldCONTEXT__SRC__srcRef2, contexT__SRC__srcRef2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmType getCONTEXT__SRC__srcType() {
		if (contexT__SRC__srcType != null && contexT__SRC__srcType.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcType = (InternalEObject)contexT__SRC__srcType;
			contexT__SRC__srcType = (JvmType)eResolveProxy(oldCONTEXT__SRC__srcType);
			if (contexT__SRC__srcType != oldCONTEXT__SRC__srcType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE, oldCONTEXT__SRC__srcType, contexT__SRC__srcType));
			}
		}
		return contexT__SRC__srcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmType basicGetCONTEXT__SRC__srcType() {
		return contexT__SRC__srcType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcType(JvmType newCONTEXT__SRC__srcType) {
		JvmType oldCONTEXT__SRC__srcType = contexT__SRC__srcType;
		contexT__SRC__srcType = newCONTEXT__SRC__srcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE, oldCONTEXT__SRC__srcType, contexT__SRC__srcType));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF, oldCONTEXT__TRG__trgRef, contexT__TRG__trgRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF, oldCONTEXT__TRG__trgRef, contexT__TRG__trgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference getCONTEXT__TRG__trgRef2() {
		if (contexT__TRG__trgRef2 != null && contexT__TRG__trgRef2.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgRef2 = (InternalEObject)contexT__TRG__trgRef2;
			contexT__TRG__trgRef2 = (JvmParameterizedTypeReference)eResolveProxy(oldCONTEXT__TRG__trgRef2);
			if (contexT__TRG__trgRef2 != oldCONTEXT__TRG__trgRef2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2, oldCONTEXT__TRG__trgRef2, contexT__TRG__trgRef2));
			}
		}
		return contexT__TRG__trgRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmParameterizedTypeReference basicGetCONTEXT__TRG__trgRef2() {
		return contexT__TRG__trgRef2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgRef2(JvmParameterizedTypeReference newCONTEXT__TRG__trgRef2) {
		JvmParameterizedTypeReference oldCONTEXT__TRG__trgRef2 = contexT__TRG__trgRef2;
		contexT__TRG__trgRef2 = newCONTEXT__TRG__trgRef2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2, oldCONTEXT__TRG__trgRef2, contexT__TRG__trgRef2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmType getCONTEXT__TRG__trgType() {
		if (contexT__TRG__trgType != null && contexT__TRG__trgType.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgType = (InternalEObject)contexT__TRG__trgType;
			contexT__TRG__trgType = (JvmType)eResolveProxy(oldCONTEXT__TRG__trgType);
			if (contexT__TRG__trgType != oldCONTEXT__TRG__trgType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE, oldCONTEXT__TRG__trgType, contexT__TRG__trgType));
			}
		}
		return contexT__TRG__trgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmType basicGetCONTEXT__TRG__trgType() {
		return contexT__TRG__trgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgType(JvmType newCONTEXT__TRG__trgType) {
		JvmType oldCONTEXT__TRG__trgType = contexT__TRG__trgType;
		contexT__TRG__trgType = newCONTEXT__TRG__trgType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE, oldCONTEXT__TRG__trgType, contexT__TRG__trgType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type getCONTEXT__CORR__T2T() {
		if (contexT__CORR__T2T != null && contexT__CORR__T2T.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__T2T = (InternalEObject)contexT__CORR__T2T;
			contexT__CORR__T2T = (Type2Type)eResolveProxy(oldCONTEXT__CORR__T2T);
			if (contexT__CORR__T2T != oldCONTEXT__CORR__T2T) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T, oldCONTEXT__CORR__T2T, contexT__CORR__T2T));
			}
		}
		return contexT__CORR__T2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type2Type basicGetCONTEXT__CORR__T2T() {
		return contexT__CORR__T2T;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__T2T(Type2Type newCONTEXT__CORR__T2T) {
		Type2Type oldCONTEXT__CORR__T2T = contexT__CORR__T2T;
		contexT__CORR__T2T = newCONTEXT__CORR__T2T;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T, oldCONTEXT__CORR__T2T, contexT__CORR__T2T));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR, oldCONTEXT__CORR__TR2TR, contexT__CORR__TR2TR));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR, oldCONTEXT__CORR__TR2TR, contexT__CORR__TR2TR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef getCONTEXT__CORR__TR2TR2() {
		if (contexT__CORR__TR2TR2 != null && contexT__CORR__TR2TR2.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__TR2TR2 = (InternalEObject)contexT__CORR__TR2TR2;
			contexT__CORR__TR2TR2 = (TypeRef2TypeRef)eResolveProxy(oldCONTEXT__CORR__TR2TR2);
			if (contexT__CORR__TR2TR2 != oldCONTEXT__CORR__TR2TR2) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2, oldCONTEXT__CORR__TR2TR2, contexT__CORR__TR2TR2));
			}
		}
		return contexT__CORR__TR2TR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeRef2TypeRef basicGetCONTEXT__CORR__TR2TR2() {
		return contexT__CORR__TR2TR2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__TR2TR2(TypeRef2TypeRef newCONTEXT__CORR__TR2TR2) {
		TypeRef2TypeRef oldCONTEXT__CORR__TR2TR2 = contexT__CORR__TR2TR2;
		contexT__CORR__TR2TR2 = newCONTEXT__CORR__TR2TR2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2, oldCONTEXT__CORR__TR2TR2, contexT__CORR__TR2TR2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				if (resolve) return getCONTEXT__SRC__srcRef();
				return basicGetCONTEXT__SRC__srcRef();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2:
				if (resolve) return getCONTEXT__SRC__srcRef2();
				return basicGetCONTEXT__SRC__srcRef2();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE:
				if (resolve) return getCONTEXT__SRC__srcType();
				return basicGetCONTEXT__SRC__srcType();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				if (resolve) return getCONTEXT__TRG__trgRef();
				return basicGetCONTEXT__TRG__trgRef();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2:
				if (resolve) return getCONTEXT__TRG__trgRef2();
				return basicGetCONTEXT__TRG__trgRef2();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE:
				if (resolve) return getCONTEXT__TRG__trgType();
				return basicGetCONTEXT__TRG__trgType();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T:
				if (resolve) return getCONTEXT__CORR__T2T();
				return basicGetCONTEXT__CORR__T2T();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR:
				if (resolve) return getCONTEXT__CORR__TR2TR();
				return basicGetCONTEXT__CORR__TR2TR();
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2:
				if (resolve) return getCONTEXT__CORR__TR2TR2();
				return basicGetCONTEXT__CORR__TR2TR2();
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
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				setCONTEXT__SRC__srcRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2:
				setCONTEXT__SRC__srcRef2((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE:
				setCONTEXT__SRC__srcType((JvmType)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				setCONTEXT__TRG__trgRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2:
				setCONTEXT__TRG__trgRef2((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE:
				setCONTEXT__TRG__trgType((JvmType)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T:
				setCONTEXT__CORR__T2T((Type2Type)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR:
				setCONTEXT__CORR__TR2TR((TypeRef2TypeRef)newValue);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2:
				setCONTEXT__CORR__TR2TR2((TypeRef2TypeRef)newValue);
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
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				setCONTEXT__SRC__srcRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2:
				setCONTEXT__SRC__srcRef2((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE:
				setCONTEXT__SRC__srcType((JvmType)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				setCONTEXT__TRG__trgRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2:
				setCONTEXT__TRG__trgRef2((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE:
				setCONTEXT__TRG__trgType((JvmType)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T:
				setCONTEXT__CORR__T2T((Type2Type)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR:
				setCONTEXT__CORR__TR2TR((TypeRef2TypeRef)null);
				return;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2:
				setCONTEXT__CORR__TR2TR2((TypeRef2TypeRef)null);
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
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF:
				return contexT__SRC__srcRef != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_REF2:
				return contexT__SRC__srcRef2 != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_SRC_SRC_TYPE:
				return contexT__SRC__srcType != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF:
				return contexT__TRG__trgRef != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_REF2:
				return contexT__TRG__trgRef2 != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_TRG_TRG_TYPE:
				return contexT__TRG__trgType != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_T2T:
				return contexT__CORR__T2T != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR:
				return contexT__CORR__TR2TR != null;
			case JavaExchangePackage.SECOND_TYPE_REF2_SECOND_TYPE_REF_RULE_MARKER__CONTEXT_CORR_TR2TR2:
				return contexT__CORR__TR2TR2 != null;
		}
		return super.eIsSet(featureID);
	}

} //SecondTypeRef2SecondTypeRefRule__MarkerImpl
