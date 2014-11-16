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

import org.eclipse.upr.bpmnprof.BPMNCollaboration;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ConversationLink;
import org.eclipse.upr.bpmnprof.InteractionNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conversation Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ConversationLinkImpl#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ConversationLinkImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ConversationLinkImpl#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ConversationLinkImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConversationLinkImpl extends BaseElementImpl implements ConversationLink {
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
	protected ConversationLinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getConversationLink();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration getCollaboration() {
		BPMNCollaboration collaboration = basicGetCollaboration();
		return collaboration != null && collaboration.eIsProxy() ? (BPMNCollaboration)eResolveProxy((InternalEObject)collaboration) : collaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration basicGetCollaboration() {
		// TODO: implement this method to return the 'Collaboration' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollaboration(BPMNCollaboration newCollaboration) {
		// TODO: implement this method to set the 'Collaboration' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CONVERSATION_LINK__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CONVERSATION_LINK__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getTargetRef() {
		InteractionNode targetRef = basicGetTargetRef();
		return targetRef != null && targetRef.eIsProxy() ? (InteractionNode)eResolveProxy((InternalEObject)targetRef) : targetRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode basicGetTargetRef() {
		// TODO: implement this method to return the 'Target Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetRef(InteractionNode newTargetRef) {
		// TODO: implement this method to set the 'Target Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode getSourceRef() {
		InteractionNode sourceRef = basicGetSourceRef();
		return sourceRef != null && sourceRef.eIsProxy() ? (InteractionNode)eResolveProxy((InternalEObject)sourceRef) : sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionNode basicGetSourceRef() {
		// TODO: implement this method to return the 'Source Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceRef(InteractionNode newSourceRef) {
		// TODO: implement this method to set the 'Source Ref' reference
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
			case BpmnprofPackage.CONVERSATION_LINK__COLLABORATION:
				if (resolve) return getCollaboration();
				return basicGetCollaboration();
			case BpmnprofPackage.CONVERSATION_LINK__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
			case BpmnprofPackage.CONVERSATION_LINK__TARGET_REF:
				if (resolve) return getTargetRef();
				return basicGetTargetRef();
			case BpmnprofPackage.CONVERSATION_LINK__SOURCE_REF:
				if (resolve) return getSourceRef();
				return basicGetSourceRef();
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
			case BpmnprofPackage.CONVERSATION_LINK__COLLABORATION:
				setCollaboration((BPMNCollaboration)newValue);
				return;
			case BpmnprofPackage.CONVERSATION_LINK__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
				return;
			case BpmnprofPackage.CONVERSATION_LINK__TARGET_REF:
				setTargetRef((InteractionNode)newValue);
				return;
			case BpmnprofPackage.CONVERSATION_LINK__SOURCE_REF:
				setSourceRef((InteractionNode)newValue);
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
			case BpmnprofPackage.CONVERSATION_LINK__COLLABORATION:
				setCollaboration((BPMNCollaboration)null);
				return;
			case BpmnprofPackage.CONVERSATION_LINK__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
				return;
			case BpmnprofPackage.CONVERSATION_LINK__TARGET_REF:
				setTargetRef((InteractionNode)null);
				return;
			case BpmnprofPackage.CONVERSATION_LINK__SOURCE_REF:
				setSourceRef((InteractionNode)null);
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
			case BpmnprofPackage.CONVERSATION_LINK__COLLABORATION:
				return basicGetCollaboration() != null;
			case BpmnprofPackage.CONVERSATION_LINK__BASE_DEPENDENCY:
				return base_Dependency != null;
			case BpmnprofPackage.CONVERSATION_LINK__TARGET_REF:
				return basicGetTargetRef() != null;
			case BpmnprofPackage.CONVERSATION_LINK__SOURCE_REF:
				return basicGetSourceRef() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConversationLinkImpl
