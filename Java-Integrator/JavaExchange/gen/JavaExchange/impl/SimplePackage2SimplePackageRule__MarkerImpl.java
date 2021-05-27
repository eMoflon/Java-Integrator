/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SimplePackage2SimplePackage;
import JavaExchange.SimplePackage2SimplePackageRule__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simplejava.simpleJava.SimplePackage;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Package2 Simple Package Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl#getCREATE__SRC__srcPackage <em>CREATE SRC src Package</em>}</li>
 *   <li>{@link JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl#getCREATE__TRG__trgPackage <em>CREATE TRG trg Package</em>}</li>
 *   <li>{@link JavaExchange.impl.SimplePackage2SimplePackageRule__MarkerImpl#getCREATE__CORR__SP2SP <em>CREATE CORR SP2SP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimplePackage2SimplePackageRule__MarkerImpl extends TGGRuleApplicationImpl implements SimplePackage2SimplePackageRule__Marker {
	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcPackage() <em>CREATE SRC src Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcPackage()
	 * @generated
	 * @ordered
	 */
	protected SimplePackage creatE__SRC__srcPackage;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgPackage() <em>CREATE TRG trg Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgPackage()
	 * @generated
	 * @ordered
	 */
	protected SimplePackage creatE__TRG__trgPackage;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__SP2SP() <em>CREATE CORR SP2SP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__SP2SP()
	 * @generated
	 * @ordered
	 */
	protected SimplePackage2SimplePackage creatE__CORR__SP2SP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimplePackage2SimplePackageRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage getCREATE__SRC__srcPackage() {
		if (creatE__SRC__srcPackage != null && creatE__SRC__srcPackage.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcPackage = (InternalEObject)creatE__SRC__srcPackage;
			creatE__SRC__srcPackage = (SimplePackage)eResolveProxy(oldCREATE__SRC__srcPackage);
			if (creatE__SRC__srcPackage != oldCREATE__SRC__srcPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE, oldCREATE__SRC__srcPackage, creatE__SRC__srcPackage));
			}
		}
		return creatE__SRC__srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage basicGetCREATE__SRC__srcPackage() {
		return creatE__SRC__srcPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcPackage(SimplePackage newCREATE__SRC__srcPackage) {
		SimplePackage oldCREATE__SRC__srcPackage = creatE__SRC__srcPackage;
		creatE__SRC__srcPackage = newCREATE__SRC__srcPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE, oldCREATE__SRC__srcPackage, creatE__SRC__srcPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage getCREATE__TRG__trgPackage() {
		if (creatE__TRG__trgPackage != null && creatE__TRG__trgPackage.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgPackage = (InternalEObject)creatE__TRG__trgPackage;
			creatE__TRG__trgPackage = (SimplePackage)eResolveProxy(oldCREATE__TRG__trgPackage);
			if (creatE__TRG__trgPackage != oldCREATE__TRG__trgPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE, oldCREATE__TRG__trgPackage, creatE__TRG__trgPackage));
			}
		}
		return creatE__TRG__trgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage basicGetCREATE__TRG__trgPackage() {
		return creatE__TRG__trgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgPackage(SimplePackage newCREATE__TRG__trgPackage) {
		SimplePackage oldCREATE__TRG__trgPackage = creatE__TRG__trgPackage;
		creatE__TRG__trgPackage = newCREATE__TRG__trgPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE, oldCREATE__TRG__trgPackage, creatE__TRG__trgPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage2SimplePackage getCREATE__CORR__SP2SP() {
		if (creatE__CORR__SP2SP != null && creatE__CORR__SP2SP.eIsProxy()) {
			InternalEObject oldCREATE__CORR__SP2SP = (InternalEObject)creatE__CORR__SP2SP;
			creatE__CORR__SP2SP = (SimplePackage2SimplePackage)eResolveProxy(oldCREATE__CORR__SP2SP);
			if (creatE__CORR__SP2SP != oldCREATE__CORR__SP2SP) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP, oldCREATE__CORR__SP2SP, creatE__CORR__SP2SP));
			}
		}
		return creatE__CORR__SP2SP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplePackage2SimplePackage basicGetCREATE__CORR__SP2SP() {
		return creatE__CORR__SP2SP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__SP2SP(SimplePackage2SimplePackage newCREATE__CORR__SP2SP) {
		SimplePackage2SimplePackage oldCREATE__CORR__SP2SP = creatE__CORR__SP2SP;
		creatE__CORR__SP2SP = newCREATE__CORR__SP2SP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP, oldCREATE__CORR__SP2SP, creatE__CORR__SP2SP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE:
				if (resolve) return getCREATE__SRC__srcPackage();
				return basicGetCREATE__SRC__srcPackage();
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE:
				if (resolve) return getCREATE__TRG__trgPackage();
				return basicGetCREATE__TRG__trgPackage();
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP:
				if (resolve) return getCREATE__CORR__SP2SP();
				return basicGetCREATE__CORR__SP2SP();
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
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE:
				setCREATE__SRC__srcPackage((SimplePackage)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE:
				setCREATE__TRG__trgPackage((SimplePackage)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP:
				setCREATE__CORR__SP2SP((SimplePackage2SimplePackage)newValue);
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
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE:
				setCREATE__SRC__srcPackage((SimplePackage)null);
				return;
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE:
				setCREATE__TRG__trgPackage((SimplePackage)null);
				return;
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP:
				setCREATE__CORR__SP2SP((SimplePackage2SimplePackage)null);
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
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_SRC_SRC_PACKAGE:
				return creatE__SRC__srcPackage != null;
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_TRG_TRG_PACKAGE:
				return creatE__TRG__trgPackage != null;
			case JavaExchangePackage.SIMPLE_PACKAGE2_SIMPLE_PACKAGE_RULE_MARKER__CREATE_CORR_SP2SP:
				return creatE__CORR__SP2SP != null;
		}
		return super.eIsSet(featureID);
	}

} //SimplePackage2SimplePackageRule__MarkerImpl
