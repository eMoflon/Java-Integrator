/**
 */
package JavaExchange;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref2 Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.TypeRef2TypeRef#getSource <em>Source</em>}</li>
 *   <li>{@link JavaExchange.TypeRef2TypeRef#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see JavaExchange.JavaExchangePackage#getTypeRef2TypeRef()
 * @model
 * @generated
 */
public interface TypeRef2TypeRef extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(JvmParameterizedTypeReference)
	 * @see JavaExchange.JavaExchangePackage#getTypeRef2TypeRef_Source()
	 * @model
	 * @generated
	 */
	JvmParameterizedTypeReference getSource();

	/**
	 * Sets the value of the '{@link JavaExchange.TypeRef2TypeRef#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(JvmParameterizedTypeReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(JvmParameterizedTypeReference)
	 * @see JavaExchange.JavaExchangePackage#getTypeRef2TypeRef_Target()
	 * @model
	 * @generated
	 */
	JvmParameterizedTypeReference getTarget();

	/**
	 * Sets the value of the '{@link JavaExchange.TypeRef2TypeRef#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(JvmParameterizedTypeReference value);

} // TypeRef2TypeRef
