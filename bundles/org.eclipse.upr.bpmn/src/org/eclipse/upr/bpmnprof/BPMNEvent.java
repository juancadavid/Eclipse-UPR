/**
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Event</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNEvent#getEventClass <em>Event Class</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNEvent#get_eventDefinitions <em>event Definitions</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNEvent#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNEvent#getEventDefinitionRefs <em>Event Definition Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNEvent()
 * @model abstract="true"
 * @generated
 */
public interface BPMNEvent extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Event Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Class</em>' reference.
	 * @see #setEventClass(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNEvent_EventClass()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getEventClass();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNEvent#getEventClass <em>Event Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Class</em>' reference.
	 * @see #getEventClass()
	 * @generated
	 */
	void setEventClass(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>event Definitions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>event Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>event Definitions</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNEvent__eventDefinitions()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' eventDefinitions'"
	 * @generated
	 */
	EList<EventDefinition> get_eventDefinitions();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.BPMNProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNEvent_Properties()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BPMNProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Event Definition Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.EventDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Definition Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Definition Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNEvent_EventDefinitionRefs()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<EventDefinition> getEventDefinitionRefs();

} // BPMNEvent
