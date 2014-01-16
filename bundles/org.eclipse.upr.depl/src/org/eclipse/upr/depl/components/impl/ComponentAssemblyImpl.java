/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 */
package org.eclipse.upr.depl.components.impl;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.examples.domain.elements.DomainType;
import org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator;
import org.eclipse.ocl.examples.domain.types.IdResolver;
import org.eclipse.ocl.examples.domain.values.BagValue;
import org.eclipse.ocl.examples.domain.values.SetValue;
import org.eclipse.ocl.examples.domain.values.impl.InvalidValueException;
import org.eclipse.ocl.examples.domain.values.util.ValuesUtil;
import org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation;
import org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager;
import org.eclipse.upr.depl.components.Component;
import org.eclipse.upr.depl.components.ComponentAssembly;
import org.eclipse.upr.depl.components.ComponentsPackage;
import org.eclipse.upr.depl.components.ComponentsTables;
import org.eclipse.upr.depl.components.Port;
import org.eclipse.upr.depl.components.PortConnector;
import org.eclipse.upr.depl.components.Property;
import org.eclipse.upr.depl.components.PropertyConnector;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Assembly</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl#getContainedComponent <em>Contained Component</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl#getOwnedPropertyConnector <em>Owned Property Connector</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl#getAssemblyProperty <em>Assembly Property</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl#getExternalPort <em>External Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentAssemblyImpl#getOwnedPortConnector <em>Owned Port Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentAssemblyImpl extends ComponentImplementationImpl implements ComponentAssembly {
	/**
	 * The cached value of the '{@link #getContainedComponent() <em>Contained Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> containedComponent;

	/**
	 * The cached value of the '{@link #getOwnedPropertyConnector() <em>Owned Property Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPropertyConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyConnector> ownedPropertyConnector;

	/**
	 * The cached value of the '{@link #getOwnedPortConnector() <em>Owned Port Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<PortConnector> ownedPortConnector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentAssemblyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.COMPONENT_ASSEMBLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getContainedComponent() {
		if (containedComponent == null) {
			containedComponent = new EObjectResolvingEList<Component>(Component.class, this, ComponentsPackage.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT);
		}
		return containedComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyConnector> getOwnedPropertyConnector() {
		if (ownedPropertyConnector == null) {
			ownedPropertyConnector = new EObjectContainmentEList<PropertyConnector>(PropertyConnector.class, this, ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR);
		}
		return ownedPropertyConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getAssemblyProperty() {
		/**
		 * 
		 * Component.allInstances()
		 * ->select(c | c.implementation->includes(self))
		 * .configProperty->flatten()
		 */
		final /*@NonNull*/ /*@NonInvalid*/ ComponentAssembly self = this;
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = new EcoreExecutorManager(this, ComponentsTables.LIBRARY);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_UMLProfileForDC_c_c_components_c_c_Component = idResolver.getType(ComponentsTables.CLSSid_Component_0, null);
		final /*@NonNull*/ /*@Thrown*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, ComponentsTables.SET_CLSSid_Component, TYP_UMLProfileForDC_c_c_components_c_c_Component);
		/*@NonNull*/ /*@NonInvalid*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(ComponentsTables.SET_CLSSid_Component);
		/*@Nullable*/ Iterator<?> ITERATOR_c = allInstances.iterator();
		/*@NonNull*/ /*@Thrown*/ SetValue select;
		while (true) {
		    if (!ITERATOR_c.hasNext()) {
		        select = accumulator;
		        break;
		    }
		    /*@Nullable*/ /*@NonInvalid*/ Component c = (Component)ITERATOR_c.next();
		    /**
		     * c.implementation->includes(self)
		     */
		    if (c == null) {
		        throw new InvalidValueException("Null source");
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<?> implementation = c.getImplementation();
		    final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_implementation = idResolver.createSetOfAll(ComponentsTables.SET_CLSSid_ComponentImplementation, implementation);
		    final /*@NonNull*/ /*@Thrown*/ Boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_implementation, self);
		    //
		    if (includes == ValuesUtil.TRUE_VALUE) {
		        accumulator.add(c);
		    }
		}
		/*@NonNull*/ /*@NonInvalid*/ BagValue.Accumulator accumulator_0 = ValuesUtil.createBagAccumulatorValue(ComponentsTables.BAG_CLSSid_Property);
		/*@Nullable*/ Iterator<?> ITERATOR__1 = select.iterator();
		/*@NonNull*/ /*@Thrown*/ BagValue collect;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        collect = accumulator_0;
		        break;
		    }
		    /*@Nullable*/ /*@NonInvalid*/ Component _1 = (Component)ITERATOR__1.next();
		    /**
		     * configProperty
		     */
		    if (_1 == null) {
		        throw new InvalidValueException("Null source");
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<?> configProperty = _1.getConfigProperty();
		    final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_configProperty = idResolver.createSetOfAll(ComponentsTables.SET_CLSSid_Property, configProperty);
		    //
		    for (Object value : BOXED_configProperty.flatten().getElements()) {
		        accumulator_0.add(value);
		    }
		}
		final /*@NonNull*/ /*@Thrown*/ BagValue flatten = (BagValue)CollectionFlattenOperation.INSTANCE.evaluate(collect);
		final /*@NonNull*/ /*@Thrown*/ List<?> UNBOXED_flatten = flatten.asEcoreObject();
		return (EList<Property>)UNBOXED_flatten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Port> getExternalPort() {
		/**
		 * 
		 * Component.allInstances()
		 * ->select(c | c.implementation->includes(self))
		 * .ownedPort->flatten()
		 */
		final /*@NonNull*/ /*@NonInvalid*/ ComponentAssembly self = this;
		final /*@NonNull*/ /*@NonInvalid*/ DomainEvaluator evaluator = new EcoreExecutorManager(this, ComponentsTables.LIBRARY);
		final /*@NonNull*/ /*@NonInvalid*/ IdResolver idResolver = evaluator.getIdResolver();
		final /*@NonNull*/ /*@NonInvalid*/ DomainType TYP_UMLProfileForDC_c_c_components_c_c_Component = idResolver.getType(ComponentsTables.CLSSid_Component_0, null);
		final /*@NonNull*/ /*@Thrown*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(evaluator, ComponentsTables.SET_CLSSid_Component, TYP_UMLProfileForDC_c_c_components_c_c_Component);
		/*@NonNull*/ /*@NonInvalid*/ SetValue.Accumulator accumulator = ValuesUtil.createSetAccumulatorValue(ComponentsTables.SET_CLSSid_Component);
		/*@Nullable*/ Iterator<?> ITERATOR_c = allInstances.iterator();
		/*@NonNull*/ /*@Thrown*/ SetValue select;
		while (true) {
		    if (!ITERATOR_c.hasNext()) {
		        select = accumulator;
		        break;
		    }
		    /*@Nullable*/ /*@NonInvalid*/ Component c = (Component)ITERATOR_c.next();
		    /**
		     * c.implementation->includes(self)
		     */
		    if (c == null) {
		        throw new InvalidValueException("Null source");
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<?> implementation = c.getImplementation();
		    final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_implementation = idResolver.createSetOfAll(ComponentsTables.SET_CLSSid_ComponentImplementation, implementation);
		    final /*@NonNull*/ /*@Thrown*/ Boolean includes = CollectionIncludesOperation.INSTANCE.evaluate(BOXED_implementation, self);
		    //
		    if (includes == ValuesUtil.TRUE_VALUE) {
		        accumulator.add(c);
		    }
		}
		/*@NonNull*/ /*@NonInvalid*/ BagValue.Accumulator accumulator_0 = ValuesUtil.createBagAccumulatorValue(ComponentsTables.BAG_CLSSid_Port);
		/*@Nullable*/ Iterator<?> ITERATOR__1 = select.iterator();
		/*@NonNull*/ /*@Thrown*/ BagValue collect;
		while (true) {
		    if (!ITERATOR__1.hasNext()) {
		        collect = accumulator_0;
		        break;
		    }
		    /*@Nullable*/ /*@NonInvalid*/ Component _1 = (Component)ITERATOR__1.next();
		    /**
		     * ownedPort
		     */
		    if (_1 == null) {
		        throw new InvalidValueException("Null source");
		    }
		    final /*@NonNull*/ /*@Thrown*/ List<?> ownedPort = _1.getOwnedPort();
		    final /*@NonNull*/ /*@Thrown*/ SetValue BOXED_ownedPort = idResolver.createSetOfAll(ComponentsTables.SET_CLSSid_Port, ownedPort);
		    //
		    for (Object value : BOXED_ownedPort.flatten().getElements()) {
		        accumulator_0.add(value);
		    }
		}
		final /*@NonNull*/ /*@Thrown*/ BagValue flatten = (BagValue)CollectionFlattenOperation.INSTANCE.evaluate(collect);
		final /*@NonNull*/ /*@Thrown*/ List<?> UNBOXED_flatten = flatten.asEcoreObject();
		return (EList<Port>)UNBOXED_flatten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortConnector> getOwnedPortConnector() {
		if (ownedPortConnector == null) {
			ownedPortConnector = new EObjectContainmentEList<PortConnector>(PortConnector.class, this, ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR);
		}
		return ownedPortConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR:
				return ((InternalEList<?>)getOwnedPropertyConnector()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR:
				return ((InternalEList<?>)getOwnedPortConnector()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT:
				return getContainedComponent();
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR:
				return getOwnedPropertyConnector();
			case ComponentsPackage.COMPONENT_ASSEMBLY__ASSEMBLY_PROPERTY:
				return getAssemblyProperty();
			case ComponentsPackage.COMPONENT_ASSEMBLY__EXTERNAL_PORT:
				return getExternalPort();
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR:
				return getOwnedPortConnector();
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
			case ComponentsPackage.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT:
				getContainedComponent().clear();
				getContainedComponent().addAll((Collection<? extends Component>)newValue);
				return;
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR:
				getOwnedPropertyConnector().clear();
				getOwnedPropertyConnector().addAll((Collection<? extends PropertyConnector>)newValue);
				return;
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR:
				getOwnedPortConnector().clear();
				getOwnedPortConnector().addAll((Collection<? extends PortConnector>)newValue);
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
			case ComponentsPackage.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT:
				getContainedComponent().clear();
				return;
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR:
				getOwnedPropertyConnector().clear();
				return;
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR:
				getOwnedPortConnector().clear();
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
			case ComponentsPackage.COMPONENT_ASSEMBLY__CONTAINED_COMPONENT:
				return containedComponent != null && !containedComponent.isEmpty();
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PROPERTY_CONNECTOR:
				return ownedPropertyConnector != null && !ownedPropertyConnector.isEmpty();
			case ComponentsPackage.COMPONENT_ASSEMBLY__ASSEMBLY_PROPERTY:
				return !getAssemblyProperty().isEmpty();
			case ComponentsPackage.COMPONENT_ASSEMBLY__EXTERNAL_PORT:
				return !getExternalPort().isEmpty();
			case ComponentsPackage.COMPONENT_ASSEMBLY__OWNED_PORT_CONNECTOR:
				return ownedPortConnector != null && !ownedPortConnector.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentAssemblyImpl
