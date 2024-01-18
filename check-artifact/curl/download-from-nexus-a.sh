curl -u <user>:<pass> -vvv -X GET http://localhost:9091/repository/maven-releases
org/example/common-lib/1.0/common-lib-1.0.0.pom > nexus-a.pom
curl -u <user>:<pass> -vvv -X GET http://localhost:9091/repository/maven-releases
  org/example/common-lib/1.0/common-lib-1.0.0.jar -o nexus-a.jar