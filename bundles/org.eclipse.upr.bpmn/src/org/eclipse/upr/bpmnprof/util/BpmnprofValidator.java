/**
 */
package org.eclipse.upr.bpmnprof.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.upr.bpmnprof.AdHocOrdering;
import org.eclipse.upr.bpmnprof.AdHocSubProcess;
import org.eclipse.upr.bpmnprof.Assignment;
import org.eclipse.upr.bpmnprof.AssociationDirection;
import org.eclipse.upr.bpmnprof.Auditing;
import org.eclipse.upr.bpmnprof.BPMNActivity;
import org.eclipse.upr.bpmnprof.BPMNArtifact;
import org.eclipse.upr.bpmnprof.BPMNAssociation;
import org.eclipse.upr.bpmnprof.BPMNCollaboration;
import org.eclipse.upr.bpmnprof.BPMNEvent;
import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BPMNExtension;
import org.eclipse.upr.bpmnprof.BPMNInterface;
import org.eclipse.upr.bpmnprof.BPMNMessage;
import org.eclipse.upr.bpmnprof.BPMNOperation;
import org.eclipse.upr.bpmnprof.BPMNProcess;
import org.eclipse.upr.bpmnprof.BPMNProperty;
import org.eclipse.upr.bpmnprof.BPMNRelationship;
import org.eclipse.upr.bpmnprof.BPMNSignal;
import org.eclipse.upr.bpmnprof.BaseElement;
import org.eclipse.upr.bpmnprof.BoundaryEvent;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.BusinessRuleTask;
import org.eclipse.upr.bpmnprof.CallActivity;
import org.eclipse.upr.bpmnprof.CallConversation;
import org.eclipse.upr.bpmnprof.CallableElement;
import org.eclipse.upr.bpmnprof.CancelEventDefinition;
import org.eclipse.upr.bpmnprof.CatchEvent;
import org.eclipse.upr.bpmnprof.Category;
import org.eclipse.upr.bpmnprof.CategoryValue;
import org.eclipse.upr.bpmnprof.CompensateEventDefinition;
import org.eclipse.upr.bpmnprof.ComplexBehaviorDefinition;
import org.eclipse.upr.bpmnprof.ComplexGateway;
import org.eclipse.upr.bpmnprof.ConditionalEventDefinition;
import org.eclipse.upr.bpmnprof.Conversation;
import org.eclipse.upr.bpmnprof.ConversationLink;
import org.eclipse.upr.bpmnprof.ConversationNode;
import org.eclipse.upr.bpmnprof.CorrelationKey;
import org.eclipse.upr.bpmnprof.CorrelationProperty;
import org.eclipse.upr.bpmnprof.CorrelationPropertyBinding;
import org.eclipse.upr.bpmnprof.CorrelationPropertyRetrievalExpression;
import org.eclipse.upr.bpmnprof.CorrelationSubscription;
import org.eclipse.upr.bpmnprof.DataAssociation;
import org.eclipse.upr.bpmnprof.DataInput;
import org.eclipse.upr.bpmnprof.DataInputAssociation;
import org.eclipse.upr.bpmnprof.DataObject;
import org.eclipse.upr.bpmnprof.DataObjectReference;
import org.eclipse.upr.bpmnprof.DataOutput;
import org.eclipse.upr.bpmnprof.DataOutputAssociation;
import org.eclipse.upr.bpmnprof.DataState;
import org.eclipse.upr.bpmnprof.DataStore;
import org.eclipse.upr.bpmnprof.DataStoreReference;
import org.eclipse.upr.bpmnprof.Definitions;
import org.eclipse.upr.bpmnprof.Documentation;
import org.eclipse.upr.bpmnprof.EndEvent;
import org.eclipse.upr.bpmnprof.ErrorEventDefinition;
import org.eclipse.upr.bpmnprof.Escalation;
import org.eclipse.upr.bpmnprof.EscalationEventDefinition;
import org.eclipse.upr.bpmnprof.EventBasedGateway;
import org.eclipse.upr.bpmnprof.EventBasedGatewayType;
import org.eclipse.upr.bpmnprof.EventDefinition;
import org.eclipse.upr.bpmnprof.ExclusiveGateway;
import org.eclipse.upr.bpmnprof.ExtensionAttributeDefinition;
import org.eclipse.upr.bpmnprof.ExtensionAttributeValue;
import org.eclipse.upr.bpmnprof.ExtensionDefinition;
import org.eclipse.upr.bpmnprof.FlowElement;
import org.eclipse.upr.bpmnprof.FlowElementsContainer;
import org.eclipse.upr.bpmnprof.FlowNode;
import org.eclipse.upr.bpmnprof.FormalExpression;
import org.eclipse.upr.bpmnprof.Gateway;
import org.eclipse.upr.bpmnprof.GatewayDirection;
import org.eclipse.upr.bpmnprof.GlobalBusinessRuleTask;
import org.eclipse.upr.bpmnprof.GlobalConversation;
import org.eclipse.upr.bpmnprof.GlobalManualTask;
import org.eclipse.upr.bpmnprof.GlobalScriptTask;
import org.eclipse.upr.bpmnprof.GlobalTask;
import org.eclipse.upr.bpmnprof.GlobalUserTask;
import org.eclipse.upr.bpmnprof.Group;
import org.eclipse.upr.bpmnprof.HumanPerformer;
import org.eclipse.upr.bpmnprof.ImplicitThrowEvent;
import org.eclipse.upr.bpmnprof.Import;
import org.eclipse.upr.bpmnprof.InclusiveGateway;
import org.eclipse.upr.bpmnprof.InputOutputBinding;
import org.eclipse.upr.bpmnprof.InputOutputSpecification;
import org.eclipse.upr.bpmnprof.InputSet;
import org.eclipse.upr.bpmnprof.InteractionNode;
import org.eclipse.upr.bpmnprof.IntermediateCatchEvent;
import org.eclipse.upr.bpmnprof.IntermediateThrowEvent;
import org.eclipse.upr.bpmnprof.ItemAwareElement;
import org.eclipse.upr.bpmnprof.ItemDefinition;
import org.eclipse.upr.bpmnprof.ItemKind;
import org.eclipse.upr.bpmnprof.Lane;
import org.eclipse.upr.bpmnprof.LaneSet;
import org.eclipse.upr.bpmnprof.LinkEventDefinition;
import org.eclipse.upr.bpmnprof.LoopCharacteristics;
import org.eclipse.upr.bpmnprof.ManualTask;
import org.eclipse.upr.bpmnprof.MessageEventDefinition;
import org.eclipse.upr.bpmnprof.MessageFlow;
import org.eclipse.upr.bpmnprof.MessageFlowAssociation;
import org.eclipse.upr.bpmnprof.Monitoring;
import org.eclipse.upr.bpmnprof.MultiInstanceBehavior;
import org.eclipse.upr.bpmnprof.MultiInstanceLoopCharacteristics;
import org.eclipse.upr.bpmnprof.NonExclusiveGateway;
import org.eclipse.upr.bpmnprof.OutputSet;
import org.eclipse.upr.bpmnprof.ParallelGateway;
import org.eclipse.upr.bpmnprof.Participant;
import org.eclipse.upr.bpmnprof.ParticipantAssociation;
import org.eclipse.upr.bpmnprof.ParticipantMultiplicity;
import org.eclipse.upr.bpmnprof.PartnerEntity;
import org.eclipse.upr.bpmnprof.PartnerRole;
import org.eclipse.upr.bpmnprof.Performer;
import org.eclipse.upr.bpmnprof.PotentialOwner;
import org.eclipse.upr.bpmnprof.ProcessType;
import org.eclipse.upr.bpmnprof.ReceiveTask;
import org.eclipse.upr.bpmnprof.RelationshipDirection;
import org.eclipse.upr.bpmnprof.Rendering;
import org.eclipse.upr.bpmnprof.Resource;
import org.eclipse.upr.bpmnprof.ResourceAssignmentExpression;
import org.eclipse.upr.bpmnprof.ResourceParameter;
import org.eclipse.upr.bpmnprof.ResourceParameterBinding;
import org.eclipse.upr.bpmnprof.ResourceRole;
import org.eclipse.upr.bpmnprof.RootElement;
import org.eclipse.upr.bpmnprof.ScriptTask;
import org.eclipse.upr.bpmnprof.SendTask;
import org.eclipse.upr.bpmnprof.SequenceFlow;
import org.eclipse.upr.bpmnprof.ServiceTask;
import org.eclipse.upr.bpmnprof.SignalEventDefinition;
import org.eclipse.upr.bpmnprof.StandardLoopCharacteristics;
import org.eclipse.upr.bpmnprof.StartEvent;
import org.eclipse.upr.bpmnprof.SubConversation;
import org.eclipse.upr.bpmnprof.SubProcess;
import org.eclipse.upr.bpmnprof.Task;
import org.eclipse.upr.bpmnprof.TerminateEventDefinition;
import org.eclipse.upr.bpmnprof.TextAnnotation;
import org.eclipse.upr.bpmnprof.ThrowEvent;
import org.eclipse.upr.bpmnprof.TimerEventDefinition;
import org.eclipse.upr.bpmnprof.Transaction;
import org.eclipse.upr.bpmnprof.UserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage
 * @generated
 */
