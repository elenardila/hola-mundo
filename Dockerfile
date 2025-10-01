# Etapa de build (Maven + JDK 17)
FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app

# Cache de dependencias
COPY pom.xml .
RUN mvn -q -B -DskipTests dependency:go-offline

# Código y empaquetado (forzamos el repackage de Spring Boot)
COPY src ./src
RUN mvn -q -B -DskipTests package spring-boot:repackage

# Etapa de runtime (JRE 17)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]
