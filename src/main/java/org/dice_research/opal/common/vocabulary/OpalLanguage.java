package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.dice_research.opal.common.constants.ISO_639_1;

/**
 * Languages of metadata records.
 *
 * DQV (https://www.w3.org/TR/vocab-dqv/) allows to specify a language for a
 * entire catalog. That refers to the language of all metadata records of the
 * catalog (dcat:Catalog and dct:language). It is also possible to specify the
 * language for a dataset. That refers to the dataset and not the metadata
 * (dcat:Dataset and dct:language).
 * 
 * This vocabulary allows to specify a language for a single metadata record
 * (e.g. the language of the description).
 *
 * @author Adrian Wilke
 */
public abstract class OpalLanguage {

	private static final Model MODEL = ModelFactory.createDefaultModel();
	private static final String NS_OPAL_LANGUAGE = Opal.NS_OPAL + "language/";

	public static final Property language = MODEL.createProperty(Opal.NS_OPAL + "language");

	public static final Resource LANGUAGE_DE = MODEL.createResource(NS_OPAL_LANGUAGE + ISO_639_1.DE);
	public static final Resource LANGUAGE_EN = MODEL.createResource(NS_OPAL_LANGUAGE + ISO_639_1.EN);
	public static final Resource LANGUAGE_ES = MODEL.createResource(NS_OPAL_LANGUAGE + ISO_639_1.ES);
	public static final Resource LANGUAGE_FR = MODEL.createResource(NS_OPAL_LANGUAGE + ISO_639_1.FR);
}