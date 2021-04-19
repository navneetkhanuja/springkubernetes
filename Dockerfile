#FROM openjdk:8
FROM adoptopenjdk/openjdk11:latest
COPY build/libs/springkubernetes-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java -Djava.security.egd=file:/dev/./urandom -jar /app.jar