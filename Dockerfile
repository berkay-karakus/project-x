FROM openjdk:17-jdk-slim
ARG JAR_FILE=target/*.jar
RUN chmod +x mvnw
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]