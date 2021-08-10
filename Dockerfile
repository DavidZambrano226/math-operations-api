FROM openjdk:8-jdk-alpine
MAINTAINER David Zambrano
ADD build/libs/*.jar rest-api-k8s.jar
ENTRYPOINT["sh", "-c", "java -jar /rest-api-k8s.jar"]