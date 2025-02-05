FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .

RUN mvn dependency:go-offline

COPY . .

RUN mvn clean install -DskipTests

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/*.jar"]
