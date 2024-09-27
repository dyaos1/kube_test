FROM openjdk:17-jdk-slim
LABEL authors="spark3840"

WORKDIR /app

# Copy the application JAR file (adjust the JAR name)
COPY build/libs/kube_test-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]