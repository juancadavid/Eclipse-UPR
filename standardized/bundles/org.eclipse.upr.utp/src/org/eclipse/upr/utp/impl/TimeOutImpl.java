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
package org.eclipse.upr.utp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.TimeEvent;

import org.eclipse.upr.utp.TimeOut;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Out</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.TimeOutImpl#getBase_TimeEvent <em>Base Time Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeOutImpl extends EObjectImpl implements TimeOut {
	/**
	 * The cached value of the '{@link #getBase_TimeEvent() <em>Base Time Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_TimeEvent()
	 * @generated
	 * @ordered
	 */
	protected TimeEvent base_TimeEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeOutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.TIME_OUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent getBase_TimeEvent() {
		if (base_TimeEvent != null && base_TimeEvent.eIsProxy()) {
			InternalEObject oldBase_TimeEvent = (InternalEObject)base_TimeEvent;
			base_TimeEvent = (TimeEvent)eResolveProxy(oldBase_TimeEvent);
			if (base_TimeEvent != oldBase_TimeEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TIME_OUT__BASE_TIME_EVENT, oldBase_TimeEvent, base_TimeEvent));
			}
		}
		return base_TimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeEvent basicGetBase_TimeEvent() {
		return base_TimeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_TimeEvent(TimeEvent newBase_TimeEvent) {
		TimeEvent oldBase_TimeEvent = base_TimeEvent;
		base_TimeEvent = newBase_TimeEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TIME_OUT__BASE_TIME_EVENT, oldBase_TimeEvent, base_TimeEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.TIME_OUT__BASE_TIME_EVENT:
				if (resolve) return getBase_TimeEvent();
				return basicGetBase_TimeEvent();
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
			case UTPPackage.TIME_OUT__BASE_TIME_EVENT:
				setBase_TimeEvent((TimeEvent)newValue);
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
			case UTPPackage.TIME_OUT__BASE_TIME_EVENT:
				setBase_TimeEvent((TimeEvent)null);
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
			case UTPPackage.TIME_OUT__BASE_TIME_EVENT:
				return base_TimeEvent != null;
		}
		return super.eIsSet(featureID);
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
	 * Retrieves the cache adapter for this '<em><b>Time Out</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Time Out</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //TimeOutImpl
