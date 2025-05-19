FROM openjdk:8-jdk-alpine


ADD ./ts-config-service-1.0.jar /app/
CMD ["java", "-Xmx200m",  "-jar", "/app/ts-config-service-1.0.jar"]

EXPOSE 8092