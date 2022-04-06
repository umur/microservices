FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="User Service"
WORKDIR ./
COPY target/user-0.0.1-SNAPSHOT.jar user-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","user-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080