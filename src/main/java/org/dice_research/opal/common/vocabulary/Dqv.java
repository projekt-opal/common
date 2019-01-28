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

	private static final Model MODEL = ModelFactory.createDefaultModel();

	public static final Resource NAMESPACE = MODEL.createResource(NS);

	public static final Property HAS_QUALITY_MEASUREMENT = MODEL.createProperty(NS + "hasQualityMeasurement");

	public static final Resource QUALITY_MEASUREMENT = MODEL.createResource(NS + "QualityMeasurement");
	public static final Property HAS_VALUE = MODEL.createProperty(NS + "value");
	public static final Property IS_MEASUREMENT_OF = MODEL.createProperty(NS + "isMeasurementOf");

	public static final Resource METRIC = MODEL.createResource(NS + "Metric");
	public static final Property IN_DIMENSION = MODEL.createProperty(NS + "inDimension");

	public static final Resource DIMENSION = MODEL.createResource(NS + "Dimension");
	public static final Property IN_CATEGORY = MODEL.createProperty(NS + "inCategory");

	public static final Resource CATEGORY = MODEL.createResource(NS + "Category");
}