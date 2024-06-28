FROM openjdk:17-jdk-alpine3.13
COPY target/*.jar /app.jar
ENV JAVA_OPTS=""
CMD java $JAVA_OPTS -jar /app.jar