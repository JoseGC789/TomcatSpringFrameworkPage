FROM tomcat

MAINTAINER joseGC789 "https://github.com/JoseGC789/"

COPY docker/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml
COPY docker/host-manager-context.xml /usr/local/tomcat/webapps/host-manager/META-INF/context.xml
COPY docker/manager-context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml
COPY target/*.war /usr/local/tomcat/webapps/apishow.war

CMD ["catalina.sh", "run"]

EXPOSE 8080