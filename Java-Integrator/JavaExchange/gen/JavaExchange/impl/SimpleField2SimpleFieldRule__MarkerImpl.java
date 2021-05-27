/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SimpleClass2SimpleClass;
import JavaExchange.SimpleField2SimpleField;
import JavaExchange.SimpleField2SimpleFieldRule__Marker;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.simplejava.simpleJava.SimpleClass;
import org.xtext.simplejava.simpleJava.SimpleField;

import runtime.impl.TGGRuleApplicationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Field2 Simple Field Rule Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl#getCONTEXT__SRC__srcClass <em>CONTEXT SRC src Class</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl#getCREATE__SRC__srcField <em>CREATE SRC src Field</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl#getCONTEXT__TRG__trgClass <em>CONTEXT TRG trg Class</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl#getCREATE__TRG__trgField <em>CREATE TRG trg Field</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl#getCONTEXT__CORR__SC2SC <em>CONTEXT CORR SC2SC</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleField2SimpleFieldRule__MarkerImpl#getCREATE__CORR__SF2SF <em>CREATE CORR SF2SF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleField2SimpleFieldRule__MarkerImpl extends TGGRuleApplicationImpl implements SimpleField2SimpleFieldRule__Marker {
	/**
	 * The cached value of the '{@link #getCONTEXT__SRC__srcClass() <em>CONTEXT SRC src Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__SRC__srcClass()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass contexT__SRC__srcClass;

	/**
	 * The cached value of the '{@link #getCREATE__SRC__srcField() <em>CREATE SRC src Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__SRC__srcField()
	 * @generated
	 * @ordered
	 */
	protected SimpleField creatE__SRC__srcField;

	/**
	 * The cached value of the '{@link #getCONTEXT__TRG__trgClass() <em>CONTEXT TRG trg Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__TRG__trgClass()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass contexT__TRG__trgClass;

	/**
	 * The cached value of the '{@link #getCREATE__TRG__trgField() <em>CREATE TRG trg Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__TRG__trgField()
	 * @generated
	 * @ordered
	 */
	protected SimpleField creatE__TRG__trgField;

	/**
	 * The cached value of the '{@link #getCONTEXT__CORR__SC2SC() <em>CONTEXT CORR SC2SC</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCONTEXT__CORR__SC2SC()
	 * @generated
	 * @ordered
	 */
	protected SimpleClass2SimpleClass contexT__CORR__SC2SC;

	/**
	 * The cached value of the '{@link #getCREATE__CORR__SF2SF() <em>CREATE CORR SF2SF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATE__CORR__SF2SF()
	 * @generated
	 * @ordered
	 */
	protected SimpleField2SimpleField creatE__CORR__SF2SF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleField2SimpleFieldRule__MarkerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass getCONTEXT__SRC__srcClass() {
		if (contexT__SRC__srcClass != null && contexT__SRC__srcClass.eIsProxy()) {
			InternalEObject oldCONTEXT__SRC__srcClass = (InternalEObject)contexT__SRC__srcClass;
			contexT__SRC__srcClass = (SimpleClass)eResolveProxy(oldCONTEXT__SRC__srcClass);
			if (contexT__SRC__srcClass != oldCONTEXT__SRC__srcClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS, oldCONTEXT__SRC__srcClass, contexT__SRC__srcClass));
			}
		}
		return contexT__SRC__srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass basicGetCONTEXT__SRC__srcClass() {
		return contexT__SRC__srcClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__SRC__srcClass(SimpleClass newCONTEXT__SRC__srcClass) {
		SimpleClass oldCONTEXT__SRC__srcClass = contexT__SRC__srcClass;
		contexT__SRC__srcClass = newCONTEXT__SRC__srcClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS, oldCONTEXT__SRC__srcClass, contexT__SRC__srcClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField getCREATE__SRC__srcField() {
		if (creatE__SRC__srcField != null && creatE__SRC__srcField.eIsProxy()) {
			InternalEObject oldCREATE__SRC__srcField = (InternalEObject)creatE__SRC__srcField;
			creatE__SRC__srcField = (SimpleField)eResolveProxy(oldCREATE__SRC__srcField);
			if (creatE__SRC__srcField != oldCREATE__SRC__srcField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD, oldCREATE__SRC__srcField, creatE__SRC__srcField));
			}
		}
		return creatE__SRC__srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField basicGetCREATE__SRC__srcField() {
		return creatE__SRC__srcField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__SRC__srcField(SimpleField newCREATE__SRC__srcField) {
		SimpleField oldCREATE__SRC__srcField = creatE__SRC__srcField;
		creatE__SRC__srcField = newCREATE__SRC__srcField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD, oldCREATE__SRC__srcField, creatE__SRC__srcField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass getCONTEXT__TRG__trgClass() {
		if (contexT__TRG__trgClass != null && contexT__TRG__trgClass.eIsProxy()) {
			InternalEObject oldCONTEXT__TRG__trgClass = (InternalEObject)contexT__TRG__trgClass;
			contexT__TRG__trgClass = (SimpleClass)eResolveProxy(oldCONTEXT__TRG__trgClass);
			if (contexT__TRG__trgClass != oldCONTEXT__TRG__trgClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS, oldCONTEXT__TRG__trgClass, contexT__TRG__trgClass));
			}
		}
		return contexT__TRG__trgClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass basicGetCONTEXT__TRG__trgClass() {
		return contexT__TRG__trgClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__TRG__trgClass(SimpleClass newCONTEXT__TRG__trgClass) {
		SimpleClass oldCONTEXT__TRG__trgClass = contexT__TRG__trgClass;
		contexT__TRG__trgClass = newCONTEXT__TRG__trgClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS, oldCONTEXT__TRG__trgClass, contexT__TRG__trgClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField getCREATE__TRG__trgField() {
		if (creatE__TRG__trgField != null && creatE__TRG__trgField.eIsProxy()) {
			InternalEObject oldCREATE__TRG__trgField = (InternalEObject)creatE__TRG__trgField;
			creatE__TRG__trgField = (SimpleField)eResolveProxy(oldCREATE__TRG__trgField);
			if (creatE__TRG__trgField != oldCREATE__TRG__trgField) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD, oldCREATE__TRG__trgField, creatE__TRG__trgField));
			}
		}
		return creatE__TRG__trgField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField basicGetCREATE__TRG__trgField() {
		return creatE__TRG__trgField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__TRG__trgField(SimpleField newCREATE__TRG__trgField) {
		SimpleField oldCREATE__TRG__trgField = creatE__TRG__trgField;
		creatE__TRG__trgField = newCREATE__TRG__trgField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD, oldCREATE__TRG__trgField, creatE__TRG__trgField));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass getCONTEXT__CORR__SC2SC() {
		if (contexT__CORR__SC2SC != null && contexT__CORR__SC2SC.eIsProxy()) {
			InternalEObject oldCONTEXT__CORR__SC2SC = (InternalEObject)contexT__CORR__SC2SC;
			contexT__CORR__SC2SC = (SimpleClass2SimpleClass)eResolveProxy(oldCONTEXT__CORR__SC2SC);
			if (contexT__CORR__SC2SC != oldCONTEXT__CORR__SC2SC) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC, oldCONTEXT__CORR__SC2SC, contexT__CORR__SC2SC));
			}
		}
		return contexT__CORR__SC2SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleClass2SimpleClass basicGetCONTEXT__CORR__SC2SC() {
		return contexT__CORR__SC2SC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCONTEXT__CORR__SC2SC(SimpleClass2SimpleClass newCONTEXT__CORR__SC2SC) {
		SimpleClass2SimpleClass oldCONTEXT__CORR__SC2SC = contexT__CORR__SC2SC;
		contexT__CORR__SC2SC = newCONTEXT__CORR__SC2SC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC, oldCONTEXT__CORR__SC2SC, contexT__CORR__SC2SC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField2SimpleField getCREATE__CORR__SF2SF() {
		if (creatE__CORR__SF2SF != null && creatE__CORR__SF2SF.eIsProxy()) {
			InternalEObject oldCREATE__CORR__SF2SF = (InternalEObject)creatE__CORR__SF2SF;
			creatE__CORR__SF2SF = (SimpleField2SimpleField)eResolveProxy(oldCREATE__CORR__SF2SF);
			if (creatE__CORR__SF2SF != oldCREATE__CORR__SF2SF) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF, oldCREATE__CORR__SF2SF, creatE__CORR__SF2SF));
			}
		}
		return creatE__CORR__SF2SF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleField2SimpleField basicGetCREATE__CORR__SF2SF() {
		return creatE__CORR__SF2SF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATE__CORR__SF2SF(SimpleField2SimpleField newCREATE__CORR__SF2SF) {
		SimpleField2SimpleField oldCREATE__CORR__SF2SF = creatE__CORR__SF2SF;
		creatE__CORR__SF2SF = newCREATE__CORR__SF2SF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF, oldCREATE__CORR__SF2SF, creatE__CORR__SF2SF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				if (resolve) return getCONTEXT__SRC__srcClass();
				return basicGetCONTEXT__SRC__srcClass();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD:
				if (resolve) return getCREATE__SRC__srcField();
				return basicGetCREATE__SRC__srcField();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				if (resolve) return getCONTEXT__TRG__trgClass();
				return basicGetCONTEXT__TRG__trgClass();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD:
				if (resolve) return getCREATE__TRG__trgField();
				return basicGetCREATE__TRG__trgField();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				if (resolve) return getCONTEXT__CORR__SC2SC();
				return basicGetCONTEXT__CORR__SC2SC();
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF:
				if (resolve) return getCREATE__CORR__SF2SF();
				return basicGetCREATE__CORR__SF2SF();
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
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				setCONTEXT__SRC__srcClass((SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD:
				setCREATE__SRC__srcField((SimpleField)newValue);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				setCONTEXT__TRG__trgClass((SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD:
				setCREATE__TRG__trgField((SimpleField)newValue);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				setCONTEXT__CORR__SC2SC((SimpleClass2SimpleClass)newValue);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF:
				setCREATE__CORR__SF2SF((SimpleField2SimpleField)newValue);
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
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				setCONTEXT__SRC__srcClass((SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD:
				setCREATE__SRC__srcField((SimpleField)null);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				setCONTEXT__TRG__trgClass((SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD:
				setCREATE__TRG__trgField((SimpleField)null);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				setCONTEXT__CORR__SC2SC((SimpleClass2SimpleClass)null);
				return;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF:
				setCREATE__CORR__SF2SF((SimpleField2SimpleField)null);
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
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_SRC_SRC_CLASS:
				return contexT__SRC__srcClass != null;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_SRC_SRC_FIELD:
				return creatE__SRC__srcField != null;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_TRG_TRG_CLASS:
				return contexT__TRG__trgClass != null;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_TRG_TRG_FIELD:
				return creatE__TRG__trgField != null;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CONTEXT_CORR_SC2SC:
				return contexT__CORR__SC2SC != null;
			case JavaExchangePackage.SIMPLE_FIELD2_SIMPLE_FIELD_RULE_MARKER__CREATE_CORR_SF2SF:
				return creatE__CORR__SF2SF != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleField2SimpleFieldRule__MarkerImpl
