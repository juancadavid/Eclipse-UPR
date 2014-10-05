/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Property;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CorrelationProperty;
import org.eclipse.upr.bpmnprof.CorrelationPropertyBinding;
import org.eclipse.upr.bpmnprof.FormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationPropertyBindingImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationPropertyBindingImpl#getDataPath <em>Data Path</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationPropertyBindingImpl#getCorrelationPropertyRef <em>Correlation Property Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyBindingImpl extends BaseElementImpl implements CorrelationPropertyBinding {
	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getDataPath() <em>Data Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataPath()
	 * @generated
	 * @ordered
	 */
	protected FormalExpression dataPath;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getCorrelationPropertyBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CORRELATION_PROPERTY_BINDING__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CORRELATION_PROPERTY_BINDING__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getDataPath() {
		if (dataPath != null && dataPath.eIsProxy()) {
			InternalEObject oldDataPath = (InternalEObject)dataPath;
			dataPath = (FormalExpression)eResolveProxy(oldDataPath);
			if (dataPath != oldDataPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH, oldDataPath, dataPath));
			}
		}
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression basicGetDataPath() {
		return dataPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataPath(FormalExpression newDataPath) {
		FormalExpression oldDataPath = dataPath;
		dataPath = newDataPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH, oldDataPath, dataPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty getCorrelationPropertyRef() {
		CorrelationProperty correlationPropertyRef = basicGetCorrelationPropertyRef();
		return correlationPropertyRef != null && correlationPropertyRef.eIsProxy() ? (CorrelationProperty)eResolveProxy((InternalEObject)correlationPropertyRef) : correlationPropertyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty basicGetCorrelationPropertyRef() {
		// TODO: implement this method to return the 'Correlation Property Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyRef(CorrelationProperty newCorrelationPropertyRef) {
		// TODO: implement this method to set the 'Correlation Property Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				if (resolve) return getDataPath();
				return basicGetDataPath();
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				if (resolve) return getCorrelationPropertyRef();
				return basicGetCorrelationPropertyRef();
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
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				setDataPath((FormalExpression)newValue);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				setCorrelationPropertyRef((CorrelationProperty)newValue);
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
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				setDataPath((FormalExpression)null);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				setCorrelationPropertyRef((CorrelationProperty)null);
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
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__BASE_PROPERTY:
				return base_Property != null;
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__DATA_PATH:
				return dataPath != null;
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING__CORRELATION_PROPERTY_REF:
				return basicGetCorrelationPropertyRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationPropertyBindingImpl
