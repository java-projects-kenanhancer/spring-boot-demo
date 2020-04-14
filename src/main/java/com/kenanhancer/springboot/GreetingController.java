package com.kenanhancer.springboot;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // call from browser:
    // http://locahost:8080/greeting
    // http://locahost:8080/greeting?name=Kenan
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

    // call from browser:
    // http://locahost:8080/greetingV2
    // http://locahost:8080/greetingV2?name=Kenan
    @GetMapping("/greetingV2")
    public Greeting greetingV2(@RequestParam(value = "name", defaultValue = "World") String name) {
        return greeting(name);
    }

    // call from browser:
    // http://locahost:8080/greetingV3?name=Kenan
    @GetMapping("/greetingV3")
    public Greeting greetingV3(@RequestParam String name) {
        return greeting(name);
    }

    // call from browser:
    // http://locahost:8080/greetingV4/Kenan
    @GetMapping("/greetingV4/{name}")
    public Greeting greetingV4(@PathVariable String name) {
        return greeting(name);
    }
}
