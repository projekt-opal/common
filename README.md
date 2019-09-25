# OPAL Common

Common utilities for OPAL components.

## Usage

To use OPAL Common, you have to configure the GitHub Maven Package Registry and add OPAL Common as a dependency.

### 1. GitHub authentication token

For authentication, use the GitHub article [Creating a personal access token for the command line](https://help.github.com/en/articles/creating-a-personal-access-token-for-the-command-line). You need to set the read:packages scope. You can copy your new token directly after generation to continue with the next step.

### 2. Configuration of Apache Maven

Edit the file `~/.m2/settings.xml` and insert the code below.
Replace _TOKEN_ with the data from the step above and replace also _USERNAME_ with your GitHub username.
This is additionally described in the GitHub article [Authenticating to GitHub Package Registry](https://help.github.com/en/articles/configuring-apache-maven-for-use-with-github-package-registry#authenticating-to-github-package-registry).

```
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
          <releases><enabled>true</enabled></releases>
          <snapshots><enabled>true</enabled></snapshots>
        </repository>
        <repository>
          <id>github-projekt-opal</id>
          <name>GitHub projekt-opal Apache Maven Packages</name>
          <url>https://maven.pkg.github.com/projekt-opal</url>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github-projekt-opal</id>
      <username>USERNAME</username>
      <password>TOKEN</password>
    </server>
  </servers>
</settings>
```

### 3. Specification of the dependency

Edit the `pom.xml` of your project and insert the following code:

```
<dependencies>
	<!-- OPAL common 1.0.* -->
	<!-- https://github.com/projekt-opal/common -->
	<dependency>
		<groupId>org.dice_research.opal</groupId>
		<artifactId>common</artifactId>
		<version>[1.0,1.1)</version>
	</dependency>
</dependencies>
```

## Credits

[Data Science Group (DICE)](https://dice-research.org/) at [Paderborn University](https://www.uni-paderborn.de/)

This work has been supported by the German Federal Ministry of Transport and Digital Infrastructure (BMVI) in the project [Open Data Portal Germany (OPAL)](http://projekt-opal.de/) (funding code 19F2028A).
