package org.dice_research.opal.common.utilities;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {

	/**
	 * Like described in {@link MessageDigest}
	 */
	private static final String ALGORITHM_ID = "MD5";

	private MessageDigest messageDigest;

	public String md5(String string) {

		// Initialize
		if (messageDigest == null) {
			try {
				messageDigest = MessageDigest.getInstance(ALGORITHM_ID);
			} catch (NoSuchAlgorithmException e) {
				// Should not occur, as a default algorithm is used
				throw new RuntimeException(e);
			}
		}

		// Compute
		messageDigest.update(string.getBytes());
		return String.format("%032X", new BigInteger(1, messageDigest.digest())).toLowerCase();
	}

	public static void main(String[] args) {
		System.out.println(new Hash().md5("Hey"));
		System.out.println(new Hash().md5("Ho"));
	}
}
