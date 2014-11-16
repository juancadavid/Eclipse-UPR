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

import org.eclipse.uml2.uml.Dependency;

import org.eclipse.upr.bpmnprof.Assignment;
import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.AssignmentImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.AssignmentImpl#getFrom <em>From</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.AssignmentImpl#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends BaseElementImpl implements Assignment {
	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getAssignment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject)base_Dependency;
			base_Dependency = (Dependency)eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.ASSIGNMENT__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ASSIGNMENT__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getFrom() {
		BPMNExpression from = basicGetFrom();
		return from != null && from.eIsProxy() ? (BPMNExpression)eResolveProxy((InternalEObject)from) : from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetFrom() {
		// TODO: implement this method to return the 'From' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(BPMNExpression newFrom) {
		// TODO: implement this method to set the 'From' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getTo() {
		BPMNExpression to = basicGetTo();
		return to != null && to.eIsProxy() ? (BPMNExpression)eResolveProxy((InternalEObject)to) : to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetTo() {
		// TODO: implement this method to return the 'To' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(BPMNExpression newTo) {
		// TODO: implement this method to set the 'To' reference
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
			case BpmnprofPackage.ASSIGNMENT__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
			case BpmnprofPackage.ASSIGNMENT__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case BpmnprofPackage.ASSIGNMENT__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case BpmnprofPackage.ASSIGNMENT__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
				return;
			case BpmnprofPackage.ASSIGNMENT__FROM:
				setFrom((BPMNExpression)newValue);
				return;
			case BpmnprofPackage.ASSIGNMENT__TO:
				setTo((BPMNExpression)newValue);
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
			case BpmnprofPackage.ASSIGNMENT__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
				return;
			case BpmnprofPackage.ASSIGNMENT__FROM:
				setFrom((BPMNExpression)null);
				return;
			case BpmnprofPackage.ASSIGNMENT__TO:
				setTo((BPMNExpression)null);
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
			case BpmnprofPackage.ASSIGNMENT__BASE_DEPENDENCY:
				return base_Dependency != null;
			case BpmnprofPackage.ASSIGNMENT__FROM:
				return basicGetFrom() != null;
			case BpmnprofPackage.ASSIGNMENT__TO:
				return basicGetTo() != null;
		}
		return super.eIsSet(featureID);
	}

} //AssignmentImpl
