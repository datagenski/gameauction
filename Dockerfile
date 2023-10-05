FROM maven AS builder

WORKDIR /app/

COPY pom.xml .

COPY src ./src

RUN mvn package -DskipTests

FROM openjdk

WORKDIR /app

COPY --from=builder /app/target/gameAuction-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]