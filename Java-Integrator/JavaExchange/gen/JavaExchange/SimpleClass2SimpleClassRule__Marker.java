/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimplePackage;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Class2 Simple Class Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__SRC__srcClass <em>CREATE SRC src Class</em>}</li>
 *   <li>{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__SRC__srcPackage <em>CONTEXT SRC src Package</em>}</li>
 *   <li>{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__TRG__trgClass <em>CREATE TRG trg Class</em>}</li>
 *   <li>{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__TRG__trgPackage <em>CONTEXT TRG trg Package</em>}</li>
 *   <li>{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__CORR__SC2SC <em>CREATE CORR SC2SC</em>}</li>
 *   <li>{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__CORR__SP2SP <em>CONTEXT CORR SP2SP</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker()
 * @model
 * @generated
 */
public interface SimpleClass2SimpleClassRule__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC src Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC src Class</em>' reference.
	 * @see #setCREATE__SRC__srcClass(SimpleClass)
	 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker_CREATE__SRC__srcClass()
	 * @model required="true"
	 * @generated
	 */
	SimpleClass getCREATE__SRC__srcClass();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__SRC__srcClass <em>CREATE SRC src Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC src Class</em>' reference.
	 * @see #getCREATE__SRC__srcClass()
	 * @generated
	 */
	void setCREATE__SRC__srcClass(SimpleClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC src Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC src Package</em>' reference.
	 * @see #setCONTEXT__SRC__srcPackage(SimplePackage)
	 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker_CONTEXT__SRC__srcPackage()
	 * @model required="true"
	 * @generated
	 */
	SimplePackage getCONTEXT__SRC__srcPackage();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__SRC__srcPackage <em>CONTEXT SRC src Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC src Package</em>' reference.
	 * @see #getCONTEXT__SRC__srcPackage()
	 * @generated
	 */
	void setCONTEXT__SRC__srcPackage(SimplePackage value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG trg Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG trg Class</em>' reference.
	 * @see #setCREATE__TRG__trgClass(SimpleClass)
	 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker_CREATE__TRG__trgClass()
	 * @model required="true"
	 * @generated
	 */
	SimpleClass getCREATE__TRG__trgClass();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__TRG__trgClass <em>CREATE TRG trg Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG trg Class</em>' reference.
	 * @see #getCREATE__TRG__trgClass()
	 * @generated
	 */
	void setCREATE__TRG__trgClass(SimpleClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG trg Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG trg Package</em>' reference.
	 * @see #setCONTEXT__TRG__trgPackage(SimplePackage)
	 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker_CONTEXT__TRG__trgPackage()
	 * @model required="true"
	 * @generated
	 */
	SimplePackage getCONTEXT__TRG__trgPackage();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__TRG__trgPackage <em>CONTEXT TRG trg Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG trg Package</em>' reference.
	 * @see #getCONTEXT__TRG__trgPackage()
	 * @generated
	 */
	void setCONTEXT__TRG__trgPackage(SimplePackage value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR SC2SC</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR SC2SC</em>' reference.
	 * @see #setCREATE__CORR__SC2SC(SimpleClass2SimpleClass)
	 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker_CREATE__CORR__SC2SC()
	 * @model required="true"
	 * @generated
	 */
	SimpleClass2SimpleClass getCREATE__CORR__SC2SC();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCREATE__CORR__SC2SC <em>CREATE CORR SC2SC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR SC2SC</em>' reference.
	 * @see #getCREATE__CORR__SC2SC()
	 * @generated
	 */
	void setCREATE__CORR__SC2SC(SimpleClass2SimpleClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR SP2SP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR SP2SP</em>' reference.
	 * @see #setCONTEXT__CORR__SP2SP(SimplePackage2SimplePackage)
	 * @see JavaExchange.JavaExchangePackage#getSimpleClass2SimpleClassRule__Marker_CONTEXT__CORR__SP2SP()
	 * @model required="true"
	 * @generated
	 */
	SimplePackage2SimplePackage getCONTEXT__CORR__SP2SP();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleClass2SimpleClassRule__Marker#getCONTEXT__CORR__SP2SP <em>CONTEXT CORR SP2SP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR SP2SP</em>' reference.
	 * @see #getCONTEXT__CORR__SP2SP()
	 * @generated
	 */
	void setCONTEXT__CORR__SP2SP(SimplePackage2SimplePackage value);

} // SimpleClass2SimpleClassRule__Marker
