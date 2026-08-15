FROM openjdk:17.0.2
EXPOSE  8080
ADD target/springboot-aws.jar springboot-aws.jar
ENTRYPOINT  ["java", "-jar", "/springboot-aws.jar"]
