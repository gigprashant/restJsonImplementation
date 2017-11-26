package com.f1soft.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author sadhana.dahal
 */
@Path("/")
public class DefaultResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String welcomeMessage() {
        return "<h2> BACKEND RUNNING </h2>";
    }
}
