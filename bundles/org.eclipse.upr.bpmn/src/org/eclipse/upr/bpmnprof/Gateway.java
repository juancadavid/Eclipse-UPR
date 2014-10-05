/**
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ControlNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::CoreStructure::Common::Gateways.</p>
 * <p>From package BPMNProfile::CoreStructure::Infrastructure.</p>
 * <p>From package BPMNProfile::Process.</p>
 * <p>From package BPMNProfile (URI {@literal http://www.omg.org/spec/BPMNProfile/20121112/}).</p>
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
 *   <li>{@link org.eclipse.upr.bpmnprof.Gateway#getBase_ControlNode <em>Base Control Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Gateway#getBase_ActivityGroup <em>Base Activity Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getGateway()
 * @model abstract="true"
 * @generated
 */
public interface Gateway extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Base Control Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Control Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Control Node</em>' reference.
	 * @see #setBase_ControlNode(ControlNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getGateway_Base_ControlNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ControlNode getBase_ControlNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Gateway#getBase_ControlNode <em>Base Control Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Control Node</em>' reference.
	 * @see #getBase_ControlNode()
	 * @generated
	 */
	void setBase_ControlNode(ControlNode value);

	/**
	 * Returns the value of the '<em><b>Base Activity Group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Group</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Group</em>' reference.
	 * @see #setBase_ActivityGroup(ActivityGroup)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getGateway_Base_ActivityGroup()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActivityGroup getBase_ActivityGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Gateway#getBase_ActivityGroup <em>Base Activity Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Group</em>' reference.
	 * @see #getBase_ActivityGroup()
	 * @generated
	 */
	void setBase_ActivityGroup(ActivityGroup value);

} // Gateway
