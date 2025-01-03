package org.quarter;

import io.quarkus.runtime.Startup;

public class quarterApplication {

    @Startup
    public void init() {
        System.out.println("App has started");
    }

}
