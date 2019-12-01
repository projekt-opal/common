package org.dice_research.opal.common.interfaces;

import org.apache.jena.rdf.model.Model;

/**
 * Deprecated. Use {@link ModelProcessor} instead.
 * 
 * To ensure downward compatibility, the following code can be implemented:
 * <code>
 * processModel(model, datasetUri);
 * return model;
 * </code>
 * 
 * @deprecated Replaced by {@link ModelProcessor}.
 *
 * @author Adrian Wilke
 */
@Deprecated
public interface JenaModelProcessor {

	/**
	 * Deprecated as input model could be modified.
	 * 
	 * Use {@link ModelProcessor#processModel(Model, String)} instead.
	 * 
	 * To ensure downward compatibility, the following code can be implemented:
	 * <code>
	 * processModel(model, datasetUri);
	 * return model;
	 * </code>
	 * 
	 * @deprecated Replaced by {@link ModelProcessor#processModel(Model, String)}
	 */
	@Deprecated
	public Model process(Model model, String datasetUri) throws Exception;

}