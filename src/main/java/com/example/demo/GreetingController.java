package com.example.demo;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

    @RequestMapping("/time")
    public ResponseEntity<String> getTime() {
        String dateTime = ZonedDateTime.now(ZoneId.of("Europe/Minsk")).toString();
        return  new ResponseEntity<>(dateTime, HttpStatus.OK);

    }
}
