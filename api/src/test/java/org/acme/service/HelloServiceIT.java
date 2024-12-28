package org.acme.service;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class HelloServiceIT {

    public HelloServiceIT() {
        System.out.println(
                String.format(
                        "=========================== %s Integration Test (IT) ================================",
                        this.getClass()
                                .getSimpleName()
                )
        );
    }

    @Inject
    HelloService helloService;

    @BeforeEach
    public void setup() {
        // Setup logic (if any) goes here
    }

    @Test
    public void testHello() {
        String response = helloService.hello();
        Assertions.assertNotNull(
                response,
                "Response should not be null"
        );
        Assertions.assertFalse(
                response.isEmpty(),
                "Response should not be empty"
        );
    }

}
