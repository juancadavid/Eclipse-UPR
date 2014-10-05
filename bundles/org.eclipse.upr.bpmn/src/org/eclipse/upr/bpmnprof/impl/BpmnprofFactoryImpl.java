/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.upr.bpmnprof.AdHocOrdering;
import org.eclipse.upr.bpmnprof.AdHocSubProcess;
import org.eclipse.upr.bpmnprof.Assignment;
import org.eclipse.upr.bpmnprof.AssociationDirection;
import org.eclipse.upr.bpmnprof.Auditing;
import org.eclipse.upr.bpmnprof.BPMNAssociation;
import org.eclipse.upr.bpmnprof.BPMNCollaboration;
import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BPMNExtension;
import org.eclipse.upr.bpmnprof.BPMNInterface;
import org.eclipse.upr.bpmnprof.BPMNMessage;
import org.eclipse.upr.bpmnprof.BPMNOperation;
import org.eclipse.upr.bpmnprof.BPMNProcess;
import org.eclipse.upr.bpmnprof.BPMNProperty;
import org.eclipse.upr.bpmnprof.BPMNRelationship;
import org.eclipse.upr.bpmnprof.BPMNSignal;
import org.eclipse.upr.bpmnprof.BoundaryEvent;
import org.eclipse.upr.bpmnprof.BpmnprofFactory;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.BusinessRuleTask;
import org.eclipse.upr.bpmnprof.CallActivity;
import org.eclipse.upr.bpmnprof.CallConversation;
import org.eclipse.upr.bpmnprof.CancelEventDefinition;
import org.eclipse.upr.bpmnprof.Category;
import org.eclipse.upr.bpmnprof.CategoryValue;
import org.eclipse.upr.bpmnprof.CompensateEventDefinition;
import org.eclipse.upr.bpmnprof.ComplexBehaviorDefinition;
import org.eclipse.upr.bpmnprof.ComplexGateway;
import org.eclipse.upr.bpmnprof.ConditionalEventDefinition;
import org.eclipse.upr.bpmnprof.Conversation;
import org.eclipse.upr.bpmnprof.ConversationLink;
import org.eclipse.upr.bpmnprof.CorrelationKey;
import org.eclipse.upr.bpmnprof.CorrelationProperty;
import org.eclipse.upr.bpmnprof.CorrelationPropertyBinding;
import org.eclipse.upr.bpmnprof.CorrelationPropertyRetrievalExpression;
import org.eclipse.upr.bpmnprof.CorrelationSubscription;
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
import org.eclipse.upr.bpmnprof.ExclusiveGateway;
import org.eclipse.upr.bpmnprof.ExtensionAttributeDefinition;
import org.eclipse.upr.bpmnprof.ExtensionAttributeValue;
import org.eclipse.upr.bpmnprof.ExtensionDefinition;
import org.eclipse.upr.bpmnprof.FormalExpression;
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
import org.eclipse.upr.bpmnprof.IntermediateCatchEvent;
import org.eclipse.upr.bpmnprof.IntermediateThrowEvent;
import org.eclipse.upr.bpmnprof.ItemDefinition;
import org.eclipse.upr.bpmnprof.ItemKind;
import org.eclipse.upr.bpmnprof.Lane;
import org.eclipse.upr.bpmnprof.LaneSet;
import org.eclipse.upr.bpmnprof.LinkEventDefinition;
import org.eclipse.upr.bpmnprof.ManualTask;
import org.eclipse.upr.bpmnprof.MessageEventDefinition;
import org.eclipse.upr.bpmnprof.MessageFlow;
import org.eclipse.upr.bpmnprof.MessageFlowAssociation;
import org.eclipse.upr.bpmnprof.Monitoring;
import org.eclipse.upr.bpmnprof.MultiInstanceBehavior;
import org.eclipse.upr.bpmnprof.MultiInstanceLoopCharacteristics;
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
import org.eclipse.upr.bpmnprof.TimerEventDefinition;
import org.eclipse.upr.bpmnprof.Transaction;
import org.eclipse.upr.bpmnprof.UserTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnprofFactoryImpl extends EFactoryImpl implements BpmnprofFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BpmnprofFactory init() {
		try {
			BpmnprofFactory theBpmnprofFactory = (BpmnprofFactory)EPackage.Registry.INSTANCE.getEFactory(BpmnprofPackage.eNS_URI);
			if (theBpmnprofFactory != null) {
				return theBpmnprofFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BpmnprofFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnprofFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BpmnprofPackage.INCLUSIVE_GATEWAY: return createInclusiveGateway();
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_VALUE: return createExtensionAttributeValue();
			case BpmnprofPackage.EXTENSION_ATTRIBUTE_DEFINITION: return createExtensionAttributeDefinition();
			case BpmnprofPackage.DOCUMENTATION: return createDocumentation();
			case BpmnprofPackage.EXTENSION_DEFINITION: return createExtensionDefinition();
			case BpmnprofPackage.BPMN_ASSOCIATION: return createBPMNAssociation();
			case BpmnprofPackage.AUDITING: return createAuditing();
			case BpmnprofPackage.MONITORING: return createMonitoring();
			case BpmnprofPackage.CATEGORY_VALUE: return createCategoryValue();
			case BpmnprofPackage.LANE_SET: return createLaneSet();
			case BpmnprofPackage.LANE: return createLane();
			case BpmnprofPackage.SEQUENCE_FLOW: return createSequenceFlow();
			case BpmnprofPackage.BPMN_EXPRESSION: return createBPMNExpression();
			case BpmnprofPackage.EVENT_BASED_GATEWAY: return createEventBasedGateway();
			case BpmnprofPackage.PARALLEL_GATEWAY: return createParallelGateway();
			case BpmnprofPackage.COMPLEX_GATEWAY: return createComplexGateway();
			case BpmnprofPackage.EXCLUSIVE_GATEWAY: return createExclusiveGateway();
			case BpmnprofPackage.DEFINITIONS: return createDefinitions();
			case BpmnprofPackage.BPMN_EXTENSION: return createBPMNExtension();
			case BpmnprofPackage.IMPORT: return createImport();
			case BpmnprofPackage.BPMN_RELATIONSHIP: return createBPMNRelationship();
			case BpmnprofPackage.BPMN_PROCESS: return createBPMNProcess();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION: return createInputOutputSpecification();
			case BpmnprofPackage.DATA_INPUT: return createDataInput();
			case BpmnprofPackage.DATA_STATE: return createDataState();
			case BpmnprofPackage.ITEM_DEFINITION: return createItemDefinition();
			case BpmnprofPackage.INPUT_SET: return createInputSet();
			case BpmnprofPackage.DATA_OUTPUT: return createDataOutput();
			case BpmnprofPackage.OUTPUT_SET: return createOutputSet();
			case BpmnprofPackage.BPMN_INTERFACE: return createBPMNInterface();
			case BpmnprofPackage.BPMN_OPERATION: return createBPMNOperation();
			case BpmnprofPackage.BPMN_MESSAGE: return createBPMNMessage();
			case BpmnprofPackage.ERROR: return createError();
			case BpmnprofPackage.INPUT_OUTPUT_BINDING: return createInputOutputBinding();
			case BpmnprofPackage.BPMN_COLLABORATION: return createBPMNCollaboration();
			case BpmnprofPackage.PARTICIPANT_ASSOCIATION: return createParticipantAssociation();
			case BpmnprofPackage.PARTICIPANT: return createParticipant();
			case BpmnprofPackage.CONVERSATION_LINK: return createConversationLink();
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY: return createParticipantMultiplicity();
			case BpmnprofPackage.PARTNER_ENTITY: return createPartnerEntity();
			case BpmnprofPackage.PARTNER_ROLE: return createPartnerRole();
			case BpmnprofPackage.MESSAGE_FLOW_ASSOCIATION: return createMessageFlowAssociation();
			case BpmnprofPackage.MESSAGE_FLOW: return createMessageFlow();
			case BpmnprofPackage.CORRELATION_KEY: return createCorrelationKey();
			case BpmnprofPackage.CORRELATION_PROPERTY: return createCorrelationProperty();
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION: return createCorrelationPropertyRetrievalExpression();
			case BpmnprofPackage.FORMAL_EXPRESSION: return createFormalExpression();
			case BpmnprofPackage.CORRELATION_SUBSCRIPTION: return createCorrelationSubscription();
			case BpmnprofPackage.CORRELATION_PROPERTY_BINDING: return createCorrelationPropertyBinding();
			case BpmnprofPackage.BPMN_PROPERTY: return createBPMNProperty();
			case BpmnprofPackage.RESOURCE_ROLE: return createResourceRole();
			case BpmnprofPackage.RESOURCE_ASSIGNMENT_EXPRESSION: return createResourceAssignmentExpression();
			case BpmnprofPackage.RESOURCE: return createResource();
			case BpmnprofPackage.RESOURCE_PARAMETER: return createResourceParameter();
			case BpmnprofPackage.RESOURCE_PARAMETER_BINDING: return createResourceParameterBinding();
			case BpmnprofPackage.GLOBAL_SCRIPT_TASK: return createGlobalScriptTask();
			case BpmnprofPackage.GLOBAL_TASK: return createGlobalTask();
			case BpmnprofPackage.GLOBAL_BUSINESS_RULE_TASK: return createGlobalBusinessRuleTask();
			case BpmnprofPackage.COMPENSATE_EVENT_DEFINITION: return createCompensateEventDefinition();
			case BpmnprofPackage.BOUNDARY_EVENT: return createBoundaryEvent();
			case BpmnprofPackage.DATA_OUTPUT_ASSOCIATION: return createDataOutputAssociation();
			case BpmnprofPackage.ASSIGNMENT: return createAssignment();
			case BpmnprofPackage.DATA_INPUT_ASSOCIATION: return createDataInputAssociation();
			case BpmnprofPackage.ESCALATION_EVENT_DEFINITION: return createEscalationEventDefinition();
			case BpmnprofPackage.ESCALATION: return createEscalation();
			case BpmnprofPackage.TIMER_EVENT_DEFINITION: return createTimerEventDefinition();
			case BpmnprofPackage.SIGNAL_EVENT_DEFINITION: return createSignalEventDefinition();
			case BpmnprofPackage.BPMN_SIGNAL: return createBPMNSignal();
			case BpmnprofPackage.END_EVENT: return createEndEvent();
			case BpmnprofPackage.MESSAGE_EVENT_DEFINITION: return createMessageEventDefinition();
			case BpmnprofPackage.START_EVENT: return createStartEvent();
			case BpmnprofPackage.CONDITIONAL_EVENT_DEFINITION: return createConditionalEventDefinition();
			case BpmnprofPackage.LINK_EVENT_DEFINITION: return createLinkEventDefinition();
			case BpmnprofPackage.ERROR_EVENT_DEFINITION: return createErrorEventDefinition();
			case BpmnprofPackage.INTERMEDIATE_CATCH_EVENT: return createIntermediateCatchEvent();
			case BpmnprofPackage.INTERMEDIATE_THROW_EVENT: return createIntermediateThrowEvent();
			case BpmnprofPackage.TERMINATE_EVENT_DEFINITION: return createTerminateEventDefinition();
			case BpmnprofPackage.IMPLICIT_THROW_EVENT: return createImplicitThrowEvent();
			case BpmnprofPackage.CANCEL_EVENT_DEFINITION: return createCancelEventDefinition();
			case BpmnprofPackage.TEXT_ANNOTATION: return createTextAnnotation();
			case BpmnprofPackage.CATEGORY: return createCategory();
			case BpmnprofPackage.GROUP: return createGroup();
			case BpmnprofPackage.DATA_OBJECT_REFERENCE: return createDataObjectReference();
			case BpmnprofPackage.DATA_OBJECT: return createDataObject();
			case BpmnprofPackage.DATA_STORE: return createDataStore();
			case BpmnprofPackage.DATA_STORE_REFERENCE: return createDataStoreReference();
			case BpmnprofPackage.USER_TASK: return createUserTask();
			case BpmnprofPackage.TASK: return createTask();
			case BpmnprofPackage.RENDERING: return createRendering();
			case BpmnprofPackage.HUMAN_PERFORMER: return createHumanPerformer();
			case BpmnprofPackage.PERFORMER: return createPerformer();
			case BpmnprofPackage.GLOBAL_USER_TASK: return createGlobalUserTask();
			case BpmnprofPackage.GLOBAL_MANUAL_TASK: return createGlobalManualTask();
			case BpmnprofPackage.MANUAL_TASK: return createManualTask();
			case BpmnprofPackage.POTENTIAL_OWNER: return createPotentialOwner();
			case BpmnprofPackage.SUB_CONVERSATION: return createSubConversation();
			case BpmnprofPackage.GLOBAL_CONVERSATION: return createGlobalConversation();
			case BpmnprofPackage.CALL_CONVERSATION: return createCallConversation();
			case BpmnprofPackage.CONVERSATION: return createConversation();
			case BpmnprofPackage.SUB_PROCESS: return createSubProcess();
			case BpmnprofPackage.CALL_ACTIVITY: return createCallActivity();
			case BpmnprofPackage.BUSINESS_RULE_TASK: return createBusinessRuleTask();
			case BpmnprofPackage.COMPLEX_BEHAVIOR_DEFINITION: return createComplexBehaviorDefinition();
			case BpmnprofPackage.AD_HOC_SUB_PROCESS: return createAdHocSubProcess();
			case BpmnprofPackage.SCRIPT_TASK: return createScriptTask();
			case BpmnprofPackage.SEND_TASK: return createSendTask();
			case BpmnprofPackage.TRANSACTION: return createTransaction();
			case BpmnprofPackage.STANDARD_LOOP_CHARACTERISTICS: return createStandardLoopCharacteristics();
			case BpmnprofPackage.RECEIVE_TASK: return createReceiveTask();
			case BpmnprofPackage.SERVICE_TASK: return createServiceTask();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS: return createMultiInstanceLoopCharacteristics();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnprofPackage.ASSOCIATION_DIRECTION:
				return createAssociationDirectionFromString(eDataType, initialValue);
			case BpmnprofPackage.EVENT_BASED_GATEWAY_TYPE:
				return createEventBasedGatewayTypeFromString(eDataType, initialValue);
			case BpmnprofPackage.GATEWAY_DIRECTION:
				return createGatewayDirectionFromString(eDataType, initialValue);
			case BpmnprofPackage.RELATIONSHIP_DIRECTION:
				return createRelationshipDirectionFromString(eDataType, initialValue);
			case BpmnprofPackage.ITEM_KIND:
				return createItemKindFromString(eDataType, initialValue);
			case BpmnprofPackage.PROCESS_TYPE:
				return createProcessTypeFromString(eDataType, initialValue);
			case BpmnprofPackage.AD_HOC_ORDERING:
				return createAdHocOrderingFromString(eDataType, initialValue);
			case BpmnprofPackage.MULTI_INSTANCE_BEHAVIOR:
				return createMultiInstanceBehaviorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case BpmnprofPackage.ASSOCIATION_DIRECTION:
				return convertAssociationDirectionToString(eDataType, instanceValue);
			case BpmnprofPackage.EVENT_BASED_GATEWAY_TYPE:
				return convertEventBasedGatewayTypeToString(eDataType, instanceValue);
			case BpmnprofPackage.GATEWAY_DIRECTION:
				return convertGatewayDirectionToString(eDataType, instanceValue);
			case BpmnprofPackage.RELATIONSHIP_DIRECTION:
				return convertRelationshipDirectionToString(eDataType, instanceValue);
			case BpmnprofPackage.ITEM_KIND:
				return convertItemKindToString(eDataType, instanceValue);
			case BpmnprofPackage.PROCESS_TYPE:
				return convertProcessTypeToString(eDataType, instanceValue);
			case BpmnprofPackage.AD_HOC_ORDERING:
				return convertAdHocOrderingToString(eDataType, instanceValue);
			case BpmnprofPackage.MULTI_INSTANCE_BEHAVIOR:
				return convertMultiInstanceBehaviorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InclusiveGateway createInclusiveGateway() {
		InclusiveGatewayImpl inclusiveGateway = new InclusiveGatewayImpl();
		return inclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeValue createExtensionAttributeValue() {
		ExtensionAttributeValueImpl extensionAttributeValue = new ExtensionAttributeValueImpl();
		return extensionAttributeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionAttributeDefinition createExtensionAttributeDefinition() {
		ExtensionAttributeDefinitionImpl extensionAttributeDefinition = new ExtensionAttributeDefinitionImpl();
		return extensionAttributeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Documentation createDocumentation() {
		DocumentationImpl documentation = new DocumentationImpl();
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition createExtensionDefinition() {
		ExtensionDefinitionImpl extensionDefinition = new ExtensionDefinitionImpl();
		return extensionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNAssociation createBPMNAssociation() {
		BPMNAssociationImpl bpmnAssociation = new BPMNAssociationImpl();
		return bpmnAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing createAuditing() {
		AuditingImpl auditing = new AuditingImpl();
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring createMonitoring() {
		MonitoringImpl monitoring = new MonitoringImpl();
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CategoryValue createCategoryValue() {
		CategoryValueImpl categoryValue = new CategoryValueImpl();
		return categoryValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaneSet createLaneSet() {
		LaneSetImpl laneSet = new LaneSetImpl();
		return laneSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lane createLane() {
		LaneImpl lane = new LaneImpl();
		return lane;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow createSequenceFlow() {
		SequenceFlowImpl sequenceFlow = new SequenceFlowImpl();
		return sequenceFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression createBPMNExpression() {
		BPMNExpressionImpl bpmnExpression = new BPMNExpressionImpl();
		return bpmnExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGateway createEventBasedGateway() {
		EventBasedGatewayImpl eventBasedGateway = new EventBasedGatewayImpl();
		return eventBasedGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelGateway createParallelGateway() {
		ParallelGatewayImpl parallelGateway = new ParallelGatewayImpl();
		return parallelGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexGateway createComplexGateway() {
		ComplexGatewayImpl complexGateway = new ComplexGatewayImpl();
		return complexGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExclusiveGateway createExclusiveGateway() {
		ExclusiveGatewayImpl exclusiveGateway = new ExclusiveGatewayImpl();
		return exclusiveGateway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions createDefinitions() {
		DefinitionsImpl definitions = new DefinitionsImpl();
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExtension createBPMNExtension() {
		BPMNExtensionImpl bpmnExtension = new BPMNExtensionImpl();
		return bpmnExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import createImport() {
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNRelationship createBPMNRelationship() {
		BPMNRelationshipImpl bpmnRelationship = new BPMNRelationshipImpl();
		return bpmnRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNProcess createBPMNProcess() {
		BPMNProcessImpl bpmnProcess = new BPMNProcessImpl();
		return bpmnProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification createInputOutputSpecification() {
		InputOutputSpecificationImpl inputOutputSpecification = new InputOutputSpecificationImpl();
		return inputOutputSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput createDataInput() {
		DataInputImpl dataInput = new DataInputImpl();
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataState createDataState() {
		DataStateImpl dataState = new DataStateImpl();
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition createItemDefinition() {
		ItemDefinitionImpl itemDefinition = new ItemDefinitionImpl();
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet createInputSet() {
		InputSetImpl inputSet = new InputSetImpl();
		return inputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput createDataOutput() {
		DataOutputImpl dataOutput = new DataOutputImpl();
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet createOutputSet() {
		OutputSetImpl outputSet = new OutputSetImpl();
		return outputSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNInterface createBPMNInterface() {
		BPMNInterfaceImpl bpmnInterface = new BPMNInterfaceImpl();
		return bpmnInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNOperation createBPMNOperation() {
		BPMNOperationImpl bpmnOperation = new BPMNOperationImpl();
		return bpmnOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNMessage createBPMNMessage() {
		BPMNMessageImpl bpmnMessage = new BPMNMessageImpl();
		return bpmnMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.upr.bpmnprof.Error createError() {
		ErrorImpl error = new ErrorImpl();
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputBinding createInputOutputBinding() {
		InputOutputBindingImpl inputOutputBinding = new InputOutputBindingImpl();
		return inputOutputBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration createBPMNCollaboration() {
		BPMNCollaborationImpl bpmnCollaboration = new BPMNCollaborationImpl();
		return bpmnCollaboration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantAssociation createParticipantAssociation() {
		ParticipantAssociationImpl participantAssociation = new ParticipantAssociationImpl();
		return participantAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Participant createParticipant() {
		ParticipantImpl participant = new ParticipantImpl();
		return participant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConversationLink createConversationLink() {
		ConversationLinkImpl conversationLink = new ConversationLinkImpl();
		return conversationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParticipantMultiplicity createParticipantMultiplicity() {
		ParticipantMultiplicityImpl participantMultiplicity = new ParticipantMultiplicityImpl();
		return participantMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerEntity createPartnerEntity() {
		PartnerEntityImpl partnerEntity = new PartnerEntityImpl();
		return partnerEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartnerRole createPartnerRole() {
		PartnerRoleImpl partnerRole = new PartnerRoleImpl();
		return partnerRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlowAssociation createMessageFlowAssociation() {
		MessageFlowAssociationImpl messageFlowAssociation = new MessageFlowAssociationImpl();
		return messageFlowAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFlow createMessageFlow() {
		MessageFlowImpl messageFlow = new MessageFlowImpl();
		return messageFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationKey createCorrelationKey() {
		CorrelationKeyImpl correlationKey = new CorrelationKeyImpl();
		return correlationKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationProperty createCorrelationProperty() {
		CorrelationPropertyImpl correlationProperty = new CorrelationPropertyImpl();
		return correlationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyRetrievalExpression createCorrelationPropertyRetrievalExpression() {
		CorrelationPropertyRetrievalExpressionImpl correlationPropertyRetrievalExpression = new CorrelationPropertyRetrievalExpressionImpl();
		return correlationPropertyRetrievalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression createFormalExpression() {
		FormalExpressionImpl formalExpression = new FormalExpressionImpl();
		return formalExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationSubscription createCorrelationSubscription() {
		CorrelationSubscriptionImpl correlationSubscription = new CorrelationSubscriptionImpl();
		return correlationSubscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationPropertyBinding createCorrelationPropertyBinding() {
		CorrelationPropertyBindingImpl correlationPropertyBinding = new CorrelationPropertyBindingImpl();
		return correlationPropertyBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNProperty createBPMNProperty() {
		BPMNPropertyImpl bpmnProperty = new BPMNPropertyImpl();
		return bpmnProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceRole createResourceRole() {
		ResourceRoleImpl resourceRole = new ResourceRoleImpl();
		return resourceRole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceAssignmentExpression createResourceAssignmentExpression() {
		ResourceAssignmentExpressionImpl resourceAssignmentExpression = new ResourceAssignmentExpressionImpl();
		return resourceAssignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resource createResource() {
		ResourceImpl resource = new ResourceImpl();
		return resource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameter createResourceParameter() {
		ResourceParameterImpl resourceParameter = new ResourceParameterImpl();
		return resourceParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceParameterBinding createResourceParameterBinding() {
		ResourceParameterBindingImpl resourceParameterBinding = new ResourceParameterBindingImpl();
		return resourceParameterBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalScriptTask createGlobalScriptTask() {
		GlobalScriptTaskImpl globalScriptTask = new GlobalScriptTaskImpl();
		return globalScriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalTask createGlobalTask() {
		GlobalTaskImpl globalTask = new GlobalTaskImpl();
		return globalTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalBusinessRuleTask createGlobalBusinessRuleTask() {
		GlobalBusinessRuleTaskImpl globalBusinessRuleTask = new GlobalBusinessRuleTaskImpl();
		return globalBusinessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompensateEventDefinition createCompensateEventDefinition() {
		CompensateEventDefinitionImpl compensateEventDefinition = new CompensateEventDefinitionImpl();
		return compensateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundaryEvent createBoundaryEvent() {
		BoundaryEventImpl boundaryEvent = new BoundaryEventImpl();
		return boundaryEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutputAssociation createDataOutputAssociation() {
		DataOutputAssociationImpl dataOutputAssociation = new DataOutputAssociationImpl();
		return dataOutputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInputAssociation createDataInputAssociation() {
		DataInputAssociationImpl dataInputAssociation = new DataInputAssociationImpl();
		return dataInputAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EscalationEventDefinition createEscalationEventDefinition() {
		EscalationEventDefinitionImpl escalationEventDefinition = new EscalationEventDefinitionImpl();
		return escalationEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Escalation createEscalation() {
		EscalationImpl escalation = new EscalationImpl();
		return escalation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerEventDefinition createTimerEventDefinition() {
		TimerEventDefinitionImpl timerEventDefinition = new TimerEventDefinitionImpl();
		return timerEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignalEventDefinition createSignalEventDefinition() {
		SignalEventDefinitionImpl signalEventDefinition = new SignalEventDefinitionImpl();
		return signalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNSignal createBPMNSignal() {
		BPMNSignalImpl bpmnSignal = new BPMNSignalImpl();
		return bpmnSignal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndEvent createEndEvent() {
		EndEventImpl endEvent = new EndEventImpl();
		return endEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageEventDefinition createMessageEventDefinition() {
		MessageEventDefinitionImpl messageEventDefinition = new MessageEventDefinitionImpl();
		return messageEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartEvent createStartEvent() {
		StartEventImpl startEvent = new StartEventImpl();
		return startEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalEventDefinition createConditionalEventDefinition() {
		ConditionalEventDefinitionImpl conditionalEventDefinition = new ConditionalEventDefinitionImpl();
		return conditionalEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition createLinkEventDefinition() {
		LinkEventDefinitionImpl linkEventDefinition = new LinkEventDefinitionImpl();
		return linkEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ErrorEventDefinition createErrorEventDefinition() {
		ErrorEventDefinitionImpl errorEventDefinition = new ErrorEventDefinitionImpl();
		return errorEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateCatchEvent createIntermediateCatchEvent() {
		IntermediateCatchEventImpl intermediateCatchEvent = new IntermediateCatchEventImpl();
		return intermediateCatchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediateThrowEvent createIntermediateThrowEvent() {
		IntermediateThrowEventImpl intermediateThrowEvent = new IntermediateThrowEventImpl();
		return intermediateThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TerminateEventDefinition createTerminateEventDefinition() {
		TerminateEventDefinitionImpl terminateEventDefinition = new TerminateEventDefinitionImpl();
		return terminateEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitThrowEvent createImplicitThrowEvent() {
		ImplicitThrowEventImpl implicitThrowEvent = new ImplicitThrowEventImpl();
		return implicitThrowEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelEventDefinition createCancelEventDefinition() {
		CancelEventDefinitionImpl cancelEventDefinition = new CancelEventDefinitionImpl();
		return cancelEventDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAnnotation createTextAnnotation() {
		TextAnnotationImpl textAnnotation = new TextAnnotationImpl();
		return textAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObjectReference createDataObjectReference() {
		DataObjectReferenceImpl dataObjectReference = new DataObjectReferenceImpl();
		return dataObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject createDataObject() {
		DataObjectImpl dataObject = new DataObjectImpl();
		return dataObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStore createDataStore() {
		DataStoreImpl dataStore = new DataStoreImpl();
		return dataStore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreReference createDataStoreReference() {
		DataStoreReferenceImpl dataStoreReference = new DataStoreReferenceImpl();
		return dataStoreReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTask createUserTask() {
		UserTaskImpl userTask = new UserTaskImpl();
		return userTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rendering createRendering() {
		RenderingImpl rendering = new RenderingImpl();
		return rendering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HumanPerformer createHumanPerformer() {
		HumanPerformerImpl humanPerformer = new HumanPerformerImpl();
		return humanPerformer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer createPerformer() {
		PerformerImpl performer = new PerformerImpl();
		return performer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalUserTask createGlobalUserTask() {
		GlobalUserTaskImpl globalUserTask = new GlobalUserTaskImpl();
		return globalUserTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalManualTask createGlobalManualTask() {
		GlobalManualTaskImpl globalManualTask = new GlobalManualTaskImpl();
		return globalManualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualTask createManualTask() {
		ManualTaskImpl manualTask = new ManualTaskImpl();
		return manualTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotentialOwner createPotentialOwner() {
		PotentialOwnerImpl potentialOwner = new PotentialOwnerImpl();
		return potentialOwner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubConversation createSubConversation() {
		SubConversationImpl subConversation = new SubConversationImpl();
		return subConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalConversation createGlobalConversation() {
		GlobalConversationImpl globalConversation = new GlobalConversationImpl();
		return globalConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConversation createCallConversation() {
		CallConversationImpl callConversation = new CallConversationImpl();
		return callConversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conversation createConversation() {
		ConversationImpl conversation = new ConversationImpl();
		return conversation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubProcess createSubProcess() {
		SubProcessImpl subProcess = new SubProcessImpl();
		return subProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallActivity createCallActivity() {
		CallActivityImpl callActivity = new CallActivityImpl();
		return callActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BusinessRuleTask createBusinessRuleTask() {
		BusinessRuleTaskImpl businessRuleTask = new BusinessRuleTaskImpl();
		return businessRuleTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexBehaviorDefinition createComplexBehaviorDefinition() {
		ComplexBehaviorDefinitionImpl complexBehaviorDefinition = new ComplexBehaviorDefinitionImpl();
		return complexBehaviorDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocSubProcess createAdHocSubProcess() {
		AdHocSubProcessImpl adHocSubProcess = new AdHocSubProcessImpl();
		return adHocSubProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptTask createScriptTask() {
		ScriptTaskImpl scriptTask = new ScriptTaskImpl();
		return scriptTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendTask createSendTask() {
		SendTaskImpl sendTask = new SendTaskImpl();
		return sendTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transaction createTransaction() {
		TransactionImpl transaction = new TransactionImpl();
		return transaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardLoopCharacteristics createStandardLoopCharacteristics() {
		StandardLoopCharacteristicsImpl standardLoopCharacteristics = new StandardLoopCharacteristicsImpl();
		return standardLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveTask createReceiveTask() {
		ReceiveTaskImpl receiveTask = new ReceiveTaskImpl();
		return receiveTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceTask createServiceTask() {
		ServiceTaskImpl serviceTask = new ServiceTaskImpl();
		return serviceTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceLoopCharacteristics createMultiInstanceLoopCharacteristics() {
		MultiInstanceLoopCharacteristicsImpl multiInstanceLoopCharacteristics = new MultiInstanceLoopCharacteristicsImpl();
		return multiInstanceLoopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociationDirection createAssociationDirectionFromString(EDataType eDataType, String initialValue) {
		AssociationDirection result = AssociationDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociationDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayType createEventBasedGatewayTypeFromString(EDataType eDataType, String initialValue) {
		EventBasedGatewayType result = EventBasedGatewayType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventBasedGatewayTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GatewayDirection createGatewayDirectionFromString(EDataType eDataType, String initialValue) {
		GatewayDirection result = GatewayDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGatewayDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationshipDirection createRelationshipDirectionFromString(EDataType eDataType, String initialValue) {
		RelationshipDirection result = RelationshipDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRelationshipDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind createItemKindFromString(EDataType eDataType, String initialValue) {
		ItemKind result = ItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType createProcessTypeFromString(EDataType eDataType, String initialValue) {
		ProcessType result = ProcessType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdHocOrdering createAdHocOrderingFromString(EDataType eDataType, String initialValue) {
		AdHocOrdering result = AdHocOrdering.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdHocOrderingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior createMultiInstanceBehaviorFromString(EDataType eDataType, String initialValue) {
		MultiInstanceBehavior result = MultiInstanceBehavior.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiInstanceBehaviorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnprofPackage getBpmnprofPackage() {
		return (BpmnprofPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BpmnprofPackage getPackage() {
		return BpmnprofPackage.eINSTANCE;
	}

} //BpmnprofFactoryImpl
