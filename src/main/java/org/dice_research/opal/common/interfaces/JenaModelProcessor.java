package org.dice_research.opal.common.interfaces;

import java.util.Collection;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.vocabulary.DCAT;
import org.dice_research.opal.common.utilities.ModelSerialization;

/**
 * Processes data in Jena model.
 * 
 * For serialization of byte arrays, {@link ModelSerialization} can be used
 * before and after calling the process method.
 *
 * @author Adrian Wilke
 */
public interface JenaModelProcessor {

	/**
	 * Reads data in given Jena {@link Model}, processes data related to DCAT
	 * {@link DCAT#Dataset} URIs, and returns new Jena {@link Model}.
	 * 
	 * @param model       Jena model
	 * @param datasetUris URIs of DCAT datasets to process
	 * @return Jena model with processed data
	 * @throws Exception On errors
	 */
	public Model process(Model model, Collection<String> datasetUris) throws Exception;

}