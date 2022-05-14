FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Circuit Breaker Service"
WORKDIR ./
COPY target/circuit-breaker-0.0.1-SNAPSHOT.jar circuit-breaker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","circuit-breaker-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080