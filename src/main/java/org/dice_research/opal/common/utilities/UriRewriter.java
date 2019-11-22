package org.dice_research.opal.common.utilities;

import org.dice_research.opal.common.constants.Catalogs;
import org.dice_research.opal.common.vocabulary.Opal;

/**
 * Provides methods to compute URIs for the OPAL graph.
 *
 * @author Adrian Wilke
 */
public abstract class UriRewriter {

	/**
	 * Computes OPAL URI for a dataset provided by a catalog.
	 * 
	 * The URIs are required to ensure unique URIs of single datasets and
	 * distributions. Using the original URIs could cause an unwanted fusion/merging
	 * of resources. That is having the same predicates multiple times for the same
	 * dataset/distribution. E.g. two titles for a dataset with the same URI
	 * downloaded from different source portals.
	 * 
	 * @param catalogId   ID of source catalog. Use constants in {@link Catalogs}.
	 * @param originalUri as provided by catalog (data portal)
	 * @return URI to be used in the OPAL graph.
	 */
	public static String getOpalDatasetUri(String catalogId, String originalUri) {
		if (catalogId == null || catalogId.isBlank()) {
			throw new RuntimeException("No catalog ID given.");
		}
		if (originalUri == null || originalUri.isBlank()) {
			throw new RuntimeException("No original URI given.");
		}
		return Opal.NS_OPAL_DATASETS + Hash.md5(catalogId + originalUri);
	}

	/**
	 * Computes OPAL URI for a dataset provided by a catalog.
	 * 
	 * @param catalogId   ID of source catalog. Use constants in {@link Catalogs}.
	 * @param originalUri as provided by catalog (data portal)
	 * @return URI to be used in the OPAL graph.
	 */
	public static String getOpalDistributionUri(String catalogId, String originalUri) {
		if (catalogId == null || catalogId.isBlank()) {
			throw new RuntimeException("No catalog ID given.");
		}
		if (originalUri == null || originalUri.isBlank()) {
			throw new RuntimeException("No original URI given.");
		}
		return Opal.NS_OPAL_DISTRIBUTIONS + Hash.md5(catalogId + originalUri);
	}

}