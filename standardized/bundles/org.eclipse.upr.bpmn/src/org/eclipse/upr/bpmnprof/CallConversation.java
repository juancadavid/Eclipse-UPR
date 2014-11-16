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
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.CollaborationUse;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Conversation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::Collaboration::Conversation.</p>
 * <p>From package BPMNProfile::CoreStructure.</p>
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.CallConversation#get_collaborationUse <em>collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CallConversation#getParticipantAssociations <em>Participant Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCallConversation()
 * @model
 * @generated
 */
public interface CallConversation extends ConversationNode {
	/**
	 * Returns the value of the '<em><b>collaboration Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>collaboration Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>collaboration Use</em>' reference.
	 * @see #set_collaborationUse(CollaborationUse)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCallConversation__collaborationUse()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' collaborationUse'"
	 * @generated
	 */
	CollaborationUse get_collaborationUse();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CallConversation#get_collaborationUse <em>collaboration Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>collaboration Use</em>' reference.
	 * @see #get_collaborationUse()
	 * @generated
	 */
	void set_collaborationUse(CollaborationUse value);

	/**
	 * Returns the value of the '<em><b>Called Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Called Collaboration Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #setCalledCollaborationRef(BPMNCollaboration)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCallConversation_CalledCollaborationRef()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BPMNCollaboration getCalledCollaborationRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CallConversation#getCalledCollaborationRef <em>Called Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Collaboration Ref</em>' reference.
	 * @see #getCalledCollaborationRef()
	 * @generated
	 */
	void setCalledCollaborationRef(BPMNCollaboration value);

	/**
	 * Returns the value of the '<em><b>Participant Associations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ParticipantAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Associations</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCallConversation_ParticipantAssociations()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CallConversation::/calledCollaborationRef : BPMNCollaboration [0..1] = Collaboration.type
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CallConversation.calledCollaborationRef'"
	 * @generated
	 */
	boolean CallConversationcalledCollaborationRef(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CallConversation::/participantAssociations : ParticipantAssociation [*] = CollaborationUse.RoleBinding
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='CallConversation.participantAssociations'"
	 * @generated
	 */
	boolean CallConversationparticipantAssociations(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CallConversation
