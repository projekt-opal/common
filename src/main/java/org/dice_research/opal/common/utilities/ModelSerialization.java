package org.dice_research.opal.common.utilities;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

/**
 * Utility for Jena model serialization.
 * 
 * @author Afshin Amini
 * @author Adrian Wilke
 */
public abstract class ModelSerialization {

	public final static String DEFAULT_LANGUAGE = "TURTLE";

	/**
	 * Byte array of data in TURTLE format to Jena model.
	 * 
	 * @param bytes Byte array using the {@link #DEFAULT_LANGUAGE}.
	 * @return Jena model
	 */
	public static Model deserialize(byte[] bytes) {
		return deserialize(bytes, null, DEFAULT_LANGUAGE);
	}

	/**
	 * Byte array to Jena model.
	 * 
	 * @see http://jena.apache.org/documentation/io/index.html
	 * @see Model#read(java.io.InputStream, String, String)
	 * 
	 * @param bytes Byte array
	 * @param base  Base URI to be used when converting relative URIs to absolute
	 *              URIs
	 * @param lang  Serialization language of byte array
	 * @return Jena model
	 */
	public static Model deserialize(byte[] bytes, String base, String lang) {
		Model model = ModelFactory.createDefaultModel();
		model.read(new ByteArrayInputStream(bytes), base, lang);
		return model;
	}

	/**
	 * Jena model to byte array using the {@link #DEFAULT_LANGUAGE}.
	 * 
	 * @param model Jena model
	 * @return Byte array in TURTLE format
	 */
	public static byte[] serialize(Model model) {
		return serialize(model, DEFAULT_LANGUAGE);
	}

	/**
	 * Jena model to byte array.
	 * 
	 * @see http://jena.apache.org/documentation/io/index.html
	 * @see Model#write(java.io.OutputStream, String)
	 * 
	 * @param model Jena model
	 * @param lang  Serialization language of byte array
	 * @return Byte array
	 */
	public static byte[] serialize(Model model, String lang) {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		model.write(outStream, lang);
		return outStream.toByteArray();
	}

}