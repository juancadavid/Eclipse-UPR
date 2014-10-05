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

import org.eclipse.uml2.uml.ExpansionRegion;

import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ComplexBehaviorDefinition;
import org.eclipse.upr.bpmnprof.DataInput;
import org.eclipse.upr.bpmnprof.DataOutput;
import org.eclipse.upr.bpmnprof.EventDefinition;
import org.eclipse.upr.bpmnprof.ItemAwareElement;
import org.eclipse.upr.bpmnprof.MultiInstanceBehavior;
import org.eclipse.upr.bpmnprof.MultiInstanceLoopCharacteristics;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Instance Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getLoopCardinality <em>Loop Cardinality</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getCompletionCondition <em>Completion Condition</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getBase_ExpansionRegion <em>Base Expansion Region</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#isSequential <em>Is Sequential</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataInputRef <em>Loop Data Input Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getLoopDataOutputRef <em>Loop Data Output Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getOutputDataItem <em>Output Data Item</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getInputDataItem <em>Input Data Item</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getOneBehaviorEventRef <em>One Behavior Event Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getNoneBehaviorEventRef <em>None Behavior Event Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.MultiInstanceLoopCharacteristicsImpl#getComplexBehaviorDefinition <em>Complex Behavior Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiInstanceLoopCharacteristicsImpl extends LoopCharacteristicsImpl implements MultiInstanceLoopCharacteristics {
	/**
	 * The default value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected static final MultiInstanceBehavior BEHAVIOR_EDEFAULT = MultiInstanceBehavior.ALL;

	/**
	 * The cached value of the '{@link #getBehavior() <em>Behavior</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehavior()
	 * @generated
	 * @ordered
	 */
	protected MultiInstanceBehavior behavior = BEHAVIOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopCardinality() <em>Loop Cardinality</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopCardinality()
	 * @generated
	 * @ordered
	 */
	protected BPMNExpression loopCardinality;

	/**
	 * The cached value of the '{@link #getCompletionCondition() <em>Completion Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompletionCondition()
	 * @generated
	 * @ordered
	 */
	protected BPMNExpression completionCondition;

	/**
	 * The cached value of the '{@link #getBase_ExpansionRegion() <em>Base Expansion Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ExpansionRegion()
	 * @generated
	 * @ordered
	 */
	protected ExpansionRegion base_ExpansionRegion;

	/**
	 * The default value of the '{@link #isSequential() <em>Is Sequential</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSequential()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_SEQUENTIAL_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiInstanceLoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getMultiInstanceLoopCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInstanceBehavior getBehavior() {
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBehavior(MultiInstanceBehavior newBehavior) {
		MultiInstanceBehavior oldBehavior = behavior;
		behavior = newBehavior == null ? BEHAVIOR_EDEFAULT : newBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR, oldBehavior, behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getLoopCardinality() {
		if (loopCardinality != null && loopCardinality.eIsProxy()) {
			InternalEObject oldLoopCardinality = (InternalEObject)loopCardinality;
			loopCardinality = (BPMNExpression)eResolveProxy(oldLoopCardinality);
			if (loopCardinality != oldLoopCardinality) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, oldLoopCardinality, loopCardinality));
			}
		}
		return loopCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetLoopCardinality() {
		return loopCardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopCardinality(BPMNExpression newLoopCardinality) {
		BPMNExpression oldLoopCardinality = loopCardinality;
		loopCardinality = newLoopCardinality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY, oldLoopCardinality, loopCardinality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getCompletionCondition() {
		if (completionCondition != null && completionCondition.eIsProxy()) {
			InternalEObject oldCompletionCondition = (InternalEObject)completionCondition;
			completionCondition = (BPMNExpression)eResolveProxy(oldCompletionCondition);
			if (completionCondition != oldCompletionCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, oldCompletionCondition, completionCondition));
			}
		}
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetCompletionCondition() {
		return completionCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompletionCondition(BPMNExpression newCompletionCondition) {
		BPMNExpression oldCompletionCondition = completionCondition;
		completionCondition = newCompletionCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION, oldCompletionCondition, completionCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion getBase_ExpansionRegion() {
		if (base_ExpansionRegion != null && base_ExpansionRegion.eIsProxy()) {
			InternalEObject oldBase_ExpansionRegion = (InternalEObject)base_ExpansionRegion;
			base_ExpansionRegion = (ExpansionRegion)eResolveProxy(oldBase_ExpansionRegion);
			if (base_ExpansionRegion != oldBase_ExpansionRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BASE_EXPANSION_REGION, oldBase_ExpansionRegion, base_ExpansionRegion));
			}
		}
		return base_ExpansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionRegion basicGetBase_ExpansionRegion() {
		return base_ExpansionRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ExpansionRegion(ExpansionRegion newBase_ExpansionRegion) {
		ExpansionRegion oldBase_ExpansionRegion = base_ExpansionRegion;
		base_ExpansionRegion = newBase_ExpansionRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BASE_EXPANSION_REGION, oldBase_ExpansionRegion, base_ExpansionRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSequential() {
		// TODO: implement this method to return the 'Is Sequential' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSequential(boolean newIsSequential) {
		// TODO: implement this method to set the 'Is Sequential' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getLoopDataInputRef() {
		ItemAwareElement loopDataInputRef = basicGetLoopDataInputRef();
		return loopDataInputRef != null && loopDataInputRef.eIsProxy() ? (ItemAwareElement)eResolveProxy((InternalEObject)loopDataInputRef) : loopDataInputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement basicGetLoopDataInputRef() {
		// TODO: implement this method to return the 'Loop Data Input Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDataInputRef(ItemAwareElement newLoopDataInputRef) {
		// TODO: implement this method to set the 'Loop Data Input Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement getLoopDataOutputRef() {
		ItemAwareElement loopDataOutputRef = basicGetLoopDataOutputRef();
		return loopDataOutputRef != null && loopDataOutputRef.eIsProxy() ? (ItemAwareElement)eResolveProxy((InternalEObject)loopDataOutputRef) : loopDataOutputRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemAwareElement basicGetLoopDataOutputRef() {
		// TODO: implement this method to return the 'Loop Data Output Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopDataOutputRef(ItemAwareElement newLoopDataOutputRef) {
		// TODO: implement this method to set the 'Loop Data Output Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput getOutputDataItem() {
		DataOutput outputDataItem = basicGetOutputDataItem();
		return outputDataItem != null && outputDataItem.eIsProxy() ? (DataOutput)eResolveProxy((InternalEObject)outputDataItem) : outputDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput basicGetOutputDataItem() {
		// TODO: implement this method to return the 'Output Data Item' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataItem(DataOutput newOutputDataItem) {
		// TODO: implement this method to set the 'Output Data Item' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput getInputDataItem() {
		DataInput inputDataItem = basicGetInputDataItem();
		return inputDataItem != null && inputDataItem.eIsProxy() ? (DataInput)eResolveProxy((InternalEObject)inputDataItem) : inputDataItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput basicGetInputDataItem() {
		// TODO: implement this method to return the 'Input Data Item' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataItem(DataInput newInputDataItem) {
		// TODO: implement this method to set the 'Input Data Item' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getOneBehaviorEventRef() {
		EventDefinition oneBehaviorEventRef = basicGetOneBehaviorEventRef();
		return oneBehaviorEventRef != null && oneBehaviorEventRef.eIsProxy() ? (EventDefinition)eResolveProxy((InternalEObject)oneBehaviorEventRef) : oneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition basicGetOneBehaviorEventRef() {
		// TODO: implement this method to return the 'One Behavior Event Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOneBehaviorEventRef(EventDefinition newOneBehaviorEventRef) {
		// TODO: implement this method to set the 'One Behavior Event Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition getNoneBehaviorEventRef() {
		EventDefinition noneBehaviorEventRef = basicGetNoneBehaviorEventRef();
		return noneBehaviorEventRef != null && noneBehaviorEventRef.eIsProxy() ? (EventDefinition)eResolveProxy((InternalEObject)noneBehaviorEventRef) : noneBehaviorEventRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventDefinition basicGetNoneBehaviorEventRef() {
		// TODO: implement this method to return the 'None Behavior Event Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoneBehaviorEventRef(EventDefinition newNoneBehaviorEventRef) {
		// TODO: implement this method to set the 'None Behavior Event Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplexBehaviorDefinition> getComplexBehaviorDefinition() {
		// TODO: implement this method to return the 'Complex Behavior Definition' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MultiinstanceLoopCharacteristicstarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.MULTI_INSTANCE_LOOP_CHARACTERISTICS__MULTIINSTANCE_LOOP_CHARACTERISTICSTARGET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MultiinstanceLoopCharacteristicstarget", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				return getBehavior();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				if (resolve) return getLoopCardinality();
				return basicGetLoopCardinality();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				if (resolve) return getCompletionCondition();
				return basicGetCompletionCondition();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BASE_EXPANSION_REGION:
				if (resolve) return getBase_ExpansionRegion();
				return basicGetBase_ExpansionRegion();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				return isSequential();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				if (resolve) return getLoopDataInputRef();
				return basicGetLoopDataInputRef();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				if (resolve) return getLoopDataOutputRef();
				return basicGetLoopDataOutputRef();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				if (resolve) return getOutputDataItem();
				return basicGetOutputDataItem();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				if (resolve) return getInputDataItem();
				return basicGetInputDataItem();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				if (resolve) return getOneBehaviorEventRef();
				return basicGetOneBehaviorEventRef();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				if (resolve) return getNoneBehaviorEventRef();
				return basicGetNoneBehaviorEventRef();
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return getComplexBehaviorDefinition();
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
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				setBehavior((MultiInstanceBehavior)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				setLoopCardinality((BPMNExpression)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				setCompletionCondition((BPMNExpression)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BASE_EXPANSION_REGION:
				setBase_ExpansionRegion((ExpansionRegion)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				setIsSequential((Boolean)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				setLoopDataInputRef((ItemAwareElement)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				setLoopDataOutputRef((ItemAwareElement)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				setOutputDataItem((DataOutput)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				setInputDataItem((DataInput)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				setOneBehaviorEventRef((EventDefinition)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				setNoneBehaviorEventRef((EventDefinition)newValue);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				getComplexBehaviorDefinition().clear();
				getComplexBehaviorDefinition().addAll((Collection<? extends ComplexBehaviorDefinition>)newValue);
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
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				setBehavior(BEHAVIOR_EDEFAULT);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				setLoopCardinality((BPMNExpression)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				setCompletionCondition((BPMNExpression)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BASE_EXPANSION_REGION:
				setBase_ExpansionRegion((ExpansionRegion)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				setIsSequential(IS_SEQUENTIAL_EDEFAULT);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				setLoopDataInputRef((ItemAwareElement)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				setLoopDataOutputRef((ItemAwareElement)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				setOutputDataItem((DataOutput)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				setInputDataItem((DataInput)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				setOneBehaviorEventRef((EventDefinition)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				setNoneBehaviorEventRef((EventDefinition)null);
				return;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				getComplexBehaviorDefinition().clear();
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
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BEHAVIOR:
				return behavior != BEHAVIOR_EDEFAULT;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_CARDINALITY:
				return loopCardinality != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLETION_CONDITION:
				return completionCondition != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__BASE_EXPANSION_REGION:
				return base_ExpansionRegion != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__IS_SEQUENTIAL:
				return isSequential() != IS_SEQUENTIAL_EDEFAULT;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_INPUT_REF:
				return basicGetLoopDataInputRef() != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__LOOP_DATA_OUTPUT_REF:
				return basicGetLoopDataOutputRef() != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__OUTPUT_DATA_ITEM:
				return basicGetOutputDataItem() != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__INPUT_DATA_ITEM:
				return basicGetInputDataItem() != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__ONE_BEHAVIOR_EVENT_REF:
				return basicGetOneBehaviorEventRef() != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__NONE_BEHAVIOR_EVENT_REF:
				return basicGetNoneBehaviorEventRef() != null;
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS__COMPLEX_BEHAVIOR_DEFINITION:
				return !getComplexBehaviorDefinition().isEmpty();
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
			case BpmnprofPackage.MULTI_INSTANCE_LOOP_CHARACTERISTICS___MULTIINSTANCE_LOOP_CHARACTERISTICSTARGET__DIAGNOSTICCHAIN_MAP:
				return MultiinstanceLoopCharacteristicstarget((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (behavior: ");
		result.append(behavior);
		result.append(')');
		return result.toString();
	}

} //MultiInstanceLoopCharacteristicsImpl
