package org.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloClientTest {

    public HelloClientTest() {
        System.out.println(String.format("-------------------------- %s Unit Test ---------------------------------",
                this.getClass().getSimpleName()));
    }

    HelloClient helloClient;

    @BeforeEach
    public void setup() {
        helloClient = new HelloClient();
    }

    @Test
    public void testHello() {
        String response = helloClient.getHello();
        Assertions.assertTrue(response.length() > 0);
    }
}
