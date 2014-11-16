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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.AssociationClass;

import org.eclipse.upr.depl.target.Bridge;
import org.eclipse.upr.depl.target.CommunicationPath;
import org.eclipse.upr.depl.target.Interconnect;
import org.eclipse.upr.depl.target.Resource;
import org.eclipse.upr.depl.target.TargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bridge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.impl.BridgeImpl#getBase_AssociationClass <em>Base Association Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.BridgeImpl#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.BridgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.BridgeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.BridgeImpl#getCommunicationPath <em>Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.BridgeImpl#getInterconnect <em>Interconnect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BridgeImpl extends EObjectImpl implements Bridge {
	/**
	 * The cached value of the '{@link #getBase_AssociationClass() <em>Base Association Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_AssociationClass()
	 * @generated
	 * @ordered
	 */
	protected AssociationClass base_AssociationClass;

	/**
	 * The cached value of the '{@link #getOwnedResource() <em>Owned Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> ownedResource;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getInterconnect() <em>Interconnect</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnect()
	 * @generated
	 * @ordered
	 */
	protected EList<Interconnect> interconnect;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BridgeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.BRIDGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass getBase_AssociationClass() {
		if (base_AssociationClass != null && base_AssociationClass.eIsProxy()) {
			InternalEObject oldBase_AssociationClass = (InternalEObject)base_AssociationClass;
			base_AssociationClass = (AssociationClass)eResolveProxy(oldBase_AssociationClass);
			if (base_AssociationClass != oldBase_AssociationClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetPackage.BRIDGE__BASE_ASSOCIATION_CLASS, oldBase_AssociationClass, base_AssociationClass));
			}
		}
		return base_AssociationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationClass basicGetBase_AssociationClass() {
		return base_AssociationClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_AssociationClass(AssociationClass newBase_AssociationClass) {
		AssociationClass oldBase_AssociationClass = base_AssociationClass;
		base_AssociationClass = newBase_AssociationClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE__BASE_ASSOCIATION_CLASS, oldBase_AssociationClass, base_AssociationClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOwnedResource() {
		if (ownedResource == null) {
			ownedResource = new EObjectContainmentEList<Resource>(Resource.class, this, TargetPackage.BRIDGE__OWNED_RESOURCE);
		}
		return ownedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationPath getCommunicationPath() {
		if (eContainerFeatureID() != TargetPackage.BRIDGE__COMMUNICATION_PATH) return null;
		return (CommunicationPath)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationPath(CommunicationPath newCommunicationPath, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCommunicationPath, TargetPackage.BRIDGE__COMMUNICATION_PATH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationPath(CommunicationPath newCommunicationPath) {
		if (newCommunicationPath != eInternalContainer() || (eContainerFeatureID() != TargetPackage.BRIDGE__COMMUNICATION_PATH && newCommunicationPath != null)) {
			if (EcoreUtil.isAncestor(this, newCommunicationPath))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCommunicationPath != null)
				msgs = ((InternalEObject)newCommunicationPath).eInverseAdd(this, TargetPackage.COMMUNICATION_PATH__BRIDGE, CommunicationPath.class, msgs);
			msgs = basicSetCommunicationPath(newCommunicationPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.BRIDGE__COMMUNICATION_PATH, newCommunicationPath, newCommunicationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interconnect> getInterconnect() {
		if (interconnect == null) {
			interconnect = new EObjectWithInverseResolvingEList.ManyInverse<Interconnect>(Interconnect.class, this, TargetPackage.BRIDGE__INTERCONNECT, TargetPackage.INTERCONNECT__BRIDGE);
		}
		return interconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCommunicationPath((CommunicationPath)otherEnd, msgs);
			case TargetPackage.BRIDGE__INTERCONNECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterconnect()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.BRIDGE__OWNED_RESOURCE:
				return ((InternalEList<?>)getOwnedResource()).basicRemove(otherEnd, msgs);
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				return basicSetCommunicationPath(null, msgs);
			case TargetPackage.BRIDGE__INTERCONNECT:
				return ((InternalEList<?>)getInterconnect()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				return eInternalContainer().eInverseRemove(this, TargetPackage.COMMUNICATION_PATH__BRIDGE, CommunicationPath.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetPackage.BRIDGE__BASE_ASSOCIATION_CLASS:
				if (resolve) return getBase_AssociationClass();
				return basicGetBase_AssociationClass();
			case TargetPackage.BRIDGE__OWNED_RESOURCE:
				return getOwnedResource();
			case TargetPackage.BRIDGE__NAME:
				return getName();
			case TargetPackage.BRIDGE__LABEL:
				return getLabel();
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				return getCommunicationPath();
			case TargetPackage.BRIDGE__INTERCONNECT:
				return getInterconnect();
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
			case TargetPackage.BRIDGE__BASE_ASSOCIATION_CLASS:
				setBase_AssociationClass((AssociationClass)newValue);
				return;
			case TargetPackage.BRIDGE__OWNED_RESOURCE:
				getOwnedResource().clear();
				getOwnedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case TargetPackage.BRIDGE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.BRIDGE__LABEL:
				setLabel((String)newValue);
				return;
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				setCommunicationPath((CommunicationPath)newValue);
				return;
			case TargetPackage.BRIDGE__INTERCONNECT:
				getInterconnect().clear();
				getInterconnect().addAll((Collection<? extends Interconnect>)newValue);
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
			case TargetPackage.BRIDGE__BASE_ASSOCIATION_CLASS:
				setBase_AssociationClass((AssociationClass)null);
				return;
			case TargetPackage.BRIDGE__OWNED_RESOURCE:
				getOwnedResource().clear();
				return;
			case TargetPackage.BRIDGE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.BRIDGE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				setCommunicationPath((CommunicationPath)null);
				return;
			case TargetPackage.BRIDGE__INTERCONNECT:
				getInterconnect().clear();
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
			case TargetPackage.BRIDGE__BASE_ASSOCIATION_CLASS:
				return base_AssociationClass != null;
			case TargetPackage.BRIDGE__OWNED_RESOURCE:
				return ownedResource != null && !ownedResource.isEmpty();
			case TargetPackage.BRIDGE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.BRIDGE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case TargetPackage.BRIDGE__COMMUNICATION_PATH:
				return getCommunicationPath() != null;
			case TargetPackage.BRIDGE__INTERCONNECT:
				return interconnect != null && !interconnect.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //BridgeImpl
