FROM openjdk:8
ADD target/docker.jar docker.jar
EXPOSE 8000
ENTRYPOINT ["java", "-jar", "docker.jar"]