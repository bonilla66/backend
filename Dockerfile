FROM openjdk:17
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/apirest-0.0.1-SNAPSHOT.jar /app/apirest.jar
ENTRYPOINT ["java", "-jar", "/app/apirest.jar"]