FROM java:8-jre
MAINTAINER jerryYan jerryYan <ys_home@163.com>

VOLUME /tmp
ADD springcloud-eureka-server.jar
RUN bash -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /springcloud-eureka-server.jar" ]