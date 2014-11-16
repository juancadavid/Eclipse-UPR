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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Slot;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ExtensionAttributeDefinition;
import org.eclipse.upr.bpmnprof.ExtensionAttributeValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ExtensionAttributeValueImpl#getBase_Slot <em>Base Slot</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ExtensionAttributeValueImpl#getValueRef <em>Value Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ExtensionAttributeValueImpl#getExtensionAttributeDefinition <em>Extension Attribute Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionAttributeValueImpl extends MinimalEObjectImpl.Container implements ExtensionAttributeValue {
	/**
	 * The cached value of the '{@link #getBase_Slot() <em>Base Slot</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Slot()
	 * @generated
	 * @ordered
	 */
	protected Slot base_Slot;

	/**
	 * The cached value of the '{@link #getValueRef() <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueRef()
	 * @generated
	 * @ordered
	 */
	protected Element valueRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionAttributeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getExtensionAttributeValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot getBase_Slot() {
		if (base_Slot != null && base_Slot.eIsProxy()) {
			InternalEObject oldBase_Slot = (InternalEObject)base_Slot;
			base_Slot = (Slot)eResolveProxy(oldBase_Slot);
			if (base_Slot != oldBase_Slot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__BASE_SLOT, oldBase_Slot, base_Slot));
			}
		}
		return base_Slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Slot basicGetBase_Slot() {
		return base_Slot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Slot(Slot newBase_Slot) {
		Slot oldBase_Slot = base_Slot;
		base_Slot = newBase_Slot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__BASE_SLOT, oldBase_Slot, base_Slot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getValueRef() {
		if (valueRef != null && valueRef.eIsProxy()) {
			InternalEObject oldValueRef = (InternalEObject)valueRef;
			valueRef = (Element)eResolveProxy(oldValueRef);
			if (valueRef != oldValueRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, oldValueRef, valueRef));
			}
		}
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetValueRef() {
		return valueRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueRef(Element newValueRef) {
		Element oldValueRef = valueRef;
		valueRef = newValueRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF, oldValueRef, valueRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition getExtensionAttributeDefinition() {
		ExtensionAttributeDefinition extensionAttributeDefinition = basicGetExtensionAttributeDefinition();
		return extensionAttributeDefinition != null && extensionAttributeDefinition.eIsProxy() ? (ExtensionAttributeDefinition)eResolveProxy((InternalEObject)extensionAttributeDefinition) : extensionAttributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition basicGetExtensionAttributeDefinition() {
		// TODO: implement this method to return the 'Extension Attribute Definition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtensionAttributeDefinition(ExtensionAttributeDefinition newExtensionAttributeDefinition) {
		// TODO: implement this method to set the 'Extension Attribute Definition' reference
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
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__BASE_SLOT:
				if (resolve) return getBase_Slot();
				return basicGetBase_Slot();
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
				if (resolve) return getValueRef();
				return basicGetValueRef();
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
				if (resolve) return getExtensionAttributeDefinition();
				return basicGetExtensionAttributeDefinition();
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
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__BASE_SLOT:
				setBase_Slot((Slot)newValue);
				return;
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
				setValueRef((Element)newValue);
				return;
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
				setExtensionAttributeDefinition((ExtensionAttributeDefinition)newValue);
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
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__BASE_SLOT:
				setBase_Slot((Slot)null);
				return;
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
				setValueRef((Element)null);
				return;
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
				setExtensionAttributeDefinition((ExtensionAttributeDefinition)null);
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
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__BASE_SLOT:
				return base_Slot != null;
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__VALUE_REF:
				return valueRef != null;
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE__EXTENSION_ATTRIBUTE_DEFINITION:
				return basicGetExtensionAttributeDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionAttributeValueImpl
