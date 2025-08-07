# Start from an OpenJDK 17 base image
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the containerdocker build -t curddemo-app .docker build -t curddemo-app .
COPY target/*.jar app.jar

# Expose the port your Spring Boot app listens on
EXPOSE 9898

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
