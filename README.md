# spring-boot-demo
Demo Project for Spring Boot

# cleaning(deleting target folder) and packaging(building jar file in target folder)
pom.xml has two profiles named as **spring-package** and **console-package**


if you want to run console application(com.kenanhancer.helloworld.maven.Application), then run the following
```shell script
mvn clean package -Pconsole-package
```

if you want to run springboot application(com.kenanhancer.springboot.Application), then run the following
```shell script
mvn clean package -Pspring-package
```


# run spring-boot-demo jar file
Output of the following command will be different according to above packaging version.

```shell script
java -jar target/spring-boot-demo-1.0-SNAPSHOT.jar
```

## Testing HelloController
http://locahost:8080/

## Testing GreetingController
http://locahost:8080/greeting
http://locahost:8080/greeting?name=Kenan

http://locahost:8080/greetingV2
http://locahost:8080/greetingV2?name=Kenan

http://locahost:8080/greetingV3?name=Kenan

http://locahost:8080/greetingV4/Kenan