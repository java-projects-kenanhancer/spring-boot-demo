package com.kenanhancer.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //call from browser: http://locahost:8080/
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
