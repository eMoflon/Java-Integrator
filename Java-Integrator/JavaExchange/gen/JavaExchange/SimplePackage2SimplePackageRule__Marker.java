/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.xtext.simplejava.simpleJava.SimplePackage;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Package2 Simple Package Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__SRC__srcPackage <em>CREATE SRC src Package</em>}</li>
 *   <li>{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__TRG__trgPackage <em>CREATE TRG trg Package</em>}</li>
 *   <li>{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__CORR__SP2SP <em>CREATE CORR SP2SP</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getSimplePackage2SimplePackageRule__Marker()
 * @model
 * @generated
 */
public interface SimplePackage2SimplePackageRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src Package</em>' reference.
	 * @see #setCREATE__SRC__srcPackage(SimplePackage)
	 * @see JavaExchange.JavaExchangePackage#getSimplePackage2SimplePackageRule__Marker_CREATE__SRC__srcPackage()
	 * @model required="true"
	 * @generated
	 */
	SimplePackage getCREATE__SRC__srcPackage();

	/**
	 * Sets the value of the '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__SRC__srcPackage <em>CREATE SRC src Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src Package</em>' reference.
	 * @see #getCREATE__SRC__srcPackage()
	 * @generated
	 */
	void setCREATE__SRC__srcPackage(SimplePackage value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg Package</em>' reference.
	 * @see #setCREATE__TRG__trgPackage(SimplePackage)
	 * @see JavaExchange.JavaExchangePackage#getSimplePackage2SimplePackageRule__Marker_CREATE__TRG__trgPackage()
	 * @model required="true"
	 * @generated
	 */
	SimplePackage getCREATE__TRG__trgPackage();

	/**
	 * Sets the value of the '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__TRG__trgPackage <em>CREATE TRG trg Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg Package</em>' reference.
	 * @see #getCREATE__TRG__trgPackage()
	 * @generated
	 */
	void setCREATE__TRG__trgPackage(SimplePackage value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR SP2SP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR SP2SP</em>' reference.
	 * @see #setCREATE__CORR__SP2SP(SimplePackage2SimplePackage)
	 * @see JavaExchange.JavaExchangePackage#getSimplePackage2SimplePackageRule__Marker_CREATE__CORR__SP2SP()
	 * @model required="true"
	 * @generated
	 */
	SimplePackage2SimplePackage getCREATE__CORR__SP2SP();

	/**
	 * Sets the value of the '{@link JavaExchange.SimplePackage2SimplePackageRule__Marker#getCREATE__CORR__SP2SP <em>CREATE CORR SP2SP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR SP2SP</em>' reference.
	 * @see #getCREATE__CORR__SP2SP()
	 * @generated
	 */
	void setCREATE__CORR__SP2SP(SimplePackage2SimplePackage value);

} // SimplePackage2SimplePackageRule__Marker
