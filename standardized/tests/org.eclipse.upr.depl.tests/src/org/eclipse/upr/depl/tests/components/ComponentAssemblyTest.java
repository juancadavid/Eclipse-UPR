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
package org.eclipse.upr.depl.tests.components;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLUtil;
import org.eclipse.upr.depl.components.ComponentAssembly;
import org.eclipse.upr.depl.components.Property;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Tests derived properties on model element {@link ComponentAssembly}.
 * When running in Eclipse, this test has to be executed as a Plug-in Test.
 * @author Max Bureck
 */
public class ComponentAssemblyTest {

	
	public static Model umlModel;
	public static Resource umlResource;
	
	@BeforeClass
	public static void loadModel() throws MalformedURLException {
		
		// Load the UML model to run tests on
		final ResourceSet resourceSet = new ResourceSetImpl();
		URL modelUrl = ComponentAssemblyTest.class.getResource("ComponentAssemblyTest.uml");
		URI modelURI = URI.createURI(modelUrl.toString());
		Resource resource = resourceSet.getResource(modelURI,true);
		Assert.assertNotNull(resource);
		umlModel = (Model) resource.getContents().get(0);
		umlResource = resource;
	}
	
	@AfterClass
	public static void unreferenceModel() {
		umlModel = null;
		umlResource = null;
	}
	

	/**
	 * Tests if the derived property "configProperty" works as expected
	 */
	@Ignore @Test
	public void testConfigProperty() {
		final org.eclipse.uml2.uml.Package p = getComponentAssemblyPackacke();
		final boolean ignoreCase = false;
		final boolean createOnDemand = false;
		

		// The component "Assembly" has two implementations: "Implementation_1" and "Implementation_2".
		// "Implementation_1" has one property "propterty_1".
		// "Implementation_2" has one property "propterty_2".
		// Both of these properties have to be available over the derived property
		// "assemblyProperty" on "Assembly"
		final Component assembly = getComponent("Assembly", p, ignoreCase, createOnDemand);
		
		// Get all derived properties
		final ComponentAssembly compAssStereotype = (ComponentAssembly) assembly.getStereotypeApplications().get(0);
		final Set<Property> properties = new HashSet<Property>(compAssStereotype.getAssemblyProperty());
		
		// Get all properties of Implementation_1 and Implementation_2
		final Component implementation1 = getComponent("Implementation_1", p, ignoreCase, createOnDemand);
		org.eclipse.upr.depl.components.Component component_implementation1 = 
				(org.eclipse.upr.depl.components.Component) implementation1.getStereotypeApplications().get(0);
		
		final Component implementation2 = getComponent("Implementation_2", p, ignoreCase, createOnDemand);
		org.eclipse.upr.depl.components.Component component_implementation2 = 
				(org.eclipse.upr.depl.components.Component) implementation2.getStereotypeApplications().get(0);
		
		// Check if the properties of Implementation_1 and Implementation_2 are in the derived properties
		assertTrue( properties.containsAll(component_implementation1.getConfigProperty()) );
		assertTrue( properties.containsAll(component_implementation2.getConfigProperty()) );
		
		// test if the property of "Implementation_3" (which is not implementing "Assembly") is NOT
		// part of the derived property
		
		final Component implementation3 = getComponent("Implementation_3", p, ignoreCase, createOnDemand);
		org.eclipse.upr.depl.components.Component component_implementation3 = 
				(org.eclipse.upr.depl.components.Component) implementation3.getStereotypeApplications().get(0);
		
		assertFalse( properties.containsAll(component_implementation3.getConfigProperty()) );
	}

	
	@Test
	public void testExternalPort() {
		//TODO implement
	}
	
	private Component getComponent(final String componentName, final org.eclipse.uml2.uml.Package p,
			final boolean ignoreCase, final boolean createOnDemand) {
		return (Component) p.getOwnedType(componentName, ignoreCase , UMLPackage.Literals.COMPONENT, createOnDemand);
	}

	/**
	 * Gets package with qualified name "model::AssemblyProperty" from the loaded model
	 * {@link ComponentAssemblyTest#umlModel}
	 * @return the requested package
	 */
	private org.eclipse.uml2.uml.Package getComponentAssemblyPackacke() {
		final Collection<NamedElement> elements = UMLUtil.findNamedElements(umlResource, "model::AssemblyProperty");
		final NamedElement namedElement = elements.iterator().next();
		assertTrue(namedElement instanceof org.eclipse.uml2.uml.Package);
		return (org.eclipse.uml2.uml.Package) namedElement;
	}

}
