FROM java:8

MAINTAINER SANDY

EXPOSE 8888

ADD DEVOPSProject-1.jar /DEVOPSProject-1.jar
RUN chmod +x /DEVOPSProject-1.jar

ADD test.yml /test.yml
RUN chmod +x /test.yml

ADD start_up.sh /start_up.sh
RUN chmod +x /start_up.sh

CMD bash start_up.sh