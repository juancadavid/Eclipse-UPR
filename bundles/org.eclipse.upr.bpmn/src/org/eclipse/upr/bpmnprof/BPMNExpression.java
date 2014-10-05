/**
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.uml2.uml.OpaqueExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
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
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNExpression#getBase_OpaqueExpression <em>Base Opaque Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNExpression()
 * @model
 * @generated
 */
public interface BPMNExpression extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Base Opaque Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Opaque Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Opaque Expression</em>' reference.
	 * @see #setBase_OpaqueExpression(OpaqueExpression)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNExpression_Base_OpaqueExpression()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OpaqueExpression getBase_OpaqueExpression();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNExpression#getBase_OpaqueExpression <em>Base Opaque Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Opaque Expression</em>' reference.
	 * @see #getBase_OpaqueExpression()
	 * @generated
	 */
	void setBase_OpaqueExpression(OpaqueExpression value);

} // BPMNExpression
