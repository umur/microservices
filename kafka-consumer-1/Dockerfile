FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Kafka Consumer 1"
WORKDIR ./
COPY target/kafka-consumer-1-0.0.1-SNAPSHOT.jar kafka-consumer-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","kafka-consumer-1-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080