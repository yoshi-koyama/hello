package com.tutorial.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("Hello, World!", ZonedDateTime.now());
    }

    @GetMapping("/dogs")
    public List<Dog> getDogs() {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Pochi", 3));
        dogs.add(new Dog("Taro", 5));
        return dogs;
    }
}
