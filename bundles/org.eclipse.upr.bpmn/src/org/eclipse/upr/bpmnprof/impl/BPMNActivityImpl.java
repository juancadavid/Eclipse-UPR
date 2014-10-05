/**
 */
package org.eclipse.upr.bpmnprof.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Action;

import org.eclipse.upr.bpmnprof.BPMNActivity;
import org.eclipse.upr.bpmnprof.BPMNProperty;
import org.eclipse.upr.bpmnprof.BoundaryEvent;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.DataInputAssociation;
import org.eclipse.upr.bpmnprof.DataOutputAssociation;
import org.eclipse.upr.bpmnprof.LoopCharacteristics;
import org.eclipse.upr.bpmnprof.ResourceRole;
import org.eclipse.upr.bpmnprof.SequenceFlow;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#isForCompensation <em>Is For Compensation</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getStartQuantity <em>Start Quantity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getCompletionQuantity <em>Completion Quantity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getActivityClass <em>Activity Class</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getBoundaryEventRefs <em>Boundary Event Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getDataInputAssociations <em>Data Input Associations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getDataOutputAssociations <em>Data Output Associations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getLoopCharacteristics <em>Loop Characteristics</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNActivityImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BPMNActivityImpl extends FlowNodeImpl implements BPMNActivity {
	/**
	 * The default value of the '{@link #isForCompensation() <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForCompensation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FOR_COMPENSATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isForCompensation() <em>Is For Compensation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isForCompensation()
	 * @generated
	 * @ordered
	 */
	protected boolean isForCompensation = IS_FOR_COMPENSATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int START_QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getStartQuantity() <em>Start Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartQuantity()
	 * @generated
	 * @ordered
	 */
	protected int startQuantity = START_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETION_QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getCompletionQuantity() <em>Completion Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionQuantity()
	 * @generated
	 * @ordered
	 */
	protected int completionQuantity = COMPLETION_QUANTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Action() <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Action()
	 * @generated
	 * @ordered
	 */
	protected Action base_Action;

	/**
	 * The cached value of the '{@link #getActivityClass() <em>Activity Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivityClass()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class activityClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNActivity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isForCompensation() {
		return isForCompensation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsForCompensation(boolean newIsForCompensation) {
		boolean oldIsForCompensation = isForCompensation;
		isForCompensation = newIsForCompensation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_ACTIVITY__IS_FOR_COMPENSATION, oldIsForCompensation, isForCompensation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStartQuantity() {
		return startQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartQuantity(int newStartQuantity) {
		int oldStartQuantity = startQuantity;
		startQuantity = newStartQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_ACTIVITY__START_QUANTITY, oldStartQuantity, startQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompletionQuantity() {
		return completionQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionQuantity(int newCompletionQuantity) {
		int oldCompletionQuantity = completionQuantity;
		completionQuantity = newCompletionQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_ACTIVITY__COMPLETION_QUANTITY, oldCompletionQuantity, completionQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getBase_Action() {
		if (base_Action != null && base_Action.eIsProxy()) {
			InternalEObject oldBase_Action = (InternalEObject)base_Action;
			base_Action = (Action)eResolveProxy(oldBase_Action);
			if (base_Action != oldBase_Action) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_ACTIVITY__BASE_ACTION, oldBase_Action, base_Action));
			}
		}
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetBase_Action() {
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Action(Action newBase_Action) {
		Action oldBase_Action = base_Action;
		base_Action = newBase_Action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_ACTIVITY__BASE_ACTION, oldBase_Action, base_Action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getActivityClass() {
		if (activityClass != null && activityClass.eIsProxy()) {
			InternalEObject oldActivityClass = (InternalEObject)activityClass;
			activityClass = (org.eclipse.uml2.uml.Class)eResolveProxy(oldActivityClass);
			if (activityClass != oldActivityClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_ACTIVITY__ACTIVITY_CLASS, oldActivityClass, activityClass));
			}
		}
		return activityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetActivityClass() {
		return activityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityClass(org.eclipse.uml2.uml.Class newActivityClass) {
		org.eclipse.uml2.uml.Class oldActivityClass = activityClass;
		activityClass = newActivityClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_ACTIVITY__ACTIVITY_CLASS, oldActivityClass, activityClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPMNProperty> getProperties() {
		// TODO: implement this method to return the 'Properties' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow getDefault() {
		SequenceFlow default_ = basicGetDefault();
		return default_ != null && default_.eIsProxy() ? (SequenceFlow)eResolveProxy((InternalEObject)default_) : default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequenceFlow basicGetDefault() {
		// TODO: implement this method to return the 'Default' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(SequenceFlow newDefault) {
		// TODO: implement this method to set the 'Default' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundaryEvent> getBoundaryEventRefs() {
		// TODO: implement this method to return the 'Boundary Event Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInputAssociation> getDataInputAssociations() {
		// TODO: implement this method to return the 'Data Input Associations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutputAssociation> getDataOutputAssociations() {
		// TODO: implement this method to return the 'Data Output Associations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCharacteristics getLoopCharacteristics() {
		LoopCharacteristics loopCharacteristics = basicGetLoopCharacteristics();
		return loopCharacteristics != null && loopCharacteristics.eIsProxy() ? (LoopCharacteristics)eResolveProxy((InternalEObject)loopCharacteristics) : loopCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopCharacteristics basicGetLoopCharacteristics() {
		// TODO: implement this method to return the 'Loop Characteristics' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCharacteristics(LoopCharacteristics newLoopCharacteristics) {
		// TODO: implement this method to set the 'Loop Characteristics' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRole> getResources() {
		// TODO: implement this method to return the 'Resources' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BPMNActivityresources(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_ACTIVITY__BPMN_ACTIVITYRESOURCES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNActivityresources", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BPMNActivitycontainer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_ACTIVITY__BPMN_ACTIVITYCONTAINER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNActivitycontainer", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BPMNActivityproperties(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_ACTIVITY__BPMN_ACTIVITYPROPERTIES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNActivityproperties", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BPMNActivitydefault(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_ACTIVITY__BPMN_ACTIVITYDEFAULT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNActivitydefault", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BPMNActivityboundaryEventsRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_ACTIVITY__BPMN_ACTIVITYBOUNDARY_EVENTS_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNActivityboundaryEventsRefs", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean BPMNActivityloopCharacteristics(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_ACTIVITY__BPMN_ACTIVITYLOOP_CHARACTERISTICS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNActivityloopCharacteristics", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_ACTIVITY__IS_FOR_COMPENSATION:
				return isForCompensation();
			case BpmnprofPackage.BPMN_ACTIVITY__START_QUANTITY:
				return getStartQuantity();
			case BpmnprofPackage.BPMN_ACTIVITY__COMPLETION_QUANTITY:
				return getCompletionQuantity();
			case BpmnprofPackage.BPMN_ACTIVITY__BASE_ACTION:
				if (resolve) return getBase_Action();
				return basicGetBase_Action();
			case BpmnprofPackage.BPMN_ACTIVITY__ACTIVITY_CLASS:
				if (resolve) return getActivityClass();
				return basicGetActivityClass();
			case BpmnprofPackage.BPMN_ACTIVITY__PROPERTIES:
				return getProperties();
			case BpmnprofPackage.BPMN_ACTIVITY__DEFAULT:
				if (resolve) return getDefault();
				return basicGetDefault();
			case BpmnprofPackage.BPMN_ACTIVITY__BOUNDARY_EVENT_REFS:
				return getBoundaryEventRefs();
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_INPUT_ASSOCIATIONS:
				return getDataInputAssociations();
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
				return getDataOutputAssociations();
			case BpmnprofPackage.BPMN_ACTIVITY__LOOP_CHARACTERISTICS:
				if (resolve) return getLoopCharacteristics();
				return basicGetLoopCharacteristics();
			case BpmnprofPackage.BPMN_ACTIVITY__RESOURCES:
				return getResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_ACTIVITY__IS_FOR_COMPENSATION:
				setIsForCompensation((Boolean)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__START_QUANTITY:
				setStartQuantity((Integer)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__COMPLETION_QUANTITY:
				setCompletionQuantity((Integer)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__BASE_ACTION:
				setBase_Action((Action)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__ACTIVITY_CLASS:
				setActivityClass((org.eclipse.uml2.uml.Class)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends BPMNProperty>)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__DEFAULT:
				setDefault((SequenceFlow)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__BOUNDARY_EVENT_REFS:
				getBoundaryEventRefs().clear();
				getBoundaryEventRefs().addAll((Collection<? extends BoundaryEvent>)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_INPUT_ASSOCIATIONS:
				getDataInputAssociations().clear();
				getDataInputAssociations().addAll((Collection<? extends DataInputAssociation>)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
				getDataOutputAssociations().clear();
				getDataOutputAssociations().addAll((Collection<? extends DataOutputAssociation>)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((LoopCharacteristics)newValue);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceRole>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_ACTIVITY__IS_FOR_COMPENSATION:
				setIsForCompensation(IS_FOR_COMPENSATION_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__START_QUANTITY:
				setStartQuantity(START_QUANTITY_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__COMPLETION_QUANTITY:
				setCompletionQuantity(COMPLETION_QUANTITY_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__BASE_ACTION:
				setBase_Action((Action)null);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__ACTIVITY_CLASS:
				setActivityClass((org.eclipse.uml2.uml.Class)null);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__PROPERTIES:
				getProperties().clear();
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__DEFAULT:
				setDefault((SequenceFlow)null);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__BOUNDARY_EVENT_REFS:
				getBoundaryEventRefs().clear();
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_INPUT_ASSOCIATIONS:
				getDataInputAssociations().clear();
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
				getDataOutputAssociations().clear();
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__LOOP_CHARACTERISTICS:
				setLoopCharacteristics((LoopCharacteristics)null);
				return;
			case BpmnprofPackage.BPMN_ACTIVITY__RESOURCES:
				getResources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_ACTIVITY__IS_FOR_COMPENSATION:
				return isForCompensation != IS_FOR_COMPENSATION_EDEFAULT;
			case BpmnprofPackage.BPMN_ACTIVITY__START_QUANTITY:
				return startQuantity != START_QUANTITY_EDEFAULT;
			case BpmnprofPackage.BPMN_ACTIVITY__COMPLETION_QUANTITY:
				return completionQuantity != COMPLETION_QUANTITY_EDEFAULT;
			case BpmnprofPackage.BPMN_ACTIVITY__BASE_ACTION:
				return base_Action != null;
			case BpmnprofPackage.BPMN_ACTIVITY__ACTIVITY_CLASS:
				return activityClass != null;
			case BpmnprofPackage.BPMN_ACTIVITY__PROPERTIES:
				return !getProperties().isEmpty();
			case BpmnprofPackage.BPMN_ACTIVITY__DEFAULT:
				return basicGetDefault() != null;
			case BpmnprofPackage.BPMN_ACTIVITY__BOUNDARY_EVENT_REFS:
				return !getBoundaryEventRefs().isEmpty();
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_INPUT_ASSOCIATIONS:
				return !getDataInputAssociations().isEmpty();
			case BpmnprofPackage.BPMN_ACTIVITY__DATA_OUTPUT_ASSOCIATIONS:
				return !getDataOutputAssociations().isEmpty();
			case BpmnprofPackage.BPMN_ACTIVITY__LOOP_CHARACTERISTICS:
				return basicGetLoopCharacteristics() != null;
			case BpmnprofPackage.BPMN_ACTIVITY__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BpmnprofPackage.BPMN_ACTIVITY___BPMN_ACTIVITYRESOURCES__DIAGNOSTICCHAIN_MAP:
				return BPMNActivityresources((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_ACTIVITY___BPMN_ACTIVITYCONTAINER__DIAGNOSTICCHAIN_MAP:
				return BPMNActivitycontainer((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_ACTIVITY___BPMN_ACTIVITYPROPERTIES__DIAGNOSTICCHAIN_MAP:
				return BPMNActivityproperties((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_ACTIVITY___BPMN_ACTIVITYDEFAULT__DIAGNOSTICCHAIN_MAP:
				return BPMNActivitydefault((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_ACTIVITY___BPMN_ACTIVITYBOUNDARY_EVENTS_REFS__DIAGNOSTICCHAIN_MAP:
				return BPMNActivityboundaryEventsRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_ACTIVITY___BPMN_ACTIVITYLOOP_CHARACTERISTICS__DIAGNOSTICCHAIN_MAP:
				return BPMNActivityloopCharacteristics((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isForCompensation: ");
		result.append(isForCompensation);
		result.append(", startQuantity: ");
		result.append(startQuantity);
		result.append(", completionQuantity: ");
		result.append(completionQuantity);
		result.append(')');
		return result.toString();
	}

} //BPMNActivityImpl
