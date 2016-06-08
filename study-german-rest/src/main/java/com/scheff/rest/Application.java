package com.scheff.rest;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * @author Serg Petrochenko
 *         21/05/16.
 */
@ApplicationPath("/")
public class Application extends ResourceConfig {

    public Application() {
        packages("com.scheff.rest");
    }
}
