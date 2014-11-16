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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Elements Container</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.FlowElementsContainer#getFlowElements <em>Flow Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElementsContainer()
 * @model abstract="true"
 * @generated
 */
public interface FlowElementsContainer extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Lane Sets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.LaneSet}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.LaneSet#getFlowElementsContainer <em>Flow Elements Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lane Sets</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lane Sets</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElementsContainer_LaneSets()
	 * @see org.eclipse.upr.bpmnprof.LaneSet#getFlowElementsContainer
	 * @model opposite="flowElementsContainer" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<LaneSet> getLaneSets();

	/**
	 * Returns the value of the '<em><b>Flow Elements</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.FlowElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.FlowElement#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getFlowElementsContainer_FlowElements()
	 * @see org.eclipse.upr.bpmnprof.FlowElement#getContainer
	 * @model opposite="container" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<FlowElement> getFlowElements();

} // FlowElementsContainer
