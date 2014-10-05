/**
 */
package org.eclipse.upr.bpmnprof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Behavior;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.DataInput;
import org.eclipse.upr.bpmnprof.DataOutput;
import org.eclipse.upr.bpmnprof.InputOutputSpecification;
import org.eclipse.upr.bpmnprof.InputSet;
import org.eclipse.upr.bpmnprof.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputSpecificationImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputSpecificationImpl#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputSpecificationImpl#getDataInputs <em>Data Inputs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputSpecificationImpl#getDataOutputs <em>Data Outputs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputSpecificationImpl#getInputSets <em>Input Sets</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputSpecificationImpl#getOutputSets <em>Output Sets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputSpecificationImpl extends BaseElementImpl implements InputOutputSpecification {
	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getInputOutputSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_ACTION, oldBase_Action, base_Action));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_ACTION, oldBase_Action, base_Action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInput> getDataInputs() {
		// TODO: implement this method to return the 'Data Inputs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataOutput> getDataOutputs() {
		// TODO: implement this method to return the 'Data Outputs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputSet> getInputSets() {
		// TODO: implement this method to return the 'Input Sets' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputSet> getOutputSets() {
		// TODO: implement this method to return the 'Output Sets' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_ACTION:
				if (resolve) return getBase_Action();
				return basicGetBase_Action();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
				return getDataInputs();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
				return getDataOutputs();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
				return getInputSets();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
				return getOutputSets();
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
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_ACTION:
				setBase_Action((Action)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
				getDataInputs().clear();
				getDataInputs().addAll((Collection<? extends DataInput>)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
				getDataOutputs().clear();
				getDataOutputs().addAll((Collection<? extends DataOutput>)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
				getInputSets().clear();
				getInputSets().addAll((Collection<? extends InputSet>)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
				getOutputSets().clear();
				getOutputSets().addAll((Collection<? extends OutputSet>)newValue);
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
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_ACTION:
				setBase_Action((Action)null);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
				getDataInputs().clear();
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
				getDataOutputs().clear();
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
				getInputSets().clear();
				return;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
				getOutputSets().clear();
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
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_BEHAVIOR:
				return base_Behavior != null;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__BASE_ACTION:
				return base_Action != null;
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_INPUTS:
				return !getDataInputs().isEmpty();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__DATA_OUTPUTS:
				return !getDataOutputs().isEmpty();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__INPUT_SETS:
				return !getInputSets().isEmpty();
			case BpmnprofPackage.INPUT_OUTPUT_SPECIFICATION__OUTPUT_SETS:
				return !getOutputSets().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //InputOutputSpecificationImpl
