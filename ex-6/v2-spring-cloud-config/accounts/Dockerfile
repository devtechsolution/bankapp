#Start with a base image containing Java Runtime
FROM openjdk:17-jdk-slim

#Information around who maintains the images
MAINTAINER https://github.com/devtechsolution

#Add the application's jar to image
COPY build/libs/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]
