FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/rh-api-gateway-zuul-0.0.1-SNAPSHOT.jar rh-api-gateway-zuul.jar
ENTRYPOINT ["java","-jar","/rh-api-gateway-zuul.jar"]