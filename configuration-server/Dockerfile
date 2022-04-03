FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Configuration Server"
WORKDIR ./
COPY target/configuration-server-0.0.1-SNAPSHOT.jar configuration-server-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","configuration-server-0.0.1-SNAPSHOT.jar"]
EXPOSE 9090