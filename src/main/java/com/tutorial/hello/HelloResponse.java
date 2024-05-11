package com.tutorial.hello;

import java.time.ZonedDateTime;

public class HelloResponse {

    private String greeting;

    private ZonedDateTime timestamp;

    public HelloResponse(String greeting, ZonedDateTime timestamp) {
        this.greeting = greeting;
        this.timestamp = timestamp;
    }

    public String getGreeting() {
        return greeting;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
