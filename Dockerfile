FROM openjdk:17
EXPOSE 8080
WORKDIR /app
COPY target/springDocker.jar /app/springDocker.jar
ENTRYPOINT ["java","-jar","springDocker.jar"]