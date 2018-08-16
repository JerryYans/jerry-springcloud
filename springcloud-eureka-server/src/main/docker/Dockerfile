FROM java:8-jre
MAINTAINER jerryYan jerryYan <ys_home@163.com>

VOLUME /tmp
ADD springcloud-eureka-server-1.0-SNAPSHOT.jar springcloud-eureka-server.jar
RUN bash -c 'touch /springcloud-eureka-server.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /springcloud-eureka-server.jar" ]