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
import org.eclipse.uml2.uml.Element;

import org.eclipse.upr.bpmnprof.BaseElement;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.FlowNode;
import org.eclipse.upr.bpmnprof.Lane;
import org.eclipse.upr.bpmnprof.LaneSet;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lane</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneImpl#getBase_ActivityPartition <em>Base Activity Partition</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneImpl#get_partitionElement <em>partition Element</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneImpl#getFlowNodeRefs <em>Flow Node Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneImpl#getPartitionElementRef <em>Partition Element Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneImpl#getChildLaneSet <em>Child Lane Set</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LaneImpl#getLaneSet <em>Lane Set</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaneImpl extends BaseElementImpl implements Lane {
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
	 * The cached value of the '{@link #get_partitionElement() <em>partition Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_partitionElement()
	 * @generated
	 * @ordered
	 */
	protected Element _partitionElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getLane();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.LANE__BASE_ACTIVITY_PARTITION, oldBase_ActivityPartition, base_ActivityPartition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LANE__BASE_ACTIVITY_PARTITION, oldBase_ActivityPartition, base_ActivityPartition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element get_partitionElement() {
		if (_partitionElement != null && _partitionElement.eIsProxy()) {
			InternalEObject old_partitionElement = (InternalEObject)_partitionElement;
			_partitionElement = (Element)eResolveProxy(old_partitionElement);
			if (_partitionElement != old_partitionElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.LANE__PARTITION_ELEMENT, old_partitionElement, _partitionElement));
			}
		}
		return _partitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGet_partitionElement() {
		return _partitionElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_partitionElement(Element new_partitionElement) {
		Element old_partitionElement = _partitionElement;
		_partitionElement = new_partitionElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LANE__PARTITION_ELEMENT, old_partitionElement, _partitionElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowNode> getFlowNodeRefs() {
		// TODO: implement this method to return the 'Flow Node Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement getPartitionElementRef() {
		BaseElement partitionElementRef = basicGetPartitionElementRef();
		return partitionElementRef != null && partitionElementRef.eIsProxy() ? (BaseElement)eResolveProxy((InternalEObject)partitionElementRef) : partitionElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseElement basicGetPartitionElementRef() {
		// TODO: implement this method to return the 'Partition Element Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartitionElementRef(BaseElement newPartitionElementRef) {
		// TODO: implement this method to set the 'Partition Element Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet getChildLaneSet() {
		LaneSet childLaneSet = basicGetChildLaneSet();
		return childLaneSet != null && childLaneSet.eIsProxy() ? (LaneSet)eResolveProxy((InternalEObject)childLaneSet) : childLaneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet basicGetChildLaneSet() {
		// TODO: implement this method to return the 'Child Lane Set' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildLaneSet(LaneSet newChildLaneSet) {
		// TODO: implement this method to set the 'Child Lane Set' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet getLaneSet() {
		LaneSet laneSet = basicGetLaneSet();
		return laneSet != null && laneSet.eIsProxy() ? (LaneSet)eResolveProxy((InternalEObject)laneSet) : laneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet basicGetLaneSet() {
		// TODO: implement this method to return the 'Lane Set' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaneSet(LaneSet newLaneSet) {
		// TODO: implement this method to set the 'Lane Set' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean LanelaneSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.LANE__LANELANE_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LanelaneSet", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean LanechildLaneSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.LANE__LANECHILD_LANE_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LanechildLaneSet", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean LanepartitionElementRef(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.LANE__LANEPARTITION_ELEMENT_REF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LanepartitionElementRef", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean LaneflowNodeRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.LANE__LANEFLOW_NODE_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaneflowNodeRefs", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.LANE__BASE_ACTIVITY_PARTITION:
				if (resolve) return getBase_ActivityPartition();
				return basicGetBase_ActivityPartition();
			case BpmnprofPackage.LANE__PARTITION_ELEMENT:
				if (resolve) return get_partitionElement();
				return basicGet_partitionElement();
			case BpmnprofPackage.LANE__FLOW_NODE_REFS:
				return getFlowNodeRefs();
			case BpmnprofPackage.LANE__PARTITION_ELEMENT_REF:
				if (resolve) return getPartitionElementRef();
				return basicGetPartitionElementRef();
			case BpmnprofPackage.LANE__CHILD_LANE_SET:
				if (resolve) return getChildLaneSet();
				return basicGetChildLaneSet();
			case BpmnprofPackage.LANE__LANE_SET:
				if (resolve) return getLaneSet();
				return basicGetLaneSet();
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
			case BpmnprofPackage.LANE__BASE_ACTIVITY_PARTITION:
				setBase_ActivityPartition((ActivityPartition)newValue);
				return;
			case BpmnprofPackage.LANE__PARTITION_ELEMENT:
				set_partitionElement((Element)newValue);
				return;
			case BpmnprofPackage.LANE__FLOW_NODE_REFS:
				getFlowNodeRefs().clear();
				getFlowNodeRefs().addAll((Collection<? extends FlowNode>)newValue);
				return;
			case BpmnprofPackage.LANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((BaseElement)newValue);
				return;
			case BpmnprofPackage.LANE__CHILD_LANE_SET:
				setChildLaneSet((LaneSet)newValue);
				return;
			case BpmnprofPackage.LANE__LANE_SET:
				setLaneSet((LaneSet)newValue);
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
			case BpmnprofPackage.LANE__BASE_ACTIVITY_PARTITION:
				setBase_ActivityPartition((ActivityPartition)null);
				return;
			case BpmnprofPackage.LANE__PARTITION_ELEMENT:
				set_partitionElement((Element)null);
				return;
			case BpmnprofPackage.LANE__FLOW_NODE_REFS:
				getFlowNodeRefs().clear();
				return;
			case BpmnprofPackage.LANE__PARTITION_ELEMENT_REF:
				setPartitionElementRef((BaseElement)null);
				return;
			case BpmnprofPackage.LANE__CHILD_LANE_SET:
				setChildLaneSet((LaneSet)null);
				return;
			case BpmnprofPackage.LANE__LANE_SET:
				setLaneSet((LaneSet)null);
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
			case BpmnprofPackage.LANE__BASE_ACTIVITY_PARTITION:
				return base_ActivityPartition != null;
			case BpmnprofPackage.LANE__PARTITION_ELEMENT:
				return _partitionElement != null;
			case BpmnprofPackage.LANE__FLOW_NODE_REFS:
				return !getFlowNodeRefs().isEmpty();
			case BpmnprofPackage.LANE__PARTITION_ELEMENT_REF:
				return basicGetPartitionElementRef() != null;
			case BpmnprofPackage.LANE__CHILD_LANE_SET:
				return basicGetChildLaneSet() != null;
			case BpmnprofPackage.LANE__LANE_SET:
				return basicGetLaneSet() != null;
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
			case BpmnprofPackage.LANE___LANELANE_SET__DIAGNOSTICCHAIN_MAP:
				return LanelaneSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.LANE___LANECHILD_LANE_SET__DIAGNOSTICCHAIN_MAP:
				return LanechildLaneSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.LANE___LANEPARTITION_ELEMENT_REF__DIAGNOSTICCHAIN_MAP:
				return LanepartitionElementRef((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.LANE___LANEFLOW_NODE_REFS__DIAGNOSTICCHAIN_MAP:
				return LaneflowNodeRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //LaneImpl
