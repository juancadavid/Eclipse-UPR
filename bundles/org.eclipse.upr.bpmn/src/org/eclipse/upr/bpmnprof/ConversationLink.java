/**
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conversation Link</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.ConversationLink#getCollaboration <em>Collaboration</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ConversationLink#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ConversationLink#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ConversationLink#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getConversationLink()
 * @model
 * @generated
 */
public interface ConversationLink extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Collaboration</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.BPMNCollaboration#getConversationLinks <em>Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collaboration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collaboration</em>' reference.
	 * @see #setCollaboration(BPMNCollaboration)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getConversationLink_Collaboration()
	 * @see org.eclipse.upr.bpmnprof.BPMNCollaboration#getConversationLinks
	 * @model opposite="conversationLinks" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BPMNCollaboration getCollaboration();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ConversationLink#getCollaboration <em>Collaboration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collaboration</em>' reference.
	 * @see #getCollaboration()
	 * @generated
	 */
	void setCollaboration(BPMNCollaboration value);

	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getConversationLink_Base_Dependency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ConversationLink#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(InteractionNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getConversationLink_TargetRef()
	 * @see org.eclipse.upr.bpmnprof.InteractionNode#getIncomingConversationLinks
	 * @model opposite="incomingConversationLinks" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	InteractionNode getTargetRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ConversationLink#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(InteractionNode value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(InteractionNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getConversationLink_SourceRef()
	 * @see org.eclipse.upr.bpmnprof.InteractionNode#getOutgoingConversationLinks
	 * @model opposite="outgoingConversationLinks" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	InteractionNode getSourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ConversationLink#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(InteractionNode value);

} // ConversationLink
