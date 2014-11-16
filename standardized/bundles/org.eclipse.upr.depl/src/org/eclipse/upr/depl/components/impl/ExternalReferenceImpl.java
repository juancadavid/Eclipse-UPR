/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 */
package org.eclipse.upr.depl.components.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.uml.ConnectableElement;

import org.eclipse.upr.depl.components.ComponentsPackage;
import org.eclipse.upr.depl.components.ExternalReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ExternalReferenceImpl#getBase_ConnectableElement <em>Base Connectable Element</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ExternalReferenceImpl#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalReferenceImpl extends EObjectImpl implements ExternalReference {
	/**
	 * The cached value of the '{@link #getBase_ConnectableElement() <em>Base Connectable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ConnectableElement()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement base_ConnectableElement;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.EXTERNAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getBase_ConnectableElement() {
		if (base_ConnectableElement != null && base_ConnectableElement.eIsProxy()) {
			InternalEObject oldBase_ConnectableElement = (InternalEObject)base_ConnectableElement;
			base_ConnectableElement = (ConnectableElement)eResolveProxy(oldBase_ConnectableElement);
			if (base_ConnectableElement != oldBase_ConnectableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT, oldBase_ConnectableElement, base_ConnectableElement));
			}
		}
		return base_ConnectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetBase_ConnectableElement() {
		return base_ConnectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ConnectableElement(ConnectableElement newBase_ConnectableElement) {
		ConnectableElement oldBase_ConnectableElement = base_ConnectableElement;
		base_ConnectableElement = newBase_ConnectableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT, oldBase_ConnectableElement, base_ConnectableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.EXTERNAL_REFERENCE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT:
				if (resolve) return getBase_ConnectableElement();
				return basicGetBase_ConnectableElement();
			case ComponentsPackage.EXTERNAL_REFERENCE__LOCATION:
				return getLocation();
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
			case ComponentsPackage.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT:
				setBase_ConnectableElement((ConnectableElement)newValue);
				return;
			case ComponentsPackage.EXTERNAL_REFERENCE__LOCATION:
				setLocation((String)newValue);
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
			case ComponentsPackage.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT:
				setBase_ConnectableElement((ConnectableElement)null);
				return;
			case ComponentsPackage.EXTERNAL_REFERENCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
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
			case ComponentsPackage.EXTERNAL_REFERENCE__BASE_CONNECTABLE_ELEMENT:
				return base_ConnectableElement != null;
			case ComponentsPackage.EXTERNAL_REFERENCE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(')');
		return result.toString();
	}

} //ExternalReferenceImpl
