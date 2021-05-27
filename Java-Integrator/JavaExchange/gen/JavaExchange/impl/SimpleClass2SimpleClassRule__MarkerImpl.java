/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SimpleClass2SimpleClass;
import JavaExchange.SimpleClass2SimpleClassRule__Marker;
import JavaExchange.SimplePackage2SimplePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimplePackage;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Class2 Simple Class Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl#getCREATE__SRC__srcClass <em>CREATE SRC src Class</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl#getCONTEXT__SRC__srcPackage <em>CONTEXT SRC src Package</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl#getCREATE__TRG__trgClass <em>CREATE TRG trg Class</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl#getCONTEXT__TRG__trgPackage <em>CONTEXT TRG trg Package</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl#getCREATE__CORR__SC2SC <em>CREATE CORR SC2SC</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleClass2SimpleClassRule__MarkerImpl#getCONTEXT__CORR__SP2SP <em>CONTEXT CORR SP2SP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleClass2SimpleClassRule__MarkerImpl extends TGGRuleApplicationImpl implements SimpleClass2SimpleClassRule__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcClass() <em>CREATE SRC src Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcClass()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass creatE__SRC__srcClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcPackage() <em>CONTEXT SRC src Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcPackage()
	 * @generated
	 * @ordered
	 */
	protected SimplePackage contexT__SRC__srcPackage;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgClass() <em>CREATE TRG trg Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgClass()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass creatE__TRG__trgClass;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgPackage() <em>CONTEXT TRG trg Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgPackage()
	 * @generated
	 * @ordered
	 */
	protected SimplePackage contexT__TRG__trgPackage;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__SC2SC() <em>CREATE CORR SC2SC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__SC2SC()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass2SimpleClass creatE__CORR__SC2SC;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__SP2SP() <em>CONTEXT CORR SP2SP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__SP2SP()
	 * @generated
	 * @ordered
	 */
	protected SimplePackage2SimplePackage contexT__CORR__SP2SP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleClass2SimpleClassRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass getCREATE__SRC__srcClass() {
		if (creatE__SRC__srcClass != null && creatE__SRC__srcClass.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcClass = (InternalEObject)creatE__SRC__srcClass;
			creatE__SRC__srcClass = (SimpleClass)eResolveProxy(oldCREATE__SRC__srcClass);
			if (creatE__SRC__srcClass != oldCREATE__SRC__srcClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS, oldCREATE__SRC__srcClass, creatE__SRC__srcClass));
			}
		}
		return creatE__SRC__srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass basicGetCREATE__SRC__srcClass() {
		return creatE__SRC__srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcClass(SimpleClass newCREATE__SRC__srcClass) {
		SimpleClass oldCREATE__SRC__srcClass = creatE__SRC__srcClass;
		creatE__SRC__srcClass = newCREATE__SRC__srcClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS, oldCREATE__SRC__srcClass, creatE__SRC__srcClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage getCONTEXT__SRC__srcPackage() {
		if (contexT__SRC__srcPackage != null && contexT__SRC__srcPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcPackage = (InternalEObject)contexT__SRC__srcPackage;
			contexT__SRC__srcPackage = (SimplePackage)eResolveProxy(oldCONTEXT__SRC__srcPackage);
			if (contexT__SRC__srcPackage != oldCONTEXT__SRC__srcPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE, oldCONTEXT__SRC__srcPackage, contexT__SRC__srcPackage));
			}
		}
		return contexT__SRC__srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage basicGetCONTEXT__SRC__srcPackage() {
		return contexT__SRC__srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcPackage(SimplePackage newCONTEXT__SRC__srcPackage) {
		SimplePackage oldCONTEXT__SRC__srcPackage = contexT__SRC__srcPackage;
		contexT__SRC__srcPackage = newCONTEXT__SRC__srcPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE, oldCONTEXT__SRC__srcPackage, contexT__SRC__srcPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass getCREATE__TRG__trgClass() {
		if (creatE__TRG__trgClass != null && creatE__TRG__trgClass.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgClass = (InternalEObject)creatE__TRG__trgClass;
			creatE__TRG__trgClass = (SimpleClass)eResolveProxy(oldCREATE__TRG__trgClass);
			if (creatE__TRG__trgClass != oldCREATE__TRG__trgClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS, oldCREATE__TRG__trgClass, creatE__TRG__trgClass));
			}
		}
		return creatE__TRG__trgClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass basicGetCREATE__TRG__trgClass() {
		return creatE__TRG__trgClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgClass(SimpleClass newCREATE__TRG__trgClass) {
		SimpleClass oldCREATE__TRG__trgClass = creatE__TRG__trgClass;
		creatE__TRG__trgClass = newCREATE__TRG__trgClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS, oldCREATE__TRG__trgClass, creatE__TRG__trgClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage getCONTEXT__TRG__trgPackage() {
		if (contexT__TRG__trgPackage != null && contexT__TRG__trgPackage.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgPackage = (InternalEObject)contexT__TRG__trgPackage;
			contexT__TRG__trgPackage = (SimplePackage)eResolveProxy(oldCONTEXT__TRG__trgPackage);
			if (contexT__TRG__trgPackage != oldCONTEXT__TRG__trgPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE, oldCONTEXT__TRG__trgPackage, contexT__TRG__trgPackage));
			}
		}
		return contexT__TRG__trgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage basicGetCONTEXT__TRG__trgPackage() {
		return contexT__TRG__trgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgPackage(SimplePackage newCONTEXT__TRG__trgPackage) {
		SimplePackage oldCONTEXT__TRG__trgPackage = contexT__TRG__trgPackage;
		contexT__TRG__trgPackage = newCONTEXT__TRG__trgPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE, oldCONTEXT__TRG__trgPackage, contexT__TRG__trgPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass getCREATE__CORR__SC2SC() {
		if (creatE__CORR__SC2SC != null && creatE__CORR__SC2SC.eIsProxy()) {
			InternalEObject oldCREATE__CORR__SC2SC = (InternalEObject)creatE__CORR__SC2SC;
			creatE__CORR__SC2SC = (SimpleClass2SimpleClass)eResolveProxy(oldCREATE__CORR__SC2SC);
			if (creatE__CORR__SC2SC != oldCREATE__CORR__SC2SC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC, oldCREATE__CORR__SC2SC, creatE__CORR__SC2SC));
			}
		}
		return creatE__CORR__SC2SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass basicGetCREATE__CORR__SC2SC() {
		return creatE__CORR__SC2SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__SC2SC(SimpleClass2SimpleClass newCREATE__CORR__SC2SC) {
		SimpleClass2SimpleClass oldCREATE__CORR__SC2SC = creatE__CORR__SC2SC;
		creatE__CORR__SC2SC = newCREATE__CORR__SC2SC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC, oldCREATE__CORR__SC2SC, creatE__CORR__SC2SC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage2SimplePackage getCONTEXT__CORR__SP2SP() {
		if (contexT__CORR__SP2SP != null && contexT__CORR__SP2SP.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__SP2SP = (InternalEObject)contexT__CORR__SP2SP;
			contexT__CORR__SP2SP = (SimplePackage2SimplePackage)eResolveProxy(oldCONTEXT__CORR__SP2SP);
			if (contexT__CORR__SP2SP != oldCONTEXT__CORR__SP2SP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP, oldCONTEXT__CORR__SP2SP, contexT__CORR__SP2SP));
			}
		}
		return contexT__CORR__SP2SP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage2SimplePackage basicGetCONTEXT__CORR__SP2SP() {
		return contexT__CORR__SP2SP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__SP2SP(SimplePackage2SimplePackage newCONTEXT__CORR__SP2SP) {
		SimplePackage2SimplePackage oldCONTEXT__CORR__SP2SP = contexT__CORR__SP2SP;
		contexT__CORR__SP2SP = newCONTEXT__CORR__SP2SP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP, oldCONTEXT__CORR__SP2SP, contexT__CORR__SP2SP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS:
				if (resolve) return getCREATE__SRC__srcClass();
				return basicGetCREATE__SRC__srcClass();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE:
				if (resolve) return getCONTEXT__SRC__srcPackage();
				return basicGetCONTEXT__SRC__srcPackage();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS:
				if (resolve) return getCREATE__TRG__trgClass();
				return basicGetCREATE__TRG__trgClass();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE:
				if (resolve) return getCONTEXT__TRG__trgPackage();
				return basicGetCONTEXT__TRG__trgPackage();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC:
				if (resolve) return getCREATE__CORR__SC2SC();
				return basicGetCREATE__CORR__SC2SC();
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP:
				if (resolve) return getCONTEXT__CORR__SP2SP();
				return basicGetCONTEXT__CORR__SP2SP();
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
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS:
				setCREATE__SRC__srcClass((SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE:
				setCONTEXT__SRC__srcPackage((SimplePackage)newValue);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS:
				setCREATE__TRG__trgClass((SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE:
				setCONTEXT__TRG__trgPackage((SimplePackage)newValue);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC:
				setCREATE__CORR__SC2SC((SimpleClass2SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP:
				setCONTEXT__CORR__SP2SP((SimplePackage2SimplePackage)newValue);
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
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS:
				setCREATE__SRC__srcClass((SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE:
				setCONTEXT__SRC__srcPackage((SimplePackage)null);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS:
				setCREATE__TRG__trgClass((SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE:
				setCONTEXT__TRG__trgPackage((SimplePackage)null);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC:
				setCREATE__CORR__SC2SC((SimpleClass2SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP:
				setCONTEXT__CORR__SP2SP((SimplePackage2SimplePackage)null);
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
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_SRC_SRC_CLASS:
				return creatE__SRC__srcClass != null;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_SRC_SRC_PACKAGE:
				return contexT__SRC__srcPackage != null;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_TRG_TRG_CLASS:
				return creatE__TRG__trgClass != null;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_TRG_TRG_PACKAGE:
				return contexT__TRG__trgPackage != null;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CREATE_CORR_SC2SC:
				return creatE__CORR__SC2SC != null;
			case JavaExchangePackage.SIMPLE_CLASS2_SIMPLE_CLASS_RULE_MARKER__CONTEXT_CORR_SP2SP:
				return contexT__CORR__SP2SP != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleClass2SimpleClassRule__MarkerImpl
