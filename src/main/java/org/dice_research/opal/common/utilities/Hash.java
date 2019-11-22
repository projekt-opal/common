package org.dice_research.opal.common.utilities;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Hash functions.
 * 
 * Currently: Computes Message-Digest Algorithm 5 (MD5).
 *
 * @author Adrian Wilke
 */
public abstract class Hash {

	/**
	 * Computes Message-Digest Algorithm 5 (MD5) value for given input string.
	 */
	public static String md5(String string) {
		MessageDigest messageDigest;
		try {
			messageDigest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// Should not occur, as a default algorithm is used
			throw new RuntimeException(e);
		}
		return String.format("%032X", new BigInteger(1, messageDigest.digest(string.getBytes()))).toLowerCase();
	}
}