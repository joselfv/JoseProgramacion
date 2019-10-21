FROM dockerfile/java:oracle-java8

VOLUME /tmp
ADD DeploySpring.jar /opt/DeploySpring/
EXPOSE 8080
WORKDIR /opt/DeploySpring/
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-Xms512m", "-Xmx1g", "-jar", "DeploySpring.jar"]
