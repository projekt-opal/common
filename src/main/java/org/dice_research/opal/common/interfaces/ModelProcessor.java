package org.dice_research.opal.common.interfaces;

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
public interface ModelProcessor {

	/**
	 * Reads data in given Jena {@link Model}, processes data related to DCAT
	 * {@link DCAT#Dataset} URIs, and writes processed data into input model.
	 * 
	 * @param model      Jena model
	 * @param datasetUri URI of DCAT dataset to process
	 * 
	 * @throws Exception On errors
	 */
	public void processModel(Model model, String datasetUri) throws Exception;

}