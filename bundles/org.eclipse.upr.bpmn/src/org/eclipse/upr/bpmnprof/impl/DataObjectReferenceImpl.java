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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.TypedElement;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.DataObject;
import org.eclipse.upr.bpmnprof.DataObjectReference;
import org.eclipse.upr.bpmnprof.DataState;
import org.eclipse.upr.bpmnprof.ItemAwareElement;
import org.eclipse.upr.bpmnprof.ItemDefinition;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataObjectReferenceImpl#getDataState <em>Data State</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataObjectReferenceImpl#getBase_TypedElement <em>Base Typed Element</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataObjectReferenceImpl#getItemSubjectRef <em>Item Subject Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataObjectReferenceImpl#getDataObjectRef <em>Data Object Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.DataObjectReferenceImpl#getBase_DataStoreNode <em>Base Data Store Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataObjectReferenceImpl extends FlowElementImpl implements DataObjectReference {
	/**
	 * The cached value of the '{@link #getDataState() <em>Data State</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataState()
	 * @generated
	 * @ordered
	 */
	protected EList<DataState> dataState;

	/**
	 * The cached value of the '{@link #getBase_TypedElement() <em>Base Typed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_TypedElement()
	 * @generated
	 * @ordered
	 */
	protected TypedElement base_TypedElement;

	/**
	 * The cached value of the '{@link #getDataObjectRef() <em>Data Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataObjectRef()
	 * @generated
	 * @ordered
	 */
	protected DataObject dataObjectRef;

	/**
	 * The cached value of the '{@link #getBase_DataStoreNode() <em>Base Data Store Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataStoreNode()
	 * @generated
	 * @ordered
	 */
	protected DataStoreNode base_DataStoreNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataObjectReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getDataObjectReference();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataState> getDataState() {
		if (dataState == null) {
			dataState = new EObjectResolvingEList<DataState>(DataState.class, this, BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE);
		}
		return dataState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement getBase_TypedElement() {
		if (base_TypedElement != null && base_TypedElement.eIsProxy()) {
			InternalEObject oldBase_TypedElement = (InternalEObject)base_TypedElement;
			base_TypedElement = (TypedElement)eResolveProxy(oldBase_TypedElement);
			if (base_TypedElement != oldBase_TypedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT, oldBase_TypedElement, base_TypedElement));
			}
		}
		return base_TypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypedElement basicGetBase_TypedElement() {
		return base_TypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_TypedElement(TypedElement newBase_TypedElement) {
		TypedElement oldBase_TypedElement = base_TypedElement;
		base_TypedElement = newBase_TypedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT, oldBase_TypedElement, base_TypedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition getItemSubjectRef() {
		ItemDefinition itemSubjectRef = basicGetItemSubjectRef();
		return itemSubjectRef != null && itemSubjectRef.eIsProxy() ? (ItemDefinition)eResolveProxy((InternalEObject)itemSubjectRef) : itemSubjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemDefinition basicGetItemSubjectRef() {
		// TODO: implement this method to return the 'Item Subject Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemSubjectRef(ItemDefinition newItemSubjectRef) {
		// TODO: implement this method to set the 'Item Subject Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject getDataObjectRef() {
		if (dataObjectRef != null && dataObjectRef.eIsProxy()) {
			InternalEObject oldDataObjectRef = (InternalEObject)dataObjectRef;
			dataObjectRef = (DataObject)eResolveProxy(oldDataObjectRef);
			if (dataObjectRef != oldDataObjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, oldDataObjectRef, dataObjectRef));
			}
		}
		return dataObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataObject basicGetDataObjectRef() {
		return dataObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataObjectRef(DataObject newDataObjectRef) {
		DataObject oldDataObjectRef = dataObjectRef;
		dataObjectRef = newDataObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF, oldDataObjectRef, dataObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode getBase_DataStoreNode() {
		if (base_DataStoreNode != null && base_DataStoreNode.eIsProxy()) {
			InternalEObject oldBase_DataStoreNode = (InternalEObject)base_DataStoreNode;
			base_DataStoreNode = (DataStoreNode)eResolveProxy(oldBase_DataStoreNode);
			if (base_DataStoreNode != oldBase_DataStoreNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_DATA_STORE_NODE, oldBase_DataStoreNode, base_DataStoreNode));
			}
		}
		return base_DataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode basicGetBase_DataStoreNode() {
		return base_DataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataStoreNode(DataStoreNode newBase_DataStoreNode) {
		DataStoreNode oldBase_DataStoreNode = base_DataStoreNode;
		base_DataStoreNode = newBase_DataStoreNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_DATA_STORE_NODE, oldBase_DataStoreNode, base_DataStoreNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ItemAwareElementdataState(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.ITEM_AWARE_ELEMENT__ITEM_AWARE_ELEMENTDATA_STATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ItemAwareElementdataState", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean DataObjectRefsourcetarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.DATA_OBJECT_REFERENCE__DATA_OBJECT_REFSOURCETARGET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataObjectRefsourcetarget", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean DataObjectRefdataState(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.DATA_OBJECT_REFERENCE__DATA_OBJECT_REFDATA_STATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DataObjectRefdataState", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE:
				return getDataState();
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT:
				if (resolve) return getBase_TypedElement();
				return basicGetBase_TypedElement();
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
				if (resolve) return getItemSubjectRef();
				return basicGetItemSubjectRef();
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
				if (resolve) return getDataObjectRef();
				return basicGetDataObjectRef();
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_DATA_STORE_NODE:
				if (resolve) return getBase_DataStoreNode();
				return basicGetBase_DataStoreNode();
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
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE:
				getDataState().clear();
				getDataState().addAll((Collection<? extends DataState>)newValue);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT:
				setBase_TypedElement((TypedElement)newValue);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
				setItemSubjectRef((ItemDefinition)newValue);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
				setDataObjectRef((DataObject)newValue);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_DATA_STORE_NODE:
				setBase_DataStoreNode((DataStoreNode)newValue);
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
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE:
				getDataState().clear();
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT:
				setBase_TypedElement((TypedElement)null);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
				setItemSubjectRef((ItemDefinition)null);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
				setDataObjectRef((DataObject)null);
				return;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_DATA_STORE_NODE:
				setBase_DataStoreNode((DataStoreNode)null);
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
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE:
				return dataState != null && !dataState.isEmpty();
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT:
				return base_TypedElement != null;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF:
				return basicGetItemSubjectRef() != null;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_OBJECT_REF:
				return dataObjectRef != null;
			case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_DATA_STORE_NODE:
				return base_DataStoreNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ItemAwareElement.class) {
			switch (derivedFeatureID) {
				case BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE: return BpmnprofPackage.ITEM_AWARE_ELEMENT__DATA_STATE;
				case BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT: return BpmnprofPackage.ITEM_AWARE_ELEMENT__BASE_TYPED_ELEMENT;
				case BpmnprofPackage.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF: return BpmnprofPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ItemAwareElement.class) {
			switch (baseFeatureID) {
				case BpmnprofPackage.ITEM_AWARE_ELEMENT__DATA_STATE: return BpmnprofPackage.DATA_OBJECT_REFERENCE__DATA_STATE;
				case BpmnprofPackage.ITEM_AWARE_ELEMENT__BASE_TYPED_ELEMENT: return BpmnprofPackage.DATA_OBJECT_REFERENCE__BASE_TYPED_ELEMENT;
				case BpmnprofPackage.ITEM_AWARE_ELEMENT__ITEM_SUBJECT_REF: return BpmnprofPackage.DATA_OBJECT_REFERENCE__ITEM_SUBJECT_REF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ItemAwareElement.class) {
			switch (baseOperationID) {
				case BpmnprofPackage.ITEM_AWARE_ELEMENT___ITEM_AWARE_ELEMENTDATA_STATE__DIAGNOSTICCHAIN_MAP: return BpmnprofPackage.DATA_OBJECT_REFERENCE___ITEM_AWARE_ELEMENTDATA_STATE__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case BpmnprofPackage.DATA_OBJECT_REFERENCE___ITEM_AWARE_ELEMENTDATA_STATE__DIAGNOSTICCHAIN_MAP:
				return ItemAwareElementdataState((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.DATA_OBJECT_REFERENCE___DATA_OBJECT_REFSOURCETARGET__DIAGNOSTICCHAIN_MAP:
				return DataObjectRefsourcetarget((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.DATA_OBJECT_REFERENCE___DATA_OBJECT_REFDATA_STATE__DIAGNOSTICCHAIN_MAP:
				return DataObjectRefdataState((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DataObjectReferenceImpl
