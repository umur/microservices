FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Reactive Client 1 Service"
WORKDIR ./
COPY target/reactive-client-1-0.0.1-SNAPSHOT.jar reactive-client-1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","reactive-client-1-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080