FROM eclipse-temurin:latest

ARG DEPENDENCY=target/dependency

COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app

VOLUME /tmp
VOLUME /app/logs
VOLUME /app/logsa

ENTRYPOINT ["java", "-cp", "app:app/lib/*", "com.example.testsecrets.TestSecretsApplication"]

CMD [""]