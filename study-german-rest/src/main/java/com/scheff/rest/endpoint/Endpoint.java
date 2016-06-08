package com.scheff.rest.endpoint;

import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Serg Petrochenko
 *         21/05/16.
 */
@Path("/api")
@Produces("application/json")
@Controller
public class Endpoint {

    @GET
    public String hello() {
        return "Hello world";
    }
}
