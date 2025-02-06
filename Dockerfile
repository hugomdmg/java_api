FROM openjdk:17-jdk-slim

RUN apt-get update && apt-get install -y maven

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY . .

RUN mvn clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar target/*.jar"]
