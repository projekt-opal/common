package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;

/**
 * Data Quality Vocabulary (DQV)
 * 
 * DQV hierarchy (general to specific): Category > Dimension > Metric.
 * 
 * @see <a href=
 *      "https://www.w3.org/TR/vocab-dqv/">https://www.w3.org/TR/vocab-dqv/</a>
 * 
 * @author Adrian Wilke
 */
public class Dqv {

	public static final String NS = "http://www.w3.org/ns/dqv#";

	private static final Model m_model = ModelFactory.createDefaultModel();

	public static final Resource NAMESPACE = m_model.createResource(NS);

	public static final Property HAS_QUALITY_MEASUREMENT = m_model.createProperty(NS + "hasQualityMeasurement");

	public static final Resource QUALITY_MEASUREMENT = m_model.createResource(NS + "QualityMeasurement");
	public static final Property HAS_VALUE = m_model.createProperty(NS + "value");
	public static final Property IS_MEASUREMENT_OF = m_model.createProperty(NS + "isMeasurementOf");

	public static final Resource METRIC = m_model.createResource(NS + "Metric");
	public static final Property IN_DIMENSION = m_model.createProperty(NS + "inDimension");

	public static final Resource DIMENSION = m_model.createResource(NS + "Dimension");
	public static final Property IN_CATEGORY = m_model.createProperty(NS + "inCategory");

	public static final Resource CATEGORY = m_model.createResource(NS + "Category");
}