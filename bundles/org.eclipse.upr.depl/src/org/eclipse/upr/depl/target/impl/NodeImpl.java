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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager;
import org.eclipse.upr.depl.target.CommunicationPath;
import org.eclipse.upr.depl.target.Interconnect;
import org.eclipse.upr.depl.target.Node;
import org.eclipse.upr.depl.target.Resource;
import org.eclipse.upr.depl.target.SharedResource;
import org.eclipse.upr.depl.target.TargetPackage;
import org.eclipse.upr.depl.target.TargetTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getBase_Node <em>Base Node</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getAvailableSharedResource <em>Available Shared Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getCommunicationPath <em>Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.impl.NodeImpl#getNodeConnector <em>Node Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The cached value of the '{@link #getBase_Node() <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Node()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Node base_Node;

	/**
	 * The cached value of the '{@link #getAvailableSharedResource() <em>Available Shared Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailableSharedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedResource> availableSharedResource;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedResource() <em>Owned Resource</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> ownedResource;

	/**
	 * The cached value of the '{@link #getNodeConnector() <em>Node Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Interconnect> nodeConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Node getBase_Node() {
		if (base_Node != null && base_Node.eIsProxy()) {
			InternalEObject oldBase_Node = (InternalEObject)base_Node;
			base_Node = (org.eclipse.uml2.uml.Node)eResolveProxy(oldBase_Node);
			if (base_Node != oldBase_Node) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetPackage.NODE__BASE_NODE, oldBase_Node, base_Node));
			}
		}
		return base_Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Node basicGetBase_Node() {
		return base_Node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Node(org.eclipse.uml2.uml.Node newBase_Node) {
		org.eclipse.uml2.uml.Node oldBase_Node = base_Node;
		base_Node = newBase_Node;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE__BASE_NODE, oldBase_Node, base_Node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedResource> getAvailableSharedResource() {
		if (availableSharedResource == null) {
			availableSharedResource = new EObjectWithInverseResolvingEList.ManyInverse<SharedResource>(SharedResource.class, this, TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE, TargetPackage.SHARED_RESOURCE__RESOURCE_USER);
		}
		return availableSharedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CommunicationPath> getCommunicationPath() {
		/**
		 * self.nodeConnector.communicationPath->flatten()
		 */
		final /*@NonNull*/ /*@NonInvalid*/ Node self = this;
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = new EcoreExecutorManager(this, TargetTables.LIBRARY);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@Thrown*/ List<?> nodeConnector = self.getNodeConnector();
		final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_nodeConnector = idResolver.createSetOfAll(TargetTables.SET_CLSSid_Interconnect, nodeConnector);
		/*@NonNull*/ /*@NonInvalid*/ BagValue.Accumulator accumulator = ValuesUtil.createBagAccumulatorValue(TargetTables.BAG_CLSSid_CommunicationPath);
		/*@Nullable*/ Iterator<?> ITERATOR__1 = BOXED_nodeConnector.iterator();
		/*@NonNull*/ /*@Thrown*/ BagValue collect;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        collect = accumulator;
		        break;
		    }
		    /*@Nullable*/ /*@NonInvalid*/ Interconnect _1 = (Interconnect)ITERATOR__1.next();
		    /**
		     * communicationPath
		     */
		    if (_1 == null) {
		        throw new InvalidValueException("Null source");
		    }
		    final /*@NonNull*/ /*@Thrown*/ CommunicationPath communicationPath = _1.getCommunicationPath();
		    //
		    accumulator.add(communicationPath);
		}
		final /*@NonNull*/ /*@Thrown*/ BagValue flatten = (BagValue)CollectionFlattenOperation.INSTANCE.evaluate(collect);
		final /*@NonNull*/ /*@Thrown*/ List<?> UNBOXED_flatten = flatten.asEcoreObject();
		return (EList<CommunicationPath>)UNBOXED_flatten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetPackage.NODE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getOwnedResource() {
		if (ownedResource == null) {
			ownedResource = new EObjectContainmentEList<Resource>(Resource.class, this, TargetPackage.NODE__OWNED_RESOURCE);
		}
		return ownedResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interconnect> getNodeConnector() {
		if (nodeConnector == null) {
			nodeConnector = new EObjectWithInverseResolvingEList.ManyInverse<Interconnect>(Interconnect.class, this, TargetPackage.NODE__NODE_CONNECTOR, TargetPackage.INTERCONNECT__CONNECTED_NODE);
		}
		return nodeConnector;
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
			case TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAvailableSharedResource()).basicAdd(otherEnd, msgs);
			case TargetPackage.NODE__NODE_CONNECTOR:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNodeConnector()).basicAdd(otherEnd, msgs);
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
			case TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE:
				return ((InternalEList<?>)getAvailableSharedResource()).basicRemove(otherEnd, msgs);
			case TargetPackage.NODE__OWNED_RESOURCE:
				return ((InternalEList<?>)getOwnedResource()).basicRemove(otherEnd, msgs);
			case TargetPackage.NODE__NODE_CONNECTOR:
				return ((InternalEList<?>)getNodeConnector()).basicRemove(otherEnd, msgs);
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
			case TargetPackage.NODE__BASE_NODE:
				if (resolve) return getBase_Node();
				return basicGetBase_Node();
			case TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE:
				return getAvailableSharedResource();
			case TargetPackage.NODE__COMMUNICATION_PATH:
				return getCommunicationPath();
			case TargetPackage.NODE__NAME:
				return getName();
			case TargetPackage.NODE__LABEL:
				return getLabel();
			case TargetPackage.NODE__OWNED_RESOURCE:
				return getOwnedResource();
			case TargetPackage.NODE__NODE_CONNECTOR:
				return getNodeConnector();
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
			case TargetPackage.NODE__BASE_NODE:
				setBase_Node((org.eclipse.uml2.uml.Node)newValue);
				return;
			case TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE:
				getAvailableSharedResource().clear();
				getAvailableSharedResource().addAll((Collection<? extends SharedResource>)newValue);
				return;
			case TargetPackage.NODE__COMMUNICATION_PATH:
				getCommunicationPath().clear();
				getCommunicationPath().addAll((Collection<? extends CommunicationPath>)newValue);
				return;
			case TargetPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case TargetPackage.NODE__LABEL:
				setLabel((String)newValue);
				return;
			case TargetPackage.NODE__OWNED_RESOURCE:
				getOwnedResource().clear();
				getOwnedResource().addAll((Collection<? extends Resource>)newValue);
				return;
			case TargetPackage.NODE__NODE_CONNECTOR:
				getNodeConnector().clear();
				getNodeConnector().addAll((Collection<? extends Interconnect>)newValue);
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
			case TargetPackage.NODE__BASE_NODE:
				setBase_Node((org.eclipse.uml2.uml.Node)null);
				return;
			case TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE:
				getAvailableSharedResource().clear();
				return;
			case TargetPackage.NODE__COMMUNICATION_PATH:
				getCommunicationPath().clear();
				return;
			case TargetPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TargetPackage.NODE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case TargetPackage.NODE__OWNED_RESOURCE:
				getOwnedResource().clear();
				return;
			case TargetPackage.NODE__NODE_CONNECTOR:
				getNodeConnector().clear();
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
			case TargetPackage.NODE__BASE_NODE:
				return base_Node != null;
			case TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE:
				return availableSharedResource != null && !availableSharedResource.isEmpty();
			case TargetPackage.NODE__COMMUNICATION_PATH:
				return !getCommunicationPath().isEmpty();
			case TargetPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TargetPackage.NODE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case TargetPackage.NODE__OWNED_RESOURCE:
				return ownedResource != null && !ownedResource.isEmpty();
			case TargetPackage.NODE__NODE_CONNECTOR:
				return nodeConnector != null && !nodeConnector.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
