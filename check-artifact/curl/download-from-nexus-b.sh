curl -u <user>:<pass> -vvv -X GET http://localhost:9092/repository/maven-releases
org/example/common-lib/1.0/common-lib-1.0.0.pom > nexus-b.pom
curl -u <user>:<pass> -vvv -X GET http://localhost:9092/repository/maven-releases
  org/example/common-lib/1.0/common-lib-1.0.0.jar -o nexus-b.jar