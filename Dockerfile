FROM library/openjdk:9.0.1-11-jre-slim AS builder
ADD . /app
WORKDIR /app
RUN ./gradlew bootRepackage
RUN mv /app/build/libs/*.jar /app.jar

FROM library/openjdk:9.0.1-11-jre-slim
COPY --from=builder /app.jar /app.jar
ENTRYPOINT [ "java", "-jar", "/app.jar" ]


