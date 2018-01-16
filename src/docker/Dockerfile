FROM tomcat:8.5-jre8-alpine
MAINTAINER "Mashinarius Team <mashinarius@gmail.com>"
#VOLUME ["/logs"]
ADD settings.xml /usr/local/tomcat/conf/
ADD tomcat-users.xml /usr/local/tomcat/conf/
ENV APP_SLEEP 0
COPY demo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/demo.war