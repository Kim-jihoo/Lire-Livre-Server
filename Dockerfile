FROM openjdk:11
ARG JAR_FILE=build/libs/lirelivre.jar
COPY ${JAR_FILE} ./lirelivre.jar
ENV TZ=Asia/Seoul
ENTRYPOINT ["java", "-jar", "./lirelivre.jar"]
