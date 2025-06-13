FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE dev
COPY . .
ADD ./target/shipping-service.jar shipping-service.jar
EXPOSE 8600
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "shipping-service.jar"]