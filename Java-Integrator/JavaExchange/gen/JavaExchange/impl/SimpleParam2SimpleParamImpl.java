/**
 */
package JavaExchange.impl;

import JavaExchange.JavaExchangePackage;
import JavaExchange.SimpleParam2SimpleParam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.simplejava.simpleJava.SimpleParam;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Param2 Simple Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamImpl#getSource <em>Source</em>}</li>
 *   <li>{@link JavaExchange.impl.SimpleParam2SimpleParamImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleParam2SimpleParamImpl extends MinimalEObjectImpl.Container implements SimpleParam2SimpleParam {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SimpleParam target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleParam2SimpleParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JavaExchangePackage.Literals.SIMPLE_PARAM2_SIMPLE_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SimpleParam)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SimpleParam newSource) {
		SimpleParam oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SimpleParam)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParam basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SimpleParam newTarget) {
		SimpleParam oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE:
				setSource((SimpleParam)newValue);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__TARGET:
				setTarget((SimpleParam)newValue);
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
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE:
				setSource((SimpleParam)null);
				return;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__TARGET:
				setTarget((SimpleParam)null);
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
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__SOURCE:
				return source != null;
			case JavaExchangePackage.SIMPLE_PARAM2_SIMPLE_PARAM__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //SimpleParam2SimpleParamImpl
