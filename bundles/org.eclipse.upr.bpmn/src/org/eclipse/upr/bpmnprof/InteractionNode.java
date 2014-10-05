/**
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Element;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Node</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.InteractionNode#getBase_Element <em>Base Element</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.InteractionNode#getOutgoingConversationLinks <em>Outgoing Conversation Links</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInteractionNode()
 * @model abstract="true"
 * @generated
 */
public interface InteractionNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Element</em>' reference.
	 * @see #setBase_Element(Element)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInteractionNode_Base_Element()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Element getBase_Element();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.InteractionNode#getBase_Element <em>Base Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Element</em>' reference.
	 * @see #getBase_Element()
	 * @generated
	 */
	void setBase_Element(Element value);

	/**
	 * Returns the value of the '<em><b>Outgoing Conversation Links</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ConversationLink}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.ConversationLink#getSourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Conversation Links</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Conversation Links</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInteractionNode_OutgoingConversationLinks()
	 * @see org.eclipse.upr.bpmnprof.ConversationLink#getSourceRef
	 * @model opposite="sourceRef" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ConversationLink> getOutgoingConversationLinks();

	/**
	 * Returns the value of the '<em><b>Incoming Conversation Links</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.ConversationLink#getTargetRef <em>Target Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Conversation Links</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Conversation Links</em>' reference.
	 * @see #setIncomingConversationLinks(ConversationLink)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getInteractionNode_IncomingConversationLinks()
	 * @see org.eclipse.upr.bpmnprof.ConversationLink#getTargetRef
	 * @model opposite="targetRef" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ConversationLink getIncomingConversationLinks();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.InteractionNode#getIncomingConversationLinks <em>Incoming Conversation Links</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Incoming Conversation Links</em>' reference.
	 * @see #getIncomingConversationLinks()
	 * @generated
	 */
	void setIncomingConversationLinks(ConversationLink value);

} // InteractionNode
