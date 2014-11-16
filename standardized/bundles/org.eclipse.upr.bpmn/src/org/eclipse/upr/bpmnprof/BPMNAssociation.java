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

import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
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
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getAssociationDirection <em>Association Direction</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getTargetRef <em>Target Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNAssociation()
 * @model
 * @generated
 */
public interface BPMNAssociation extends BPMNArtifact {
	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNAssociation_Base_Dependency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Association Direction</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.eclipse.upr.bpmnprof.AssociationDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Association Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Association Direction</em>' attribute.
	 * @see org.eclipse.upr.bpmnprof.AssociationDirection
	 * @see #setAssociationDirection(AssociationDirection)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNAssociation_AssociationDirection()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	AssociationDirection getAssociationDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getAssociationDirection <em>Association Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Association Direction</em>' attribute.
	 * @see org.eclipse.upr.bpmnprof.AssociationDirection
	 * @see #getAssociationDirection()
	 * @generated
	 */
	void setAssociationDirection(AssociationDirection value);

	/**
	 * Returns the value of the '<em><b>Target Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.BaseElement#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Ref</em>' reference.
	 * @see #setTargetRef(BaseElement)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNAssociation_TargetRef()
	 * @see org.eclipse.upr.bpmnprof.BaseElement#getIncoming
	 * @model opposite="incoming" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BaseElement getTargetRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getTargetRef <em>Target Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ref</em>' reference.
	 * @see #getTargetRef()
	 * @generated
	 */
	void setTargetRef(BaseElement value);

	/**
	 * Returns the value of the '<em><b>Source Ref</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.BaseElement#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Ref</em>' reference.
	 * @see #setSourceRef(BaseElement)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNAssociation_SourceRef()
	 * @see org.eclipse.upr.bpmnprof.BaseElement#getOutgoing
	 * @model opposite="outgoing" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BaseElement getSourceRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNAssociation#getSourceRef <em>Source Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ref</em>' reference.
	 * @see #getSourceRef()
	 * @generated
	 */
	void setSourceRef(BaseElement value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * At least one of association ends (target or source) must be TextAnnotation.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean AssociationEnd(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BPMNAssociation
