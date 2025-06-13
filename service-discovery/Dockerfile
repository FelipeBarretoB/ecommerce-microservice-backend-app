FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE=dev
COPY . .
ADD target/service-discovery.jar service-discovery.jar
EXPOSE 8761
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "service-discovery.jar"]