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

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.DataStore;
import org.eclipse.upr.bpmnprof.ItemDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataStoreImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataStoreImpl#isUnlimited <em>Is Unlimited</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataStoreImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataStoreImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataStoreImpl extends RootElementImpl implements DataStore {
	/**
	 * The default value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected int capacity = CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isUnlimited() <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnlimited()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNLIMITED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnlimited() <em>Is Unlimited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnlimited()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnlimited = IS_UNLIMITED_EDEFAULT;

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
	protected DataStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getDataStore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.DATA_STORE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUnlimited() {
		return isUnlimited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnlimited(boolean newIsUnlimited) {
		boolean oldIsUnlimited = isUnlimited;
		isUnlimited = newIsUnlimited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.DATA_STORE__IS_UNLIMITED, oldIsUnlimited, isUnlimited));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.DATA_STORE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.DATA_STORE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getItemSubjectRef() {
		ItemDefinition itemSubjectRef = basicGetItemSubjectRef();
		return itemSubjectRef != null && itemSubjectRef.eIsProxy() ? (ItemDefinition)eResolveProxy((InternalEObject)itemSubjectRef) : itemSubjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetItemSubjectRef() {
		// TODO: implement this method to return the 'Item Subject Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
		// TODO: implement this method to set the 'Item Subject Ref' reference
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
			case BpmnprofPackage.DATA_STORE__CAPACITY:
				return getCapacity();
			case BpmnprofPackage.DATA_STORE__IS_UNLIMITED:
				return isUnlimited();
			case BpmnprofPackage.DATA_STORE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case BpmnprofPackage.DATA_STORE__ITEM_SUBJECT_REF:
				if (resolve) return getItemSubjectRef();
				return basicGetItemSubjectRef();
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
			case BpmnprofPackage.DATA_STORE__CAPACITY:
				setCapacity((Integer)newValue);
				return;
			case BpmnprofPackage.DATA_STORE__IS_UNLIMITED:
				setIsUnlimited((Boolean)newValue);
				return;
			case BpmnprofPackage.DATA_STORE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case BpmnprofPackage.DATA_STORE__ITEM_SUBJECT_REF:
				setItemSubjectRef((ItemDefinition)newValue);
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
			case BpmnprofPackage.DATA_STORE__CAPACITY:
				setCapacity(CAPACITY_EDEFAULT);
				return;
			case BpmnprofPackage.DATA_STORE__IS_UNLIMITED:
				setIsUnlimited(IS_UNLIMITED_EDEFAULT);
				return;
			case BpmnprofPackage.DATA_STORE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case BpmnprofPackage.DATA_STORE__ITEM_SUBJECT_REF:
				setItemSubjectRef((ItemDefinition)null);
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
			case BpmnprofPackage.DATA_STORE__CAPACITY:
				return capacity != CAPACITY_EDEFAULT;
			case BpmnprofPackage.DATA_STORE__IS_UNLIMITED:
				return isUnlimited != IS_UNLIMITED_EDEFAULT;
			case BpmnprofPackage.DATA_STORE__BASE_CLASS:
				return base_Class != null;
			case BpmnprofPackage.DATA_STORE__ITEM_SUBJECT_REF:
				return basicGetItemSubjectRef() != null;
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
		result.append(" (capacity: ");
		result.append(capacity);
		result.append(", isUnlimited: ");
		result.append(isUnlimited);
		result.append(')');
		return result.toString();
	}

} //DataStoreImpl
