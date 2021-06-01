# Purpose
Spring Boot example of using an Aspect for simple logging

# Summary
A naïve API that adds 2 numbers and returns the sum for you. The logging Aspect
detects both the execution time and the return value. Logging output may look 
like this:
```
2021-05-31 20:00:30.998  INFO 6441 --- [nio-8080-exec-2] c.j.a.aspect.SimpleAdderReturnAspect     : value return was 4
2021-05-31 20:00:31.003  INFO 6441 --- [nio-8080-exec-2] c.j.a.aspect.SimpleAdderReturnAspect     : Execution time of SimpleAdderService.add :: 10 ms
```

# Compilation & execution
This expects JDK 11+ to be installed and to be the default JDK referenced when you 
type `java` into the command line. A Gradle wrapper is included,
which requires no global installation. If you are not using the IntelliJ IDEA IDE,
these are some steps to run the project on your machine locally.

### Linux/macOS:
Enter the project directory through your command line interface and type in:
```
./gradlew build
./gradlew bootRun
```

### Windows:
Enter the project directory through your command line interface and type in:
```
gradlew.bat build
gradlew.bat bootRun
```

For both of these platforms, use `Ctrl`+`C` to stop running the `bootRun` task and
shut down the running Spring Boot app.

# API Endpoint
URL: `localhost:8080/add` (replace the port if you are not using the default)  
### Request
```json
{
  "left": 2,
  "right": 2
}
```
### Expected response
```json
{
  "sum": 4
}
```

A Postman v2.1 collection is included in this project as an example.

# Credits
These authors wrote helpful tutorials that enabled me to create this demo.
- [Baeldung](https://www.baeldung.com/spring-aop)
- [Lokesh Gupta](https://howtodoinjava.com/spring-boot2/aop-aspectj/)
