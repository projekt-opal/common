package org.dice_research.opal.common.vocabulary;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;

/**
 * OPAL quality vocabulary.
 * 
 * @author Adrian Wilke
 */
public class Opal {

	// Namespaces

	private static final String NS_OPAL_CATALOGS = "http://projekt-opal.de/catalog/";
	private static final String NS_OPAL_DIMENSIONS = "http://dimension.projekt-opal.de/";
	private static final String NS_OPAL_METRICS = "http://metric.projekt-opal.de/";

	private static final Model m_model = ModelFactory.createDefaultModel();

	// Fixed resource URIs

	public static final Resource OPAL_CATALOG_MCLOUD = m_model.createResource(NS_OPAL_CATALOGS + "mcloud");
	public static final Resource OPAL_CATALOG_GOVDATA = m_model.createResource(NS_OPAL_CATALOGS + "govdata");
	public static final Resource OPAL_CATALOG_EUROPEANDATAPORTAL = m_model
			.createResource(NS_OPAL_CATALOGS + "europeandataportal");

	// Accessibility - Access

	public static final Resource OPAL_DIMENSION_ACCESS = m_model.createResource(NS_OPAL_DIMENSIONS + "Access");
	public static final Resource OPAL_METRIC_OPEN_METADATA = m_model.createResource(NS_OPAL_METRICS + "OpenMetadata");
	public static final Resource OPAL_METRIC_RETRIEVABILITY = m_model
			.createResource(NS_OPAL_METRICS + "Retrievability");

	// Accessibility - Data

	public static final Resource OPAL_DIMENSION_DATA = m_model.createResource(NS_OPAL_DIMENSIONS + "Data");
	public static final Resource OPAL_METRIC_OPEN_DATA_FORMAT = m_model
			.createResource(NS_OPAL_METRICS + "OpenDataFormat");
	public static final Resource OPAL_METRIC_DATA_FORMAT = m_model.createResource(NS_OPAL_METRICS + "DataFormat");
	public static final Resource OPAL_METRIC_MACHINEPROCESSABLE_DATA = m_model
			.createResource(NS_OPAL_METRICS + "MachineProcessableData");
	public static final Resource OPAL_METRIC_UNIQUE_DATA_IDENTIFIER = m_model
			.createResource(NS_OPAL_METRICS + "UniqueDataIdentifier");
	public static final Resource OPAL_METRIC_MULTIPLE_DATA_SERIALIZATIONS = m_model
			.createResource(NS_OPAL_METRICS + "MultipleDataSerializations");

	// Accessibility - Interlinking

	public static final Resource OPAL_DIMENSION_INTERLINKING = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Interlinking");
	public static final Resource OPAL_METRIC_LABELED_DATA = m_model.createResource(NS_OPAL_METRICS + "LabeledData");
	public static final Resource OPAL_METRIC_LINKED_DATA_REPRESENTAION = m_model
			.createResource(NS_OPAL_METRICS + "LinkedDataRepresentation");
	public static final Resource OPAL_METRIC_METADATA_INTERLINKING = m_model
			.createResource(NS_OPAL_METRICS + "MetadataInterlinking");

	// Accessibility - Rights

	public static final Resource OPAL_DIMENSION_RIGHTS = m_model.createResource(NS_OPAL_DIMENSIONS + "Rights");
	public static final Resource OPAL_METRIC_KNOWN_LICENSE = m_model.createResource(NS_OPAL_METRICS + "KnownLicense");
	public static final Resource OPAL_METRIC_MACHINE_READABLE_LICENSE = m_model
			.createResource(NS_OPAL_METRICS + "MachineReadableLicense");
	public static final Resource OPAL_METRIC_HUMAN_READABLE_LICENSE = m_model
			.createResource(NS_OPAL_METRICS + "HumanReadableLicense");
	public static final Resource OPAL_METRIC_OPEN_LICENSE = m_model.createResource(NS_OPAL_METRICS + "OpenLicense");
	public static final Resource OPAL_METRIC_PERMISSION_COMERCIAL_USE = m_model
			.createResource(NS_OPAL_METRICS + "PermissionCommercialUse");
	public static final Resource OPAL_METRIC_PERMISSIONS = m_model.createResource(NS_OPAL_METRICS + "Permissions");

	// Contextual - Community

	public static final Resource OPAL_DIMENSION_COMMUNITY = m_model.createResource(NS_OPAL_DIMENSIONS + "Community");
	public static final Resource OPAL_METRIC_COMMUNICATION = m_model.createResource(NS_OPAL_METRICS + "Communication");
	public static final Resource OPAL_METRIC_TRUST_TRANSFER = m_model.createResource(NS_OPAL_METRICS + "TrustTransfer");
	public static final Resource OPAL_METRIC_CORRECTNESS = m_model.createResource(NS_OPAL_METRICS + "Correctness");
	public static final Resource OPAL_METRIC_CONFIRMATION = m_model.createResource(NS_OPAL_METRICS + "Confirmation");

	// Contextual - Contactability

