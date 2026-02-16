package com.marksbasement.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mark Dyrhaug
 * @ since 02/16/2026
 *
 * This class is a simple endpoint class.
 */
@RestController
public class  HelloWorldAPI {

    /**
     * General logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldAPI.class);

    /**
     * This endpoint will return the string 'Hello World.
     * @return String Hello World
     */
    @GetMapping("/helloWorld")
    public String helloWorld() {
        if (LOG.isInfoEnabled()) {
            LOG.info("/helloWorld endpoint has been called");
        }
        return "Hello World!";
    }
}
