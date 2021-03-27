FROM openjdk:11
VOLUME /tmp
ADD ./target/rh-pagamento-0.0.1-SNAPSHOT.jar rh-pagamento.jar
ENTRYPOINT ["java","-jar","/rh-pagamento.jar"]