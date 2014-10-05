/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.FlowFinalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::CoreStructure::Common::Events.</p>
 * <p>From package BPMNProfile::CoreStructure::Common::Artifacts.</p>
 * <p>From package BPMNProfile::CoreStructure::Common.</p>
 * <p>From package BPMNProfile::Process::Data.</p>
 * <p>From package BPMNProfile::Process::HumanInteraction.</p>
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
 *   <li>{@link org.eclipse.upr.bpmnprof.ThrowEvent#getBase_CallOperationAction <em>Base Call Operation Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ThrowEvent#getBase_FlowFinalNode <em>Base Flow Final Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ThrowEvent#getDataInputAssociation <em>Data Input Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getThrowEvent()
 * @model abstract="true"
 * @generated
 */
public interface ThrowEvent extends BPMNEvent {
	/**
	 * Returns the value of the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Call Operation Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Call Operation Action</em>' reference.
	 * @see #setBase_CallOperationAction(CallOperationAction)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getThrowEvent_Base_CallOperationAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CallOperationAction getBase_CallOperationAction();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ThrowEvent#getBase_CallOperationAction <em>Base Call Operation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Call Operation Action</em>' reference.
	 * @see #getBase_CallOperationAction()
	 * @generated
	 */
	void setBase_CallOperationAction(CallOperationAction value);

	/**
	 * Returns the value of the '<em><b>Base Flow Final Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Flow Final Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Flow Final Node</em>' reference.
	 * @see #setBase_FlowFinalNode(FlowFinalNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getThrowEvent_Base_FlowFinalNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FlowFinalNode getBase_FlowFinalNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ThrowEvent#getBase_FlowFinalNode <em>Base Flow Final Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Flow Final Node</em>' reference.
	 * @see #getBase_FlowFinalNode()
	 * @generated
	 */
	void setBase_FlowFinalNode(FlowFinalNode value);

	/**
	 * Returns the value of the '<em><b>Data Input Association</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataInputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Association</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getThrowEvent_DataInputAssociation()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataInputAssociation> getDataInputAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ThrowEvent::/eventDefinitionRefs : EventDefintion [*] = the events of the triggers of a call operation action to which the stereotype is applied that are not owned by action.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='ThrowEvent.eventDefinitionRefs'"
	 * @generated
	 */
	boolean ThrowEventeventDefinitionRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ThrowEvent
