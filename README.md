# spring-boot-demo
Demo Project for Spring Boot

# cleaning(deleting target folder) and packaging(building jar file in target folder)
```shell script
mvn clean package
```

# run spring-boot-demo jar file
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