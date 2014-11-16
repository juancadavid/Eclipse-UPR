/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 */
package org.eclipse.upr.bpmnprof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CorrelationKey;
import org.eclipse.upr.bpmnprof.CorrelationPropertyBinding;
import org.eclipse.upr.bpmnprof.CorrelationSubscription;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Subscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationSubscriptionImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationSubscriptionImpl#getCorrelationKeyRef <em>Correlation Key Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationSubscriptionImpl#getCorrelationPropertyBinding <em>Correlation Property Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationSubscriptionImpl extends BaseElementImpl implements CorrelationSubscription {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationSubscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getCorrelationSubscription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CORRELATION_SUBSCRIPTION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CORRELATION_SUBSCRIPTION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey getCorrelationKeyRef() {
		CorrelationKey correlationKeyRef = basicGetCorrelationKeyRef();
		return correlationKeyRef != null && correlationKeyRef.eIsProxy() ? (CorrelationKey)eResolveProxy((InternalEObject)correlationKeyRef) : correlationKeyRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey basicGetCorrelationKeyRef() {
		// TODO: implement this method to return the 'Correlation Key Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationKeyRef(CorrelationKey newCorrelationKeyRef) {
		// TODO: implement this method to set the 'Correlation Key Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelationPropertyBinding> getCorrelationPropertyBinding() {
		// TODO: implement this method to return the 'Correlation Property Binding' reference list
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
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				if (resolve) return getCorrelationKeyRef();
				return basicGetCorrelationKeyRef();
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return getCorrelationPropertyBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((CorrelationKey)newValue);
				return;
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
				getCorrelationPropertyBinding().addAll((Collection<? extends CorrelationPropertyBinding>)newValue);
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
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				setCorrelationKeyRef((CorrelationKey)null);
				return;
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				getCorrelationPropertyBinding().clear();
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
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__BASE_CLASS:
				return base_Class != null;
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_KEY_REF:
				return basicGetCorrelationKeyRef() != null;
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION__CORRELATION_PROPERTY_BINDING:
				return !getCorrelationPropertyBinding().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrelationSubscriptionImpl
