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
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
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
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#isClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#isExecutable <em>Is Executable</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNProcess#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess()
 * @model
 * @generated
 */
public interface BPMNProcess extends CallableElement, FlowElementsContainer {
	/**
	 * Returns the value of the '<em><b>Process Type</b></em>' attribute.
	 * The default value is <code>"none"</code>.
	 * The literals are from the enumeration {@link org.eclipse.upr.bpmnprof.ProcessType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Type</em>' attribute.
	 * @see org.eclipse.upr.bpmnprof.ProcessType
	 * @see #setProcessType(ProcessType)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_ProcessType()
	 * @model default="none" required="true" ordered="false"
	 * @generated
	 */
	ProcessType getProcessType();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#getProcessType <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Type</em>' attribute.
	 * @see org.eclipse.upr.bpmnprof.ProcessType
	 * @see #getProcessType()
	 * @generated
	 */
	void setProcessType(ProcessType value);

	/**
	 * Returns the value of the '<em><b>Is Closed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Closed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Closed</em>' attribute.
	 * @see #setIsClosed(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_IsClosed()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isClosed();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#isClosed <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Closed</em>' attribute.
	 * @see #isClosed()
	 * @generated
	 */
	void setIsClosed(boolean value);

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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_Auditing()
	 * @model ordered="false"
	 * @generated
	 */
	Auditing getAuditing();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#getAuditing <em>Auditing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auditing</em>' reference.
	 * @see #getAuditing()
	 * @generated
	 */
	void setAuditing(Auditing value);

	/**
	 * Returns the value of the '<em><b>Is Executable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Executable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Executable</em>' attribute.
	 * @see #setIsExecutable(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_IsExecutable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isExecutable();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#isExecutable <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Executable</em>' attribute.
	 * @see #isExecutable()
	 * @generated
	 */
	void setIsExecutable(boolean value);

	/**
	 * Returns the value of the '<em><b>Definitional Collaboration Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitional Collaboration Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitional Collaboration Ref</em>' reference.
	 * @see #setDefinitionalCollaborationRef(BPMNCollaboration)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_DefinitionalCollaborationRef()
	 * @model ordered="false"
	 * @generated
	 */
	BPMNCollaboration getDefinitionalCollaborationRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitional Collaboration Ref</em>' reference.
	 * @see #getDefinitionalCollaborationRef()
	 * @generated
	 */
	void setDefinitionalCollaborationRef(BPMNCollaboration value);

	/**
	 * Returns the value of the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity</em>' reference.
	 * @see #setBase_Activity(Activity)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_Base_Activity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

	/**
	 * Returns the value of the '<em><b>Correlation Subscriptions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.CorrelationSubscription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Subscriptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Subscriptions</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_CorrelationSubscriptions()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CorrelationSubscription> getCorrelationSubscriptions();

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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_Monitoring()
	 * @model ordered="false"
	 * @generated
	 */
	Monitoring getMonitoring();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#getMonitoring <em>Monitoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Monitoring</em>' reference.
	 * @see #getMonitoring()
	 * @generated
	 */
	void setMonitoring(Monitoring value);

	/**
	 * Returns the value of the '<em><b>Supports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supports</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supports</em>' reference.
	 * @see #setSupports(BPMNProcess)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_Supports()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BPMNProcess getSupports();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNProcess#getSupports <em>Supports</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supports</em>' reference.
	 * @see #getSupports()
	 * @generated
	 */
	void setSupports(BPMNProcess value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.BPMNProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_Properties()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BPMNProperty> getProperties();

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ResourceRole}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.ResourceRole#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNProcess_Resources()
	 * @see org.eclipse.upr.bpmnprof.ResourceRole#getProcess
	 * @model opposite="process" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRole> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BPMN::Process supportedInterfaceRefs are referenced by UML property RealizedInterface.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Process.supportedInterfaceRefs'"
	 * @generated
	 */
	boolean ProcesssupportedInterfaceRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.supports = self.base_Activity./general.extension_Process 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Process.supports'"
	 * @generated
	 */
	boolean Processsupports(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.properties = self.base_Activity.ownedAttribute.bpmnProperty
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Process.properties'"
	 * @generated
	 */
	boolean Processproperties(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Process::/laneSets : LaneSet [*] = Activity.partition
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Process.laneSets'"
	 * @generated
	 */
	boolean ProcesslaneSets(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Process::/flowElements : RedefinableElement = the collected values of Activity::node, Activity::edge and Activity::group. Constrained to elements stereotyped by BPMN process element stereotypes.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Process.flowElements'"
	 * @generated
	 */
	boolean ProcessflowElements(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BPMNProcess
