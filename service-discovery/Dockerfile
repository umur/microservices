FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Discovery Server"
WORKDIR ./
COPY target/service-discovery-0.0.1-SNAPSHOT.jar service-discovery-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","service-discovery-0.0.1-SNAPSHOT.jar"]
EXPOSE 8761