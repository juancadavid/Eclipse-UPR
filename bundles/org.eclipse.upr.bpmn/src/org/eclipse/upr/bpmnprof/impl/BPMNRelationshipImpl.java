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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;

import org.eclipse.upr.bpmnprof.BPMNRelationship;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.Definitions;
import org.eclipse.upr.bpmnprof.RelationshipDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNRelationshipImpl#getBase_Constraint <em>Base Constraint</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNRelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNRelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNRelationshipImpl#getTargets <em>Targets</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNRelationshipImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNRelationshipImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNRelationshipImpl extends BaseElementImpl implements BPMNRelationship {
	/**
	 * The cached value of the '{@link #getBase_Constraint() <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Constraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint base_Constraint;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final RelationshipDirection DIRECTION_EDEFAULT = RelationshipDirection.NONE;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected RelationshipDirection direction = DIRECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTargets() <em>Targets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargets()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> targets;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> sources;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNRelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNRelationship();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getBase_Constraint() {
		if (base_Constraint != null && base_Constraint.eIsProxy()) {
			InternalEObject oldBase_Constraint = (InternalEObject)base_Constraint;
			base_Constraint = (Constraint)eResolveProxy(oldBase_Constraint);
			if (base_Constraint != oldBase_Constraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_RELATIONSHIP__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
			}
		}
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetBase_Constraint() {
		return base_Constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Constraint(Constraint newBase_Constraint) {
		Constraint oldBase_Constraint = base_Constraint;
		base_Constraint = newBase_Constraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_RELATIONSHIP__BASE_CONSTRAINT, oldBase_Constraint, base_Constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_RELATIONSHIP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(RelationshipDirection newDirection) {
		RelationshipDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_RELATIONSHIP__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargets() {
		if (targets == null) {
			targets = new EObjectResolvingEList<Element>(Element.class, this, BpmnprofPackage.BPMN_RELATIONSHIP__TARGETS);
		}
		return targets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getSources() {
		if (sources == null) {
			sources = new EObjectResolvingEList<Element>(Element.class, this, BpmnprofPackage.BPMN_RELATIONSHIP__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions getDefinition() {
		Definitions definition = basicGetDefinition();
		return definition != null && definition.eIsProxy() ? (Definitions)eResolveProxy((InternalEObject)definition) : definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions basicGetDefinition() {
		// TODO: implement this method to return the 'Definition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Definitions newDefinition) {
		// TODO: implement this method to set the 'Definition' reference
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
			case BpmnprofPackage.BPMN_RELATIONSHIP__BASE_CONSTRAINT:
				if (resolve) return getBase_Constraint();
				return basicGetBase_Constraint();
			case BpmnprofPackage.BPMN_RELATIONSHIP__TYPE:
				return getType();
			case BpmnprofPackage.BPMN_RELATIONSHIP__DIRECTION:
				return getDirection();
			case BpmnprofPackage.BPMN_RELATIONSHIP__TARGETS:
				return getTargets();
			case BpmnprofPackage.BPMN_RELATIONSHIP__SOURCES:
				return getSources();
			case BpmnprofPackage.BPMN_RELATIONSHIP__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case BpmnprofPackage.BPMN_RELATIONSHIP__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)newValue);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__TYPE:
				setType((String)newValue);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__DIRECTION:
				setDirection((RelationshipDirection)newValue);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__TARGETS:
				getTargets().clear();
				getTargets().addAll((Collection<? extends Element>)newValue);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends Element>)newValue);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__DEFINITION:
				setDefinition((Definitions)newValue);
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
			case BpmnprofPackage.BPMN_RELATIONSHIP__BASE_CONSTRAINT:
				setBase_Constraint((Constraint)null);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__TARGETS:
				getTargets().clear();
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__SOURCES:
				getSources().clear();
				return;
			case BpmnprofPackage.BPMN_RELATIONSHIP__DEFINITION:
				setDefinition((Definitions)null);
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
			case BpmnprofPackage.BPMN_RELATIONSHIP__BASE_CONSTRAINT:
				return base_Constraint != null;
			case BpmnprofPackage.BPMN_RELATIONSHIP__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case BpmnprofPackage.BPMN_RELATIONSHIP__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case BpmnprofPackage.BPMN_RELATIONSHIP__TARGETS:
				return targets != null && !targets.isEmpty();
			case BpmnprofPackage.BPMN_RELATIONSHIP__SOURCES:
				return sources != null && !sources.isEmpty();
			case BpmnprofPackage.BPMN_RELATIONSHIP__DEFINITION:
				return basicGetDefinition() != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //BPMNRelationshipImpl
