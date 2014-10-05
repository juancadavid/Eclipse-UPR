/**
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Element</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.FlowElement#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.FlowElement#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.FlowElement#get_categoryValueRef <em>category Value Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.FlowElement#getContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElement()
 * @model abstract="true"
 * @generated
 */
public interface FlowElement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Auditing</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auditing</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auditing</em>' reference.
	 * @see #setAuditing(Auditing)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElement_Auditing()
	 * @model ordered="false"
	 * @generated
	 */
	Auditing getAuditing();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.FlowElement#getAuditing <em>Auditing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditing</em>' reference.
	 * @see #getAuditing()
	 * @generated
	 */
	void setAuditing(Auditing value);

	/**
	 * Returns the value of the '<em><b>Monitoring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitoring</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitoring</em>' reference.
	 * @see #setMonitoring(Monitoring)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElement_Monitoring()
	 * @model ordered="false"
	 * @generated
	 */
	Monitoring getMonitoring();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.FlowElement#getMonitoring <em>Monitoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring</em>' reference.
	 * @see #getMonitoring()
	 * @generated
	 */
	void setMonitoring(Monitoring value);

	/**
	 * Returns the value of the '<em><b>category Value Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.CategoryValue}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.CategoryValue#getCategorizedFlowElements <em>Categorized Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>category Value Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>category Value Ref</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElement__categoryValueRef()
	 * @see org.eclipse.upr.bpmnprof.CategoryValue#getCategorizedFlowElements
	 * @model opposite="categorizedFlowElements" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName=' categoryValueRef'"
	 * @generated
	 */
	EList<CategoryValue> get_categoryValueRef();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' reference.
	 * @see #setContainer(FlowElementsContainer)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElement_Container()
	 * @see org.eclipse.upr.bpmnprof.FlowElementsContainer#getFlowElements
	 * @model opposite="flowElements" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	FlowElementsContainer getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.FlowElement#getContainer <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(FlowElementsContainer value);

} // FlowElement
