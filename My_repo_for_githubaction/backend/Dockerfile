# Use OpenJDK image as base
FROM openjdk:17-jdk-slim as build

# Set working directory
WORKDIR /app

# Copy the pom.xml and download dependencies (caching dependencies)
COPY pom.xml .
RUN ./mvnw dependency:go-offline

# Copy the source code
COPY src ./src

# Build the application
RUN ./mvnw clean package -DskipTests

# Second stage: create the runtime image
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copy the JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]

