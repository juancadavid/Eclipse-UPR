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
package org.eclipse.upr.depl.target.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.upr.depl.target.CommunicationPath;
import org.eclipse.upr.depl.target.Domain;
import org.eclipse.upr.depl.target.Node;
import org.eclipse.upr.depl.target.SharedResource;
import org.eclipse.upr.depl.target.TargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.impl.DomainImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.DomainImpl#getContainedCommunicationPath <em>Contained Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.DomainImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.DomainImpl#getDomainResource <em>Domain Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.DomainImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.DomainImpl#getUUID <em>UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
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
	 * The cached value of the '{@link #getContainedCommunicationPath() <em>Contained Communication Path</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedCommunicationPath()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationPath> containedCommunicationPath;

	/**
	 * The cached value of the '{@link #getContainedNode() <em>Contained Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> containedNode;

	/**
	 * The cached value of the '{@link #getDomainResource() <em>Domain Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainResource()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedResource> domainResource;

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
	 * The default value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUUID() <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUUID()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.DOMAIN;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetPackage.DOMAIN__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DOMAIN__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CommunicationPath> getContainedCommunicationPath() {
		if (containedCommunicationPath == null) {
			containedCommunicationPath = new EObjectResolvingEList<CommunicationPath>(CommunicationPath.class, this, TargetPackage.DOMAIN__CONTAINED_COMMUNICATION_PATH);
		}
		return containedCommunicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getContainedNode() {
		if (containedNode == null) {
			containedNode = new EObjectResolvingEList<Node>(Node.class, this, TargetPackage.DOMAIN__CONTAINED_NODE);
		}
		return containedNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedResource> getDomainResource() {
		if (domainResource == null) {
			domainResource = new EObjectResolvingEList<SharedResource>(SharedResource.class, this, TargetPackage.DOMAIN__DOMAIN_RESOURCE);
		}
		return domainResource;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DOMAIN__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUUID() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUUID(String newUUID) {
		String oldUUID = uuid;
		uuid = newUUID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.DOMAIN__UUID, oldUUID, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetPackage.DOMAIN__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case TargetPackage.DOMAIN__CONTAINED_COMMUNICATION_PATH:
				return getContainedCommunicationPath();
			case TargetPackage.DOMAIN__CONTAINED_NODE:
				return getContainedNode();
			case TargetPackage.DOMAIN__DOMAIN_RESOURCE:
				return getDomainResource();
			case TargetPackage.DOMAIN__LABEL:
				return getLabel();
			case TargetPackage.DOMAIN__UUID:
				return getUUID();
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
			case TargetPackage.DOMAIN__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case TargetPackage.DOMAIN__CONTAINED_COMMUNICATION_PATH:
				getContainedCommunicationPath().clear();
				getContainedCommunicationPath().addAll((Collection<? extends CommunicationPath>)newValue);
				return;
			case TargetPackage.DOMAIN__CONTAINED_NODE:
				getContainedNode().clear();
				getContainedNode().addAll((Collection<? extends Node>)newValue);
				return;
			case TargetPackage.DOMAIN__DOMAIN_RESOURCE:
				getDomainResource().clear();
				getDomainResource().addAll((Collection<? extends SharedResource>)newValue);
				return;
			case TargetPackage.DOMAIN__LABEL:
				setLabel((String)newValue);
				return;
			case TargetPackage.DOMAIN__UUID:
				setUUID((String)newValue);
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
			case TargetPackage.DOMAIN__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case TargetPackage.DOMAIN__CONTAINED_COMMUNICATION_PATH:
				getContainedCommunicationPath().clear();
				return;
			case TargetPackage.DOMAIN__CONTAINED_NODE:
				getContainedNode().clear();
				return;
			case TargetPackage.DOMAIN__DOMAIN_RESOURCE:
				getDomainResource().clear();
				return;
			case TargetPackage.DOMAIN__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case TargetPackage.DOMAIN__UUID:
				setUUID(UUID_EDEFAULT);
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
			case TargetPackage.DOMAIN__BASE_CLASS:
				return base_Class != null;
			case TargetPackage.DOMAIN__CONTAINED_COMMUNICATION_PATH:
				return containedCommunicationPath != null && !containedCommunicationPath.isEmpty();
			case TargetPackage.DOMAIN__CONTAINED_NODE:
				return containedNode != null && !containedNode.isEmpty();
			case TargetPackage.DOMAIN__DOMAIN_RESOURCE:
				return domainResource != null && !domainResource.isEmpty();
			case TargetPackage.DOMAIN__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case TargetPackage.DOMAIN__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(", UUID: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //DomainImpl
