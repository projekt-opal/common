package org.dice_research.opal.common.utilities;

import java.io.OutputStream;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.riot.Lang;
import org.apache.jena.riot.RDFDataMgr;

/**
 * RDF file handler.
 * 
 * The export methods use {@link OutputStream}, as "Using OutputStreams is
 * strongly encouraged.", see
 * http://jena.apache.org/documentation/io/rdf-output.html#notes
 * 
 * @see http://jena.apache.org/documentation/io/index.html
 *
 * @author Adrian Wilke
 */
public abstract class FileHandler {

	public static final Lang DEFAULT_LANGUAGE = Lang.TURTLE;

	/**
	 * Exports Jena model to output stream using the {@link #DEFAULT_LANGUAGE}.
	 * 
	 * Use {@link java.io.FileOutputStream} to get the {@link OutputStream} of a
	 * {@link java.io.File}.
	 * 
	 * @param outputStream OutputStream
	 * @param model        Graph to write
	 */
	public static void export(OutputStream outputStream, Model model) {
		RDFDataMgr.write(outputStream, model, DEFAULT_LANGUAGE);
	}

	/**
	 * Exports Jena model to output stream using the specified language.
	 * 
	 * Use {@link java.io.FileOutputStream} to get the {@link OutputStream} of a
	 * {@link java.io.File}.
	 * 
	 * @param outputStream OutputStream
	 * @param model        Graph to write
	 * @param lang         Language for the serialization
	 */
	public static void export(OutputStream outputStream, Model model, Lang lang) {
		RDFDataMgr.write(outputStream, model, lang);
	}

	/**
	 * Imports Jena model from the specified URI of a file and the
	 * {@link #DEFAULT_LANGUAGE}.
	 * 
	 * Use {@link File#toURI()} to get the URI of a file.
	 * 
	 * @see RDFDataMgr#read(Model, String, Lang)
	 * 
	 * @param uri URI to read from (includes file: and a plain file name)
	 * @return Jena model
	 */
	public static Model importModel(String uri) {
		return importModel(uri, DEFAULT_LANGUAGE);
	}

	/**
	 * Imports Jena model from the specified URI of a file and the related language.
	 * 
	 * Use {@link File#toURI()} to get the URI of a file.
	 * 
	 * @see RDFDataMgr#read(Model, String, Lang)
	 * 
	 * @param uri  URI to read from (includes file: and a plain file name)
	 * @param lang Hint for the syntax
	 * @return Jena model
	 */
	public static Model importModel(String uri, Lang lang) {
		return RDFDataMgr.loadModel(uri, lang);
	}
}