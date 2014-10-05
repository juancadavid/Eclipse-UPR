/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.ActivityPartition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lane Set</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.LaneSet#getBase_ActivityPartition <em>Base Activity Partition</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.LaneSet#getLanes <em>Lanes</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.LaneSet#getParentLane <em>Parent Lane</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.LaneSet#getFlowElementsContainer <em>Flow Elements Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getLaneSet()
 * @model
 * @generated
 */
public interface LaneSet extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Base Activity Partition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity Partition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity Partition</em>' reference.
	 * @see #setBase_ActivityPartition(ActivityPartition)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getLaneSet_Base_ActivityPartition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ActivityPartition getBase_ActivityPartition();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.LaneSet#getBase_ActivityPartition <em>Base Activity Partition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity Partition</em>' reference.
	 * @see #getBase_ActivityPartition()
	 * @generated
	 */
	void setBase_ActivityPartition(ActivityPartition value);

	/**
	 * Returns the value of the '<em><b>Lanes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.Lane}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.Lane#getLaneSet <em>Lane Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lanes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lanes</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getLaneSet_Lanes()
	 * @see org.eclipse.upr.bpmnprof.Lane#getLaneSet
	 * @model opposite="laneSet" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Lane> getLanes();

	/**
	 * Returns the value of the '<em><b>Parent Lane</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.Lane}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Lane</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Lane</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getLaneSet_ParentLane()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Lane> getParentLane();

	/**
	 * Returns the value of the '<em><b>Flow Elements Container</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.FlowElementsContainer#getLaneSets <em>Lane Sets</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow Elements Container</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow Elements Container</em>' reference.
	 * @see #setFlowElementsContainer(FlowElementsContainer)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getLaneSet_FlowElementsContainer()
	 * @see org.eclipse.upr.bpmnprof.FlowElementsContainer#getLaneSets
	 * @model opposite="laneSets" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	FlowElementsContainer getFlowElementsContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.LaneSet#getFlowElementsContainer <em>Flow Elements Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Elements Container</em>' reference.
	 * @see #getFlowElementsContainer()
	 * @generated
	 */
	void setFlowElementsContainer(FlowElementsContainer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaneSet::/lanes : Lane [*] = ActivityPartition.SubPartition
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LaneSet.lanes'"
	 * @generated
	 */
	boolean LaneSetlanes(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaneSet::/parentLane : Lane [*] = ActivityPartition.superpartition
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LaneSet.parentLane'"
	 * @generated
	 */
	boolean LaneSetparentLane(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * LaneSet::/flowElementsContainer [0..1] inverse of Activity.partition and SubProcess.laneSets
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='LaneSet.flowElementsContainer'"
	 * @generated
	 */
	boolean LaneSetflowElementsContainer(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ActivityPartitions with LaneSet stereotype applied must have isDimension = true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean LaneSet(DiagnosticChain diagnostics, Map<Object, Object> context);

} // LaneSet
