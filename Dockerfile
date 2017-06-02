FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/clojurejan.jar /clojurejan/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojurejan/app.jar"]
