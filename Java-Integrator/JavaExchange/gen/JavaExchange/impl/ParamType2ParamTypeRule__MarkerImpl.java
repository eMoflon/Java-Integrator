/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.ParamType2ParamTypeRule__Marker;
import JavaExchange.SimpleParam2SimpleParam;
import JavaExchange.TypeRef2TypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

import org.xtext.simplejava.simpleJava.SimpleParam;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Param Type2 Param Type Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl#getCONTEXT__SRC__srcParam <em>CONTEXT SRC src Param</em>}</li>
 *   <li>{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl#getCREATE__SRC__srcRef <em>CREATE SRC src Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl#getCONTEXT__TRG__trgParam <em>CONTEXT TRG trg Param</em>}</li>
 *   <li>{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl#getCREATE__TRG__trgRef <em>CREATE TRG trg Ref</em>}</li>
 *   <li>{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl#getCONTEXT__CORR__SPa2SPa <em>CONTEXT CORR SPa2 SPa</em>}</li>
 *   <li>{@link JavaExchange.impl.ParamType2ParamTypeRule__MarkerImpl#getCREATE__CORR__TR2TR <em>CREATE CORR TR2TR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParamType2ParamTypeRule__MarkerImpl extends TGGRuleApplicationImpl implements ParamType2ParamTypeRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcParam() <em>CONTEXT SRC src Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcParam()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam contexT__SRC__srcParam;

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
	 * The cached value of the '{@link #getCONTEXT__TRG__trgParam() <em>CONTEXT TRG trg Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgParam()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam contexT__TRG__trgParam;

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
	 * The cached value of the '{@link #getCONTEXT__CORR__SPa2SPa() <em>CONTEXT CORR SPa2 SPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__SPa2SPa()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam2SimpleParam contexT__CORR__SPa2SPa;

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
	protected ParamType2ParamTypeRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam getCONTEXT__SRC__srcParam() {
		if (contexT__SRC__srcParam != null && contexT__SRC__srcParam.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcParam = (InternalEObject)contexT__SRC__srcParam;
			contexT__SRC__srcParam = (SimpleParam)eResolveProxy(oldCONTEXT__SRC__srcParam);
			if (contexT__SRC__srcParam != oldCONTEXT__SRC__srcParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM, oldCONTEXT__SRC__srcParam, contexT__SRC__srcParam));
			}
		}
		return contexT__SRC__srcParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam basicGetCONTEXT__SRC__srcParam() {
		return contexT__SRC__srcParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcParam(SimpleParam newCONTEXT__SRC__srcParam) {
		SimpleParam oldCONTEXT__SRC__srcParam = contexT__SRC__srcParam;
		contexT__SRC__srcParam = newCONTEXT__SRC__srcParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM, oldCONTEXT__SRC__srcParam, contexT__SRC__srcParam));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF, oldCREATE__SRC__srcRef, creatE__SRC__srcRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF, oldCREATE__SRC__srcRef, creatE__SRC__srcRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam getCONTEXT__TRG__trgParam() {
		if (contexT__TRG__trgParam != null && contexT__TRG__trgParam.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgParam = (InternalEObject)contexT__TRG__trgParam;
			contexT__TRG__trgParam = (SimpleParam)eResolveProxy(oldCONTEXT__TRG__trgParam);
			if (contexT__TRG__trgParam != oldCONTEXT__TRG__trgParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM, oldCONTEXT__TRG__trgParam, contexT__TRG__trgParam));
			}
		}
		return contexT__TRG__trgParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam basicGetCONTEXT__TRG__trgParam() {
		return contexT__TRG__trgParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgParam(SimpleParam newCONTEXT__TRG__trgParam) {
		SimpleParam oldCONTEXT__TRG__trgParam = contexT__TRG__trgParam;
		contexT__TRG__trgParam = newCONTEXT__TRG__trgParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM, oldCONTEXT__TRG__trgParam, contexT__TRG__trgParam));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF, oldCREATE__TRG__trgRef, creatE__TRG__trgRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF, oldCREATE__TRG__trgRef, creatE__TRG__trgRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam2SimpleParam getCONTEXT__CORR__SPa2SPa() {
		if (contexT__CORR__SPa2SPa != null && contexT__CORR__SPa2SPa.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__SPa2SPa = (InternalEObject)contexT__CORR__SPa2SPa;
			contexT__CORR__SPa2SPa = (SimpleParam2SimpleParam)eResolveProxy(oldCONTEXT__CORR__SPa2SPa);
			if (contexT__CORR__SPa2SPa != oldCONTEXT__CORR__SPa2SPa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA, oldCONTEXT__CORR__SPa2SPa, contexT__CORR__SPa2SPa));
			}
		}
		return contexT__CORR__SPa2SPa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam2SimpleParam basicGetCONTEXT__CORR__SPa2SPa() {
		return contexT__CORR__SPa2SPa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__SPa2SPa(SimpleParam2SimpleParam newCONTEXT__CORR__SPa2SPa) {
		SimpleParam2SimpleParam oldCONTEXT__CORR__SPa2SPa = contexT__CORR__SPa2SPa;
		contexT__CORR__SPa2SPa = newCONTEXT__CORR__SPa2SPa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA, oldCONTEXT__CORR__SPa2SPa, contexT__CORR__SPa2SPa));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR, oldCREATE__CORR__TR2TR, creatE__CORR__TR2TR));
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
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR, oldCREATE__CORR__TR2TR, creatE__CORR__TR2TR));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM:
				if (resolve) return getCONTEXT__SRC__srcParam();
				return basicGetCONTEXT__SRC__srcParam();
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				if (resolve) return getCREATE__SRC__srcRef();
				return basicGetCREATE__SRC__srcRef();
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM:
				if (resolve) return getCONTEXT__TRG__trgParam();
				return basicGetCONTEXT__TRG__trgParam();
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				if (resolve) return getCREATE__TRG__trgRef();
				return basicGetCREATE__TRG__trgRef();
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA:
				if (resolve) return getCONTEXT__CORR__SPa2SPa();
				return basicGetCONTEXT__CORR__SPa2SPa();
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
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
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM:
				setCONTEXT__SRC__srcParam((SimpleParam)newValue);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				setCREATE__SRC__srcRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM:
				setCONTEXT__TRG__trgParam((SimpleParam)newValue);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				setCREATE__TRG__trgRef((JvmParameterizedTypeReference)newValue);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA:
				setCONTEXT__CORR__SPa2SPa((SimpleParam2SimpleParam)newValue);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
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
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM:
				setCONTEXT__SRC__srcParam((SimpleParam)null);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				setCREATE__SRC__srcRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM:
				setCONTEXT__TRG__trgParam((SimpleParam)null);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				setCREATE__TRG__trgRef((JvmParameterizedTypeReference)null);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA:
				setCONTEXT__CORR__SPa2SPa((SimpleParam2SimpleParam)null);
				return;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
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
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_SRC_SRC_PARAM:
				return contexT__SRC__srcParam != null;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_SRC_SRC_REF:
				return creatE__SRC__srcRef != null;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_TRG_TRG_PARAM:
				return contexT__TRG__trgParam != null;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_TRG_TRG_REF:
				return creatE__TRG__trgRef != null;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CONTEXT_CORR_SPA2_SPA:
				return contexT__CORR__SPa2SPa != null;
			case JavaExchangePackage.PARAM_TYPE2_PARAM_TYPE_RULE_MARKER__CREATE_CORR_TR2TR:
				return creatE__CORR__TR2TR != null;
		}
		return super.eIsSet(featureID);
	}

} //ParamType2ParamTypeRule__MarkerImpl
