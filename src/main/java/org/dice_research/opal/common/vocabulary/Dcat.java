package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.vocabulary.DCAT;

/**
 * Data Catalog Vocabulary (DCAT)
 * 
 * Extension of {@link org.apache.jena.vocabulary.DCAT}.
 *
 * @see DCAT version 1: https://www.w3.org/TR/2014/REC-vocab-dcat-20140116/
 * @see DCAT version 2: https://www.w3.org/TR/vocab-dcat-2/
 * @see Code generator: https://github.com/projekt-opal/vocabulary-enhancement
 *
 * @author Adrian Wilke
 */
public abstract class Dcat {

	private static final Model m = ModelFactory.createDefaultModel();

	public static final Resource DataService = m.createResource(DCAT.NS + "DataService");
	public static final Resource Relationship = m.createResource(DCAT.NS + "Relationship");
	public static final Resource Role = m.createResource(DCAT.NS + "Role");

	public static final Property accessService = m.createProperty(DCAT.NS + "accessService");
	public static final Property bbox = m.createProperty(DCAT.NS + "bbox");
	public static final Property catalog = m.createProperty(DCAT.NS + "catalog");
	public static final Property centroid = m.createProperty(DCAT.NS + "centroid");
	public static final Property compressFormat = m.createProperty(DCAT.NS + "compressFormat");
	public static final Property endDate = m.createProperty(DCAT.NS + "endDate");
	public static final Property endpointDescription = m.createProperty(DCAT.NS + "endpointDescription");
	public static final Property endpointURL = m.createProperty(DCAT.NS + "endpointURL");
	public static final Property hadRole = m.createProperty(DCAT.NS + "hadRole");
	public static final Property packageFormat = m.createProperty(DCAT.NS + "packageFormat");
	public static final Property qualifiedRelation = m.createProperty(DCAT.NS + "qualifiedRelation");
	public static final Property servesDataset = m.createProperty(DCAT.NS + "servesDataset");
	public static final Property service = m.createProperty(DCAT.NS + "service");
	public static final Property spatialResolutionInMeters = m.createProperty(DCAT.NS + "spatialResolutionInMeters");
	public static final Property startDate = m.createProperty(DCAT.NS + "startDate");
	public static final Property temporalResolution = m.createProperty(DCAT.NS + "temporalResolution");
}