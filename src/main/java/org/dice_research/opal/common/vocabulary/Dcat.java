package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.vocabulary.DCAT;

/**
 * Data Catalog Vocabulary (DCAT)
 * 
 * Extension of {@link org.apache.jena.vocabulary.DCAT}.
 *
 * @see DCAT version 1: https://www.w3.org/TR/2014/REC-vocab-dcat-20140116/
 * @see DCAT version 2: https://www.w3.org/TR/vocab-dcat-2/
 *
 * @author Adrian Wilke
 */
public abstract class Dcat {

	private static final Model m = ModelFactory.createDefaultModel();

	/**
	 * @see https://www.w3.org/TR/vocab-dcat-2/#Property:location_centroid
	 */
	public static final Property centroid = m.createProperty(DCAT.NS + "centroid");

	/**
	 * @see https://www.w3.org/TR/vocab-dcat-2/#Property:location_bbox
	 */
	public static final Property bbox = m.createProperty(DCAT.NS + "bbox");
}