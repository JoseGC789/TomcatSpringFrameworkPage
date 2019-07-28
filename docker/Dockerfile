FROM tomcat

MAINTAINER joseGC789 "https://github.com/JoseGC789/"

COPY tomcat-users /usr/local/tomcat/conf/tomcat-users.xml
COPY host-manager-context /usr/local/tomcat/webapps/host-manager/META-INF/context.xml
COPY manager-context /usr/local/tomcat/webapps/manager/META-INF/context.xml

CMD ["catalina.sh", "run"]

EXPOSE 8080