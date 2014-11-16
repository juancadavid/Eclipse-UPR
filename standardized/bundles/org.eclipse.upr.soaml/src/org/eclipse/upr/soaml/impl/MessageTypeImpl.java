/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marc-Florian Wendland
 */
package org.eclipse.upr.soaml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.DataType;
import org.eclipse.uml2.uml.Signal;

import org.eclipse.upr.soaml.MessageType;
import org.eclipse.upr.soaml.SoaMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.soaml.impl.MessageTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.impl.MessageTypeImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.impl.MessageTypeImpl#getBase_DataType <em>Base Data Type</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.impl.MessageTypeImpl#getBase_Signal <em>Base Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageTypeImpl extends EObjectImpl implements MessageType {
	/**
	 * The default value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected static final String ENCODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected String encoding = ENCODING_EDEFAULT;

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
	 * The cached value of the '{@link #getBase_DataType() <em>Base Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataType()
	 * @generated
	 * @ordered
	 */
	protected DataType base_DataType;

	/**
	 * The cached value of the '{@link #getBase_Signal() <em>Base Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Signal()
	 * @generated
	 * @ordered
	 */
	protected Signal base_Signal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoaMLPackage.Literals.MESSAGE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(String newEncoding) {
		String oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoaMLPackage.MESSAGE_TYPE__ENCODING, oldEncoding, encoding));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaMLPackage.MESSAGE_TYPE__BASE_CLASS, oldBase_Class, base_Class));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SoaMLPackage.MESSAGE_TYPE__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType getBase_DataType() {
		if (base_DataType != null && base_DataType.eIsProxy()) {
			InternalEObject oldBase_DataType = (InternalEObject)base_DataType;
			base_DataType = (DataType)eResolveProxy(oldBase_DataType);
			if (base_DataType != oldBase_DataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaMLPackage.MESSAGE_TYPE__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
			}
		}
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataType basicGetBase_DataType() {
		return base_DataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataType(DataType newBase_DataType) {
		DataType oldBase_DataType = base_DataType;
		base_DataType = newBase_DataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoaMLPackage.MESSAGE_TYPE__BASE_DATA_TYPE, oldBase_DataType, base_DataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal getBase_Signal() {
		if (base_Signal != null && base_Signal.eIsProxy()) {
			InternalEObject oldBase_Signal = (InternalEObject)base_Signal;
			base_Signal = (Signal)eResolveProxy(oldBase_Signal);
			if (base_Signal != oldBase_Signal) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaMLPackage.MESSAGE_TYPE__BASE_SIGNAL, oldBase_Signal, base_Signal));
			}
		}
		return base_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signal basicGetBase_Signal() {
		return base_Signal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Signal(Signal newBase_Signal) {
		Signal oldBase_Signal = base_Signal;
		base_Signal = newBase_Signal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoaMLPackage.MESSAGE_TYPE__BASE_SIGNAL, oldBase_Signal, base_Signal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoaMLPackage.MESSAGE_TYPE__ENCODING:
				return getEncoding();
			case SoaMLPackage.MESSAGE_TYPE__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case SoaMLPackage.MESSAGE_TYPE__BASE_DATA_TYPE:
				if (resolve) return getBase_DataType();
				return basicGetBase_DataType();
			case SoaMLPackage.MESSAGE_TYPE__BASE_SIGNAL:
				if (resolve) return getBase_Signal();
				return basicGetBase_Signal();
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
			case SoaMLPackage.MESSAGE_TYPE__ENCODING:
				setEncoding((String)newValue);
				return;
			case SoaMLPackage.MESSAGE_TYPE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case SoaMLPackage.MESSAGE_TYPE__BASE_DATA_TYPE:
				setBase_DataType((DataType)newValue);
				return;
			case SoaMLPackage.MESSAGE_TYPE__BASE_SIGNAL:
				setBase_Signal((Signal)newValue);
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
			case SoaMLPackage.MESSAGE_TYPE__ENCODING:
				setEncoding(ENCODING_EDEFAULT);
				return;
			case SoaMLPackage.MESSAGE_TYPE__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case SoaMLPackage.MESSAGE_TYPE__BASE_DATA_TYPE:
				setBase_DataType((DataType)null);
				return;
			case SoaMLPackage.MESSAGE_TYPE__BASE_SIGNAL:
				setBase_Signal((Signal)null);
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
			case SoaMLPackage.MESSAGE_TYPE__ENCODING:
				return ENCODING_EDEFAULT == null ? encoding != null : !ENCODING_EDEFAULT.equals(encoding);
			case SoaMLPackage.MESSAGE_TYPE__BASE_CLASS:
				return base_Class != null;
			case SoaMLPackage.MESSAGE_TYPE__BASE_DATA_TYPE:
				return base_DataType != null;
			case SoaMLPackage.MESSAGE_TYPE__BASE_SIGNAL:
				return base_Signal != null;
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
		result.append(" (encoding: ");
		result.append(encoding);
		result.append(')');
		return result.toString();
	}

	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected EObject create(EClass eClass) {
		return EcoreUtil.create(eClass);
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Message Type</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Message Type</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //MessageTypeImpl
