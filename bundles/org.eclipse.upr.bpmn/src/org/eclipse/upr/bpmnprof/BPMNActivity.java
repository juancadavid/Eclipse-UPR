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

import org.eclipse.uml2.uml.Action;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BPMN Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#isForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getStartQuantity <em>Start Quantity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getActivityClass <em>Activity Class</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.BPMNActivity#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity()
 * @model abstract="true"
 * @generated
 */
public interface BPMNActivity extends FlowNode {
	/**
	 * Returns the value of the '<em><b>Is For Compensation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is For Compensation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is For Compensation</em>' attribute.
	 * @see #setIsForCompensation(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_IsForCompensation()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isForCompensation();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#isForCompensation <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is For Compensation</em>' attribute.
	 * @see #isForCompensation()
	 * @generated
	 */
	void setIsForCompensation(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Quantity</em>' attribute.
	 * @see #setStartQuantity(int)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_StartQuantity()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getStartQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#getStartQuantity <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Quantity</em>' attribute.
	 * @see #getStartQuantity()
	 * @generated
	 */
	void setStartQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Completion Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Completion Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Completion Quantity</em>' attribute.
	 * @see #setCompletionQuantity(int)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_CompletionQuantity()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCompletionQuantity();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#getCompletionQuantity <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Completion Quantity</em>' attribute.
	 * @see #getCompletionQuantity()
	 * @generated
	 */
	void setCompletionQuantity(int value);

	/**
	 * Returns the value of the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Action</em>' reference.
	 * @see #setBase_Action(Action)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_Base_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Action getBase_Action();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#getBase_Action <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Action</em>' reference.
	 * @see #getBase_Action()
	 * @generated
	 */
	void setBase_Action(Action value);

	/**
	 * Returns the value of the '<em><b>Activity Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity Class</em>' reference.
	 * @see #setActivityClass(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_ActivityClass()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getActivityClass();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#getActivityClass <em>Activity Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity Class</em>' reference.
	 * @see #getActivityClass()
	 * @generated
	 */
	void setActivityClass(org.eclipse.uml2.uml.Class value);

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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_Properties()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BPMNProperty> getProperties();

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
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_Default()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	SequenceFlow getDefault();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#getDefault <em>Default</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' reference.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(SequenceFlow value);

	/**
	 * Returns the value of the '<em><b>Boundary Event Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.BoundaryEvent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boundary Event Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundary Event Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_BoundaryEventRefs()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BoundaryEvent> getBoundaryEventRefs();

	/**
	 * Returns the value of the '<em><b>Data Input Associations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataInputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Input Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Input Associations</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_DataInputAssociations()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataInputAssociation> getDataInputAssociations();

	/**
	 * Returns the value of the '<em><b>Data Output Associations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.DataOutputAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Output Associations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Output Associations</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_DataOutputAssociations()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<DataOutputAssociation> getDataOutputAssociations();

	/**
	 * Returns the value of the '<em><b>Loop Characteristics</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loop Characteristics</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loop Characteristics</em>' reference.
	 * @see #setLoopCharacteristics(LoopCharacteristics)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_LoopCharacteristics()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	LoopCharacteristics getLoopCharacteristics();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.BPMNActivity#getLoopCharacteristics <em>Loop Characteristics</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loop Characteristics</em>' reference.
	 * @see #getLoopCharacteristics()
	 * @generated
	 */
	void setLoopCharacteristics(LoopCharacteristics value);

	/**
	 * Returns the value of the '<em><b>Resources</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.ResourceRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resources</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getBPMNActivity_Resources()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<ResourceRole> getResources();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.properties = self.base_BPMNActivity.activityClass. ownedAttribute.bpmnProperty
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNActivity.resources'"
	 * @generated
	 */
	boolean BPMNActivityresources(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BPMNActivity::/container : RederinableElement the collected values of Action::Activity and Action::inGroup. Constrained to elements stereotyped by BPMNActivity or SubProcess
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNActivity.container'"
	 * @generated
	 */
	boolean BPMNActivitycontainer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BPMNActivity::/resources : ResourceRole [*] = BPMNActivity.activityClass.OwnedAttribute with the ResourceRole stereotype applied.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNActivity.properties'"
	 * @generated
	 */
	boolean BPMNActivityproperties(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BPMNActivity::/default : SequenceFlow [0..1] = and outgoingSequenceFlow with guard = "else"
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNActivity.default'"
	 * @generated
	 */
	boolean BPMNActivitydefault(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BPMNActivity::/boundaryEventsRefs : BoundaryEvent [*] = accept Event Actions in the same interruptible region as the BPMNActivity action.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNActivity.boundaryEventsRefs'"
	 * @generated
	 */
	boolean BPMNActivityboundaryEventsRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BPMNActivity::/loopCharacteristics = inStructuredActivityNode, if the inStructuredActivityNode is a LoopNode with the StandardLoopCharacteristics stereotype applied or an ExpansionRegion with MultiInstanceLoopCharacteristics stereotype applied, otherwise empty.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='BPMNActivity.loopCharacteristics'"
	 * @generated
	 */
	boolean BPMNActivityloopCharacteristics(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BPMNActivity
