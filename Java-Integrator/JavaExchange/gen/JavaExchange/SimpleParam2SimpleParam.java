/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.xtext.simplejava.simpleJava.SimpleParam;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Param2 Simple Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.SimpleParam2SimpleParam#getSource <em>Source</em>}</li>
 *   <li>{@link JavaExchange.SimpleParam2SimpleParam#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getSimpleParam2SimpleParam()
 * @model
 * @generated
 */
public interface SimpleParam2SimpleParam extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SimpleParam)
	 * @see JavaExchange.JavaExchangePackage#getSimpleParam2SimpleParam_Source()
	 * @model
	 * @generated
	 */
	SimpleParam getSource();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleParam2SimpleParam#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SimpleParam value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SimpleParam)
	 * @see JavaExchange.JavaExchangePackage#getSimpleParam2SimpleParam_Target()
	 * @model
	 * @generated
	 */
	SimpleParam getTarget();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleParam2SimpleParam#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SimpleParam value);

} // SimpleParam2SimpleParam
