# For Java 8, try this
# FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

RUN apk add --no-cache bash

# Refer to Maven build -> finalName
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/demo.jar
COPY ${JAR_FILE} demo.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","demo.jar"]

## sudo docker run -p 8080:8080 -t demo:1.0
## sudo docker run -p 80:8080 -t demo:1.0
## sudo docker run -p 443:8443 -t demo:1.0