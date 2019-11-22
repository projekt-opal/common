package org.dice_research.opal.common;

import org.dice_research.opal.common.constants.Catalogs;
import org.dice_research.opal.common.utilities.UriRewriter;
import org.junit.Assert;
import org.junit.Test;

public class UriRewriterTest {

	public static final String EXAMPLE_URI = "http://example.org";

	/**
	 * Independently calculated md5('europeandataportal' + URI)
	 */
	public static final String TEST_E_MD5 = "bc7b7b43eebcc6fb664b357e589dfb23";
	public static final String TEST_E_EXPECTED_DATASET = "http://projekt-opal.de/dataset/" + TEST_E_MD5;
	public static final String TEST_E_EXPECTED_DISTRIBUTION = "http://projekt-opal.de/distribution/" + TEST_E_MD5;

	/**
	 * Independently calculated md5('govdata' + URI)
	 */
	public static final String TEST_G_MD5 = "7424e6de96fdd76896fc4b0e778addc3";
	public static final String TEST_G_EXPECTED_DATASET = "http://projekt-opal.de/dataset/" + TEST_G_MD5;
	public static final String TEST_G_EXPECTED_DISTRIBUTION = "http://projekt-opal.de/distribution/" + TEST_G_MD5;

	/**
	 * Independently calculated md5('mcloud' + URI)
	 */
	public static final String TEST_M_MD5 = "431157c7b45958e292f0a08748677da1";
	public static final String TEST_M_EXPECTED_DATASET = "http://projekt-opal.de/dataset/" + TEST_M_MD5;
	public static final String TEST_M_EXPECTED_DISTRIBUTION = "http://projekt-opal.de/distribution/" + TEST_M_MD5;

	@Test
	public void test() {
		Assert.assertEquals(TEST_E_EXPECTED_DATASET,
				UriRewriter.getOpalDatasetUri(Catalogs.ID_EUROPEANDATAPORTAL, EXAMPLE_URI));
		Assert.assertEquals(TEST_G_EXPECTED_DATASET, UriRewriter.getOpalDatasetUri(Catalogs.ID_GOVDATA, EXAMPLE_URI));
		Assert.assertEquals(TEST_M_EXPECTED_DATASET, UriRewriter.getOpalDatasetUri(Catalogs.ID_MCLOUD, EXAMPLE_URI));

		Assert.assertEquals(TEST_E_EXPECTED_DISTRIBUTION,
				UriRewriter.getOpalDistributionUri(Catalogs.ID_EUROPEANDATAPORTAL, EXAMPLE_URI));
		Assert.assertEquals(TEST_G_EXPECTED_DISTRIBUTION,
				UriRewriter.getOpalDistributionUri(Catalogs.ID_GOVDATA, EXAMPLE_URI));
		Assert.assertEquals(TEST_M_EXPECTED_DISTRIBUTION,
				UriRewriter.getOpalDistributionUri(Catalogs.ID_MCLOUD, EXAMPLE_URI));
	}

}
