package org.dice_research.opal.common;

import org.apache.jena.rdf.model.Literal;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.ResourceFactory;
import org.apache.jena.vocabulary.DCTerms;
import org.dice_research.opal.common.utilities.ModelSerialization;
import org.junit.Assert;
import org.junit.Test;

public class ModelSerializationTest {

	@Test
	public void testSerialization() {
		Model model = getModel();
		byte[] bytes = ModelSerialization.serialize(model);
		Model deserializedModel = ModelSerialization.deserialize(bytes);
		Assert.assertTrue(model.isIsomorphicWith(deserializedModel));
	}

	@Test
	public void testSerializationNtriples() {
		Model model = getModel();
		byte[] bytes = ModelSerialization.serialize(model, "N-TRIPLES");
		Model deserializedModel = ModelSerialization.deserialize(bytes, null, "N-TRIPLES");
		Assert.assertTrue(model.isIsomorphicWith(deserializedModel));
	}

	private Model getModel() {
		Model model = ModelFactory.createDefaultModel();
		Resource resource = ResourceFactory.createResource("http://example.com/");
		Literal literal = ResourceFactory.createPlainLiteral("An example");
		model.add(resource, DCTerms.description, literal);
		return model;
	}
}