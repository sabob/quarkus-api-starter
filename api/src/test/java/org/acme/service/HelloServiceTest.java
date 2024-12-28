package org.acme.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloServiceTest {

    public HelloServiceTest() {
        System.out.println(
                String.format(
                        "-------------------------- %s Unit Test ---------------------------------", this.getClass()
                                .getSimpleName()
                )
        );
    }

    HelloService helloService;

    @BeforeEach
    public void setup() {
        helloService = new HelloService();
    }

    @Test
    public void testHello() {
        String response = helloService.hello();
        Assertions.assertTrue(response.length() > 0);
    }

}
