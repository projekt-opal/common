package org.dice_research.opal.common.utilities;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;

/**
 * Utility for Jena model serialization.
 * 
 * @author Afshin Amini
 */
public abstract class ModelSerialization {

	private final static String TURTLE = "TURTLE";

	public static byte[] serialize(Model model) {
		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		model.write(outStream, TURTLE);
		return outStream.toByteArray();
	}

	public static Model deserialize(byte[] bytes) {
		Model model = ModelFactory.createDefaultModel();
		ByteArrayInputStream stream = new ByteArrayInputStream(bytes);
		model.read(stream, null, TURTLE);
		return model;
	}

}