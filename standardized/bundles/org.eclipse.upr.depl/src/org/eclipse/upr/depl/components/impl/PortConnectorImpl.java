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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Connector;

import org.eclipse.upr.depl.components.ComponentsPackage;
import org.eclipse.upr.depl.components.ExternalReference;
import org.eclipse.upr.depl.components.Port;
import org.eclipse.upr.depl.components.PortConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortConnectorImpl#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortConnectorImpl#getConnectedPort <em>Connected Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortConnectorImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortConnectorImpl#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortConnectorImpl extends EObjectImpl implements PortConnector {
	/**
	 * The cached value of the '{@link #getBase_Connector() <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Connector()
	 * @generated
	 * @ordered
	 */
	protected Connector base_Connector;

	/**
	 * The cached value of the '{@link #getConnectedPort() <em>Connected Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> connectedPort;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReference> externalReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.PORT_CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getBase_Connector() {
		if (base_Connector != null && base_Connector.eIsProxy()) {
			InternalEObject oldBase_Connector = (InternalEObject)base_Connector;
			base_Connector = (Connector)eResolveProxy(oldBase_Connector);
			if (base_Connector != oldBase_Connector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.PORT_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
			}
		}
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetBase_Connector() {
		return base_Connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Connector(Connector newBase_Connector) {
		Connector oldBase_Connector = base_Connector;
		base_Connector = newBase_Connector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT_CONNECTOR__BASE_CONNECTOR, oldBase_Connector, base_Connector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getConnectedPort() {
		if (connectedPort == null) {
			connectedPort = new EObjectResolvingEList<Port>(Port.class, this, ComponentsPackage.PORT_CONNECTOR__CONNECTED_PORT);
		}
		return connectedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT_CONNECTOR__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReference> getExternalReference() {
		if (externalReference == null) {
			externalReference = new EObjectResolvingEList<ExternalReference>(ExternalReference.class, this, ComponentsPackage.PORT_CONNECTOR__EXTERNAL_REFERENCE);
		}
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.PORT_CONNECTOR__BASE_CONNECTOR:
				if (resolve) return getBase_Connector();
				return basicGetBase_Connector();
			case ComponentsPackage.PORT_CONNECTOR__CONNECTED_PORT:
				return getConnectedPort();
			case ComponentsPackage.PORT_CONNECTOR__LABEL:
				return getLabel();
			case ComponentsPackage.PORT_CONNECTOR__EXTERNAL_REFERENCE:
				return getExternalReference();
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
			case ComponentsPackage.PORT_CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((Connector)newValue);
				return;
			case ComponentsPackage.PORT_CONNECTOR__CONNECTED_PORT:
				getConnectedPort().clear();
				getConnectedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case ComponentsPackage.PORT_CONNECTOR__LABEL:
				setLabel((String)newValue);
				return;
			case ComponentsPackage.PORT_CONNECTOR__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				getExternalReference().addAll((Collection<? extends ExternalReference>)newValue);
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
			case ComponentsPackage.PORT_CONNECTOR__BASE_CONNECTOR:
				setBase_Connector((Connector)null);
				return;
			case ComponentsPackage.PORT_CONNECTOR__CONNECTED_PORT:
				getConnectedPort().clear();
				return;
			case ComponentsPackage.PORT_CONNECTOR__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ComponentsPackage.PORT_CONNECTOR__EXTERNAL_REFERENCE:
				getExternalReference().clear();
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
			case ComponentsPackage.PORT_CONNECTOR__BASE_CONNECTOR:
				return base_Connector != null;
			case ComponentsPackage.PORT_CONNECTOR__CONNECTED_PORT:
				return connectedPort != null && !connectedPort.isEmpty();
			case ComponentsPackage.PORT_CONNECTOR__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ComponentsPackage.PORT_CONNECTOR__EXTERNAL_REFERENCE:
				return externalReference != null && !externalReference.isEmpty();
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //PortConnectorImpl
