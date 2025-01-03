package org.quarter;

import io.quarkus.runtime.Startup;
import org.quarter.client.hello.HelloClient;

public class StarterApplication {

    private HelloClient client;

    public StarterApplication(HelloClient client) {
        this.client = client;
    }

    @Startup
    public void init() {
        System.out.println("App has started");
        System.out.println("HelloClient from Client sub-module says: " + client.getHello());
    }

}
