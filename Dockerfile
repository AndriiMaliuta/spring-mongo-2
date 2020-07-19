FROM openjdk:11
ADD ./target/vultr-cats-0.0.1.jar /usr/src/vultr-cats-0.0.1.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "vultr-cats-0.0.1.jar"]