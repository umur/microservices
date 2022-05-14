FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="RabbitMQ Consumer 2"
WORKDIR ./
COPY target/rabbitmq-consumer-2-0.0.1-SNAPSHOT.jar rabbitmq-consumer-2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","rabbitmq-consumer-2-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080