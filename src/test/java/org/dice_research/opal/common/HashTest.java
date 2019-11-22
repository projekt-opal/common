package org.dice_research.opal.common;

import org.dice_research.opal.common.utilities.Hash;
import org.dice_research.opal.common.utilities.UriRewriter;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests computation of hash functions.
 *
 * @author Adrian Wilke
 */
public class HashTest {

	public static final String HELLO_WORLD = "hello world";
	public static final String HELLO_WORLD_MD5 = "5eb63bbbe01eeed093cb22bb8f5acdc3";
	public static final String JAVA = "Java";
	public static final String JAVA_MD5 = "d52387880e1ea22817a72d3759213819";

	/**
	 * Tests computations of MD5 using the same {@link UriRewriter} instance.
	 */
	@Test
	public void test() {
		Assert.assertEquals("MD5 test 'hello world'", HELLO_WORLD_MD5, Hash.md5(HELLO_WORLD));
		Assert.assertEquals("Second MD5 test 'Java'", JAVA_MD5, Hash.md5(JAVA));
	}

}