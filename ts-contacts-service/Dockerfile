FROM openjdk:8-jdk-alpine


ADD ./ts-contacts-service-1.0.jar /app/
CMD ["java", "-Xmx200m",  "-jar", "/app/ts-contacts-service-1.0.jar"]

EXPOSE 8095