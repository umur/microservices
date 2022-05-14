FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="RabbitMQ Publisher"
WORKDIR ./
COPY target/rabbitmq-publisher-0.0.1-SNAPSHOT.jar rabbitmq-publisher-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","rabbitmq-publisher-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080