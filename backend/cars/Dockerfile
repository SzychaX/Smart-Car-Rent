# Użyj obrazu Javy jako bazowego
FROM openjdk:17-jdk-slim

# Ustaw katalog roboczy
WORKDIR /app

# Kopiuj plik JAR aplikacji do kontenera
COPY target/cars-0.0.1-SNAPSHOT.jar /app/app.jar

# Uruchom aplikację Spring Boot
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]
