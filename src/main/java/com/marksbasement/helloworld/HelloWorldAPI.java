package com.marksbasement.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldAPI {

    private static final Logger log = LoggerFactory.getLogger(HelloWorldAPI.class);

    @GetMapping("/helloWorld")
    public String helloWorld() {
        if (log.isInfoEnabled()) {
            log.info("/helloWorld endpoint has been called");
        }
        return "Hello World!";
    }
}