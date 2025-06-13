FROM openjdk:11
RUN mkdir -p /home/app
WORKDIR /home/app
ENV SPRING_PROFILES_ACTIVE dev
COPY . .
ADD ./target/proxy-client.jar proxy-client.jar
EXPOSE 8900
ENTRYPOINT ["java", "-Dspring.profiles.active=${SPRING_PROFILES_ACTIVE}", "-jar", "proxy-client.jar"]