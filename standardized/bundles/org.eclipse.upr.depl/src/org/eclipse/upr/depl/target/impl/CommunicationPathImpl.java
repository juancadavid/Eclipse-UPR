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
package org.eclipse.upr.depl.target.impl;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager;
import org.eclipse.upr.depl.target.Bridge;
import org.eclipse.upr.depl.target.CommunicationPath;
import org.eclipse.upr.depl.target.Interconnect;
import org.eclipse.upr.depl.target.Node;
import org.eclipse.upr.depl.target.TargetPackage;
import org.eclipse.upr.depl.target.TargetTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.impl.CommunicationPathImpl#getBase_CommunicationPath <em>Base Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.CommunicationPathImpl#getInterconnect <em>Interconnect</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.CommunicationPathImpl#getBridge <em>Bridge</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.CommunicationPathImpl#getConnectedNode <em>Connected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommunicationPathImpl extends EObjectImpl implements CommunicationPath {
	/**
	 * The cached value of the '{@link #getBase_CommunicationPath() <em>Base Communication Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CommunicationPath()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.CommunicationPath base_CommunicationPath;

	/**
	 * The cached value of the '{@link #getInterconnect() <em>Interconnect</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterconnect()
	 * @generated
	 * @ordered
	 */
	protected EList<Interconnect> interconnect;

	/**
	 * The cached value of the '{@link #getBridge() <em>Bridge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBridge()
	 * @generated
	 * @ordered
	 */
	protected EList<Bridge> bridge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationPathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.COMMUNICATION_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.CommunicationPath getBase_CommunicationPath() {
		if (base_CommunicationPath != null && base_CommunicationPath.eIsProxy()) {
			InternalEObject oldBase_CommunicationPath = (InternalEObject)base_CommunicationPath;
			base_CommunicationPath = (org.eclipse.uml2.uml.CommunicationPath)eResolveProxy(oldBase_CommunicationPath);
			if (base_CommunicationPath != oldBase_CommunicationPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetPackage.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH, oldBase_CommunicationPath, base_CommunicationPath));
			}
		}
		return base_CommunicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.CommunicationPath basicGetBase_CommunicationPath() {
		return base_CommunicationPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CommunicationPath(org.eclipse.uml2.uml.CommunicationPath newBase_CommunicationPath) {
		org.eclipse.uml2.uml.CommunicationPath oldBase_CommunicationPath = base_CommunicationPath;
		base_CommunicationPath = newBase_CommunicationPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH, oldBase_CommunicationPath, base_CommunicationPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interconnect> getInterconnect() {
		if (interconnect == null) {
			interconnect = new EObjectContainmentWithInverseEList<Interconnect>(Interconnect.class, this, TargetPackage.COMMUNICATION_PATH__INTERCONNECT, TargetPackage.INTERCONNECT__COMMUNICATION_PATH);
		}
		return interconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bridge> getBridge() {
		if (bridge == null) {
			bridge = new EObjectContainmentWithInverseEList<Bridge>(Bridge.class, this, TargetPackage.COMMUNICATION_PATH__BRIDGE, TargetPackage.BRIDGE__COMMUNICATION_PATH);
		}
		return bridge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Node> getConnectedNode() {
		/**
		 * self.interconnect.connectedNode->flatten()
		 */
		final /*@NonNull*/ /*@NonInvalid*/ CommunicationPath self = this;
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = new EcoreExecutorManager(this, TargetTables.LIBRARY);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@Thrown*/ List<?> interconnect = self.getInterconnect();
		final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_interconnect = idResolver.createSetOfAll(TargetTables.SET_CLSSid_Interconnect, interconnect);
		/*@NonNull*/ /*@NonInvalid*/ BagValue.Accumulator accumulator = ValuesUtil.createBagAccumulatorValue(TargetTables.BAG_CLSSid_Node);
		/*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_interconnect.iterator();
		/*@NonNull*/ /*@Thrown*/ BagValue collect;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        collect = accumulator;
		        break;
		    }
		    /*@Nullable*/ /*@NonInvalid*/ Interconnect _1 = (Interconnect)ITERATOR__1.next();
		    /**
		     * connectedNode
		     */
		    if (_1 == null) {
		        throw new InvalidValueException("Null source");
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<?> connectedNode = _1.getConnectedNode();
		    final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_connectedNode = idResolver.createSetOfAll(TargetTables.SET_CLSSid_Node, connectedNode);
		    //
		    for (Object value : BOXED_connectedNode.flatten().getElements()) {
		        accumulator.add(value);
		    }
		}
		final /*@NonNull*/ /*@Thrown*/ BagValue flatten = (BagValue)CollectionFlattenOperation.INSTANCE.evaluate(collect);
		final /*@NonNull*/ /*@Thrown*/ List<?> UNBOXED_flatten = flatten.asEcoreObject();
		return (EList<Node>)UNBOXED_flatten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.COMMUNICATION_PATH__INTERCONNECT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterconnect()).basicAdd(otherEnd, msgs);
			case TargetPackage.COMMUNICATION_PATH__BRIDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getBridge()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.COMMUNICATION_PATH__INTERCONNECT:
				return ((InternalEList<?>)getInterconnect()).basicRemove(otherEnd, msgs);
			case TargetPackage.COMMUNICATION_PATH__BRIDGE:
				return ((InternalEList<?>)getBridge()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetPackage.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH:
				if (resolve) return getBase_CommunicationPath();
				return basicGetBase_CommunicationPath();
			case TargetPackage.COMMUNICATION_PATH__INTERCONNECT:
				return getInterconnect();
			case TargetPackage.COMMUNICATION_PATH__BRIDGE:
				return getBridge();
			case TargetPackage.COMMUNICATION_PATH__CONNECTED_NODE:
				return getConnectedNode();
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
			case TargetPackage.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH:
				setBase_CommunicationPath((org.eclipse.uml2.uml.CommunicationPath)newValue);
				return;
			case TargetPackage.COMMUNICATION_PATH__INTERCONNECT:
				getInterconnect().clear();
				getInterconnect().addAll((Collection<? extends Interconnect>)newValue);
				return;
			case TargetPackage.COMMUNICATION_PATH__BRIDGE:
				getBridge().clear();
				getBridge().addAll((Collection<? extends Bridge>)newValue);
				return;
			case TargetPackage.COMMUNICATION_PATH__CONNECTED_NODE:
				getConnectedNode().clear();
				getConnectedNode().addAll((Collection<? extends Node>)newValue);
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
			case TargetPackage.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH:
				setBase_CommunicationPath((org.eclipse.uml2.uml.CommunicationPath)null);
				return;
			case TargetPackage.COMMUNICATION_PATH__INTERCONNECT:
				getInterconnect().clear();
				return;
			case TargetPackage.COMMUNICATION_PATH__BRIDGE:
				getBridge().clear();
				return;
			case TargetPackage.COMMUNICATION_PATH__CONNECTED_NODE:
				getConnectedNode().clear();
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
			case TargetPackage.COMMUNICATION_PATH__BASE_COMMUNICATION_PATH:
				return base_CommunicationPath != null;
			case TargetPackage.COMMUNICATION_PATH__INTERCONNECT:
				return interconnect != null && !interconnect.isEmpty();
			case TargetPackage.COMMUNICATION_PATH__BRIDGE:
				return bridge != null && !bridge.isEmpty();
			case TargetPackage.COMMUNICATION_PATH__CONNECTED_NODE:
				return !getConnectedNode().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunicationPathImpl
