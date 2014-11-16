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

import org.eclipse.uml2.uml.ControlFlow;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ComplexBehaviorDefinition;
import org.eclipse.upr.bpmnprof.FormalExpression;
import org.eclipse.upr.bpmnprof.ImplicitThrowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Behavior Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ComplexBehaviorDefinitionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ComplexBehaviorDefinitionImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ComplexBehaviorDefinitionImpl#getBase_ControlFlow <em>Base Control Flow</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexBehaviorDefinitionImpl extends BaseElementImpl implements ComplexBehaviorDefinition {
	/**
	 * The cached value of the '{@link #getBase_ControlFlow() <em>Base Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ControlFlow()
	 * @generated
	 * @ordered
	 */
	protected ControlFlow base_ControlFlow;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexBehaviorDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getComplexBehaviorDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getCondition() {
		FormalExpression condition = basicGetCondition();
		return condition != null && condition.eIsProxy() ? (FormalExpression)eResolveProxy((InternalEObject)condition) : condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression basicGetCondition() {
		// TODO: implement this method to return the 'Condition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(FormalExpression newCondition) {
		// TODO: implement this method to set the 'Condition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent getEvent() {
		ImplicitThrowEvent event = basicGetEvent();
		return event != null && event.eIsProxy() ? (ImplicitThrowEvent)eResolveProxy((InternalEObject)event) : event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent basicGetEvent() {
		// TODO: implement this method to return the 'Event' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvent(ImplicitThrowEvent newEvent) {
		// TODO: implement this method to set the 'Event' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getBase_ControlFlow() {
		if (base_ControlFlow != null && base_ControlFlow.eIsProxy()) {
			InternalEObject oldBase_ControlFlow = (InternalEObject)base_ControlFlow;
			base_ControlFlow = (ControlFlow)eResolveProxy(oldBase_ControlFlow);
			if (base_ControlFlow != oldBase_ControlFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__BASE_CONTROL_FLOW, oldBase_ControlFlow, base_ControlFlow));
			}
		}
		return base_ControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow basicGetBase_ControlFlow() {
		return base_ControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ControlFlow(ControlFlow newBase_ControlFlow) {
		ControlFlow oldBase_ControlFlow = base_ControlFlow;
		base_ControlFlow = newBase_ControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__BASE_CONTROL_FLOW, oldBase_ControlFlow, base_ControlFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
				if (resolve) return getEvent();
				return basicGetEvent();
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__BASE_CONTROL_FLOW:
				if (resolve) return getBase_ControlFlow();
				return basicGetBase_ControlFlow();
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
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
				setCondition((FormalExpression)newValue);
				return;
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
				setEvent((ImplicitThrowEvent)newValue);
				return;
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__BASE_CONTROL_FLOW:
				setBase_ControlFlow((ControlFlow)newValue);
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
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
				setCondition((FormalExpression)null);
				return;
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
				setEvent((ImplicitThrowEvent)null);
				return;
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__BASE_CONTROL_FLOW:
				setBase_ControlFlow((ControlFlow)null);
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
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__CONDITION:
				return basicGetCondition() != null;
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__EVENT:
				return basicGetEvent() != null;
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION__BASE_CONTROL_FLOW:
				return base_ControlFlow != null;
		}
		return super.eIsSet(featureID);
	}

} //ComplexBehaviorDefinitionImpl
