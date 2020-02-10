FROM openjdk:8-jdk-alpine

ADD target/spring-boot*.jar {path of  Docker image}

ENTRYPOINT ["java", "-jar", "app.jar" ]