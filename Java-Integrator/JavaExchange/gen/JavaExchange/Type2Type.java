/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type2 Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.Type2Type#getSource <em>Source</em>}</li>
 *   <li>{@link JavaExchange.Type2Type#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getType2Type()
 * @model
 * @generated
 */
public interface Type2Type extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(JvmType)
	 * @see JavaExchange.JavaExchangePackage#getType2Type_Source()
	 * @model
	 * @generated
	 */
	JvmType getSource();

	/**
	 * Sets the value of the '{@link JavaExchange.Type2Type#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(JvmType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JvmType)
	 * @see JavaExchange.JavaExchangePackage#getType2Type_Target()
	 * @model
	 * @generated
	 */
	JvmType getTarget();

	/**
	 * Sets the value of the '{@link JavaExchange.Type2Type#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JvmType value);

} // Type2Type
