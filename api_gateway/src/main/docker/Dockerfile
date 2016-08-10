#shamelessly lifted from https://spring.io/guides/gs/spring-boot-docker/
FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD api_gateway-1.0.jar /api_gateway-1.0.jar
ENTRYPOINT ["nohup", "java", "-jar", "/api_gateway-1.0.jar", ">", "api_gateway.log", "2>&1", "&"]