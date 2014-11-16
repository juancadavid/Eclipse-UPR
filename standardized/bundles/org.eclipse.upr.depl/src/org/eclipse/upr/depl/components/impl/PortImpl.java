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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.upr.depl.components.ComponentsPackage;
import org.eclipse.upr.depl.components.Port;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#getBase_Port <em>Base Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#getUUID <em>UUID</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#getSupportedType <em>Supported Type</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#isProvider <em>Provider</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#isExclusiveProvider <em>Exclusive Provider</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#isExclusiveUser <em>Exclusive User</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.PortImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends EObjectImpl implements Port {
	/**
	 * The cached value of the '{@link #getBase_Port() <em>Base Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Port()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Port base_Port;

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
	 * The cached value of the '{@link #getSupportedType() <em>Supported Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedType()
	 * @generated
	 * @ordered
	 */
	protected EList<String> supportedType;

	/**
	 * The default value of the '{@link #isProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvider()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PROVIDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isProvider() <em>Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isProvider()
	 * @generated
	 * @ordered
	 */
	protected boolean provider = PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isExclusiveProvider() <em>Exclusive Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveProvider()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_PROVIDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusiveProvider() <em>Exclusive Provider</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveProvider()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusiveProvider = EXCLUSIVE_PROVIDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isExclusiveUser() <em>Exclusive User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveUser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_USER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusiveUser() <em>Exclusive User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveUser()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusiveUser = EXCLUSIVE_USER_EDEFAULT;

	/**
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.PORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Port getBase_Port() {
		if (base_Port != null && base_Port.eIsProxy()) {
			InternalEObject oldBase_Port = (InternalEObject)base_Port;
			base_Port = (org.eclipse.uml2.uml.Port)eResolveProxy(oldBase_Port);
			if (base_Port != oldBase_Port) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.PORT__BASE_PORT, oldBase_Port, base_Port));
			}
		}
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Port basicGetBase_Port() {
		return base_Port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Port(org.eclipse.uml2.uml.Port newBase_Port) {
		org.eclipse.uml2.uml.Port oldBase_Port = base_Port;
		base_Port = newBase_Port;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__BASE_PORT, oldBase_Port, base_Port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__UUID, oldUUID, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSupportedType() {
		if (supportedType == null) {
			supportedType = new EDataTypeUniqueEList<String>(String.class, this, ComponentsPackage.PORT__SUPPORTED_TYPE);
		}
		return supportedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isProvider() {
		return provider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvider(boolean newProvider) {
		boolean oldProvider = provider;
		provider = newProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__PROVIDER, oldProvider, provider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusiveProvider() {
		return exclusiveProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveProvider(boolean newExclusiveProvider) {
		boolean oldExclusiveProvider = exclusiveProvider;
		exclusiveProvider = newExclusiveProvider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__EXCLUSIVE_PROVIDER, oldExclusiveProvider, exclusiveProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusiveUser() {
		return exclusiveUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveUser(boolean newExclusiveUser) {
		boolean oldExclusiveUser = exclusiveUser;
		exclusiveUser = newExclusiveUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__EXCLUSIVE_USER, oldExclusiveUser, exclusiveUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.PORT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.PORT__BASE_PORT:
				if (resolve) return getBase_Port();
				return basicGetBase_Port();
			case ComponentsPackage.PORT__NAME:
				return getName();
			case ComponentsPackage.PORT__UUID:
				return getUUID();
			case ComponentsPackage.PORT__SUPPORTED_TYPE:
				return getSupportedType();
			case ComponentsPackage.PORT__PROVIDER:
				return isProvider();
			case ComponentsPackage.PORT__EXCLUSIVE_PROVIDER:
				return isExclusiveProvider();
			case ComponentsPackage.PORT__EXCLUSIVE_USER:
				return isExclusiveUser();
			case ComponentsPackage.PORT__OPTIONAL:
				return isOptional();
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
			case ComponentsPackage.PORT__BASE_PORT:
				setBase_Port((org.eclipse.uml2.uml.Port)newValue);
				return;
			case ComponentsPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case ComponentsPackage.PORT__UUID:
				setUUID((String)newValue);
				return;
			case ComponentsPackage.PORT__SUPPORTED_TYPE:
				getSupportedType().clear();
				getSupportedType().addAll((Collection<? extends String>)newValue);
				return;
			case ComponentsPackage.PORT__PROVIDER:
				setProvider((Boolean)newValue);
				return;
			case ComponentsPackage.PORT__EXCLUSIVE_PROVIDER:
				setExclusiveProvider((Boolean)newValue);
				return;
			case ComponentsPackage.PORT__EXCLUSIVE_USER:
				setExclusiveUser((Boolean)newValue);
				return;
			case ComponentsPackage.PORT__OPTIONAL:
				setOptional((Boolean)newValue);
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
			case ComponentsPackage.PORT__BASE_PORT:
				setBase_Port((org.eclipse.uml2.uml.Port)null);
				return;
			case ComponentsPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComponentsPackage.PORT__UUID:
				setUUID(UUID_EDEFAULT);
				return;
			case ComponentsPackage.PORT__SUPPORTED_TYPE:
				getSupportedType().clear();
				return;
			case ComponentsPackage.PORT__PROVIDER:
				setProvider(PROVIDER_EDEFAULT);
				return;
			case ComponentsPackage.PORT__EXCLUSIVE_PROVIDER:
				setExclusiveProvider(EXCLUSIVE_PROVIDER_EDEFAULT);
				return;
			case ComponentsPackage.PORT__EXCLUSIVE_USER:
				setExclusiveUser(EXCLUSIVE_USER_EDEFAULT);
				return;
			case ComponentsPackage.PORT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
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
			case ComponentsPackage.PORT__BASE_PORT:
				return base_Port != null;
			case ComponentsPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComponentsPackage.PORT__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
			case ComponentsPackage.PORT__SUPPORTED_TYPE:
				return supportedType != null && !supportedType.isEmpty();
			case ComponentsPackage.PORT__PROVIDER:
				return provider != PROVIDER_EDEFAULT;
			case ComponentsPackage.PORT__EXCLUSIVE_PROVIDER:
				return exclusiveProvider != EXCLUSIVE_PROVIDER_EDEFAULT;
			case ComponentsPackage.PORT__EXCLUSIVE_USER:
				return exclusiveUser != EXCLUSIVE_USER_EDEFAULT;
			case ComponentsPackage.PORT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
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
		result.append(", UUID: ");
		result.append(uuid);
		result.append(", supportedType: ");
		result.append(supportedType);
		result.append(", provider: ");
		result.append(provider);
		result.append(", exclusiveProvider: ");
		result.append(exclusiveProvider);
		result.append(", exclusiveUser: ");
		result.append(exclusiveUser);
		result.append(", optional: ");
		result.append(optional);
		result.append(')');
		return result.toString();
	}

} //PortImpl
