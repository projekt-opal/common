package org.dice_research.opal.common.vocabulary;

/**
 * SKOS Simple Knowledge Organization System Namespace Document
 * 
 * @see <a href="https://www.w3.org/TR/skos-reference/">https://www.w3.org/TR/skos-reference/</a>
 * @see <a href="https://www.w3.org/2009/08/skos-reference/skos.html">https://www.w3.org/2009/08/skos-reference/skos.html</a>
 * 
 * @author Adrian Wilke
 */
public abstract class Skos {

	// Fixme: It seems that in the OPAL Fuseki graph (2019-01-08) a wrong property
	// is used.
	// public static final String PROPERTY_PREF_LABEL =
	// org.apache.jena.vocabulary.SKOS.prefLabel.toString();
	public static final String PROPERTY_PREF_LABEL = "https://www.w3.org/2000/01/rdf-schema#label";

}