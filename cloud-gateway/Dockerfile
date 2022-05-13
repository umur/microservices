FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Cloud Gateway"
WORKDIR ./
COPY target/cloud-gateway-0.0.1-SNAPSHOT.jar cloud-gateway-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","cloud-gateway-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080