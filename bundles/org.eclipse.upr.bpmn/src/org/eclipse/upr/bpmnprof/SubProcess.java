/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.StructuredActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.SubProcess#getBase_StructuredActivityNode <em>Base Structured Activity Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.SubProcess#getHasLaneSets <em>Has Lane Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getSubProcess()
 * @model
 * @generated
 */
public interface SubProcess extends BPMNActivity, FlowElementsContainer {
	/**
	 * Returns the value of the '<em><b>Triggered By Event</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By Event</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By Event</em>' attribute.
	 * @see #setTriggeredByEvent(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getSubProcess_TriggeredByEvent()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isTriggeredByEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.SubProcess#isTriggeredByEvent <em>Triggered By Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered By Event</em>' attribute.
	 * @see #isTriggeredByEvent()
	 * @generated
	 */
	void setTriggeredByEvent(boolean value);

	/**
	 * Returns the value of the '<em><b>Base Structured Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Structured Activity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Structured Activity Node</em>' reference.
	 * @see #setBase_StructuredActivityNode(StructuredActivityNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getSubProcess_Base_StructuredActivityNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getBase_StructuredActivityNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.SubProcess#getBase_StructuredActivityNode <em>Base Structured Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structured Activity Node</em>' reference.
	 * @see #getBase_StructuredActivityNode()
	 * @generated
	 */
	void setBase_StructuredActivityNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Has Lane Sets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.LaneSet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Lane Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Lane Sets</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getSubProcess_HasLaneSets()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<LaneSet> getHasLaneSets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * StructuredActivityNodes with SubProcess Stereotype applied that have triggeredByEvent=true, and containing initial nodes with Start Event applied that have isInterrupting = false, have isLocallyReentrant = true.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='SubProcess.triggeredByEvent'"
	 * @generated
	 */
	boolean SubProcesstriggeredByEvent(DiagnosticChain diagnostics, Map<Object, Object> context);

} // SubProcess
