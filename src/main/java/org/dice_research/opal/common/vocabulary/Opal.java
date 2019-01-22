package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

/**
 * OPAL quality vocabulary.
 * 
 * The OPAL vocabulary re-uses elements of other vocabularies. See the other
 * classes in this package.
 * 
 * 
 * @author Adrian Wilke
 */
public class Opal {

	// Namespaces

	private static final String NS_OPAL_DIMENSIONS = "http://dimension.projekt-opal.de/";
	private static final String NS_OPAL_METRICS = "http://metric.projekt-opal.de/";

	private static final Model m_model = ModelFactory.createDefaultModel();

	public static final Resource NAMESPACE_OPAL_DIMENSIONS = m_model.createResource( NS_OPAL_DIMENSIONS );
	public static final Resource NAMESPACE_OPAL_METRICS = m_model.createResource( NS_OPAL_METRICS );

	// Category Intrinsic
	// Dimension: Expressiveness

	public static final Resource OPAL_DIMENSION_EXPRESSIVENES = m_model.createResource(NS_OPAL_DIMENSIONS + "Expressiveness");
	public static final Resource OPAL_METRIC_CATEGORIZATION = m_model.createResource(NS_OPAL_METRICS + "Categorization");
	public static final Resource OPAL_METRIC_DESCRIPTION = m_model.createResource(NS_OPAL_METRICS + "Description");

	// Category Contextual
	// Dimension: Temporal

	public static final Resource OPAL_DIMENSION_TEMPORAL = m_model.createResource(NS_OPAL_DIMENSIONS + "Temporal");
	public static final Resource OPAL_METRIC_UPDATE_RATE = m_model.createResource(NS_OPAL_METRICS + "Update_rate");

	// Category Accessibility
	// Dimension: Rights

	public static final Resource OPAL_DIMENSION_RIGHTS = m_model.createResource(NS_OPAL_DIMENSIONS + "Rights");
	// TODO: Currently, it is only checked, if any license information is given
	public static final Resource OPAL_METRIC_LICENSE_SPECIFIED = m_model.createResource(NS_OPAL_METRICS + "Known_license");

}