FROM openjdk:8
ADD target/customer-demo.jar customer-demo.jar
EXPOSE 8099
ENTRYPOINT ["java","-jar","customer-demo.jar"]
