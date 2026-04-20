# ===============================
# Backend Dockerfile (Spring Boot)
# ===============================

# Stage 1: Build the JAR
FROM maven:3.9.6-eclipse-temurin-17 AS builder

WORKDIR /app

# Copy pom.xml first to leverage Docker layer caching
COPY pom.xml .
# Download dependencies (layer cache optimization)
RUN mvn dependency:go-offline -B

# Now copy source code and build the jar
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create runtime image
FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy compiled JAR from builder
COPY --from=builder /app/target/*.jar app.jar

# Expose backend port
EXPOSE 8080

# Define environment variables (optional, overridden by Compose)
ENV SPRING_PROFILES_ACTIVE=default

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
