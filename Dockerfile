FROM openjdk:11
ADD ./target/spring-mongo-2-0.0.1.jar /usr/src/spring-mongo-2-0.0.1.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "spring-mongo-2-0.0.1.jar"]