FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE dev
COPY . .
ADD ./target/user-service.jar user-service.jar
EXPOSE 8700
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "user-service.jar"]