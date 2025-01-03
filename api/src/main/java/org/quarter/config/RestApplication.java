package org.quarter.config;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

// Configures the global path for REST requests
@ApplicationPath("/api")
public class RestApplication extends Application {
    // This class can be empty or configure specific JAX-RS features
}
