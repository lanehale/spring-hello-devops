# Dockerfile
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn package -DskipTests

FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/spring-hello-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
# Force Spring Boot to bind to 0.0.0.0 and port 8080
CMD ["java", "-jar", "app.jar", "--server.port=8080", "--server.address=0.0.0.0"]