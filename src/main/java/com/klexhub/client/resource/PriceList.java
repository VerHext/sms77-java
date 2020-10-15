package com.klexhub.client.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.klexhub.client.resource.model.PriceResponse;
import com.klexhub.client.resource.type.PriceListFormat;

@Path("/pricing")
@Consumes(MediaType.APPLICATION_JSON)
public interface PriceList {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    PriceResponse getJson(@DefaultValue("de") @QueryParam("country") String countryCode,
            @DefaultValue("json") @QueryParam("format") final PriceListFormat format);

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    String getCSV(@DefaultValue("de") @QueryParam("country") String countryCode,
            @DefaultValue("csv") @QueryParam("format") final PriceListFormat format);

}
