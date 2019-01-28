package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

/**
 * OPAL quality vocabulary.
 * 
 * The OPAL vocabulary re-uses elements of other vocabularies. See the other
 * classes in this package.
 * 
 * @author Adrian Wilke
 */
public class Opal {

	// Namespaces

	private static final String NS_OPAL_CATALOGS = "http://projekt-opal.de/catalog/";
	private static final String NS_OPAL_DIMENSIONS = "http://dimension.projekt-opal.de/";
	private static final String NS_OPAL_METRICS = "http://metric.projekt-opal.de/";

	private static final Model m_model = ModelFactory.createDefaultModel();

	// Fixed resource URIs

	public static final Resource OPAL_CATALOG_MCLOUD = m_model.createResource(NS_OPAL_CATALOGS + "mcloud");
	public static final Resource OPAL_CATALOG_GOVDATA = m_model.createResource(NS_OPAL_CATALOGS + "govdata");
	public static final Resource OPAL_CATALOG_EUROPEANDATAPORTAL = m_model
			.createResource(NS_OPAL_CATALOGS + "europeandataportal");

	// --- Category: Intrinsic ---

	// Dimension: Expressiveness

	public static final Resource OPAL_DIMENSION_EXPRESSIVENES = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Expressiveness");
	public static final Resource OPAL_METRIC_CATEGORIZATION = m_model
			.createResource(NS_OPAL_METRICS + "Categorization");
	public static final Resource OPAL_METRIC_DESCRIPTION = m_model.createResource(NS_OPAL_METRICS + "Description");

	// --- Category: Contextual ---

	// Dimension: Temporal

	public static final Resource OPAL_DIMENSION_TEMPORAL = m_model.createResource(NS_OPAL_DIMENSIONS + "Temporal");
	public static final Resource OPAL_METRIC_UPDATE_RATE = m_model.createResource(NS_OPAL_METRICS + "Update_rate");

	// --- Category: Accessibility ---

	// Dimension: Rights

	public static final Resource OPAL_DIMENSION_RIGHTS = m_model.createResource(NS_OPAL_DIMENSIONS + "Rights");
	public static final Resource OPAL_METRIC_KNOWN_LICENSE = m_model.createResource(NS_OPAL_METRICS + "Known_license");

	// Dimension: Interlinking

	public static final Resource OPAL_METRIC_LINKED_DATA = m_model.createResource(NS_OPAL_METRICS + "Linked_data");

	// --- Category: Representational ---

	// Dimension: Versatility

	public static final Resource OPAL_DIMENSION_VERSATILITY = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Versatility");
	public static final Resource OPAL_METRIC_MULTIPLE_SERIALIZATIONS = m_model
			.createResource(NS_OPAL_METRICS + "Multiple_serializations");

}