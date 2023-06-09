# the first stage of our build will use a maven 3.6.1 parent image
FROM maven:3.6.1-jdk-13-alpine AS MAVEN_BUILD

# copy the pom and src code to the container
#COPY ./ ./

# default working diredtoy is /

RUN apk update
RUN apk add git

RUN git clone https://github.com/cbsi-tong/demo.git

WORKDIR /demo

# package our application code
RUN mvn clean package

# the second stage of our build will use open jdk 8 on alpine 3.9
FROM openjdk:13-jdk-alpine

# copy only the artifacts we need from the first stage and discard the rest
COPY --from=MAVEN_BUILD /demo/target/demo-0.0.1-SNAPSHOT.jar /demo.jar

# set the startup command to execute the jar
CMD ["java", "-jar", "/demo.jar"]
# ENTRYPOINT ["java","-jar","/demo.jar"]