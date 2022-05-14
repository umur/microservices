FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Reactive Service"
WORKDIR ./
COPY target/reactive-0.0.1-SNAPSHOT.jar reactive-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","reactive-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080