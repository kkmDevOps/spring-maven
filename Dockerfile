FROM adoptopenjdk/openjdk17:alpine-jre


WORKDIR /app


COPY target/*.jar app.jar

# Expose the port that the Spring Boot application will run on (usually 8080)
EXPOSE 8080


CMD ["java", "-jar", "app.jar"]
