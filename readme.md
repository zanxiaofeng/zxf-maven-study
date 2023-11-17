# Purge local repository by command
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

# maven-dependency-plugin Core Classes

# spring-boot-maven-plugin Core Classes


# how to customer logging setting for maven
- Edit: ${maven-home}/conf/logging/simpleLogger.properties
- Update: org.slf4j.simpleLogger.showLogName=true
- Add: org.slf4j.simpleLogger.log.org.apache.maven.plugins.dependency=debug
- Add: org.apache.maven.cli.MavenCli=debug
- Add: org.eclipse.aether.internal.impl=debug
- Add: org.apache.maven.project.DefaultProjectDependenciesResolver=debug

# Local repository file structure
- /{group}/{artifact}/
- /{group}/{artifact}/resolver-status.properties [Trace file used by Maven]
- /{group}/{artifact}/maven-metadata-<repository-id>.xml [Downloaded from remote repository-id]
- /{group}/{artifact}/maven-metadata-<repository-id>.xml.sha1 [Downloaded from remote repository-id]
- /{group}/{artifact}/{version}/_remote.repository [Trace file used by Maven]
- /{group}/{artifact}/{version}/<artifact>-<version>.pom  [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.pom.sha1 [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.<packaging> [Downloaded from remote repository]
- /{group}/{artifact}/{version}/<artifact>-<version>.<packaging>.sha1 [Downloaded from remote repository]

