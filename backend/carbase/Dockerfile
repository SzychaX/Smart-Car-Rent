# Użyj obrazu Javy jako bazowego
FROM openjdk:17-jdk-slim

# Ustaw katalog roboczy
WORKDIR /app

# Kopiuj plik JAR aplikacji do kontenera
COPY target/carbase-0.0.1-SNAPSHOT.jar /app/app.jar

# Uruchom aplikację Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
