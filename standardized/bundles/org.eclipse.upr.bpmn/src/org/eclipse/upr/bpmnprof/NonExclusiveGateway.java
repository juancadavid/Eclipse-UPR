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

import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.JoinNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Exclusive Gateway</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.NonExclusiveGateway#getBase_JoinNode <em>Base Join Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.NonExclusiveGateway#getBase_ForkNode <em>Base Fork Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getNonExclusiveGateway()
 * @model abstract="true"
 * @generated
 */
public interface NonExclusiveGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Base Join Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Join Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Join Node</em>' reference.
	 * @see #setBase_JoinNode(JoinNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getNonExclusiveGateway_Base_JoinNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	JoinNode getBase_JoinNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.NonExclusiveGateway#getBase_JoinNode <em>Base Join Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Join Node</em>' reference.
	 * @see #getBase_JoinNode()
	 * @generated
	 */
	void setBase_JoinNode(JoinNode value);

	/**
	 * Returns the value of the '<em><b>Base Fork Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Fork Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Fork Node</em>' reference.
	 * @see #setBase_ForkNode(ForkNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getNonExclusiveGateway_Base_ForkNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ForkNode getBase_ForkNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.NonExclusiveGateway#getBase_ForkNode <em>Base Fork Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Fork Node</em>' reference.
	 * @see #getBase_ForkNode()
	 * @generated
	 */
	void setBase_ForkNode(ForkNode value);

} // NonExclusiveGateway
