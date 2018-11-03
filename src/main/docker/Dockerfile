FROM java:8
VOLUME ["/g/docker/server", "/var/www/html"]
COPY helloworld-0.0.1-SNAPSHOT.jar /var/www/html/helloworld-0.0.1-SNAPSHOT.jar
EXPOSE 80:80
ENTRYPOINT ["java", "-jar", "/var/www/html/helloworld-0.0.1-SNAPSHOT.jar"]