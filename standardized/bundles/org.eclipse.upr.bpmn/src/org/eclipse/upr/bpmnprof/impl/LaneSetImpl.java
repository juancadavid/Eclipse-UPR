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

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.ActivityPartition;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.FlowElementsContainer;
import org.eclipse.upr.bpmnprof.Lane;
import org.eclipse.upr.bpmnprof.LaneSet;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneSetImpl#getBase_ActivityPartition <em>Base Activity Partition</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneSetImpl#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneSetImpl#getParentLane <em>Parent Lane</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneSetImpl#getFlowElementsContainer <em>Flow Elements Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaneSetImpl extends BaseElementImpl implements LaneSet {
	/**
	 * The cached value of the '{@link #getBase_ActivityPartition() <em>Base Activity Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ActivityPartition()
	 * @generated
	 * @ordered
	 */
	protected ActivityPartition base_ActivityPartition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getLaneSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition getBase_ActivityPartition() {
		if (base_ActivityPartition != null && base_ActivityPartition.eIsProxy()) {
			InternalEObject oldBase_ActivityPartition = (InternalEObject)base_ActivityPartition;
			base_ActivityPartition = (ActivityPartition)eResolveProxy(oldBase_ActivityPartition);
			if (base_ActivityPartition != oldBase_ActivityPartition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.LANE_SET__BASE_ACTIVITY_PARTITION, oldBase_ActivityPartition, base_ActivityPartition));
			}
		}
		return base_ActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityPartition basicGetBase_ActivityPartition() {
		return base_ActivityPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ActivityPartition(ActivityPartition newBase_ActivityPartition) {
		ActivityPartition oldBase_ActivityPartition = base_ActivityPartition;
		base_ActivityPartition = newBase_ActivityPartition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LANE_SET__BASE_ACTIVITY_PARTITION, oldBase_ActivityPartition, base_ActivityPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getLanes() {
		// TODO: implement this method to return the 'Lanes' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lane> getParentLane() {
		// TODO: implement this method to return the 'Parent Lane' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElementsContainer getFlowElementsContainer() {
		FlowElementsContainer flowElementsContainer = basicGetFlowElementsContainer();
		return flowElementsContainer != null && flowElementsContainer.eIsProxy() ? (FlowElementsContainer)eResolveProxy((InternalEObject)flowElementsContainer) : flowElementsContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlowElementsContainer basicGetFlowElementsContainer() {
		// TODO: implement this method to return the 'Flow Elements Container' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlowElementsContainer(FlowElementsContainer newFlowElementsContainer) {
		// TODO: implement this method to set the 'Flow Elements Container' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LaneSetlanes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.LANE_SET__LANE_SETLANES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaneSetlanes", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LaneSetparentLane(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.LANE_SET__LANE_SETPARENT_LANE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaneSetparentLane", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LaneSetflowElementsContainer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.LANE_SET__LANE_SETFLOW_ELEMENTS_CONTAINER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaneSetflowElementsContainer", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LaneSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.LANE_SET__LANE_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaneSet", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.LANE_SET__BASE_ACTIVITY_PARTITION:
				if (resolve) return getBase_ActivityPartition();
				return basicGetBase_ActivityPartition();
			case BpmnprofPackage.LANE_SET__LANES:
				return getLanes();
			case BpmnprofPackage.LANE_SET__PARENT_LANE:
				return getParentLane();
			case BpmnprofPackage.LANE_SET__FLOW_ELEMENTS_CONTAINER:
				if (resolve) return getFlowElementsContainer();
				return basicGetFlowElementsContainer();
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
			case BpmnprofPackage.LANE_SET__BASE_ACTIVITY_PARTITION:
				setBase_ActivityPartition((ActivityPartition)newValue);
				return;
			case BpmnprofPackage.LANE_SET__LANES:
				getLanes().clear();
				getLanes().addAll((Collection<? extends Lane>)newValue);
				return;
			case BpmnprofPackage.LANE_SET__PARENT_LANE:
				getParentLane().clear();
				getParentLane().addAll((Collection<? extends Lane>)newValue);
				return;
			case BpmnprofPackage.LANE_SET__FLOW_ELEMENTS_CONTAINER:
				setFlowElementsContainer((FlowElementsContainer)newValue);
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
			case BpmnprofPackage.LANE_SET__BASE_ACTIVITY_PARTITION:
				setBase_ActivityPartition((ActivityPartition)null);
				return;
			case BpmnprofPackage.LANE_SET__LANES:
				getLanes().clear();
				return;
			case BpmnprofPackage.LANE_SET__PARENT_LANE:
				getParentLane().clear();
				return;
			case BpmnprofPackage.LANE_SET__FLOW_ELEMENTS_CONTAINER:
				setFlowElementsContainer((FlowElementsContainer)null);
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
			case BpmnprofPackage.LANE_SET__BASE_ACTIVITY_PARTITION:
				return base_ActivityPartition != null;
			case BpmnprofPackage.LANE_SET__LANES:
				return !getLanes().isEmpty();
			case BpmnprofPackage.LANE_SET__PARENT_LANE:
				return !getParentLane().isEmpty();
			case BpmnprofPackage.LANE_SET__FLOW_ELEMENTS_CONTAINER:
				return basicGetFlowElementsContainer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BpmnprofPackage.LANE_SET___LANE_SETLANES__DIAGNOSTICCHAIN_MAP:
				return LaneSetlanes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.LANE_SET___LANE_SETPARENT_LANE__DIAGNOSTICCHAIN_MAP:
				return LaneSetparentLane((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.LANE_SET___LANE_SETFLOW_ELEMENTS_CONTAINER__DIAGNOSTICCHAIN_MAP:
				return LaneSetflowElementsContainer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.LANE_SET___LANE_SET__DIAGNOSTICCHAIN_MAP:
				return LaneSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LaneSetImpl
