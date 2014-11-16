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

import org.eclipse.uml2.uml.FinalNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Event</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.EndEvent#getBase_FinalNode <em>Base Final Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEndEvent()
 * @model
 * @generated
 */
public interface EndEvent extends ThrowEvent {
	/**
	 * Returns the value of the '<em><b>Base Final Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Final Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Final Node</em>' reference.
	 * @see #setBase_FinalNode(FinalNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEndEvent_Base_FinalNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FinalNode getBase_FinalNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.EndEvent#getBase_FinalNode <em>Base Final Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Final Node</em>' reference.
	 * @see #getBase_FinalNode()
	 * @generated
	 */
	void setBase_FinalNode(FinalNode value);

} // EndEvent
