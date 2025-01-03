package org.acme;

import io.quarkus.runtime.Startup;

public class AcmeApplication {

    @Startup
    public void init() {
        System.out.println("App has started");
    }

}
