# Use the Eclipse Temurin base image for Java 17
FROM eclipse-temurin:17-jdk-jammy AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and download dependencies (this will cache dependencies for faster builds)
COPY pom.xml . 
RUN ./mvnw dependency:go-offline

# Copy the rest of the source code into the container
COPY src /app/src

# Package the application using Maven
RUN ./mvnw clean package -DskipTests

# Use a lighter image for the final runtime image
FROM eclipse-temurin:17-jre-jammy

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the build stage
COPY --from=build /app/target/spring-app-1.0.0.jar /app/spring-app.jar

# Run the application
CMD ["java", "-jar", "spring-app.jar"]

# Expose the application on port 8080
EXPOSE 8080

