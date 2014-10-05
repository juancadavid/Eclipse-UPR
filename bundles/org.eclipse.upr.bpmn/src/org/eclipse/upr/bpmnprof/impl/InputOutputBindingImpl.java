/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Dependency;

import org.eclipse.upr.bpmnprof.BPMNOperation;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.InputOutputBinding;
import org.eclipse.upr.bpmnprof.InputSet;
import org.eclipse.upr.bpmnprof.OutputSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Output Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputBindingImpl#getInputDataRef <em>Input Data Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputBindingImpl#getOutputDataRef <em>Output Data Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputBindingImpl#getOperationRef <em>Operation Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputOutputBindingImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputOutputBindingImpl extends BaseElementImpl implements InputOutputBinding {
	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputOutputBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getInputOutputBinding();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet getInputDataRef() {
		InputSet inputDataRef = basicGetInputDataRef();
		return inputDataRef != null && inputDataRef.eIsProxy() ? (InputSet)eResolveProxy((InternalEObject)inputDataRef) : inputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputSet basicGetInputDataRef() {
		// TODO: implement this method to return the 'Input Data Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputDataRef(InputSet newInputDataRef) {
		// TODO: implement this method to set the 'Input Data Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet getOutputDataRef() {
		OutputSet outputDataRef = basicGetOutputDataRef();
		return outputDataRef != null && outputDataRef.eIsProxy() ? (OutputSet)eResolveProxy((InternalEObject)outputDataRef) : outputDataRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputSet basicGetOutputDataRef() {
		// TODO: implement this method to return the 'Output Data Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputDataRef(OutputSet newOutputDataRef) {
		// TODO: implement this method to set the 'Output Data Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNOperation getOperationRef() {
		BPMNOperation operationRef = basicGetOperationRef();
		return operationRef != null && operationRef.eIsProxy() ? (BPMNOperation)eResolveProxy((InternalEObject)operationRef) : operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNOperation basicGetOperationRef() {
		// TODO: implement this method to return the 'Operation Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(BPMNOperation newOperationRef) {
		// TODO: implement this method to set the 'Operation Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject)base_Dependency;
			base_Dependency = (Dependency)eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.INPUT_OUTPUT_BINDING__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.INPUT_OUTPUT_BINDING__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				if (resolve) return getInputDataRef();
				return basicGetInputDataRef();
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				if (resolve) return getOutputDataRef();
				return basicGetOutputDataRef();
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OPERATION_REF:
				if (resolve) return getOperationRef();
				return basicGetOperationRef();
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((InputSet)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((OutputSet)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OPERATION_REF:
				setOperationRef((BPMNOperation)newValue);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
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
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				setInputDataRef((InputSet)null);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				setOutputDataRef((OutputSet)null);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OPERATION_REF:
				setOperationRef((BPMNOperation)null);
				return;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
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
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__INPUT_DATA_REF:
				return basicGetInputDataRef() != null;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OUTPUT_DATA_REF:
				return basicGetOutputDataRef() != null;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__OPERATION_REF:
				return basicGetOperationRef() != null;
			case BpmnprofPackage.INPUT_OUTPUT_BINDING__BASE_DEPENDENCY:
				return base_Dependency != null;
		}
		return super.eIsSet(featureID);
	}

} //InputOutputBindingImpl
