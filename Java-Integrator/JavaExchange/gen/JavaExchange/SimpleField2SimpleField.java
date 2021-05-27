/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.xtext.simplejava.simpleJava.SimpleField;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Field2 Simple Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.SimpleField2SimpleField#getSource <em>Source</em>}</li>
 *   <li>{@link JavaExchange.SimpleField2SimpleField#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getSimpleField2SimpleField()
 * @model
 * @generated
 */
public interface SimpleField2SimpleField extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SimpleField)
	 * @see JavaExchange.JavaExchangePackage#getSimpleField2SimpleField_Source()
	 * @model
	 * @generated
	 */
	SimpleField getSource();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleField2SimpleField#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SimpleField value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SimpleField)
	 * @see JavaExchange.JavaExchangePackage#getSimpleField2SimpleField_Target()
	 * @model
	 * @generated
	 */
	SimpleField getTarget();

	/**
	 * Sets the value of the '{@link JavaExchange.SimpleField2SimpleField#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SimpleField value);

} // SimpleField2SimpleField
