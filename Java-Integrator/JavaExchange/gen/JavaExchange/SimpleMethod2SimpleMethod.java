/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.xtext.simplejava.simpleJava.SimpleMethod;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Method2 Simple Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.SimpleMethod2SimpleMethod#getSource <em>Source</em>}</li>
 *   <li>{@link JavaExchange.SimpleMethod2SimpleMethod#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getSimpleMethod2SimpleMethod()
 * @model
 * @generated
 */
public interface SimpleMethod2SimpleMethod extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SimpleMethod)
	 * @see JavaExchange.JavaExchangePackage#getSimpleMethod2SimpleMethod_Source()
	 * @model
	 * @generated
	 */
	SimpleMethod getSource();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleMethod2SimpleMethod#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SimpleMethod value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SimpleMethod)
	 * @see JavaExchange.JavaExchangePackage#getSimpleMethod2SimpleMethod_Target()
	 * @model
	 * @generated
	 */
	SimpleMethod getTarget();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleMethod2SimpleMethod#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SimpleMethod value);

} // SimpleMethod2SimpleMethod
