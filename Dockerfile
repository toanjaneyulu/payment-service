FROM openjdk:8
EXPOSE 9191
ADD target/payment-service-image.jar payment-service-image.jar
ENTRYPOINT ["java","-jar","/payment-service-image.jar"]