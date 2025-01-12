# Step 1: Use a lightweight Java base image
FROM openjdk:21-jdk-slim

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the Spring Boot JAR file into the container
# Replace 'demo-application.jar' with your actual JAR file name
COPY target/spring-demo-jenkins-1.0.jar app.jar

# Step 4: Expose the port your Spring Boot app runs on (default is 8080)
EXPOSE 8060

# Step 5: Define the command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
