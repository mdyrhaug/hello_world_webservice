package com.marksbasement.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.tags.*;
import io.swagger.v3.oas.annotations.Operation;

/**
 * @author Mark Dyrhaug
 * @ since 02/16/2026
 *
 * This class is a simple endpoint class.
 */
@RestController
@Tag(name = "Echo Endpoints", description = "Operations that parrot back information.")
public class  HelloWorldAPI {

    /**
     * General logger.
     */
    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldAPI.class);

    /**
     * This endpoint will return the string 'Hello World.
     * @return String Hello World
     */
    @Operation(
            summary = "Says hello to the world",
            description = "This enpdoint was created to learn spring boot.",
            tags = {"Learning", "Simple"}
    )
    @GetMapping("/helloWorld")
    public String helloWorld() {
        if (LOG.isInfoEnabled()) {
            LOG.info("/helloWorld endpoint has been called");
        }
        return "Hello World!";
    }
}
