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
package org.eclipse.upr.bpmnprof.impl;

import java.lang.reflect.InvocationTargetException;

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

import org.eclipse.uml2.uml.Element;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.Import;
import org.eclipse.upr.bpmnprof.ItemDefinition;
import org.eclipse.upr.bpmnprof.ItemKind;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ItemDefinitionImpl#getItemKind <em>Item Kind</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ItemDefinitionImpl#isCollection <em>Is Collection</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ItemDefinitionImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ItemDefinitionImpl#getStructureRef <em>Structure Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ItemDefinitionImpl#getImport <em>Import</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemDefinitionImpl extends RootElementImpl implements ItemDefinition {
	/**
	 * The default value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemKind()
	 * @generated
	 * @ordered
	 */
	protected static final ItemKind ITEM_KIND_EDEFAULT = ItemKind.INFORMATION;

	/**
	 * The cached value of the '{@link #getItemKind() <em>Item Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemKind()
	 * @generated
	 * @ordered
	 */
	protected ItemKind itemKind = ITEM_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #isCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COLLECTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCollection() <em>Is Collection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCollection()
	 * @generated
	 * @ordered
	 */
	protected boolean isCollection = IS_COLLECTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getStructureRef() <em>Structure Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructureRef()
	 * @generated
	 * @ordered
	 */
	protected Element structureRef;

	/**
	 * The cached value of the '{@link #getImport() <em>Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected Import import_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getItemDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemKind getItemKind() {
		return itemKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItemKind(ItemKind newItemKind) {
		ItemKind oldItemKind = itemKind;
		itemKind = newItemKind == null ? ITEM_KIND_EDEFAULT : newItemKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ITEM_DEFINITION__ITEM_KIND, oldItemKind, itemKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCollection() {
		return isCollection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCollection(boolean newIsCollection) {
		boolean oldIsCollection = isCollection;
		isCollection = newIsCollection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ITEM_DEFINITION__IS_COLLECTION, oldIsCollection, isCollection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.ITEM_DEFINITION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ITEM_DEFINITION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getStructureRef() {
		if (structureRef != null && structureRef.eIsProxy()) {
			InternalEObject oldStructureRef = (InternalEObject)structureRef;
			structureRef = (Element)eResolveProxy(oldStructureRef);
			if (structureRef != oldStructureRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef));
			}
		}
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetStructureRef() {
		return structureRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStructureRef(Element newStructureRef) {
		Element oldStructureRef = structureRef;
		structureRef = newStructureRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ITEM_DEFINITION__STRUCTURE_REF, oldStructureRef, structureRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import getImport() {
		if (import_ != null && import_.eIsProxy()) {
			InternalEObject oldImport = (InternalEObject)import_;
			import_ = (Import)eResolveProxy(oldImport);
			if (import_ != oldImport) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.ITEM_DEFINITION__IMPORT, oldImport, import_));
			}
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Import basicGetImport() {
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImport(Import newImport) {
		Import oldImport = import_;
		import_ = newImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ITEM_DEFINITION__IMPORT, oldImport, import_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ItemDefinitionstructureRef(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.ITEM_DEFINITION__ITEM_DEFINITIONSTRUCTURE_REF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ItemDefinitionstructureRef", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.ITEM_DEFINITION__ITEM_KIND:
				return getItemKind();
			case BpmnprofPackage.ITEM_DEFINITION__IS_COLLECTION:
				return isCollection();
			case BpmnprofPackage.ITEM_DEFINITION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case BpmnprofPackage.ITEM_DEFINITION__STRUCTURE_REF:
				if (resolve) return getStructureRef();
				return basicGetStructureRef();
			case BpmnprofPackage.ITEM_DEFINITION__IMPORT:
				if (resolve) return getImport();
				return basicGetImport();
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
			case BpmnprofPackage.ITEM_DEFINITION__ITEM_KIND:
				setItemKind((ItemKind)newValue);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__IS_COLLECTION:
				setIsCollection((Boolean)newValue);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__STRUCTURE_REF:
				setStructureRef((Element)newValue);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__IMPORT:
				setImport((Import)newValue);
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
			case BpmnprofPackage.ITEM_DEFINITION__ITEM_KIND:
				setItemKind(ITEM_KIND_EDEFAULT);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__IS_COLLECTION:
				setIsCollection(IS_COLLECTION_EDEFAULT);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__STRUCTURE_REF:
				setStructureRef((Element)null);
				return;
			case BpmnprofPackage.ITEM_DEFINITION__IMPORT:
				setImport((Import)null);
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
			case BpmnprofPackage.ITEM_DEFINITION__ITEM_KIND:
				return itemKind != ITEM_KIND_EDEFAULT;
			case BpmnprofPackage.ITEM_DEFINITION__IS_COLLECTION:
				return isCollection != IS_COLLECTION_EDEFAULT;
			case BpmnprofPackage.ITEM_DEFINITION__BASE_CLASS:
				return base_Class != null;
			case BpmnprofPackage.ITEM_DEFINITION__STRUCTURE_REF:
				return structureRef != null;
			case BpmnprofPackage.ITEM_DEFINITION__IMPORT:
				return import_ != null;
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
			case BpmnprofPackage.ITEM_DEFINITION___ITEM_DEFINITIONSTRUCTURE_REF__DIAGNOSTICCHAIN_MAP:
				return ItemDefinitionstructureRef((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (itemKind: ");
		result.append(itemKind);
		result.append(", isCollection: ");
		result.append(isCollection);
		result.append(')');
		return result.toString();
	}

} //ItemDefinitionImpl
