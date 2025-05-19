FROM openjdk:8-jdk-alpine


ADD ./ts-user-service-1.0.jar /app/
CMD ["java", "-Xmx200m",  "-jar", "/app/ts-user-service-1.0.jar"]

EXPOSE 8106