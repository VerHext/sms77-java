package com.klexhub.client.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.klexhub.client.resource.model.CnamLookupResponse;
import com.klexhub.client.resource.model.FormatLookupResponse;
import com.klexhub.client.resource.model.HlrLookupResponse;
import com.klexhub.client.resource.type.LookupTypes;

@Path("/lookup")
@Consumes(MediaType.APPLICATION_JSON)
public interface Lookup {
        @GET
        @Produces(MediaType.APPLICATION_JSON)
        FormatLookupResponse checkFormat(@QueryParam("number") String number,
                        @QueryParam("type") @DefaultValue("format") String type);

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        String checkMNP(@QueryParam("number") String number, @QueryParam("type") @DefaultValue("mnp") String type,
                        @QueryParam("json") @DefaultValue("1") int json);

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        HlrLookupResponse checkHLR(@QueryParam("number") String number,
                        @QueryParam("type") @DefaultValue("hlr") String type);

        @GET
        @Produces(MediaType.APPLICATION_JSON)
        CnamLookupResponse checkCNAM(@QueryParam("number") String number,
                        @QueryParam("type") @DefaultValue("cnam") String type);

}