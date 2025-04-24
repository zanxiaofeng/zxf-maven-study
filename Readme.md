# Purge local repository by command
## Delete all artifact-versions
- mvn dependency:purge-local-repository -DreResolve=false -Dverbose=true
## Delete a specified artifact-version by include
- mvn dependency:purge-local-repository -Dinclude=org.apache.logging.log4j:log4j-api -DreResolve=false -Dverbose=true
## Delete all artifact-versions of a specified group of by include
- mvn dependency:purge-local-repository -Dinclude=org.apache.logging.log4j -DreResolve=false -Dverbose=true
## Delete a specified version of an artifact by manualInclude
- mvn dependency:purge-local-repository -X -DmanualInclude=org.apache.logging.log4j:log4j-api:2.17.2 -DreResolve=false -Dverbose=true
## Delete all versions of a specified artifact by manualInclude
- mvn dependency:purge-local-repository -X -DmanualInclude=org.apache.logging.log4j:log4j-api:2.17.2 -DreResolve=false -Dverbose=true
## Delete all artifacts and versions of a specified group by manualInclude
- mvn dependency:purge-local-repository -X -DmanualInclude=org.apache.logging.log4j -DreResolve=false -Dverbose=true


# Source Code
- https://github.com/apache/maven/tree/maven-3.6.3 [Maven]
- https://github.com/apache/maven-dependency-plugin/tree/maven-dependency-plugin-3.6.1 [maven-dependency-plugin]
- https://github.com/spring-projects/spring-boot/tree/v2.7.9/spring-boot-project/spring-boot-tools/spring-boot-maven-plugin [spring-boot-maven-plugin]


# Command
- mvn -X help:effective-pom
- mvn -X help:effective-settings
- mvn --debug dependency:tree -Dverbose=true
- mvn help:active-profiles


# Maven Setting
- Global level setting(In maven folder)
- User level setting(In user folder)


# Maven Profile
## Profile Scope
- Project-specific profiles go into the project’s pom.xml file
- User-specific profiles go into the user’s settings.xml file
- Global profiles go into the global settings.xml file
## Activating Profiles
- mvn help:active-profiles
## Activating a Profile
- By parameter -P <profile>
- By setting in xml(pom.xml or settings.xml)
- > Active by Default
- > Based on a Property
- > Based on the JDK Version
- > Based on the Operating System
- > Based on a File
## Deactivating a Profile
- By parameter -P -<profile>


# maven Core Classes
- maven-core/src/main/java/org/apache/maven/Maven.java
- maven-core/src/main/java/org/apache/maven/DefaultMaven.java
- maven-core/src/main/java/org/apache/maven/project/MavenProject.java
- maven-core/src/main/java/org/apache/maven/project/ProjectBuilder.java
- maven-core/src/main/java/org/apache/maven/project/DefaultProjectBuilder.java
- maven-core/src/main/java/org/apache/maven/execution/MavenSession.java
- maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequest.java
- maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequest.java
- maven-core/src/main/java/org/apache/maven/execution/MavenExecutionResult.java
- maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionResult.java
- maven-core/src/main/java/org/apache/maven/execution/MavenExecutionRequestPopulator.java
- maven-core/src/main/java/org/apache/maven/execution/DefaultMavenExecutionRequestPopulator.java
- maven-core/src/main/java/org/apache/maven/execution/ExecutionListener.java
- maven-core/src/main/java/org/apache/maven/execution/ExecutionEvent.java
- maven-core/src/main/java/org/apache/maven/settings/MavenSettingsBuilder.java
- maven-core/src/main/java/org/apache/maven/settings/DefaultMavenSettingsBuilder.java
- maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferListener.java
- maven-core/src/main/java/org/apache/maven/repository/ArtifactTransferEvent.java
- maven-core/src/main/java/org/apache/maven/repository/LocalArtifactRepository.java
- maven-core/src/main/java/org/apache/maven/repository/RepositorySystem.java
- maven-artifact/src/main/java/org/apache/maven/artifact/Artifact.java
- maven-artifact/src/main/java/org/apache/maven/artifact/DefaultArtifact.java
- maven-artifact/src/main/java/org/apache/maven/artifact/repository/ArtifactRepository.java
- maven-embedder/src/main/java/org/apache/maven/cli/MavenCli.java
- maven-embedder/src/main/java/org/apache/maven/cli/CliRequest.java
- maven-embedder/src/main/java/org/apache/maven/cli/transfer/AbstractMavenTransferListener.java
- maven-embedder/src/main/java/org/apache/maven/cli/transfer/ConsoleMavenTransferListener.java
- maven-embedder/src/main/java/org/apache/maven/cli/transfer/Slf4jMavenTransferListener.java [Default]
- maven-embedder/src/main/java/org/apache/maven/cli/logging/Slf4jConfiguration.java
- maven-embedder/src/main/java/org/apache/maven/cli/configuration/SettingsXmlConfigurationProcessor.java

# 
- org.eclipse.aether.spi.connector.RepositoryConnector
- org.eclipse.aether.connector.basic.BasicRepositoryConnector

# maven-dependency-plugin Core Classes

# spring-boot-maven-plugin Core Classes
- spring-boot-project/spring-boot-tools/spring-boot-maven-plugin/src/main/java/org/springframework/boot/maven/AbstractPackagerMojo.java
- spring-boot-project/spring-boot-tools/spring-boot-maven-plugin/src/main/java/org/springframework/boot/maven/RepackageMojo.java


# how to customer logging setting for maven
- Edit: ${maven-home}/conf/logging/simpleLogger.properties
- Update: org.slf4j.simpleLogger.showLogName=true
- Add: org.apache.maven.cli.MavenCli=debug
- Add: org.apache.maven.DefaultMaven=debug
- Add: org.apache.maven.project.DefaultProjectDependenciesResolver=debug
- Add: org.apache.maven.plugin.version.internal.DefaultPluginVersionResolver=debug
- Add: org.apache.maven.plugin.internal.DefaultPluginDependenciesResolver=debug
- Add: org.apache.maven.plugins.dependency=debug
- Add: org.eclipse.aether.internal.impl.DefaultLocalRepositoryProvider=debug
- Add: org.eclipse.aether.internal.impl.DefaultRemoteRepositoryManager=debug
- Add: org.eclipse.aether.internal.impl.DefaultUpdatePolicyAnalyzer=debug
- Add: org.eclipse.aether.internal.impl.DefaultTransporterProvider=debug
- Add: org.eclipse.aether.internal.impl.DefaultRepositoryConnectorProvider=debug
- Add: org.eclipse.aether.internal.impl.TrackingFileManager=debug
- Add: zxf.maven.plugin.myInfoMojo=debug

# Local repository file structure
- /{group}/{artifact}/
- /{group}/{artifact}/resolver-status.properties [Trace file used by Maven]
- /{group}/{artifact}/maven-metadata-local.xml [Installed from local]
- /{group}/{artifact}/maven-metadata-<repository-id>.xml [Downloaded from remote repository-id, Only when there are duplicate version in multiple repository]
- /{group}/{artifact}/maven-metadata-<repository-id>.xml.sha1 [Downloaded from remote repository-id, Only when there are duplicate version in multiple repository]
- /{group}/{artifact}/{version}/_remote.repository [Trace file used by Maven]
- /{group}/{artifact}/{version}/<artifact>-<version>.pom  [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.pom.sha1 [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.pom.lastUpdated [Trace file used by Maven]
- /{group}/{artifact}/{version}/<artifact>-<version>.<packaging> [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.<packaging>.sha1 [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.<packaging>.lastUpdated [Trace file used by Maven]
