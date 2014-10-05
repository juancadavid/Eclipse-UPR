/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.InitialNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Catch Event</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CatchEvent#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CatchEvent#getBase_InitialNode <em>Base Initial Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.CatchEvent#getDataOutputAssociation <em>Data Output Association</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCatchEvent()
 * @model abstract="true"
 * @generated
 */
public interface CatchEvent extends BPMNEvent {
	/**
	 * Returns the value of the '<em><b>Parallel Multiple</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallel Multiple</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallel Multiple</em>' attribute.
	 * @see #setParallelMultiple(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCatchEvent_ParallelMultiple()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isParallelMultiple();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CatchEvent#isParallelMultiple <em>Parallel Multiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallel Multiple</em>' attribute.
	 * @see #isParallelMultiple()
	 * @generated
	 */
	void setParallelMultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Accept Event Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #setBase_AcceptEventAction(AcceptEventAction)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCatchEvent_Base_AcceptEventAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AcceptEventAction getBase_AcceptEventAction();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CatchEvent#getBase_AcceptEventAction <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 */
	void setBase_AcceptEventAction(AcceptEventAction value);

	/**
	 * Returns the value of the '<em><b>Base Initial Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Initial Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Initial Node</em>' reference.
	 * @see #setBase_InitialNode(InitialNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCatchEvent_Base_InitialNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InitialNode getBase_InitialNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.CatchEvent#getBase_InitialNode <em>Base Initial Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Initial Node</em>' reference.
	 * @see #getBase_InitialNode()
	 * @generated
	 */
	void setBase_InitialNode(InitialNode value);

	/**
	 * Returns the value of the '<em><b>Data Output Association</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataOutputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Association</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Association</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getCatchEvent_DataOutputAssociation()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataOutputAssociation> getDataOutputAssociation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * catchEvent::/eventDefinitionsRefs : EventDefinitions [*] = the events of the triggers of an accept event action to which the stereotype is applied that are not owned by the action.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='catchEvent.eventDefinitionsRefs'"
	 * @generated
	 */
	boolean catchEventeventDefinitionsRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

} // CatchEvent
