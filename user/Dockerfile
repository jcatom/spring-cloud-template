FROM java:17
VOLUME /tmp
COPY target/user-1.0-SNAPSHOT.jar user.jar
RUN bash -c "touch /user.jar"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "user.jar"]