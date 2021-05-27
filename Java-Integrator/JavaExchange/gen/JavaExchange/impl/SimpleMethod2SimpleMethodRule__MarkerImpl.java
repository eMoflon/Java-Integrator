/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SimpleClass2SimpleClass;
import JavaExchange.SimpleMethod2SimpleMethod;
import JavaExchange.SimpleMethod2SimpleMethodRule__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimpleMethod;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Method2 Simple Method Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl#getCONTEXT__SRC__srcClass <em>CONTEXT SRC src Class</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl#getCREATE__SRC__srcMethod <em>CREATE SRC src Method</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl#getCONTEXT__TRG__trgClass <em>CONTEXT TRG trg Class</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl#getCREATE__TRG__trgMethod <em>CREATE TRG trg Method</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl#getCONTEXT__CORR__SC2SC <em>CONTEXT CORR SC2SC</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleMethod2SimpleMethodRule__MarkerImpl#getCREATE__CORR__SM2SM <em>CREATE CORR SM2SM</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleMethod2SimpleMethodRule__MarkerImpl extends TGGRuleApplicationImpl implements SimpleMethod2SimpleMethodRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcClass() <em>CONTEXT SRC src Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcClass()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass contexT__SRC__srcClass;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcMethod() <em>CREATE SRC src Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcMethod()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod creatE__SRC__srcMethod;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgClass() <em>CONTEXT TRG trg Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgClass()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass contexT__TRG__trgClass;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgMethod() <em>CREATE TRG trg Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgMethod()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod creatE__TRG__trgMethod;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__SC2SC() <em>CONTEXT CORR SC2SC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__SC2SC()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass2SimpleClass contexT__CORR__SC2SC;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__SM2SM() <em>CREATE CORR SM2SM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__SM2SM()
	 * @generated
	 * @ordered
	 */
	protected SimpleMethod2SimpleMethod creatE__CORR__SM2SM;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleMethod2SimpleMethodRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass getCONTEXT__SRC__srcClass() {
		if (contexT__SRC__srcClass != null && contexT__SRC__srcClass.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcClass = (InternalEObject)contexT__SRC__srcClass;
			contexT__SRC__srcClass = (SimpleClass)eResolveProxy(oldCONTEXT__SRC__srcClass);
			if (contexT__SRC__srcClass != oldCONTEXT__SRC__srcClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS, oldCONTEXT__SRC__srcClass, contexT__SRC__srcClass));
			}
		}
		return contexT__SRC__srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass basicGetCONTEXT__SRC__srcClass() {
		return contexT__SRC__srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcClass(SimpleClass newCONTEXT__SRC__srcClass) {
		SimpleClass oldCONTEXT__SRC__srcClass = contexT__SRC__srcClass;
		contexT__SRC__srcClass = newCONTEXT__SRC__srcClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS, oldCONTEXT__SRC__srcClass, contexT__SRC__srcClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod getCREATE__SRC__srcMethod() {
		if (creatE__SRC__srcMethod != null && creatE__SRC__srcMethod.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcMethod = (InternalEObject)creatE__SRC__srcMethod;
			creatE__SRC__srcMethod = (SimpleMethod)eResolveProxy(oldCREATE__SRC__srcMethod);
			if (creatE__SRC__srcMethod != oldCREATE__SRC__srcMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD, oldCREATE__SRC__srcMethod, creatE__SRC__srcMethod));
			}
		}
		return creatE__SRC__srcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod basicGetCREATE__SRC__srcMethod() {
		return creatE__SRC__srcMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcMethod(SimpleMethod newCREATE__SRC__srcMethod) {
		SimpleMethod oldCREATE__SRC__srcMethod = creatE__SRC__srcMethod;
		creatE__SRC__srcMethod = newCREATE__SRC__srcMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD, oldCREATE__SRC__srcMethod, creatE__SRC__srcMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass getCONTEXT__TRG__trgClass() {
		if (contexT__TRG__trgClass != null && contexT__TRG__trgClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgClass = (InternalEObject)contexT__TRG__trgClass;
			contexT__TRG__trgClass = (SimpleClass)eResolveProxy(oldCONTEXT__TRG__trgClass);
			if (contexT__TRG__trgClass != oldCONTEXT__TRG__trgClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS, oldCONTEXT__TRG__trgClass, contexT__TRG__trgClass));
			}
		}
		return contexT__TRG__trgClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass basicGetCONTEXT__TRG__trgClass() {
		return contexT__TRG__trgClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgClass(SimpleClass newCONTEXT__TRG__trgClass) {
		SimpleClass oldCONTEXT__TRG__trgClass = contexT__TRG__trgClass;
		contexT__TRG__trgClass = newCONTEXT__TRG__trgClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS, oldCONTEXT__TRG__trgClass, contexT__TRG__trgClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod getCREATE__TRG__trgMethod() {
		if (creatE__TRG__trgMethod != null && creatE__TRG__trgMethod.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgMethod = (InternalEObject)creatE__TRG__trgMethod;
			creatE__TRG__trgMethod = (SimpleMethod)eResolveProxy(oldCREATE__TRG__trgMethod);
			if (creatE__TRG__trgMethod != oldCREATE__TRG__trgMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD, oldCREATE__TRG__trgMethod, creatE__TRG__trgMethod));
			}
		}
		return creatE__TRG__trgMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod basicGetCREATE__TRG__trgMethod() {
		return creatE__TRG__trgMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgMethod(SimpleMethod newCREATE__TRG__trgMethod) {
		SimpleMethod oldCREATE__TRG__trgMethod = creatE__TRG__trgMethod;
		creatE__TRG__trgMethod = newCREATE__TRG__trgMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD, oldCREATE__TRG__trgMethod, creatE__TRG__trgMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass getCONTEXT__CORR__SC2SC() {
		if (contexT__CORR__SC2SC != null && contexT__CORR__SC2SC.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__SC2SC = (InternalEObject)contexT__CORR__SC2SC;
			contexT__CORR__SC2SC = (SimpleClass2SimpleClass)eResolveProxy(oldCONTEXT__CORR__SC2SC);
			if (contexT__CORR__SC2SC != oldCONTEXT__CORR__SC2SC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC, oldCONTEXT__CORR__SC2SC, contexT__CORR__SC2SC));
			}
		}
		return contexT__CORR__SC2SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass basicGetCONTEXT__CORR__SC2SC() {
		return contexT__CORR__SC2SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__SC2SC(SimpleClass2SimpleClass newCONTEXT__CORR__SC2SC) {
		SimpleClass2SimpleClass oldCONTEXT__CORR__SC2SC = contexT__CORR__SC2SC;
		contexT__CORR__SC2SC = newCONTEXT__CORR__SC2SC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC, oldCONTEXT__CORR__SC2SC, contexT__CORR__SC2SC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod2SimpleMethod getCREATE__CORR__SM2SM() {
		if (creatE__CORR__SM2SM != null && creatE__CORR__SM2SM.eIsProxy()) {
			InternalEObject oldCREATE__CORR__SM2SM = (InternalEObject)creatE__CORR__SM2SM;
			creatE__CORR__SM2SM = (SimpleMethod2SimpleMethod)eResolveProxy(oldCREATE__CORR__SM2SM);
			if (creatE__CORR__SM2SM != oldCREATE__CORR__SM2SM) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM, oldCREATE__CORR__SM2SM, creatE__CORR__SM2SM));
			}
		}
		return creatE__CORR__SM2SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMethod2SimpleMethod basicGetCREATE__CORR__SM2SM() {
		return creatE__CORR__SM2SM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__SM2SM(SimpleMethod2SimpleMethod newCREATE__CORR__SM2SM) {
		SimpleMethod2SimpleMethod oldCREATE__CORR__SM2SM = creatE__CORR__SM2SM;
		creatE__CORR__SM2SM = newCREATE__CORR__SM2SM;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM, oldCREATE__CORR__SM2SM, creatE__CORR__SM2SM));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				if (resolve) return getCONTEXT__SRC__srcClass();
				return basicGetCONTEXT__SRC__srcClass();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD:
				if (resolve) return getCREATE__SRC__srcMethod();
				return basicGetCREATE__SRC__srcMethod();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				if (resolve) return getCONTEXT__TRG__trgClass();
				return basicGetCONTEXT__TRG__trgClass();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD:
				if (resolve) return getCREATE__TRG__trgMethod();
				return basicGetCREATE__TRG__trgMethod();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				if (resolve) return getCONTEXT__CORR__SC2SC();
				return basicGetCONTEXT__CORR__SC2SC();
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM:
				if (resolve) return getCREATE__CORR__SM2SM();
				return basicGetCREATE__CORR__SM2SM();
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
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				setCONTEXT__SRC__srcClass((SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD:
				setCREATE__SRC__srcMethod((SimpleMethod)newValue);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				setCONTEXT__TRG__trgClass((SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD:
				setCREATE__TRG__trgMethod((SimpleMethod)newValue);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				setCONTEXT__CORR__SC2SC((SimpleClass2SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM:
				setCREATE__CORR__SM2SM((SimpleMethod2SimpleMethod)newValue);
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
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				setCONTEXT__SRC__srcClass((SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD:
				setCREATE__SRC__srcMethod((SimpleMethod)null);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				setCONTEXT__TRG__trgClass((SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD:
				setCREATE__TRG__trgMethod((SimpleMethod)null);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				setCONTEXT__CORR__SC2SC((SimpleClass2SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM:
				setCREATE__CORR__SM2SM((SimpleMethod2SimpleMethod)null);
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
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				return contexT__SRC__srcClass != null;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_SRC_SRC_METHOD:
				return creatE__SRC__srcMethod != null;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				return contexT__TRG__trgClass != null;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_TRG_TRG_METHOD:
				return creatE__TRG__trgMethod != null;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				return contexT__CORR__SC2SC != null;
			case JavaExchangePackage.SIMPLE_METHOD2_SIMPLE_METHOD_RULE_MARKER__CREATE_CORR_SM2SM:
				return creatE__CORR__SM2SM != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleMethod2SimpleMethodRule__MarkerImpl
