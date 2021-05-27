/**
 * generated by Xtext 2.25.0
 */
package org.xtext.simplejava.simpleJava;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.simplejava.simpleJava.SimplePackage#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.simplejava.simpleJava.SimplePackage#getSimpleClasses <em>Simple Classes</em>}</li>
 * </ul>
 *
 * @see org.xtext.simplejava.simpleJava.SimpleJavaPackage#getSimplePackage()
 * @model
 * @generated
 */
public interface SimplePackage extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.simplejava.simpleJava.SimpleJavaPackage#getSimplePackage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.simplejava.simpleJava.SimplePackage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Simple Classes</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.simplejava.simpleJava.SimpleClass}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Simple Classes</em>' containment reference list.
   * @see org.xtext.simplejava.simpleJava.SimpleJavaPackage#getSimplePackage_SimpleClasses()
   * @model containment="true"
   * @generated
   */
  EList<SimpleClass> getSimpleClasses();

} // SimplePackage