	public static final Resource OPAL_DIMENSION_CONTACTABILITY = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Contactability");
	public static final Resource OPAL_METRIC_CONTACT_URL = m_model.createResource(NS_OPAL_METRICS + "ContactUrl");
	public static final Resource OPAL_METRIC_CONTACT_EMAIL = m_model.createResource(NS_OPAL_METRICS + "ContactEmail");
	public static final Resource OPAL_METRIC_CLASSICAL_CONTACT_INFORMATION = m_model
			.createResource(NS_OPAL_METRICS + "ClassicalContactInformation");

	// Contextual - Temporal

	public static final Resource OPAL_DIMENSION_TEMPORAL = m_model.createResource(NS_OPAL_DIMENSIONS + "Temporal");
	public static final Resource OPAL_METRIC_UPDATE_RATE = m_model.createResource(NS_OPAL_METRICS + "UpdateRate");
	public static final Resource OPAL_METRIC_TIMELINESS = m_model.createResource(NS_OPAL_METRICS + "Timeliness");

	// Contextual - Trust

	public static final Resource OPAL_DIMENSION_TRUST = m_model.createResource(NS_OPAL_DIMENSIONS + "Trust");
	public static final Resource OPAL_METRIC_PROVIDER_IDENTITY = m_model
			.createResource(NS_OPAL_METRICS + "ProviderIdentity");
	public static final Resource OPAL_METRIC_TRUSTED_PROVIDER = m_model
			.createResource(NS_OPAL_METRICS + "TrustedProvider");
	public static final Resource OPAL_METRIC_METADATA_AUTHENTICITY = m_model
			.createResource(NS_OPAL_METRICS + "MetadataAuthenticity");
	public static final Resource OPAL_METRIC_DIGITAL_SIGNATURES = m_model
			.createResource(NS_OPAL_METRICS + "UsageOfDigitalSignatures");

	// Contextual - Understandability

	public static final Resource OPAL_DIMENSION_UNDERSTANDABILITY = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Understandability");
	public static final Resource OPAL_METRIC_READABILITY = m_model.createResource(NS_OPAL_METRICS + "Readability");
	public static final Resource OPAL_METRIC_LANGUAGE_ERRORS = m_model
			.createResource(NS_OPAL_METRICS + "LanguageErrors");
	public static final Resource OPAL_METRIC_EXAMPLE_APPLICATIONS = m_model
			.createResource(NS_OPAL_METRICS + "ExampleApplications");

	// Intrinsic - Expressiveness
	// Note: Metric 'Weighted extend' was removed

	public static final Resource OPAL_DIMENSION_EXPRESSIVENES = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Expressiveness");
	public static final Resource OPAL_METRIC_CATEGORIZATION = m_model
			.createResource(NS_OPAL_METRICS + "Categorization");
	public static final Resource OPAL_METRIC_DESCRIPTION = m_model.createResource(NS_OPAL_METRICS + "Description");
	public static final Resource OPAL_METRIC_EXTEND = m_model.createResource(NS_OPAL_METRICS + "Extend");

	// Intrinsic - Versioning

	public static final Resource OPAL_DIMENSION_VERSIONING = m_model.createResource(NS_OPAL_DIMENSIONS + "Versioning");
	public static final Resource OPAL_METRIC_VERSION_NUMBERING = m_model
			.createResource(NS_OPAL_METRICS + "VersionNumbering");
	public static final Resource OPAL_METRIC_PERIOD_OF_TIME = m_model.createResource(NS_OPAL_METRICS + "PeriodOfTime");

	// Representational - Representation

	public static final Resource OPAL_DIMENSION_REPRESENTATION = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Representation");
	public static final Resource OPAL_METRIC_OPEN_FORMAT = m_model.createResource(NS_OPAL_METRICS + "OpenFormat");
	public static final Resource OPAL_METRIC_METADATA_FORMAT = m_model
			.createResource(NS_OPAL_METRICS + "MetadataFormat");
	public static final Resource OPAL_METRIC_MACHINE_PROCESSABLE = m_model
			.createResource(NS_OPAL_METRICS + "MachineProcessable");
	public static final Resource OPAL_METRIC_VOCABULARY = m_model.createResource(NS_OPAL_METRICS + "Vocabulary");
	public static final Resource OPAL_METRIC_DATE_FORMAT = m_model.createResource(NS_OPAL_METRICS + "DateFormat");
	public static final Resource OPAL_METRIC_UNIQUE_IDENTIFIER = m_model
			.createResource(NS_OPAL_METRICS + "UniqueIdentifier");
	public static final Resource OPAL_METRIC_LOCALITY = m_model.createResource(NS_OPAL_METRICS + "Locality");

	// Representational- Versatility

	public static final Resource OPAL_DIMENSION_VERSATILITY = m_model
			.createResource(NS_OPAL_DIMENSIONS + "Versatility");
	public static final Resource OPAL_METRIC_MULTIPLE_SERIALIZATIONS = m_model
			.createResource(NS_OPAL_METRICS + "MultipleSerializations");
	public static final Resource OPAL_METRIC_MULTIPLE_LANGUAGES = m_model
			.createResource(NS_OPAL_METRICS + "MultipleLanguages");
	public static final Resource OPAL_METRIC_MULTIPLE_ACCESS_METHODS = m_model
			.createResource(NS_OPAL_METRICS + "MultipleAccessMethods");

}