FROM openjdk:17
COPY /target/docker-jenkins-integration-sample.jar /usr/project
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/project/docker-jenkins-integration-sample.jar"]