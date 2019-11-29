# OPAL Common

Common utilities for OPAL components.

- [constants](../blob/master/src/main/java/org/dice_research/opal/common/constants) for languages and data-portals
- [interfaces](../blob/master/src/main/java/org/dice_research/opal/common/interfaces) for OPAL components
- [utilities](../blob/master/src/main/java/org/dice_research/opal/common/utilities) for handling files and data
- [vocabulary](../blob/master/src/main/java/org/dice_research/opal/common/vocabulary) for namespaces and uris (additionally, using [org.apache.jena.vocabulary](https://jena.apache.org/documentation/javadoc/jena/org/apache/jena/vocabulary/package-summary.html) is recommended)


## Usage with Apache Maven

Add the following lines to your `pom.xml` configuration file:

	<dependencies>
		<dependency>
			<groupId>org.dice-research.opal</groupId>
			<artifactId>common</artifactId>
			<version>[1,2)</version>
		</dependency>
	</dependencies>
	
	<repositories>
		<repository>
			<id>maven.aksw.internal</id>
			<name>AKSW Repository</name>
			<url>http://maven.aksw.org/archiva/repository/internal</url>
		</repository>
		<repository>
			<id>maven.aksw.snapshots</id>
			<name>AKSW Snapshot Repository</name>
			<url>http://maven.aksw.org/archiva/repository/snapshots</url>
		</repository>
	</repositories>

Available versions are listed at [maven.aksw.org](https://maven.aksw.org/archiva/#advancedsearch/org.dice-research.opal~common~~~~~30).


## Credits

[Data Science Group (DICE)](https://dice-research.org/) at [Paderborn University](https://www.uni-paderborn.de/)

This work has been supported by the German Federal Ministry of Transport and Digital Infrastructure (BMVI) in the project [Open Data Portal Germany (OPAL)](http://projekt-opal.de/) (funding code 19F2028A).
