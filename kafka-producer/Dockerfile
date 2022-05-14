FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Kafka Producer"
WORKDIR ./
COPY target/kafka-producer-0.0.1-SNAPSHOT.jar kafka-producer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","kafka-producer-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080