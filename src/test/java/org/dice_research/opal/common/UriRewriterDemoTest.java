package org.dice_research.opal.common;

import org.dice_research.opal.common.constants.Catalogs;
import org.dice_research.opal.common.utilities.UriRewriter;
import org.junit.Assert;
import org.junit.Test;

/**
 * This tests, if the data at the OPAL demo uses the same URIs as created by the
 * Uri Rewriter.
 * 
 * Data from the demo was extracted on 2020-07-08.
 * 
 * Used URL of demo:
 * https://opal.demos.dice-research.org/view/datasetView?uri=http://projekt-opal.de/dataset/3e71cf21852472e10462ab4fe97e679d
 * 
 * Title at demo website: Berlin um 1940 - [WMS]
 * 
 * Response JSON "uri"
 * :"http://projekt-opal.de/dataset/3e71cf21852472e10462ab4fe97e679d"
 * 
 * Response JSON "originalUrls":
 * ["https://europeandataportal.eu/set/data/d812423b-2d4e-3491-85f4-c83f75fcba99"]
 * 
 * @author Adrian Wilke
 */
public class UriRewriterDemoTest {

	public static final String ORIGINAL_URI = "https://europeandataportal.eu/set/data/d812423b-2d4e-3491-85f4-c83f75fcba99";
	public static final String HASH = "3e71cf21852472e10462ab4fe97e679d";
	public static final String EXPECTED_DATASET_URI = "http://projekt-opal.de/dataset/" + HASH;

	@Test
	public void test() {
		Assert.assertEquals(EXPECTED_DATASET_URI,
				UriRewriter.getOpalDatasetUri(Catalogs.ID_EUROPEANDATAPORTAL, ORIGINAL_URI));
	}

}