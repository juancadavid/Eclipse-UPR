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

import org.eclipse.uml2.uml.CollaborationUse;

import org.eclipse.upr.bpmnprof.BPMNCollaboration;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CallConversation;
import org.eclipse.upr.bpmnprof.ParticipantAssociation;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallConversationImpl#get_collaborationUse <em>collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallConversationImpl#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallConversationImpl#getParticipantAssociations <em>Participant Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallConversationImpl extends ConversationNodeImpl implements CallConversation {
	/**
	 * The cached value of the '{@link #get_collaborationUse() <em>collaboration Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_collaborationUse()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse _collaborationUse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallConversationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getCallConversation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse get_collaborationUse() {
		if (_collaborationUse != null && _collaborationUse.eIsProxy()) {
			InternalEObject old_collaborationUse = (InternalEObject)_collaborationUse;
			_collaborationUse = (CollaborationUse)eResolveProxy(old_collaborationUse);
			if (_collaborationUse != old_collaborationUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CALL_CONVERSATION__COLLABORATION_USE, old_collaborationUse, _collaborationUse));
			}
		}
		return _collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGet_collaborationUse() {
		return _collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_collaborationUse(CollaborationUse new_collaborationUse) {
		CollaborationUse old_collaborationUse = _collaborationUse;
		_collaborationUse = new_collaborationUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CALL_CONVERSATION__COLLABORATION_USE, old_collaborationUse, _collaborationUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration getCalledCollaborationRef() {
		BPMNCollaboration calledCollaborationRef = basicGetCalledCollaborationRef();
		return calledCollaborationRef != null && calledCollaborationRef.eIsProxy() ? (BPMNCollaboration)eResolveProxy((InternalEObject)calledCollaborationRef) : calledCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration basicGetCalledCollaborationRef() {
		// TODO: implement this method to return the 'Called Collaboration Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledCollaborationRef(BPMNCollaboration newCalledCollaborationRef) {
		// TODO: implement this method to set the 'Called Collaboration Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParticipantAssociation> getParticipantAssociations() {
		// TODO: implement this method to return the 'Participant Associations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CallConversationcalledCollaborationRef(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.CALL_CONVERSATION__CALL_CONVERSATIONCALLED_COLLABORATION_REF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CallConversationcalledCollaborationRef", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean CallConversationparticipantAssociations(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.CALL_CONVERSATION__CALL_CONVERSATIONPARTICIPANT_ASSOCIATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CallConversationparticipantAssociations", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.CALL_CONVERSATION__COLLABORATION_USE:
				if (resolve) return get_collaborationUse();
				return basicGet_collaborationUse();
			case BpmnprofPackage.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				if (resolve) return getCalledCollaborationRef();
				return basicGetCalledCollaborationRef();
			case BpmnprofPackage.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				return getParticipantAssociations();
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
			case BpmnprofPackage.CALL_CONVERSATION__COLLABORATION_USE:
				set_collaborationUse((CollaborationUse)newValue);
				return;
			case BpmnprofPackage.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				setCalledCollaborationRef((BPMNCollaboration)newValue);
				return;
			case BpmnprofPackage.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
				getParticipantAssociations().addAll((Collection<? extends ParticipantAssociation>)newValue);
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
			case BpmnprofPackage.CALL_CONVERSATION__COLLABORATION_USE:
				set_collaborationUse((CollaborationUse)null);
				return;
			case BpmnprofPackage.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				setCalledCollaborationRef((BPMNCollaboration)null);
				return;
			case BpmnprofPackage.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				getParticipantAssociations().clear();
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
			case BpmnprofPackage.CALL_CONVERSATION__COLLABORATION_USE:
				return _collaborationUse != null;
			case BpmnprofPackage.CALL_CONVERSATION__CALLED_COLLABORATION_REF:
				return basicGetCalledCollaborationRef() != null;
			case BpmnprofPackage.CALL_CONVERSATION__PARTICIPANT_ASSOCIATIONS:
				return !getParticipantAssociations().isEmpty();
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
			case BpmnprofPackage.CALL_CONVERSATION___CALL_CONVERSATIONCALLED_COLLABORATION_REF__DIAGNOSTICCHAIN_MAP:
				return CallConversationcalledCollaborationRef((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.CALL_CONVERSATION___CALL_CONVERSATIONPARTICIPANT_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP:
				return CallConversationparticipantAssociations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CallConversationImpl
