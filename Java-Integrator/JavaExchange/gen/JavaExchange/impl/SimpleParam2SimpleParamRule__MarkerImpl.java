/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SimpleMethod2SimpleMethod;
import JavaExchange.SimpleParam2SimpleParam;
import JavaExchange.SimpleParam2SimpleParamRule__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simplejava.simpleJava.SimpleMethod;
import org.xtext.simplejava.simpleJava.SimpleParam;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Param2 Simple Param Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl#getCONTEXT__SRC__srcMethod <em>CONTEXT SRC src Method</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl#getCREATE__SRC__srcParam <em>CREATE SRC src Param</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl#getCONTEXT__TRG__trgMethod <em>CONTEXT TRG trg Method</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl#getCREATE__TRG__trgParam <em>CREATE TRG trg Param</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl#getCONTEXT__CORR__SM2SM <em>CONTEXT CORR SM2SM</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamRule__MarkerImpl#getCREATE__CORR__SPa2SPa <em>CREATE CORR SPa2 SPa</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleParam2SimpleParamRule__MarkerImpl extends TGGRuleApplicationImpl implements SimpleParam2SimpleParamRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcMethod() <em>CONTEXT SRC src Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcMethod()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod contexT__SRC__srcMethod;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcParam() <em>CREATE SRC src Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcParam()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam creatE__SRC__srcParam;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgMethod() <em>CONTEXT TRG trg Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgMethod()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod contexT__TRG__trgMethod;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgParam() <em>CREATE TRG trg Param</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgParam()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam creatE__TRG__trgParam;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__SM2SM() <em>CONTEXT CORR SM2SM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__SM2SM()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod2SimpleMethod contexT__CORR__SM2SM;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__SPa2SPa() <em>CREATE CORR SPa2 SPa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__SPa2SPa()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam2SimpleParam creatE__CORR__SPa2SPa;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleParam2SimpleParamRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod getCONTEXT__SRC__srcMethod() {
		if (contexT__SRC__srcMethod != null && contexT__SRC__srcMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcMethod = (InternalEObject)contexT__SRC__srcMethod;
			contexT__SRC__srcMethod = (SimpleMethod)eResolveProxy(oldCONTEXT__SRC__srcMethod);
			if (contexT__SRC__srcMethod != oldCONTEXT__SRC__srcMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD, oldCONTEXT__SRC__srcMethod, contexT__SRC__srcMethod));
			}
		}
		return contexT__SRC__srcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod basicGetCONTEXT__SRC__srcMethod() {
		return contexT__SRC__srcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcMethod(SimpleMethod newCONTEXT__SRC__srcMethod) {
		SimpleMethod oldCONTEXT__SRC__srcMethod = contexT__SRC__srcMethod;
		contexT__SRC__srcMethod = newCONTEXT__SRC__srcMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD, oldCONTEXT__SRC__srcMethod, contexT__SRC__srcMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam getCREATE__SRC__srcParam() {
		if (creatE__SRC__srcParam != null && creatE__SRC__srcParam.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcParam = (InternalEObject)creatE__SRC__srcParam;
			creatE__SRC__srcParam = (SimpleParam)eResolveProxy(oldCREATE__SRC__srcParam);
			if (creatE__SRC__srcParam != oldCREATE__SRC__srcParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM, oldCREATE__SRC__srcParam, creatE__SRC__srcParam));
			}
		}
		return creatE__SRC__srcParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam basicGetCREATE__SRC__srcParam() {
		return creatE__SRC__srcParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcParam(SimpleParam newCREATE__SRC__srcParam) {
		SimpleParam oldCREATE__SRC__srcParam = creatE__SRC__srcParam;
		creatE__SRC__srcParam = newCREATE__SRC__srcParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM, oldCREATE__SRC__srcParam, creatE__SRC__srcParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod getCONTEXT__TRG__trgMethod() {
		if (contexT__TRG__trgMethod != null && contexT__TRG__trgMethod.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgMethod = (InternalEObject)contexT__TRG__trgMethod;
			contexT__TRG__trgMethod = (SimpleMethod)eResolveProxy(oldCONTEXT__TRG__trgMethod);
			if (contexT__TRG__trgMethod != oldCONTEXT__TRG__trgMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD, oldCONTEXT__TRG__trgMethod, contexT__TRG__trgMethod));
			}
		}
		return contexT__TRG__trgMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod basicGetCONTEXT__TRG__trgMethod() {
		return contexT__TRG__trgMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgMethod(SimpleMethod newCONTEXT__TRG__trgMethod) {
		SimpleMethod oldCONTEXT__TRG__trgMethod = contexT__TRG__trgMethod;
		contexT__TRG__trgMethod = newCONTEXT__TRG__trgMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD, oldCONTEXT__TRG__trgMethod, contexT__TRG__trgMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam getCREATE__TRG__trgParam() {
		if (creatE__TRG__trgParam != null && creatE__TRG__trgParam.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgParam = (InternalEObject)creatE__TRG__trgParam;
			creatE__TRG__trgParam = (SimpleParam)eResolveProxy(oldCREATE__TRG__trgParam);
			if (creatE__TRG__trgParam != oldCREATE__TRG__trgParam) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM, oldCREATE__TRG__trgParam, creatE__TRG__trgParam));
			}
		}
		return creatE__TRG__trgParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam basicGetCREATE__TRG__trgParam() {
		return creatE__TRG__trgParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgParam(SimpleParam newCREATE__TRG__trgParam) {
		SimpleParam oldCREATE__TRG__trgParam = creatE__TRG__trgParam;
		creatE__TRG__trgParam = newCREATE__TRG__trgParam;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM, oldCREATE__TRG__trgParam, creatE__TRG__trgParam));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod2SimpleMethod getCONTEXT__CORR__SM2SM() {
		if (contexT__CORR__SM2SM != null && contexT__CORR__SM2SM.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__SM2SM = (InternalEObject)contexT__CORR__SM2SM;
			contexT__CORR__SM2SM = (SimpleMethod2SimpleMethod)eResolveProxy(oldCONTEXT__CORR__SM2SM);
			if (contexT__CORR__SM2SM != oldCONTEXT__CORR__SM2SM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM, oldCONTEXT__CORR__SM2SM, contexT__CORR__SM2SM));
			}
		}
		return contexT__CORR__SM2SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod2SimpleMethod basicGetCONTEXT__CORR__SM2SM() {
		return contexT__CORR__SM2SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__SM2SM(SimpleMethod2SimpleMethod newCONTEXT__CORR__SM2SM) {
		SimpleMethod2SimpleMethod oldCONTEXT__CORR__SM2SM = contexT__CORR__SM2SM;
		contexT__CORR__SM2SM = newCONTEXT__CORR__SM2SM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM, oldCONTEXT__CORR__SM2SM, contexT__CORR__SM2SM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam2SimpleParam getCREATE__CORR__SPa2SPa() {
		if (creatE__CORR__SPa2SPa != null && creatE__CORR__SPa2SPa.eIsProxy()) {
			InternalEObject oldCREATE__CORR__SPa2SPa = (InternalEObject)creatE__CORR__SPa2SPa;
			creatE__CORR__SPa2SPa = (SimpleParam2SimpleParam)eResolveProxy(oldCREATE__CORR__SPa2SPa);
			if (creatE__CORR__SPa2SPa != oldCREATE__CORR__SPa2SPa) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA, oldCREATE__CORR__SPa2SPa, creatE__CORR__SPa2SPa));
			}
		}
		return creatE__CORR__SPa2SPa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam2SimpleParam basicGetCREATE__CORR__SPa2SPa() {
		return creatE__CORR__SPa2SPa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__SPa2SPa(SimpleParam2SimpleParam newCREATE__CORR__SPa2SPa) {
		SimpleParam2SimpleParam oldCREATE__CORR__SPa2SPa = creatE__CORR__SPa2SPa;
		creatE__CORR__SPa2SPa = newCREATE__CORR__SPa2SPa;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA, oldCREATE__CORR__SPa2SPa, creatE__CORR__SPa2SPa));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD:
				if (resolve) return getCONTEXT__SRC__srcMethod();
				return basicGetCONTEXT__SRC__srcMethod();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM:
				if (resolve) return getCREATE__SRC__srcParam();
				return basicGetCREATE__SRC__srcParam();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD:
				if (resolve) return getCONTEXT__TRG__trgMethod();
				return basicGetCONTEXT__TRG__trgMethod();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM:
				if (resolve) return getCREATE__TRG__trgParam();
				return basicGetCREATE__TRG__trgParam();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM:
				if (resolve) return getCONTEXT__CORR__SM2SM();
				return basicGetCONTEXT__CORR__SM2SM();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA:
				if (resolve) return getCREATE__CORR__SPa2SPa();
				return basicGetCREATE__CORR__SPa2SPa();
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
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD:
				setCONTEXT__SRC__srcMethod((SimpleMethod)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM:
				setCREATE__SRC__srcParam((SimpleParam)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD:
				setCONTEXT__TRG__trgMethod((SimpleMethod)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM:
				setCREATE__TRG__trgParam((SimpleParam)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM:
				setCONTEXT__CORR__SM2SM((SimpleMethod2SimpleMethod)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA:
				setCREATE__CORR__SPa2SPa((SimpleParam2SimpleParam)newValue);
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
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD:
				setCONTEXT__SRC__srcMethod((SimpleMethod)null);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM:
				setCREATE__SRC__srcParam((SimpleParam)null);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD:
				setCONTEXT__TRG__trgMethod((SimpleMethod)null);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM:
				setCREATE__TRG__trgParam((SimpleParam)null);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM:
				setCONTEXT__CORR__SM2SM((SimpleMethod2SimpleMethod)null);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA:
				setCREATE__CORR__SPa2SPa((SimpleParam2SimpleParam)null);
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
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_SRC_SRC_METHOD:
				return contexT__SRC__srcMethod != null;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_SRC_SRC_PARAM:
				return creatE__SRC__srcParam != null;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_TRG_TRG_METHOD:
				return contexT__TRG__trgMethod != null;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_TRG_TRG_PARAM:
				return creatE__TRG__trgParam != null;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CONTEXT_CORR_SM2SM:
				return contexT__CORR__SM2SM != null;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM_RULE_MARKER__CREATE_CORR_SPA2_SPA:
				return creatE__CORR__SPa2SPa != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleParam2SimpleParamRule__MarkerImpl
