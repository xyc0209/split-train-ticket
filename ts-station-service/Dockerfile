FROM openjdk:8-jdk-alpine

ADD ./ts-station-service-1.0.jar /app/
CMD ["java", "-Xmx200m",  "-jar", "/app/ts-station-service-1.0.jar"]

EXPOSE 8103