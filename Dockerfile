FROM openjdk:11-jre-slim
ADD build/libs/*.jar /app.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "/app.jar"]