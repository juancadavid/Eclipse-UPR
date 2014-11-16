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

import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.MergeNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exclusive Gateway</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.ExclusiveGateway#getBase_DecisionNode <em>Base Decision Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ExclusiveGateway#getBase_MergeNode <em>Base Merge Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.ExclusiveGateway#getDefault <em>Default</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExclusiveGateway()
 * @model
 * @generated
 */
public interface ExclusiveGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Base Decision Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Decision Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Decision Node</em>' reference.
	 * @see #setBase_DecisionNode(DecisionNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExclusiveGateway_Base_DecisionNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DecisionNode getBase_DecisionNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExclusiveGateway#getBase_DecisionNode <em>Base Decision Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Decision Node</em>' reference.
	 * @see #getBase_DecisionNode()
	 * @generated
	 */
	void setBase_DecisionNode(DecisionNode value);

	/**
	 * Returns the value of the '<em><b>Base Merge Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Merge Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Merge Node</em>' reference.
	 * @see #setBase_MergeNode(MergeNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExclusiveGateway_Base_MergeNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	MergeNode getBase_MergeNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExclusiveGateway#getBase_MergeNode <em>Base Merge Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Merge Node</em>' reference.
	 * @see #getBase_MergeNode()
	 * @generated
	 */
	void setBase_MergeNode(MergeNode value);

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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getExclusiveGateway_Default()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.ExclusiveGateway#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * exclusiveGateway::/default : SequenceFlow [0..1] = an outgoing control flow with guard "else"
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='exclusiveGateway.default'"
	 * @generated
	 */
	boolean exclusiveGatewaydefault(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExclusiveGateway
