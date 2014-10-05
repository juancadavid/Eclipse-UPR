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

import org.eclipse.uml2.uml.Collaboration;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Collaboration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::Collaboration.</p>
 * <p>From package BPMNProfile::CoreStructure::Foundation.</p>
 * <p>From package BPMNProfile::CoreStructure::Service.</p>
 * <p>From package BPMNProfile::Collaboration::Conversation.</p>
 * <p>From package BPMNProfile::CoreStructure.</p>
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#isClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getParticipantAssociations <em>Participant Associations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getConversationLinks <em>Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getMessageFlowAssociations <em>Message Flow Associations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getMessageFlows <em>Message Flows</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getBase_Collaboration <em>Base Collaboration</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getConversations <em>Conversations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getCorrelationKeys <em>Correlation Keys</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getParticipants <em>Participants</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration()
 * @model
 * @generated
 */
public interface BPMNCollaboration extends RootElement {
	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #setIsClosed(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_IsClosed()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#isClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setIsClosed(boolean value);

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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_ParticipantAssociations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ParticipantAssociation> getParticipantAssociations();

	/**
	 * Returns the value of the '<em><b>Conversation Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ConversationLink}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.ConversationLink#getCollaboration <em>Collaboration</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversation Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversation Links</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_ConversationLinks()
	 * @see org.eclipse.upr.bpmnprof.ConversationLink#getCollaboration
	 * @model opposite="collaboration" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConversationLink> getConversationLinks();

	/**
	 * Returns the value of the '<em><b>Message Flow Associations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.MessageFlowAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flow Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flow Associations</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_MessageFlowAssociations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<MessageFlowAssociation> getMessageFlowAssociations();

	/**
	 * Returns the value of the '<em><b>Message Flows</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.MessageFlow}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Flows</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Flows</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_MessageFlows()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<MessageFlow> getMessageFlows();

	/**
	 * Returns the value of the '<em><b>Base Collaboration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Collaboration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Collaboration</em>' reference.
	 * @see #setBase_Collaboration(Collaboration)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_Base_Collaboration()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Collaboration getBase_Collaboration();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getBase_Collaboration <em>Base Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Collaboration</em>' reference.
	 * @see #getBase_Collaboration()
	 * @generated
	 */
	void setBase_Collaboration(Collaboration value);

	/**
	 * Returns the value of the '<em><b>Conversations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ConversationNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conversations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conversations</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_Conversations()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<ConversationNode> getConversations();

	/**
	 * Returns the value of the '<em><b>Correlation Keys</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.CorrelationKey}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Keys</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Keys</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_CorrelationKeys()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationKey> getCorrelationKeys();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNCollaboration_Participants()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Collaboration::/participants : Participant [*] = Collaboration.ownedAttributes with Participant stereotype applied.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Collaboration.participants'"
	 * @generated
	 */
	boolean Collaborationparticipants(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BPMNCollaboration
