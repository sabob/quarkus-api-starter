package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class HelloClientIT{

    public HelloClientIT() {
        System.out.println(
                String.format("=========================== %s Integration Test (IT) ================================",
                        this.getClass().getSimpleName()));
    }

    @Inject
    HelloClient helloClient;

    @BeforeEach
    public void setup(){
    }

    @Test
    public void testHello(){
        String response = helloClient.getHello();
        Assertions.assertTrue(response.length() > 0);
    }
}
