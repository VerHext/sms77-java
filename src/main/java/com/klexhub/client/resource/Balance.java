package com.klexhub.client.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/balance")
@Consumes(MediaType.APPLICATION_JSON)
public interface Balance {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    double get();

}