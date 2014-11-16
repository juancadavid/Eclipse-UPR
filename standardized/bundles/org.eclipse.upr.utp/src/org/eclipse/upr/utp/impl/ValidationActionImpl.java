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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.upr.utp.UTPPackage;
import org.eclipse.upr.utp.ValidationAction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Validation Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.ValidationActionImpl#getBase_CallOperationAction <em>Base Call Operation Action</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.ValidationActionImpl#getReasons <em>Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ValidationActionImpl extends EObjectImpl implements ValidationAction {
	/**
	 * The cached value of the '{@link #getBase_CallOperationAction() <em>Base Call Operation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CallOperationAction()
	 * @generated
	 * @ordered
	 */
	protected CallOperationAction base_CallOperationAction;

	/**
	 * The cached value of the '{@link #getReasons() <em>Reason</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> reasons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValidationActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.VALIDATION_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction getBase_CallOperationAction() {
		if (base_CallOperationAction != null && base_CallOperationAction.eIsProxy()) {
			InternalEObject oldBase_CallOperationAction = (InternalEObject)base_CallOperationAction;
			base_CallOperationAction = (CallOperationAction)eResolveProxy(oldBase_CallOperationAction);
			if (base_CallOperationAction != oldBase_CallOperationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION, oldBase_CallOperationAction, base_CallOperationAction));
			}
		}
		return base_CallOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction basicGetBase_CallOperationAction() {
		return base_CallOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CallOperationAction(CallOperationAction newBase_CallOperationAction) {
		CallOperationAction oldBase_CallOperationAction = base_CallOperationAction;
		base_CallOperationAction = newBase_CallOperationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION, oldBase_CallOperationAction, base_CallOperationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getReasons() {
		if (reasons == null) {
			reasons = new EObjectResolvingEList<ValueSpecification>(ValueSpecification.class, this, UTPPackage.VALIDATION_ACTION__REASON);
		}
		return reasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReason(String name, Type type) {
		return getReason(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getReason(String name, Type type, boolean ignoreCase, EClass eClass) {
		reasonLoop: for (ValueSpecification reason : getReasons()) {
			if (eClass != null && !eClass.isInstance(reason))
				continue reasonLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(reason.getName()) : name.equals(reason.getName())))
				continue reasonLoop;
			if (type != null && !type.equals(reason.getType()))
				continue reasonLoop;
			return reason;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION:
				if (resolve) return getBase_CallOperationAction();
				return basicGetBase_CallOperationAction();
			case UTPPackage.VALIDATION_ACTION__REASON:
				return getReasons();
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
			case UTPPackage.VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION:
				setBase_CallOperationAction((CallOperationAction)newValue);
				return;
			case UTPPackage.VALIDATION_ACTION__REASON:
				getReasons().clear();
				getReasons().addAll((Collection<? extends ValueSpecification>)newValue);
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
			case UTPPackage.VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION:
				setBase_CallOperationAction((CallOperationAction)null);
				return;
			case UTPPackage.VALIDATION_ACTION__REASON:
				getReasons().clear();
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
			case UTPPackage.VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION:
				return base_CallOperationAction != null;
			case UTPPackage.VALIDATION_ACTION__REASON:
				return reasons != null && !reasons.isEmpty();
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
	 * Retrieves the cache adapter for this '<em><b>Validation Action</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Validation Action</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //ValidationActionImpl
