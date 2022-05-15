FROM openjdk:11
MAINTAINER Rajeev Sarsandi
EXPOSE 8080
ARG JAR_FILE=target/jenkins-docker-demo.jar
COPY ${JAR_FILE} jenkins-docker-demo.jar
ENTRYPOINT ["java","-jar","/jenkins-docker-demo.jar"]