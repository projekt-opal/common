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
public interface JenaModelProcessor {

	/**
	 * Reads data in given Jena {@link Model}, processes data related to DCAT
	 * {@link DCAT#Dataset} URIs, and returns a Jena {@link Model} with processed
	 * data.
	 * 
	 * Note: The model to return may be the same instance as the input model. Data
	 * in the input model may be changed. To protect the input model, use (inter
	 * alia) <code>ModelFactory.createDefaultModel().add(model)</code>.
	 * 
	 * @param model      Jena input model
	 * @param datasetUri URI of DCAT dataset to process
	 * @return Jena output model with processed data
	 * @throws Exception On errors
	 */
	public Model process(Model model, String datasetUri) throws Exception;

}