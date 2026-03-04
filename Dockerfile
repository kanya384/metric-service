# Use an official OpenJDK runtime as the base image
FROM eclipse-temurin:21-jdk-jammy AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the application's JAR file from the host's 'target' directory to the container's '/app' directory
COPY target/metrics.jar /app/metrics.jar

# Expose the port your Java application runs on (e.g., 8080 for Spring Boot)
EXPOSE 8080

# Define the command to run the application when the container starts
CMD ["java", "-jar", "metrics.jar"]