public class BpmnprofValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BpmnprofValidator INSTANCE = new BpmnprofValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.upr.bpmnprof";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Inclusive Gatewaydefault' of 'Inclusive Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INCLUSIVE_GATEWAY__INCLUSIVE_GATEWAYDEFAULT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Association End' of 'BPMN Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ASSOCIATION__ASSOCIATION_END = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lane Setlanes' of 'Lane Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE_SET__LANE_SETLANES = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lane Setparent Lane' of 'Lane Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE_SET__LANE_SETPARENT_LANE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lane Setflow Elements Container' of 'Lane Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE_SET__LANE_SETFLOW_ELEMENTS_CONTAINER = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lane Set' of 'Lane Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE_SET__LANE_SET = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lanelane Set' of 'Lane'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE__LANELANE_SET = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lanechild Lane Set' of 'Lane'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE__LANECHILD_LANE_SET = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Lanepartition Element Ref' of 'Lane'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE__LANEPARTITION_ELEMENT_REF = 9;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Laneflow Node Refs' of 'Lane'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LANE__LANEFLOW_NODE_REFS = 10;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sequence Flowcondition Expression' of 'Sequence Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEQUENCE_FLOW__SEQUENCE_FLOWCONDITION_EXPRESSION = 11;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sequence Flowsource Ref' of 'Sequence Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEQUENCE_FLOW__SEQUENCE_FLOWSOURCE_REF = 12;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sequence Flowtarget Ref' of 'Sequence Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEQUENCE_FLOW__SEQUENCE_FLOWTARGET_REF = 13;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Complex Gatewaydefault' of 'Complex Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_GATEWAY__COMPLEX_GATEWAYDEFAULT = 14;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Complex Gatewayactivation Condition' of 'Complex Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_GATEWAY__COMPLEX_GATEWAYACTIVATION_CONDITION = 15;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Complex Gatewayjoin Spec' of 'Complex Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int COMPLEX_GATEWAY__COMPLEX_GATEWAYJOIN_SPEC = 16;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Exclusive Gatewaydefault' of 'Exclusive Gateway'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int EXCLUSIVE_GATEWAY__EXCLUSIVE_GATEWAYDEFAULT = 17;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Processsupported Interface Refs' of 'BPMN Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROCESS__PROCESSSUPPORTED_INTERFACE_REFS = 18;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Processsupports' of 'BPMN Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROCESS__PROCESSSUPPORTS = 19;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Processproperties' of 'BPMN Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROCESS__PROCESSPROPERTIES = 20;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Processlane Sets' of 'BPMN Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROCESS__PROCESSLANE_SETS = 21;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Processflow Elements' of 'BPMN Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROCESS__PROCESSFLOW_ELEMENTS = 22;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Callable Eelementsupported Interface Refs' of 'Callable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALLABLE_ELEMENT__CALLABLE_EELEMENTSUPPORTED_INTERFACE_REFS = 23;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Callable Elementresources' of 'Callable Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALLABLE_ELEMENT__CALLABLE_ELEMENTRESOURCES = 24;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Input Association' of 'Data Input'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_INPUT__DATA_INPUT_ASSOCIATION = 25;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Inputnotation' of 'Data Input'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_INPUT__DATA_INPUTNOTATION = 26;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Inputitem Subject Ref' of 'Data Input'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_INPUT__DATA_INPUTITEM_SUBJECT_REF = 27;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Item Aware Elementdata State' of 'Item Aware Element'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM_AWARE_ELEMENT__ITEM_AWARE_ELEMENTDATA_STATE = 28;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Item Definitionstructure Ref' of 'Item Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ITEM_DEFINITION__ITEM_DEFINITIONSTRUCTURE_REF = 29;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Setdata Input Refs' of 'Input Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUT_SET__INPUT_SETDATA_INPUT_REFS = 30;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Setoptional Input Refs' of 'Input Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUT_SET__INPUT_SETOPTIONAL_INPUT_REFS = 31;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Input Setwhile Executing Input Refs' of 'Input Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INPUT_SET__INPUT_SETWHILE_EXECUTING_INPUT_REFS = 32;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Outputnotation' of 'Data Output'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OUTPUT__DATA_OUTPUTNOTATION = 33;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Outputitem Subject Ref' of 'Data Output'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OUTPUT__DATA_OUTPUTITEM_SUBJECT_REF = 34;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Setdata Output Refs' of 'Output Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OUTPUT_SET__OUTPUT_SETDATA_OUTPUT_REFS = 35;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Setoptional Output Refs' of 'Output Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OUTPUT_SET__OUTPUT_SETOPTIONAL_OUTPUT_REFS = 36;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Output Setwhile Executing Output Refs' of 'Output Set'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int OUTPUT_SET__OUTPUT_SETWHILE_EXECUTING_OUTPUT_REFS = 37;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interfaceoperationmultiplicity' of 'BPMN Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_INTERFACE__INTERFACEOPERATIONMULTIPLICITY = 38;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Interfaceowned Operation' of 'BPMN Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_INTERFACE__INTERFACEOWNED_OPERATION = 39;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Interfacecallable Elements' of 'BPMN Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_INTERFACE__BPMN_INTERFACECALLABLE_ELEMENTS = 40;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Interfaceoperations' of 'BPMN Interface'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_INTERFACE__BPMN_INTERFACEOPERATIONS = 41;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Operationowner' of 'BPMN Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_OPERATION__BPMN_OPERATIONOWNER = 42;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Operationin Message Ref' of 'BPMN Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_OPERATION__BPMN_OPERATIONIN_MESSAGE_REF = 43;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Operationout Message Ref' of 'BPMN Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_OPERATION__BPMN_OPERATIONOUT_MESSAGE_REF = 44;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Operationerror Refs' of 'BPMN Operation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_OPERATION__BPMN_OPERATIONERROR_REFS = 45;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Messageitem Ref' of 'BPMN Message'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_MESSAGE__MESSAGEITEM_REF = 46;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Collaborationparticipants' of 'BPMN Collaboration'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_COLLABORATION__COLLABORATIONPARTICIPANTS = 47;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participant Associationinner Participant Ref' of 'Participant Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT_ASSOCIATION__PARTICIPANT_ASSOCIATIONINNER_PARTICIPANT_REF = 48;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participant Associationouter Participant Ref' of 'Participant Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT_ASSOCIATION__PARTICIPANT_ASSOCIATIONOUTER_PARTICIPANT_REF = 49;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantownership' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTOWNERSHIP = 50;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participanttype' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTTYPE = 51;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantmultiplicity Minimum' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTMULTIPLICITY_MINIMUM = 52;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantrealizationsupplier' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTREALIZATIONSUPPLIER = 53;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantprocess Ref' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTPROCESS_REF = 54;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantmultiplicity Maximum' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTMULTIPLICITY_MAXIMUM = 55;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantpartner Entity Ref' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTPARTNER_ENTITY_REF = 56;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantpartner Role Ref' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTPARTNER_ROLE_REF = 57;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Participantinterface Refs' of 'Participant'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTICIPANT__PARTICIPANTINTERFACE_REFS = 58;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Partner Entityparticipant Ref' of 'Partner Entity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTNER_ENTITY__PARTNER_ENTITYPARTICIPANT_REF = 59;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Partner Roleparticipant Ref' of 'Partner Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PARTNER_ROLE__PARTNER_ROLEPARTICIPANT_REF = 60;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Message Flow Associationinner Message Flow Ref' of 'Message Flow Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_FLOW_ASSOCIATION__MESSAGE_FLOW_ASSOCIATIONINNER_MESSAGE_FLOW_REF = 61;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Message Flow Associationouter Message Flow Ref' of 'Message Flow Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_FLOW_ASSOCIATION__MESSAGE_FLOW_ASSOCIATIONOUTER_MESSAGE_FLOW_REF = 62;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Message Flowsource Ref' of 'Message Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_FLOW__MESSAGE_FLOWSOURCE_REF = 63;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Message Flowtarget Ref' of 'Message Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_FLOW__MESSAGE_FLOWTARGET_REF = 64;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Message Flowmessage Ref' of 'Message Flow'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MESSAGE_FLOW__MESSAGE_FLOWMESSAGE_REF = 65;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Conversation Nodeparticipant Refs' of 'Conversation Node'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONVERSATION_NODE__CONVERSATION_NODEPARTICIPANT_REFS = 66;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Formal Expressionevaluates To Type Ref' of 'Formal Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int FORMAL_EXPRESSION__FORMAL_EXPRESSIONEVALUATES_TO_TYPE_REF = 67;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Propertynotation' of 'BPMN Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROPERTY__PROPERTYNOTATION = 68;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Propertyapply' of 'BPMN Property'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_PROPERTY__BPMN_PROPERTYAPPLY = 69;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Roleowner' of 'Resource Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ROLE__RESOURCE_ROLEOWNER = 70;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Roleresource Ref' of 'Resource Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ROLE__RESOURCE_ROLERESOURCE_REF = 71;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Roleis Required' of 'Resource Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ROLE__RESOURCE_ROLEIS_REQUIRED = 72;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Roleprocess' of 'Resource Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ROLE__RESOURCE_ROLEPROCESS = 73;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Roleresource Parameter Bindings' of 'Resource Role'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ROLE__RESOURCE_ROLERESOURCE_PARAMETER_BINDINGS = 74;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Assignment Expressionexpression' of 'Resource Assignment Expression'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_ASSIGNMENT_EXPRESSION__RESOURCE_ASSIGNMENT_EXPRESSIONEXPRESSION = 75;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resourceresource Parameters' of 'Resource'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE__RESOURCERESOURCE_PARAMETERS = 76;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Parameterowner' of 'Resource Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_PARAMETER__RESOURCE_PARAMETEROWNER = 77;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Parametertype' of 'Resource Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_PARAMETER__RESOURCE_PARAMETERTYPE = 78;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Parameteris Required' of 'Resource Parameter'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_PARAMETER__RESOURCE_PARAMETERIS_REQUIRED = 79;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Parameter Bindingexpression' of 'Resource Parameter Binding'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_PARAMETER_BINDING__RESOURCE_PARAMETER_BINDINGEXPRESSION = 80;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Resource Parameter Bindingparameter Ref' of 'Resource Parameter Binding'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RESOURCE_PARAMETER_BINDING__RESOURCE_PARAMETER_BINDINGPARAMETER_REF = 81;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global Script Taskscript Format' of 'Global Script Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_SCRIPT_TASK__GLOBAL_SCRIPT_TASKSCRIPT_FORMAT = 82;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global Script Taskscript' of 'Global Script Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_SCRIPT_TASK__GLOBAL_SCRIPT_TASKSCRIPT = 83;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global Tasksupported Interface Refs' of 'Global Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_TASK__GLOBAL_TASKSUPPORTED_INTERFACE_REFS = 84;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global Business Rule Taskimplementation' of 'Global Business Rule Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_BUSINESS_RULE_TASK__GLOBAL_BUSINESS_RULE_TASKIMPLEMENTATION = 85;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Activityresources' of 'BPMN Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ACTIVITY__BPMN_ACTIVITYRESOURCES = 86;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Activitycontainer' of 'BPMN Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ACTIVITY__BPMN_ACTIVITYCONTAINER = 87;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Activityproperties' of 'BPMN Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ACTIVITY__BPMN_ACTIVITYPROPERTIES = 88;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Activitydefault' of 'BPMN Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ACTIVITY__BPMN_ACTIVITYDEFAULT = 89;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Activityboundary Events Refs' of 'BPMN Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ACTIVITY__BPMN_ACTIVITYBOUNDARY_EVENTS_REFS = 90;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Activityloop Characteristics' of 'BPMN Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_ACTIVITY__BPMN_ACTIVITYLOOP_CHARACTERISTICS = 91;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Boundary Eventattached To Ref' of 'Boundary Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BOUNDARY_EVENT__BOUNDARY_EVENTATTACHED_TO_REF = 92;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Catch Eventevent Definitions Refs' of 'Catch Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CATCH_EVENT__CATCH_EVENTEVENT_DEFINITIONS_REFS = 93;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Output Associationsource' of 'Data Output Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OUTPUT_ASSOCIATION__DATA_OUTPUT_ASSOCIATIONSOURCE = 94;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Output Associationtarget' of 'Data Output Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OUTPUT_ASSOCIATION__DATA_OUTPUT_ASSOCIATIONTARGET = 95;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Associationsource' of 'Data Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ASSOCIATION__DATA_ASSOCIATIONSOURCE = 96;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Associationtransformation' of 'Data Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ASSOCIATION__DATA_ASSOCIATIONTRANSFORMATION = 97;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Associationtarget' of 'Data Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_ASSOCIATION__DATA_ASSOCIATIONTARGET = 98;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Input Associationsource' of 'Data Input Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_INPUT_ASSOCIATION__DATA_INPUT_ASSOCIATIONSOURCE = 99;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Input Associationtarget' of 'Data Input Association'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_INPUT_ASSOCIATION__DATA_INPUT_ASSOCIATIONTARGET = 100;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Escalationstructure Ref' of 'Escalation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ESCALATION__ESCALATIONSTRUCTURE_REF = 101;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'BPMN Signalstructure Ref' of 'BPMN Signal'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BPMN_SIGNAL__BPMN_SIGNALSTRUCTURE_REF = 102;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Throw Eventevent Definition Refs' of 'Throw Event'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int THROW_EVENT__THROW_EVENTEVENT_DEFINITION_REFS = 103;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Conditional Event Definitioncondition' of 'Conditional Event Definition'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CONDITIONAL_EVENT_DEFINITION__CONDITIONAL_EVENT_DEFINITIONCONDITION = 104;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Object Refsourcetarget' of 'Data Object Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OBJECT_REFERENCE__DATA_OBJECT_REFSOURCETARGET = 105;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Object Refdata State' of 'Data Object Reference'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OBJECT_REFERENCE__DATA_OBJECT_REFDATA_STATE = 106;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Data Objectdata State' of 'Data Object'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DATA_OBJECT__DATA_OBJECTDATA_STATE = 107;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Taskimplementation' of 'User Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER_TASK__USER_TASKIMPLEMENTATION = 108;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'User Taskrenderings' of 'User Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int USER_TASK__USER_TASKRENDERINGS = 109;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global User Taskrenderings' of 'Global User Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_USER_TASK__GLOBAL_USER_TASKRENDERINGS = 110;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global User Taskimplementation' of 'Global User Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_USER_TASK__GLOBAL_USER_TASKIMPLEMENTATION = 111;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sub Conversationconnectedelements' of 'Sub Conversation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUB_CONVERSATION__SUB_CONVERSATIONCONNECTEDELEMENTS = 112;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Global Conversationcontainedelements' of 'Global Conversation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GLOBAL_CONVERSATION__GLOBAL_CONVERSATIONCONTAINEDELEMENTS = 113;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Call Conversationcalled Collaboration Ref' of 'Call Conversation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_CONVERSATION__CALL_CONVERSATIONCALLED_COLLABORATION_REF = 114;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Call Conversationparticipant Associations' of 'Call Conversation'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_CONVERSATION__CALL_CONVERSATIONPARTICIPANT_ASSOCIATIONS = 115;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Sub Processtriggered By Event' of 'Sub Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SUB_PROCESS__SUB_PROCESSTRIGGERED_BY_EVENT = 116;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Call Activitycalled Element Refvalues' of 'Call Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int CALL_ACTIVITY__CALL_ACTIVITYCALLED_ELEMENT_REFVALUES = 117;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Business Rule Taskimplementation' of 'Business Rule Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int BUSINESS_RULE_TASK__BUSINESS_RULE_TASKIMPLEMENTATION = 118;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ad Hoc Sub Processcancel Remaining Instances' of 'Ad Hoc Sub Process'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int AD_HOC_SUB_PROCESS__AD_HOC_SUB_PROCESSCANCEL_REMAINING_INSTANCES = 119;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Script Taskscript Format' of 'Script Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCRIPT_TASK__SCRIPT_TASKSCRIPT_FORMAT = 120;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Script Taskscript' of 'Script Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SCRIPT_TASK__SCRIPT_TASKSCRIPT = 121;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Send Taskoperation Ref' of 'Send Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SEND_TASK__SEND_TASKOPERATION_REF = 122;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Standard Loop Characteristicstest Before' of 'Standard Loop Characteristics'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STANDARD_LOOP_CHARACTERISTICS__STANDARD_LOOP_CHARACTERISTICSTEST_BEFORE = 123;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Standard Loop Characteristicsloop Condition' of 'Standard Loop Characteristics'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int STANDARD_LOOP_CHARACTERISTICS__STANDARD_LOOP_CHARACTERISTICSLOOP_CONDITION = 124;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Receive Taskoperation Ref' of 'Receive Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int RECEIVE_TASK__RECEIVE_TASKOPERATION_REF = 125;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Service Taskinput Set' of 'Service Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_TASK__SERVICE_TASKINPUT_SET = 126;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Service Taskoutput Set' of 'Service Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_TASK__SERVICE_TASKOUTPUT_SET = 127;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Service Taskoperation Ref' of 'Service Task'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SERVICE_TASK__SERVICE_TASKOPERATION_REF = 128;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Multiinstance Loop Characteristicstarget' of 'Multi Instance Loop Characteristics'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MULTI_INSTANCE_LOOP_CHARACTERISTICS__MULTIINSTANCE_LOOP_CHARACTERISTICSTARGET = 129;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 129;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnprofValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BpmnprofPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BpmnprofPackage.INCLUSIVE_GATEWAY:
				return validateInclusiveGateway((InclusiveGateway)value, diagnostics, context);
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY:
				return validateNonExclusiveGateway((NonExclusiveGateway)value, diagnostics, context);
			case BpmnprofPackage.GATEWAY:
				return validateGateway((Gateway)value, diagnostics, context);
			case BpmnprofPackage.FLOW_NODE:
				return validateFlowNode((FlowNode)value, diagnostics, context);
			case BpmnprofPackage.FLOW_ELEMENT:
				return validateFlowElement((FlowElement)value, diagnostics, context);
			case BpmnprofPackage.BASE_ELEMENT:
				return validateBaseElement((BaseElement)value, diagnostics, context);
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE:
				return validateExtensionAttributeValue((ExtensionAttributeValue)value, diagnostics, context);
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_DEFINITION:
				return validateExtensionAttributeDefinition((ExtensionAttributeDefinition)value, diagnostics, context);
			case BpmnprofPackage.DOCUMENTATION:
				return validateDocumentation((Documentation)value, diagnostics, context);
			case BpmnprofPackage.EXTENSION_DEFINITION:
				return validateExtensionDefinition((ExtensionDefinition)value, diagnostics, context);
			case BpmnprofPackage.BPMN_ASSOCIATION:
				return validateBPMNAssociation((BPMNAssociation)value, diagnostics, context);
			case BpmnprofPackage.BPMN_ARTIFACT:
				return validateBPMNArtifact((BPMNArtifact)value, diagnostics, context);
			case BpmnprofPackage.AUDITING:
				return validateAuditing((Auditing)value, diagnostics, context);
			case BpmnprofPackage.MONITORING:
				return validateMonitoring((Monitoring)value, diagnostics, context);
			case BpmnprofPackage.CATEGORY_VALUE:
				return validateCategoryValue((CategoryValue)value, diagnostics, context);
			case BpmnprofPackage.FLOW_ELEMENTS_CONTAINER:
				return validateFlowElementsContainer((FlowElementsContainer)value, diagnostics, context);
			case BpmnprofPackage.LANE_SET:
				return validateLaneSet((LaneSet)value, diagnostics, context);
			case BpmnprofPackage.LANE:
				return validateLane((Lane)value, diagnostics, context);
			case BpmnprofPackage.SEQUENCE_FLOW:
				return validateSequenceFlow((SequenceFlow)value, diagnostics, context);
			case BpmnprofPackage.BPMN_EXPRESSION:
				return validateBPMNExpression((BPMNExpression)value, diagnostics, context);
			case BpmnprofPackage.EVENT_BASED_GATEWAY:
				return validateEventBasedGateway((EventBasedGateway)value, diagnostics, context);
			case BpmnprofPackage.PARALLEL_GATEWAY:
				return validateParallelGateway((ParallelGateway)value, diagnostics, context);
			case BpmnprofPackage.COMPLEX_GATEWAY:
				return validateComplexGateway((ComplexGateway)value, diagnostics, context);
			case BpmnprofPackage.EXCLUSIVE_GATEWAY:
				return validateExclusiveGateway((ExclusiveGateway)value, diagnostics, context);
			case BpmnprofPackage.ROOT_ELEMENT:
				return validateRootElement((RootElement)value, diagnostics, context);
			case BpmnprofPackage.DEFINITIONS:
				return validateDefinitions((Definitions)value, diagnostics, context);
			case BpmnprofPackage.BPMN_EXTENSION:
				return validateBPMNExtension((BPMNExtension)value, diagnostics, context);
			case BpmnprofPackage.IMPORT:
				return validateImport((Import)value, diagnostics, context);
			case BpmnprofPackage.BPMN_RELATIONSHIP:
				return validateBPMNRelationship((BPMNRelationship)value, diagnostics, context);
			case BpmnprofPackage.BPMN_PROCESS:
				return validateBPMNProcess((BPMNProcess)value, diagnostics, context);
			case BpmnprofPackage.CALLABLE_ELEMENT:
				return validateCallableElement((CallableElement)value, diagnostics, context);
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION:
				return validateInputOutputSpecification((InputOutputSpecification)value, diagnostics, context);
			case BpmnprofPackage.DATA_INPUT:
				return validateDataInput((DataInput)value, diagnostics, context);
			case BpmnprofPackage.ITEM_AWARE_ELEMENT:
				return validateItemAwareElement((ItemAwareElement)value, diagnostics, context);
			case BpmnprofPackage.DATA_STATE:
				return validateDataState((DataState)value, diagnostics, context);
			case BpmnprofPackage.ITEM_DEFINITION:
				return validateItemDefinition((ItemDefinition)value, diagnostics, context);
			case BpmnprofPackage.INPUT_SET:
				return validateInputSet((InputSet)value, diagnostics, context);
			case BpmnprofPackage.DATA_OUTPUT:
				return validateDataOutput((DataOutput)value, diagnostics, context);
			case BpmnprofPackage.OUTPUT_SET:
				return validateOutputSet((OutputSet)value, diagnostics, context);
			case BpmnprofPackage.BPMN_INTERFACE:
				return validateBPMNInterface((BPMNInterface)value, diagnostics, context);
			case BpmnprofPackage.BPMN_OPERATION:
				return validateBPMNOperation((BPMNOperation)value, diagnostics, context);
			case BpmnprofPackage.BPMN_MESSAGE:
				return validateBPMNMessage((BPMNMessage)value, diagnostics, context);
			case BpmnprofPackage.ERROR:
				return validateError((org.eclipse.upr.bpmnprof.Error)value, diagnostics, context);
			case BpmnprofPackage.INPUT_OUTPUT_BINDING:
				return validateInputOutputBinding((InputOutputBinding)value, diagnostics, context);
			case BpmnprofPackage.BPMN_COLLABORATION:
				return validateBPMNCollaboration((BPMNCollaboration)value, diagnostics, context);
			case BpmnprofPackage.PARTICIPANT_ASSOCIATION:
				return validateParticipantAssociation((ParticipantAssociation)value, diagnostics, context);
			case BpmnprofPackage.PARTICIPANT:
				return validateParticipant((Participant)value, diagnostics, context);
			case BpmnprofPackage.INTERACTION_NODE:
				return validateInteractionNode((InteractionNode)value, diagnostics, context);
			case BpmnprofPackage.CONVERSATION_LINK:
				return validateConversationLink((ConversationLink)value, diagnostics, context);
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY:
				return validateParticipantMultiplicity((ParticipantMultiplicity)value, diagnostics, context);
			case BpmnprofPackage.PARTNER_ENTITY:
				return validatePartnerEntity((PartnerEntity)value, diagnostics, context);
			case BpmnprofPackage.PARTNER_ROLE:
				return validatePartnerRole((PartnerRole)value, diagnostics, context);
			case BpmnprofPackage.MESSAGE_FLOW_ASSOCIATION:
				return validateMessageFlowAssociation((MessageFlowAssociation)value, diagnostics, context);
			case BpmnprofPackage.MESSAGE_FLOW:
				return validateMessageFlow((MessageFlow)value, diagnostics, context);
			case BpmnprofPackage.CONVERSATION_NODE:
				return validateConversationNode((ConversationNode)value, diagnostics, context);
			case BpmnprofPackage.CORRELATION_KEY:
				return validateCorrelationKey((CorrelationKey)value, diagnostics, context);
			case BpmnprofPackage.CORRELATION_PROPERTY:
				return validateCorrelationProperty((CorrelationProperty)value, diagnostics, context);
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION:
				return validateCorrelationPropertyRetrievalExpression((CorrelationPropertyRetrievalExpression)value, diagnostics, context);
			case BpmnprofPackage.FORMAL_EXPRESSION:
				return validateFormalExpression((FormalExpression)value, diagnostics, context);
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION:
				return validateCorrelationSubscription((CorrelationSubscription)value, diagnostics, context);
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING:
				return validateCorrelationPropertyBinding((CorrelationPropertyBinding)value, diagnostics, context);
			case BpmnprofPackage.BPMN_PROPERTY:
				return validateBPMNProperty((BPMNProperty)value, diagnostics, context);
			case BpmnprofPackage.RESOURCE_ROLE:
				return validateResourceRole((ResourceRole)value, diagnostics, context);
			case BpmnprofPackage.RESOURCE_ASSIGNMENT_EXPRESSION:
				return validateResourceAssignmentExpression((ResourceAssignmentExpression)value, diagnostics, context);
			case BpmnprofPackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case BpmnprofPackage.RESOURCE_PARAMETER:
				return validateResourceParameter((ResourceParameter)value, diagnostics, context);
			case BpmnprofPackage.RESOURCE_PARAMETER_BINDING:
				return validateResourceParameterBinding((ResourceParameterBinding)value, diagnostics, context);
			case BpmnprofPackage.GLOBAL_SCRIPT_TASK:
				return validateGlobalScriptTask((GlobalScriptTask)value, diagnostics, context);
			case BpmnprofPackage.GLOBAL_TASK:
				return validateGlobalTask((GlobalTask)value, diagnostics, context);
			case BpmnprofPackage.GLOBAL_BUSINESS_RULE_TASK:
				return validateGlobalBusinessRuleTask((GlobalBusinessRuleTask)value, diagnostics, context);
			case BpmnprofPackage.COMPENSATE_EVENT_DEFINITION:
				return validateCompensateEventDefinition((CompensateEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.EVENT_DEFINITION:
				return validateEventDefinition((EventDefinition)value, diagnostics, context);
			case BpmnprofPackage.BPMN_ACTIVITY:
				return validateBPMNActivity((BPMNActivity)value, diagnostics, context);
			case BpmnprofPackage.BOUNDARY_EVENT:
				return validateBoundaryEvent((BoundaryEvent)value, diagnostics, context);
			case BpmnprofPackage.CATCH_EVENT:
				return validateCatchEvent((CatchEvent)value, diagnostics, context);
			case BpmnprofPackage.BPMN_EVENT:
				return validateBPMNEvent((BPMNEvent)value, diagnostics, context);
			case BpmnprofPackage.DATA_OUTPUT_ASSOCIATION:
				return validateDataOutputAssociation((DataOutputAssociation)value, diagnostics, context);
			case BpmnprofPackage.DATA_ASSOCIATION:
				return validateDataAssociation((DataAssociation)value, diagnostics, context);
			case BpmnprofPackage.ASSIGNMENT:
				return validateAssignment((Assignment)value, diagnostics, context);
			case BpmnprofPackage.DATA_INPUT_ASSOCIATION:
				return validateDataInputAssociation((DataInputAssociation)value, diagnostics, context);
			case BpmnprofPackage.LOOP_CHARACTERISTICS:
				return validateLoopCharacteristics((LoopCharacteristics)value, diagnostics, context);
			case BpmnprofPackage.ESCALATION_EVENT_DEFINITION:
				return validateEscalationEventDefinition((EscalationEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.ESCALATION:
				return validateEscalation((Escalation)value, diagnostics, context);
			case BpmnprofPackage.TIMER_EVENT_DEFINITION:
				return validateTimerEventDefinition((TimerEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.SIGNAL_EVENT_DEFINITION:
				return validateSignalEventDefinition((SignalEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.BPMN_SIGNAL:
				return validateBPMNSignal((BPMNSignal)value, diagnostics, context);
			case BpmnprofPackage.END_EVENT:
				return validateEndEvent((EndEvent)value, diagnostics, context);
			case BpmnprofPackage.THROW_EVENT:
				return validateThrowEvent((ThrowEvent)value, diagnostics, context);
			case BpmnprofPackage.MESSAGE_EVENT_DEFINITION:
				return validateMessageEventDefinition((MessageEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.START_EVENT:
				return validateStartEvent((StartEvent)value, diagnostics, context);
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION:
				return validateConditionalEventDefinition((ConditionalEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.LINK_EVENT_DEFINITION:
				return validateLinkEventDefinition((LinkEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.ERROR_EVENT_DEFINITION:
				return validateErrorEventDefinition((ErrorEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.INTERMEDIATE_CATCH_EVENT:
				return validateIntermediateCatchEvent((IntermediateCatchEvent)value, diagnostics, context);
			case BpmnprofPackage.INTERMEDIATE_THROW_EVENT:
				return validateIntermediateThrowEvent((IntermediateThrowEvent)value, diagnostics, context);
			case BpmnprofPackage.TERMINATE_EVENT_DEFINITION:
				return validateTerminateEventDefinition((TerminateEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.IMPLICIT_THROW_EVENT:
				return validateImplicitThrowEvent((ImplicitThrowEvent)value, diagnostics, context);
			case BpmnprofPackage.CANCEL_EVENT_DEFINITION:
				return validateCancelEventDefinition((CancelEventDefinition)value, diagnostics, context);
			case BpmnprofPackage.TEXT_ANNOTATION:
				return validateTextAnnotation((TextAnnotation)value, diagnostics, context);
			case BpmnprofPackage.CATEGORY:
				return validateCategory((Category)value, diagnostics, context);
			case BpmnprofPackage.GROUP:
				return validateGroup((Group)value, diagnostics, context);
			case BpmnprofPackage.DATA_OBJECT_REFERENCE:
				return validateDataObjectReference((DataObjectReference)value, diagnostics, context);
			case BpmnprofPackage.DATA_OBJECT:
				return validateDataObject((DataObject)value, diagnostics, context);
			case BpmnprofPackage.DATA_STORE:
				return validateDataStore((DataStore)value, diagnostics, context);
			case BpmnprofPackage.DATA_STORE_REFERENCE:
				return validateDataStoreReference((DataStoreReference)value, diagnostics, context);
			case BpmnprofPackage.USER_TASK:
				return validateUserTask((UserTask)value, diagnostics, context);
			case BpmnprofPackage.TASK:
				return validateTask((Task)value, diagnostics, context);
			case BpmnprofPackage.RENDERING:
				return validateRendering((Rendering)value, diagnostics, context);
			case BpmnprofPackage.HUMAN_PERFORMER:
				return validateHumanPerformer((HumanPerformer)value, diagnostics, context);
			case BpmnprofPackage.PERFORMER:
				return validatePerformer((Performer)value, diagnostics, context);
			case BpmnprofPackage.GLOBAL_USER_TASK:
				return validateGlobalUserTask((GlobalUserTask)value, diagnostics, context);
			case BpmnprofPackage.GLOBAL_MANUAL_TASK:
				return validateGlobalManualTask((GlobalManualTask)value, diagnostics, context);
			case BpmnprofPackage.MANUAL_TASK:
				return validateManualTask((ManualTask)value, diagnostics, context);
			case BpmnprofPackage.POTENTIAL_OWNER:
				return validatePotentialOwner((PotentialOwner)value, diagnostics, context);
			case BpmnprofPackage.SUB_CONVERSATION:
				return validateSubConversation((SubConversation)value, diagnostics, context);
			case BpmnprofPackage.GLOBAL_CONVERSATION:
				return validateGlobalConversation((GlobalConversation)value, diagnostics, context);
			case BpmnprofPackage.CALL_CONVERSATION:
				return validateCallConversation((CallConversation)value, diagnostics, context);
			case BpmnprofPackage.CONVERSATION:
				return validateConversation((Conversation)value, diagnostics, context);
			case BpmnprofPackage.SUB_PROCESS:
				return validateSubProcess((SubProcess)value, diagnostics, context);
			case BpmnprofPackage.CALL_ACTIVITY:
				return validateCallActivity((CallActivity)value, diagnostics, context);
			case BpmnprofPackage.BUSINESS_RULE_TASK:
				return validateBusinessRuleTask((BusinessRuleTask)value, diagnostics, context);
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION:
				return validateComplexBehaviorDefinition((ComplexBehaviorDefinition)value, diagnostics, context);
			case BpmnprofPackage.AD_HOC_SUB_PROCESS:
				return validateAdHocSubProcess((AdHocSubProcess)value, diagnostics, context);
			case BpmnprofPackage.SCRIPT_TASK:
				return validateScriptTask((ScriptTask)value, diagnostics, context);
			case BpmnprofPackage.SEND_TASK:
				return validateSendTask((SendTask)value, diagnostics, context);
			case BpmnprofPackage.TRANSACTION:
				return validateTransaction((Transaction)value, diagnostics, context);
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS:
				return validateStandardLoopCharacteristics((StandardLoopCharacteristics)value, diagnostics, context);
			case BpmnprofPackage.RECEIVE_TASK:
				return validateReceiveTask((ReceiveTask)value, diagnostics, context);
			case BpmnprofPackage.SERVICE_TASK:
				return validateServiceTask((ServiceTask)value, diagnostics, context);
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS:
				return validateMultiInstanceLoopCharacteristics((MultiInstanceLoopCharacteristics)value, diagnostics, context);
			case BpmnprofPackage.ASSOCIATION_DIRECTION:
				return validateAssociationDirection((AssociationDirection)value, diagnostics, context);
			case BpmnprofPackage.EVENT_BASED_GATEWAY_TYPE:
				return validateEventBasedGatewayType((EventBasedGatewayType)value, diagnostics, context);
			case BpmnprofPackage.GATEWAY_DIRECTION:
				return validateGatewayDirection((GatewayDirection)value, diagnostics, context);
			case BpmnprofPackage.RELATIONSHIP_DIRECTION:
				return validateRelationshipDirection((RelationshipDirection)value, diagnostics, context);
			case BpmnprofPackage.ITEM_KIND:
				return validateItemKind((ItemKind)value, diagnostics, context);
			case BpmnprofPackage.PROCESS_TYPE:
				return validateProcessType((ProcessType)value, diagnostics, context);
			case BpmnprofPackage.AD_HOC_ORDERING:
				return validateAdHocOrdering((AdHocOrdering)value, diagnostics, context);
			case BpmnprofPackage.MULTI_INSTANCE_BEHAVIOR:
				return validateMultiInstanceBehavior((MultiInstanceBehavior)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInclusiveGateway(InclusiveGateway inclusiveGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inclusiveGateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateInclusiveGateway_inclusiveGatewaydefault(inclusiveGateway, diagnostics, context);
		return result;
	}

	/**
	 * Validates the inclusiveGatewaydefault constraint of '<em>Inclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInclusiveGateway_inclusiveGatewaydefault(InclusiveGateway inclusiveGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inclusiveGateway.inclusiveGatewaydefault(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonExclusiveGateway(NonExclusiveGateway nonExclusiveGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nonExclusiveGateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGateway(Gateway gateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(gateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowNode(FlowNode flowNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowElement(FlowElement flowElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseElement(BaseElement baseElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionAttributeValue(ExtensionAttributeValue extensionAttributeValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionAttributeValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionAttributeDefinition(ExtensionAttributeDefinition extensionAttributeDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionAttributeDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentation(Documentation documentation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensionDefinition(ExtensionDefinition extensionDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensionDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNAssociation(BPMNAssociation bpmnAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNAssociation_AssociationEnd(bpmnAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AssociationEnd constraint of '<em>BPMN Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNAssociation_AssociationEnd(BPMNAssociation bpmnAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnAssociation.AssociationEnd(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNArtifact(BPMNArtifact bpmnArtifact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnArtifact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuditing(Auditing auditing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auditing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitoring(Monitoring monitoring, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(monitoring, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategoryValue(CategoryValue categoryValue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(categoryValue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlowElementsContainer(FlowElementsContainer flowElementsContainer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flowElementsContainer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaneSet(LaneSet laneSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(laneSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateLaneSet_LaneSetlanes(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateLaneSet_LaneSetparentLane(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateLaneSet_LaneSetflowElementsContainer(laneSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateLaneSet_LaneSet(laneSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LaneSetlanes constraint of '<em>Lane Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaneSet_LaneSetlanes(LaneSet laneSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laneSet.LaneSetlanes(diagnostics, context);
	}

	/**
	 * Validates the LaneSetparentLane constraint of '<em>Lane Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaneSet_LaneSetparentLane(LaneSet laneSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laneSet.LaneSetparentLane(diagnostics, context);
	}

	/**
	 * Validates the LaneSetflowElementsContainer constraint of '<em>Lane Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaneSet_LaneSetflowElementsContainer(LaneSet laneSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laneSet.LaneSetflowElementsContainer(diagnostics, context);
	}

	/**
	 * Validates the LaneSet constraint of '<em>Lane Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLaneSet_LaneSet(LaneSet laneSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return laneSet.LaneSet(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLane(Lane lane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lane, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validateLane_LanelaneSet(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validateLane_LanechildLaneSet(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validateLane_LanepartitionElementRef(lane, diagnostics, context);
		if (result || diagnostics != null) result &= validateLane_LaneflowNodeRefs(lane, diagnostics, context);
		return result;
	}

	/**
	 * Validates the LanelaneSet constraint of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLane_LanelaneSet(Lane lane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lane.LanelaneSet(diagnostics, context);
	}

	/**
	 * Validates the LanechildLaneSet constraint of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLane_LanechildLaneSet(Lane lane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lane.LanechildLaneSet(diagnostics, context);
	}

	/**
	 * Validates the LanepartitionElementRef constraint of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLane_LanepartitionElementRef(Lane lane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lane.LanepartitionElementRef(diagnostics, context);
	}

	/**
	 * Validates the LaneflowNodeRefs constraint of '<em>Lane</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLane_LaneflowNodeRefs(Lane lane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return lane.LaneflowNodeRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceFlow(SequenceFlow sequenceFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequenceFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequenceFlow_SequenceFlowconditionExpression(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequenceFlow_SequenceFlowsourceRef(sequenceFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequenceFlow_SequenceFlowtargetRef(sequenceFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SequenceFlowconditionExpression constraint of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceFlow_SequenceFlowconditionExpression(SequenceFlow sequenceFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sequenceFlow.SequenceFlowconditionExpression(diagnostics, context);
	}

	/**
	 * Validates the SequenceFlowsourceRef constraint of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceFlow_SequenceFlowsourceRef(SequenceFlow sequenceFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sequenceFlow.SequenceFlowsourceRef(diagnostics, context);
	}

	/**
	 * Validates the SequenceFlowtargetRef constraint of '<em>Sequence Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequenceFlow_SequenceFlowtargetRef(SequenceFlow sequenceFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sequenceFlow.SequenceFlowtargetRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNExpression(BPMNExpression bpmnExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventBasedGateway(EventBasedGateway eventBasedGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventBasedGateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParallelGateway(ParallelGateway parallelGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parallelGateway, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexGateway(ComplexGateway complexGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(complexGateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexGateway_complexGatewaydefault(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexGateway_complexGatewayactivationCondition(complexGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateComplexGateway_complexGatewayjoinSpec(complexGateway, diagnostics, context);
		return result;
	}

	/**
	 * Validates the complexGatewaydefault constraint of '<em>Complex Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexGateway_complexGatewaydefault(ComplexGateway complexGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexGateway.complexGatewaydefault(diagnostics, context);
	}

	/**
	 * Validates the complexGatewayactivationCondition constraint of '<em>Complex Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexGateway_complexGatewayactivationCondition(ComplexGateway complexGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexGateway.complexGatewayactivationCondition(diagnostics, context);
	}

	/**
	 * Validates the complexGatewayjoinSpec constraint of '<em>Complex Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexGateway_complexGatewayjoinSpec(ComplexGateway complexGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return complexGateway.complexGatewayjoinSpec(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExclusiveGateway(ExclusiveGateway exclusiveGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(exclusiveGateway, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(exclusiveGateway, diagnostics, context);
		if (result || diagnostics != null) result &= validateExclusiveGateway_exclusiveGatewaydefault(exclusiveGateway, diagnostics, context);
		return result;
	}

	/**
	 * Validates the exclusiveGatewaydefault constraint of '<em>Exclusive Gateway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExclusiveGateway_exclusiveGatewaydefault(ExclusiveGateway exclusiveGateway, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return exclusiveGateway.exclusiveGatewaydefault(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootElement(RootElement rootElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rootElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefinitions(Definitions definitions, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(definitions, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNExtension(BPMNExtension bpmnExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnExtension, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImport(Import import_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(import_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNRelationship(BPMNRelationship bpmnRelationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnRelationship, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProcess(BPMNProcess bpmnProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProcess_ProcesssupportedInterfaceRefs(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProcess_Processsupports(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProcess_Processproperties(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProcess_ProcesslaneSets(bpmnProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProcess_ProcessflowElements(bpmnProcess, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ProcesssupportedInterfaceRefs constraint of '<em>BPMN Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProcess_ProcesssupportedInterfaceRefs(BPMNProcess bpmnProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProcess.ProcesssupportedInterfaceRefs(diagnostics, context);
	}

	/**
	 * Validates the Processsupports constraint of '<em>BPMN Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProcess_Processsupports(BPMNProcess bpmnProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProcess.Processsupports(diagnostics, context);
	}

	/**
	 * Validates the Processproperties constraint of '<em>BPMN Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProcess_Processproperties(BPMNProcess bpmnProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProcess.Processproperties(diagnostics, context);
	}

	/**
	 * Validates the ProcesslaneSets constraint of '<em>BPMN Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProcess_ProcesslaneSets(BPMNProcess bpmnProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProcess.ProcesslaneSets(diagnostics, context);
	}

	/**
	 * Validates the ProcessflowElements constraint of '<em>BPMN Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProcess_ProcessflowElements(BPMNProcess bpmnProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProcess.ProcessflowElements(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallableElement(CallableElement callableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callableElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(callableElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(callableElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CallableEelementsupportedInterfaceRefs constraint of '<em>Callable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallableElement_CallableEelementsupportedInterfaceRefs(CallableElement callableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callableElement.CallableEelementsupportedInterfaceRefs(diagnostics, context);
	}

	/**
	 * Validates the CallableElementresources constraint of '<em>Callable Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallableElement_CallableElementresources(CallableElement callableElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callableElement.CallableElementresources(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputSpecification(InputOutputSpecification inputOutputSpecification, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputSpecification, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInput(DataInput dataInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataInput, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataInput_DataInputAssociation(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataInput_DataInputnotation(dataInput, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataInput_DataInputitemSubjectRef(dataInput, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DataInputAssociation constraint of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInput_DataInputAssociation(DataInput dataInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataInput.DataInputAssociation(diagnostics, context);
	}

	/**
	 * Validates the DataInputnotation constraint of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInput_DataInputnotation(DataInput dataInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataInput.DataInputnotation(diagnostics, context);
	}

	/**
	 * Validates the DataInputitemSubjectRef constraint of '<em>Data Input</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInput_DataInputitemSubjectRef(DataInput dataInput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataInput.DataInputitemSubjectRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemAwareElement(ItemAwareElement itemAwareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemAwareElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemAwareElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(itemAwareElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemAwareElementdataState constraint of '<em>Item Aware Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemAwareElement_ItemAwareElementdataState(ItemAwareElement itemAwareElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return itemAwareElement.ItemAwareElementdataState(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataState(DataState dataState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataState, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemDefinition(ItemDefinition itemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(itemDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(itemDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemDefinition_ItemDefinitionstructureRef(itemDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ItemDefinitionstructureRef constraint of '<em>Item Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemDefinition_ItemDefinitionstructureRef(ItemDefinition itemDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return itemDefinition.ItemDefinitionstructureRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSet(InputSet inputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(inputSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputSet_InputSetdataInputRefs(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputSet_InputSetoptionalInputRefs(inputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateInputSet_InputSetwhileExecutingInputRefs(inputSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the InputSetdataInputRefs constraint of '<em>Input Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSet_InputSetdataInputRefs(InputSet inputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputSet.InputSetdataInputRefs(diagnostics, context);
	}

	/**
	 * Validates the InputSetoptionalInputRefs constraint of '<em>Input Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSet_InputSetoptionalInputRefs(InputSet inputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputSet.InputSetoptionalInputRefs(diagnostics, context);
	}

	/**
	 * Validates the InputSetwhileExecutingInputRefs constraint of '<em>Input Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputSet_InputSetwhileExecutingInputRefs(InputSet inputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return inputSet.InputSetwhileExecutingInputRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOutput(DataOutput dataOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataOutput, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOutput_DataOutputnotation(dataOutput, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOutput_DataOutputitemSubjectRef(dataOutput, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DataOutputnotation constraint of '<em>Data Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOutput_DataOutputnotation(DataOutput dataOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataOutput.DataOutputnotation(diagnostics, context);
	}

	/**
	 * Validates the DataOutputitemSubjectRef constraint of '<em>Data Output</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOutput_DataOutputitemSubjectRef(DataOutput dataOutput, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataOutput.DataOutputitemSubjectRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSet(OutputSet outputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(outputSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputSet_OutputSetdataOutputRefs(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputSet_OutputSetoptionalOutputRefs(outputSet, diagnostics, context);
		if (result || diagnostics != null) result &= validateOutputSet_OutputSetwhileExecutingOutputRefs(outputSet, diagnostics, context);
		return result;
	}

	/**
	 * Validates the OutputSetdataOutputRefs constraint of '<em>Output Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSet_OutputSetdataOutputRefs(OutputSet outputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return outputSet.OutputSetdataOutputRefs(diagnostics, context);
	}

	/**
	 * Validates the OutputSetoptionalOutputRefs constraint of '<em>Output Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSet_OutputSetoptionalOutputRefs(OutputSet outputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return outputSet.OutputSetoptionalOutputRefs(diagnostics, context);
	}

	/**
	 * Validates the OutputSetwhileExecutingOutputRefs constraint of '<em>Output Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutputSet_OutputSetwhileExecutingOutputRefs(OutputSet outputSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return outputSet.OutputSetwhileExecutingOutputRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNInterface(BPMNInterface bpmnInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNInterface_Interfaceoperationmultiplicity(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNInterface_InterfaceownedOperation(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNInterface_BPMNInterfacecallableElements(bpmnInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNInterface_BPMNInterfaceoperations(bpmnInterface, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Interfaceoperationmultiplicity constraint of '<em>BPMN Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNInterface_Interfaceoperationmultiplicity(BPMNInterface bpmnInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnInterface.Interfaceoperationmultiplicity(diagnostics, context);
	}

	/**
	 * Validates the InterfaceownedOperation constraint of '<em>BPMN Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNInterface_InterfaceownedOperation(BPMNInterface bpmnInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnInterface.InterfaceownedOperation(diagnostics, context);
	}

	/**
	 * Validates the BPMNInterfacecallableElements constraint of '<em>BPMN Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNInterface_BPMNInterfacecallableElements(BPMNInterface bpmnInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnInterface.BPMNInterfacecallableElements(diagnostics, context);
	}

	/**
	 * Validates the BPMNInterfaceoperations constraint of '<em>BPMN Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNInterface_BPMNInterfaceoperations(BPMNInterface bpmnInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnInterface.BPMNInterfaceoperations(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNOperation(BPMNOperation bpmnOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNOperation_BPMNOperationowner(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNOperation_BPMNOperationinMessageRef(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNOperation_BPMNOperationoutMessageRef(bpmnOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNOperation_BPMNOperationerrorRefs(bpmnOperation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BPMNOperationowner constraint of '<em>BPMN Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNOperation_BPMNOperationowner(BPMNOperation bpmnOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnOperation.BPMNOperationowner(diagnostics, context);
	}

	/**
	 * Validates the BPMNOperationinMessageRef constraint of '<em>BPMN Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNOperation_BPMNOperationinMessageRef(BPMNOperation bpmnOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnOperation.BPMNOperationinMessageRef(diagnostics, context);
	}

	/**
	 * Validates the BPMNOperationoutMessageRef constraint of '<em>BPMN Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNOperation_BPMNOperationoutMessageRef(BPMNOperation bpmnOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnOperation.BPMNOperationoutMessageRef(diagnostics, context);
	}

	/**
	 * Validates the BPMNOperationerrorRefs constraint of '<em>BPMN Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNOperation_BPMNOperationerrorRefs(BPMNOperation bpmnOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnOperation.BPMNOperationerrorRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNMessage(BPMNMessage bpmnMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnMessage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemDefinition_ItemDefinitionstructureRef(bpmnMessage, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNMessage_MessageitemRef(bpmnMessage, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MessageitemRef constraint of '<em>BPMN Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNMessage_MessageitemRef(BPMNMessage bpmnMessage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnMessage.MessageitemRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateError(org.eclipse.upr.bpmnprof.Error error, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(error, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(error, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(error, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemDefinition_ItemDefinitionstructureRef(error, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputOutputBinding(InputOutputBinding inputOutputBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputOutputBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNCollaboration(BPMNCollaboration bpmnCollaboration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnCollaboration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnCollaboration, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNCollaboration_Collaborationparticipants(bpmnCollaboration, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Collaborationparticipants constraint of '<em>BPMN Collaboration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNCollaboration_Collaborationparticipants(BPMNCollaboration bpmnCollaboration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnCollaboration.Collaborationparticipants(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantAssociation(ParticipantAssociation participantAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participantAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipantAssociation_ParticipantAssociationinnerParticipantRef(participantAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipantAssociation_ParticipantAssociationouterParticipantRef(participantAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ParticipantAssociationinnerParticipantRef constraint of '<em>Participant Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantAssociation_ParticipantAssociationinnerParticipantRef(ParticipantAssociation participantAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participantAssociation.ParticipantAssociationinnerParticipantRef(diagnostics, context);
	}

	/**
	 * Validates the ParticipantAssociationouterParticipantRef constraint of '<em>Participant Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantAssociation_ParticipantAssociationouterParticipantRef(ParticipantAssociation participantAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participantAssociation.ParticipantAssociationouterParticipantRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(participant, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_Participantownership(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_Participanttype(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_ParticipantmultiplicityMinimum(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_Participantrealizationsupplier(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_ParticipantprocessRef(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_ParticipantmultiplicityMaximum(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_participantpartnerEntityRef(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_participantpartnerRoleRef(participant, diagnostics, context);
		if (result || diagnostics != null) result &= validateParticipant_ParticipantinterfaceRefs(participant, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Participantownership constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_Participantownership(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.Participantownership(diagnostics, context);
	}

	/**
	 * Validates the Participanttype constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_Participanttype(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.Participanttype(diagnostics, context);
	}

	/**
	 * Validates the ParticipantmultiplicityMinimum constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_ParticipantmultiplicityMinimum(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.ParticipantmultiplicityMinimum(diagnostics, context);
	}

	/**
	 * Validates the Participantrealizationsupplier constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_Participantrealizationsupplier(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.Participantrealizationsupplier(diagnostics, context);
	}

	/**
	 * Validates the ParticipantprocessRef constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_ParticipantprocessRef(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.ParticipantprocessRef(diagnostics, context);
	}

	/**
	 * Validates the ParticipantmultiplicityMaximum constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_ParticipantmultiplicityMaximum(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.ParticipantmultiplicityMaximum(diagnostics, context);
	}

	/**
	 * Validates the participantpartnerEntityRef constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_participantpartnerEntityRef(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.participantpartnerEntityRef(diagnostics, context);
	}

	/**
	 * Validates the participantpartnerRoleRef constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_participantpartnerRoleRef(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.participantpartnerRoleRef(diagnostics, context);
	}

	/**
	 * Validates the ParticipantinterfaceRefs constraint of '<em>Participant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipant_ParticipantinterfaceRefs(Participant participant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return participant.ParticipantinterfaceRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInteractionNode(InteractionNode interactionNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(interactionNode, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversationLink(ConversationLink conversationLink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(conversationLink, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParticipantMultiplicity(ParticipantMultiplicity participantMultiplicity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(participantMultiplicity, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerEntity(PartnerEntity partnerEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partnerEntity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partnerEntity, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartnerEntity_PartnerEntityparticipantRef(partnerEntity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PartnerEntityparticipantRef constraint of '<em>Partner Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerEntity_PartnerEntityparticipantRef(PartnerEntity partnerEntity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return partnerEntity.PartnerEntityparticipantRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerRole(PartnerRole partnerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partnerRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partnerRole, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartnerRole_PartnerRoleparticipantRef(partnerRole, diagnostics, context);
		return result;
	}

	/**
	 * Validates the PartnerRoleparticipantRef constraint of '<em>Partner Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartnerRole_PartnerRoleparticipantRef(PartnerRole partnerRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return partnerRole.PartnerRoleparticipantRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlowAssociation(MessageFlowAssociation messageFlowAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageFlowAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageFlowAssociation_MessageFlowAssociationinnerMessageFlowRef(messageFlowAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageFlowAssociation_MessageFlowAssociationouterMessageFlowRef(messageFlowAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MessageFlowAssociationinnerMessageFlowRef constraint of '<em>Message Flow Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlowAssociation_MessageFlowAssociationinnerMessageFlowRef(MessageFlowAssociation messageFlowAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messageFlowAssociation.MessageFlowAssociationinnerMessageFlowRef(diagnostics, context);
	}

	/**
	 * Validates the MessageFlowAssociationouterMessageFlowRef constraint of '<em>Message Flow Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlowAssociation_MessageFlowAssociationouterMessageFlowRef(MessageFlowAssociation messageFlowAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messageFlowAssociation.MessageFlowAssociationouterMessageFlowRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlow(MessageFlow messageFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(messageFlow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageFlow_MessageFlowsourceRef(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageFlow_MessageFlowtargetRef(messageFlow, diagnostics, context);
		if (result || diagnostics != null) result &= validateMessageFlow_MessageFlowmessageRef(messageFlow, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MessageFlowsourceRef constraint of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlow_MessageFlowsourceRef(MessageFlow messageFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messageFlow.MessageFlowsourceRef(diagnostics, context);
	}

	/**
	 * Validates the MessageFlowtargetRef constraint of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlow_MessageFlowtargetRef(MessageFlow messageFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messageFlow.MessageFlowtargetRef(diagnostics, context);
	}

	/**
	 * Validates the MessageFlowmessageRef constraint of '<em>Message Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageFlow_MessageFlowmessageRef(MessageFlow messageFlow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return messageFlow.MessageFlowmessageRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversationNode(ConversationNode conversationNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conversationNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conversationNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateConversationNode_ConversationNodeparticipantRefs(conversationNode, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ConversationNodeparticipantRefs constraint of '<em>Conversation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversationNode_ConversationNodeparticipantRefs(ConversationNode conversationNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conversationNode.ConversationNodeparticipantRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationKey(CorrelationKey correlationKey, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationKey, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationProperty(CorrelationProperty correlationProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationProperty, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationPropertyRetrievalExpression(CorrelationPropertyRetrievalExpression correlationPropertyRetrievalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationPropertyRetrievalExpression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalExpression(FormalExpression formalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(formalExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(formalExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateFormalExpression_FormalExpressionevaluatesToTypeRef(formalExpression, diagnostics, context);
		return result;
	}

	/**
	 * Validates the FormalExpressionevaluatesToTypeRef constraint of '<em>Formal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormalExpression_FormalExpressionevaluatesToTypeRef(FormalExpression formalExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return formalExpression.FormalExpressionevaluatesToTypeRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationSubscription(CorrelationSubscription correlationSubscription, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationSubscription, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCorrelationPropertyBinding(CorrelationPropertyBinding correlationPropertyBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(correlationPropertyBinding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProperty(BPMNProperty bpmnProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProperty_Propertynotation(bpmnProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNProperty_BPMNPropertyapply(bpmnProperty, diagnostics, context);
		return result;
	}

	/**
	 * Validates the Propertynotation constraint of '<em>BPMN Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProperty_Propertynotation(BPMNProperty bpmnProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProperty.Propertynotation(diagnostics, context);
	}

	/**
	 * Validates the BPMNPropertyapply constraint of '<em>BPMN Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNProperty_BPMNPropertyapply(BPMNProperty bpmnProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnProperty.BPMNPropertyapply(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole(ResourceRole resourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceRole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleowner(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceRef(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleisRequired(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleprocess(resourceRole, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceParameterBindings(resourceRole, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceRoleowner constraint of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole_ResourceRoleowner(ResourceRole resourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceRole.ResourceRoleowner(diagnostics, context);
	}

	/**
	 * Validates the ResourceRoleresourceRef constraint of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole_ResourceRoleresourceRef(ResourceRole resourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceRole.ResourceRoleresourceRef(diagnostics, context);
	}

	/**
	 * Validates the ResourceRoleisRequired constraint of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole_ResourceRoleisRequired(ResourceRole resourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceRole.ResourceRoleisRequired(diagnostics, context);
	}

	/**
	 * Validates the ResourceRoleprocess constraint of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole_ResourceRoleprocess(ResourceRole resourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceRole.ResourceRoleprocess(diagnostics, context);
	}

	/**
	 * Validates the ResourceRoleresourceParameterBindings constraint of '<em>Resource Role</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceRole_ResourceRoleresourceParameterBindings(ResourceRole resourceRole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceRole.ResourceRoleresourceParameterBindings(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAssignmentExpression(ResourceAssignmentExpression resourceAssignmentExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceAssignmentExpression, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceAssignmentExpression, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceAssignmentExpression_ResourceAssignmentExpressionexpression(resourceAssignmentExpression, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceAssignmentExpressionexpression constraint of '<em>Resource Assignment Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceAssignmentExpression_ResourceAssignmentExpressionexpression(ResourceAssignmentExpression resourceAssignmentExpression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceAssignmentExpression.ResourceAssignmentExpressionexpression(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resource, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemDefinition_ItemDefinitionstructureRef(resource, diagnostics, context);
		if (result || diagnostics != null) result &= validateResource_ResourceresourceParameters(resource, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceresourceParameters constraint of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource_ResourceresourceParameters(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resource.ResourceresourceParameters(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameter(ResourceParameter resourceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceParameter_ResourceParameterowner(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceParameter_ResourceParametertype(resourceParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceParameter_ResourceParameterisRequired(resourceParameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceParameterowner constraint of '<em>Resource Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameter_ResourceParameterowner(ResourceParameter resourceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceParameter.ResourceParameterowner(diagnostics, context);
	}

	/**
	 * Validates the ResourceParametertype constraint of '<em>Resource Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameter_ResourceParametertype(ResourceParameter resourceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceParameter.ResourceParametertype(diagnostics, context);
	}

	/**
	 * Validates the ResourceParameterisRequired constraint of '<em>Resource Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameter_ResourceParameterisRequired(ResourceParameter resourceParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceParameter.ResourceParameterisRequired(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameterBinding(ResourceParameterBinding resourceParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resourceParameterBinding, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceParameterBinding_ResourceParameterBindingexpression(resourceParameterBinding, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceParameterBinding_ResourceParameterBindingparameterRef(resourceParameterBinding, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResourceParameterBindingexpression constraint of '<em>Resource Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameterBinding_ResourceParameterBindingexpression(ResourceParameterBinding resourceParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceParameterBinding.ResourceParameterBindingexpression(diagnostics, context);
	}

	/**
	 * Validates the ResourceParameterBindingparameterRef constraint of '<em>Resource Parameter Binding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceParameterBinding_ResourceParameterBindingparameterRef(ResourceParameterBinding resourceParameterBinding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return resourceParameterBinding.ResourceParameterBindingparameterRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalScriptTask(GlobalScriptTask globalScriptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalScriptTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalTask_GlobalTasksupportedInterfaceRefs(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalScriptTask_GlobalScriptTaskscriptFormat(globalScriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalScriptTask_GlobalScriptTaskscript(globalScriptTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the GlobalScriptTaskscriptFormat constraint of '<em>Global Script Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalScriptTask_GlobalScriptTaskscriptFormat(GlobalScriptTask globalScriptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalScriptTask.GlobalScriptTaskscriptFormat(diagnostics, context);
	}

	/**
	 * Validates the GlobalScriptTaskscript constraint of '<em>Global Script Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalScriptTask_GlobalScriptTaskscript(GlobalScriptTask globalScriptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalScriptTask.GlobalScriptTaskscript(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalTask(GlobalTask globalTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(globalTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalTask_GlobalTasksupportedInterfaceRefs(globalTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the GlobalTasksupportedInterfaceRefs constraint of '<em>Global Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalTask_GlobalTasksupportedInterfaceRefs(GlobalTask globalTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalTask.GlobalTasksupportedInterfaceRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalBusinessRuleTask(GlobalBusinessRuleTask globalBusinessRuleTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalBusinessRuleTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalTask_GlobalTasksupportedInterfaceRefs(globalBusinessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalBusinessRuleTask_GlobalBusinessRuleTaskimplementation(globalBusinessRuleTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the GlobalBusinessRuleTaskimplementation constraint of '<em>Global Business Rule Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalBusinessRuleTask_GlobalBusinessRuleTaskimplementation(GlobalBusinessRuleTask globalBusinessRuleTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalBusinessRuleTask.GlobalBusinessRuleTaskimplementation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompensateEventDefinition(CompensateEventDefinition compensateEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compensateEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventDefinition(EventDefinition eventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(eventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(bpmnActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(bpmnActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BPMNActivityresources constraint of '<em>BPMN Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity_BPMNActivityresources(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnActivity.BPMNActivityresources(diagnostics, context);
	}

	/**
	 * Validates the BPMNActivitycontainer constraint of '<em>BPMN Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity_BPMNActivitycontainer(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnActivity.BPMNActivitycontainer(diagnostics, context);
	}

	/**
	 * Validates the BPMNActivityproperties constraint of '<em>BPMN Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity_BPMNActivityproperties(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnActivity.BPMNActivityproperties(diagnostics, context);
	}

	/**
	 * Validates the BPMNActivitydefault constraint of '<em>BPMN Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity_BPMNActivitydefault(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnActivity.BPMNActivitydefault(diagnostics, context);
	}

	/**
	 * Validates the BPMNActivityboundaryEventsRefs constraint of '<em>BPMN Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity_BPMNActivityboundaryEventsRefs(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnActivity.BPMNActivityboundaryEventsRefs(diagnostics, context);
	}

	/**
	 * Validates the BPMNActivityloopCharacteristics constraint of '<em>BPMN Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNActivity_BPMNActivityloopCharacteristics(BPMNActivity bpmnActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnActivity.BPMNActivityloopCharacteristics(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryEvent(BoundaryEvent boundaryEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(boundaryEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCatchEvent_catchEventeventDefinitionsRefs(boundaryEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateBoundaryEvent_boundaryEventattachedToRef(boundaryEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the boundaryEventattachedToRef constraint of '<em>Boundary Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoundaryEvent_boundaryEventattachedToRef(BoundaryEvent boundaryEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return boundaryEvent.boundaryEventattachedToRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatchEvent(CatchEvent catchEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(catchEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(catchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCatchEvent_catchEventeventDefinitionsRefs(catchEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the catchEventeventDefinitionsRefs constraint of '<em>Catch Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCatchEvent_catchEventeventDefinitionsRefs(CatchEvent catchEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return catchEvent.catchEventeventDefinitionsRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNEvent(BPMNEvent bpmnEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bpmnEvent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOutputAssociation(DataOutputAssociation dataOutputAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataOutputAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationsource(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationtransformation(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationtarget(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOutputAssociation_dataOutputAssociationsource(dataOutputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataOutputAssociation_dataOutputAssociationtarget(dataOutputAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the dataOutputAssociationsource constraint of '<em>Data Output Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOutputAssociation_dataOutputAssociationsource(DataOutputAssociation dataOutputAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataOutputAssociation.dataOutputAssociationsource(diagnostics, context);
	}

	/**
	 * Validates the dataOutputAssociationtarget constraint of '<em>Data Output Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataOutputAssociation_dataOutputAssociationtarget(DataOutputAssociation dataOutputAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataOutputAssociation.dataOutputAssociationtarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAssociation(DataAssociation dataAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationsource(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationtransformation(dataAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationtarget(dataAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DataAssociationsource constraint of '<em>Data Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAssociation_DataAssociationsource(DataAssociation dataAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataAssociation.DataAssociationsource(diagnostics, context);
	}

	/**
	 * Validates the DataAssociationtransformation constraint of '<em>Data Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAssociation_DataAssociationtransformation(DataAssociation dataAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataAssociation.DataAssociationtransformation(diagnostics, context);
	}

	/**
	 * Validates the DataAssociationtarget constraint of '<em>Data Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataAssociation_DataAssociationtarget(DataAssociation dataAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataAssociation.DataAssociationtarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssignment(Assignment assignment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assignment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInputAssociation(DataInputAssociation dataInputAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataInputAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationsource(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationtransformation(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataAssociation_DataAssociationtarget(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataInputAssociation_dataInputAssociationsource(dataInputAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataInputAssociation_dataInputAssociationtarget(dataInputAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the dataInputAssociationsource constraint of '<em>Data Input Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInputAssociation_dataInputAssociationsource(DataInputAssociation dataInputAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataInputAssociation.dataInputAssociationsource(diagnostics, context);
	}

	/**
	 * Validates the dataInputAssociationtarget constraint of '<em>Data Input Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataInputAssociation_dataInputAssociationtarget(DataInputAssociation dataInputAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataInputAssociation.dataInputAssociationtarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoopCharacteristics(LoopCharacteristics loopCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loopCharacteristics, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEscalationEventDefinition(EscalationEventDefinition escalationEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(escalationEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEscalation(Escalation escalation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(escalation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemDefinition_ItemDefinitionstructureRef(escalation, diagnostics, context);
		if (result || diagnostics != null) result &= validateEscalation_EscalationstructureRef(escalation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the EscalationstructureRef constraint of '<em>Escalation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEscalation_EscalationstructureRef(Escalation escalation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return escalation.EscalationstructureRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimerEventDefinition(TimerEventDefinition timerEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timerEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSignalEventDefinition(SignalEventDefinition signalEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(signalEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNSignal(BPMNSignal bpmnSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(bpmnSignal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemDefinition_ItemDefinitionstructureRef(bpmnSignal, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNSignal_BPMNSignalstructureRef(bpmnSignal, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BPMNSignalstructureRef constraint of '<em>BPMN Signal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBPMNSignal_BPMNSignalstructureRef(BPMNSignal bpmnSignal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return bpmnSignal.BPMNSignalstructureRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndEvent(EndEvent endEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateThrowEvent_ThrowEventeventDefinitionRefs(endEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrowEvent(ThrowEvent throwEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(throwEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(throwEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateThrowEvent_ThrowEventeventDefinitionRefs(throwEvent, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ThrowEventeventDefinitionRefs constraint of '<em>Throw Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThrowEvent_ThrowEventeventDefinitionRefs(ThrowEvent throwEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return throwEvent.ThrowEventeventDefinitionRefs(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageEventDefinition(MessageEventDefinition messageEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartEvent(StartEvent startEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCatchEvent_catchEventeventDefinitionsRefs(startEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalEventDefinition(ConditionalEventDefinition conditionalEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conditionalEventDefinition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conditionalEventDefinition, diagnostics, context);
		if (result || diagnostics != null) result &= validateConditionalEventDefinition_conditionalEventDefinitioncondition(conditionalEventDefinition, diagnostics, context);
		return result;
	}

	/**
	 * Validates the conditionalEventDefinitioncondition constraint of '<em>Conditional Event Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionalEventDefinition_conditionalEventDefinitioncondition(ConditionalEventDefinition conditionalEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return conditionalEventDefinition.conditionalEventDefinitioncondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkEventDefinition(LinkEventDefinition linkEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErrorEventDefinition(ErrorEventDefinition errorEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(errorEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateCatchEvent(IntermediateCatchEvent intermediateCatchEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intermediateCatchEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intermediateCatchEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateCatchEvent_catchEventeventDefinitionsRefs(intermediateCatchEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIntermediateThrowEvent(IntermediateThrowEvent intermediateThrowEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(intermediateThrowEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(intermediateThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateThrowEvent_ThrowEventeventDefinitionRefs(intermediateThrowEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTerminateEventDefinition(TerminateEventDefinition terminateEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(terminateEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImplicitThrowEvent(ImplicitThrowEvent implicitThrowEvent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(implicitThrowEvent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(implicitThrowEvent, diagnostics, context);
		if (result || diagnostics != null) result &= validateThrowEvent_ThrowEventeventDefinitionRefs(implicitThrowEvent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCancelEventDefinition(CancelEventDefinition cancelEventDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cancelEventDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextAnnotation(TextAnnotation textAnnotation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textAnnotation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCategory(Category category, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(category, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGroup(Group group, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(group, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataObjectReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObjectReference_DataObjectRefsourcetarget(dataObjectReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObjectReference_DataObjectRefdataState(dataObjectReference, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DataObjectRefsourcetarget constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference_DataObjectRefsourcetarget(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataObjectReference.DataObjectRefsourcetarget(diagnostics, context);
	}

	/**
	 * Validates the DataObjectRefdataState constraint of '<em>Data Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObjectReference_DataObjectRefdataState(DataObjectReference dataObjectReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataObjectReference.DataObjectRefdataState(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject(DataObject dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataObject, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(dataObject, diagnostics, context);
		if (result || diagnostics != null) result &= validateDataObject_DataObjectdataState(dataObject, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DataObjectdataState constraint of '<em>Data Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataObject_DataObjectdataState(DataObject dataObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return dataObject.DataObjectdataState(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStore(DataStore dataStore, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dataStore, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDataStoreReference(DataStoreReference dataStoreReference, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dataStoreReference, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dataStoreReference, diagnostics, context);
		if (result || diagnostics != null) result &= validateItemAwareElement_ItemAwareElementdataState(dataStoreReference, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(userTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateUserTask_UserTaskimplementation(userTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateUserTask_UserTaskrenderings(userTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the UserTaskimplementation constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask_UserTaskimplementation(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return userTask.UserTaskimplementation(diagnostics, context);
	}

	/**
	 * Validates the UserTaskrenderings constraint of '<em>User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserTask_UserTaskrenderings(UserTask userTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return userTask.UserTaskrenderings(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTask(Task task, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(task, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(task, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(task, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRendering(Rendering rendering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rendering, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHumanPerformer(HumanPerformer humanPerformer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(humanPerformer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleowner(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceRef(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleisRequired(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleprocess(humanPerformer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceParameterBindings(humanPerformer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerformer(Performer performer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(performer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleowner(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceRef(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleisRequired(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleprocess(performer, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceParameterBindings(performer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalUserTask(GlobalUserTask globalUserTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalUserTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalTask_GlobalTasksupportedInterfaceRefs(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalUserTask_GlobalUserTaskrenderings(globalUserTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalUserTask_GlobalUserTaskimplementation(globalUserTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the GlobalUserTaskrenderings constraint of '<em>Global User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalUserTask_GlobalUserTaskrenderings(GlobalUserTask globalUserTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalUserTask.GlobalUserTaskrenderings(diagnostics, context);
	}

	/**
	 * Validates the GlobalUserTaskimplementation constraint of '<em>Global User Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalUserTask_GlobalUserTaskimplementation(GlobalUserTask globalUserTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalUserTask.GlobalUserTaskimplementation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalManualTask(GlobalManualTask globalManualTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalManualTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableEelementsupportedInterfaceRefs(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallableElement_CallableElementresources(globalManualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalTask_GlobalTasksupportedInterfaceRefs(globalManualTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualTask(ManualTask manualTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manualTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(manualTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(manualTask, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePotentialOwner(PotentialOwner potentialOwner, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(potentialOwner, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleowner(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceRef(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleisRequired(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleprocess(potentialOwner, diagnostics, context);
		if (result || diagnostics != null) result &= validateResourceRole_ResourceRoleresourceParameterBindings(potentialOwner, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubConversation(SubConversation subConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subConversation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConversationNode_ConversationNodeparticipantRefs(subConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubConversation_SubConversationconnectedelements(subConversation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SubConversationconnectedelements constraint of '<em>Sub Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubConversation_SubConversationconnectedelements(SubConversation subConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subConversation.SubConversationconnectedelements(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalConversation(GlobalConversation globalConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(globalConversation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNCollaboration_Collaborationparticipants(globalConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateGlobalConversation_GlobalConversationcontainedelements(globalConversation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the GlobalConversationcontainedelements constraint of '<em>Global Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalConversation_GlobalConversationcontainedelements(GlobalConversation globalConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return globalConversation.GlobalConversationcontainedelements(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallConversation(CallConversation callConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callConversation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConversationNode_ConversationNodeparticipantRefs(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallConversation_CallConversationcalledCollaborationRef(callConversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallConversation_CallConversationparticipantAssociations(callConversation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CallConversationcalledCollaborationRef constraint of '<em>Call Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallConversation_CallConversationcalledCollaborationRef(CallConversation callConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callConversation.CallConversationcalledCollaborationRef(diagnostics, context);
	}

	/**
	 * Validates the CallConversationparticipantAssociations constraint of '<em>Call Conversation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallConversation_CallConversationparticipantAssociations(CallConversation callConversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callConversation.CallConversationparticipantAssociations(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConversation(Conversation conversation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(conversation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(conversation, diagnostics, context);
		if (result || diagnostics != null) result &= validateConversationNode_ConversationNodeparticipantRefs(conversation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubProcess(SubProcess subProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(subProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(subProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubProcess_SubProcesstriggeredByEvent(subProcess, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SubProcesstriggeredByEvent constraint of '<em>Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubProcess_SubProcesstriggeredByEvent(SubProcess subProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return subProcess.SubProcesstriggeredByEvent(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallActivity(CallActivity callActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(callActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(callActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateCallActivity_CallActivitycalledElementRefvalues(callActivity, diagnostics, context);
		return result;
	}

	/**
	 * Validates the CallActivitycalledElementRefvalues constraint of '<em>Call Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCallActivity_CallActivitycalledElementRefvalues(CallActivity callActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return callActivity.CallActivitycalledElementRefvalues(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessRuleTask(BusinessRuleTask businessRuleTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(businessRuleTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(businessRuleTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBusinessRuleTask_BusinessRuleTaskimplementation(businessRuleTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the BusinessRuleTaskimplementation constraint of '<em>Business Rule Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBusinessRuleTask_BusinessRuleTaskimplementation(BusinessRuleTask businessRuleTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return businessRuleTask.BusinessRuleTaskimplementation(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexBehaviorDefinition(ComplexBehaviorDefinition complexBehaviorDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexBehaviorDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdHocSubProcess(AdHocSubProcess adHocSubProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(adHocSubProcess, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubProcess_SubProcesstriggeredByEvent(adHocSubProcess, diagnostics, context);
		if (result || diagnostics != null) result &= validateAdHocSubProcess_AdHocSubProcesscancelRemainingInstances(adHocSubProcess, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AdHocSubProcesscancelRemainingInstances constraint of '<em>Ad Hoc Sub Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdHocSubProcess_AdHocSubProcesscancelRemainingInstances(AdHocSubProcess adHocSubProcess, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return adHocSubProcess.AdHocSubProcesscancelRemainingInstances(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptTask(ScriptTask scriptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scriptTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateScriptTask_ScriptTaskscriptFormat(scriptTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateScriptTask_ScriptTaskscript(scriptTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ScriptTaskscriptFormat constraint of '<em>Script Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptTask_ScriptTaskscriptFormat(ScriptTask scriptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scriptTask.ScriptTaskscriptFormat(diagnostics, context);
	}

	/**
	 * Validates the ScriptTaskscript constraint of '<em>Script Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptTask_ScriptTaskscript(ScriptTask scriptTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return scriptTask.ScriptTaskscript(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendTask(SendTask sendTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sendTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(sendTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateSendTask_SendTaskoperationRef(sendTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SendTaskoperationRef constraint of '<em>Send Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSendTask_SendTaskoperationRef(SendTask sendTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sendTask.SendTaskoperationRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransaction(Transaction transaction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transaction, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(transaction, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubProcess_SubProcesstriggeredByEvent(transaction, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardLoopCharacteristics(StandardLoopCharacteristics standardLoopCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(standardLoopCharacteristics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validateStandardLoopCharacteristics_StandardLoopCharacteristicstestBefore(standardLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validateStandardLoopCharacteristics_StandardLoopCharacteristicsloopCondition(standardLoopCharacteristics, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StandardLoopCharacteristicstestBefore constraint of '<em>Standard Loop Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardLoopCharacteristics_StandardLoopCharacteristicstestBefore(StandardLoopCharacteristics standardLoopCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return standardLoopCharacteristics.StandardLoopCharacteristicstestBefore(diagnostics, context);
	}

	/**
	 * Validates the StandardLoopCharacteristicsloopCondition constraint of '<em>Standard Loop Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStandardLoopCharacteristics_StandardLoopCharacteristicsloopCondition(StandardLoopCharacteristics standardLoopCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return standardLoopCharacteristics.StandardLoopCharacteristicsloopCondition(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveTask(ReceiveTask receiveTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(receiveTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(receiveTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateReceiveTask_ReceiveTaskoperationRef(receiveTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ReceiveTaskoperationRef constraint of '<em>Receive Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReceiveTask_ReceiveTaskoperationRef(ReceiveTask receiveTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return receiveTask.ReceiveTaskoperationRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceTask, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityresources(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitycontainer(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityproperties(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivitydefault(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityboundaryEventsRefs(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateBPMNActivity_BPMNActivityloopCharacteristics(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_ServiceTaskinputSet(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_ServiceTaskoutputSet(serviceTask, diagnostics, context);
		if (result || diagnostics != null) result &= validateServiceTask_ServiceTaskoperationRef(serviceTask, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ServiceTaskinputSet constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask_ServiceTaskinputSet(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceTask.ServiceTaskinputSet(diagnostics, context);
	}

	/**
	 * Validates the ServiceTaskoutputSet constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask_ServiceTaskoutputSet(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceTask.ServiceTaskoutputSet(diagnostics, context);
	}

	/**
	 * Validates the ServiceTaskoperationRef constraint of '<em>Service Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceTask_ServiceTaskoperationRef(ServiceTask serviceTask, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return serviceTask.ServiceTaskoperationRef(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiInstanceLoopCharacteristics(MultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(multiInstanceLoopCharacteristics, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(multiInstanceLoopCharacteristics, diagnostics, context);
		if (result || diagnostics != null) result &= validateMultiInstanceLoopCharacteristics_MultiinstanceLoopCharacteristicstarget(multiInstanceLoopCharacteristics, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MultiinstanceLoopCharacteristicstarget constraint of '<em>Multi Instance Loop Characteristics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiInstanceLoopCharacteristics_MultiinstanceLoopCharacteristicstarget(MultiInstanceLoopCharacteristics multiInstanceLoopCharacteristics, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return multiInstanceLoopCharacteristics.MultiinstanceLoopCharacteristicstarget(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAssociationDirection(AssociationDirection associationDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventBasedGatewayType(EventBasedGatewayType eventBasedGatewayType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGatewayDirection(GatewayDirection gatewayDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipDirection(RelationshipDirection relationshipDirection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemKind(ItemKind itemKind, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessType(ProcessType processType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdHocOrdering(AdHocOrdering adHocOrdering, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiInstanceBehavior(MultiInstanceBehavior multiInstanceBehavior, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BpmnprofValidator
