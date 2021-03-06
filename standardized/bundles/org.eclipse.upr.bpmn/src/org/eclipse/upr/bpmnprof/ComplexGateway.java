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

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Gateway</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.ComplexGateway#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ComplexGateway#getActivationCondition <em>Activation Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getComplexGateway()
 * @model
 * @generated
 */
public interface ComplexGateway extends NonExclusiveGateway {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' reference.
	 * @see #setDefault(SequenceFlow)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getComplexGateway_Default()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ComplexGateway#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Activation Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activation Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activation Condition</em>' reference.
	 * @see #setActivationCondition(BPMNExpression)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getComplexGateway_ActivationCondition()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BPMNExpression getActivationCondition();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ComplexGateway#getActivationCondition <em>Activation Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activation Condition</em>' reference.
	 * @see #getActivationCondition()
	 * @generated
	 */
	void setActivationCondition(BPMNExpression value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complexGateway::/default : SequenceFlow [0..1] = an outgoing control flow with guard "else"
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='complexGateway.default'"
	 * @generated
	 */
	boolean complexGatewaydefault(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complexGateway::/activationCondition : BPMNExpression [0..1] = JoinNode::joinSpec
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='complexGateway.activationCondition'"
	 * @generated
	 */
	boolean complexGatewayactivationCondition(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * complexGateway::joinSpec = "BPMNInclusive" when applied to join nodes
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='complexGateway.joinSpec'"
	 * @generated
	 */
	boolean complexGatewayjoinSpec(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ComplexGateway
