FROM openjdk:17
LABEL MAINTAINER="Umur Inan"
LABEL APPLICATION="Vault"
WORKDIR ./
COPY target/vault-0.0.1-SNAPSHOT.jar vault-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","vault-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080