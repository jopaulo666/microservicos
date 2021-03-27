FROM openjdk:11
VOLUME /tmp
ADD ./target/rh-usuario-0.0.1-SNAPSHOT.jar rh-usuario.jar
ENTRYPOINT ["java","-jar","/rh-usuario.jar"]