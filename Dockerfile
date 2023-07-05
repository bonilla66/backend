FROM openjdk:17
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/apirest_api-0.0.1-SNAPSHOT.jar /app/apirest_api.jar
ENTRYPOINT ["java", "-jar", "/app/apirest_api.jar"]