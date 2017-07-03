
package com.ca.example.metricsdaggerexample.resources;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

@Path("/")
public class Resource {

    @Context
    UriInfo url;

    @Context
    Request request;

    String name;
	
	MetricRegistry metricRegistry = new MetricRegistry();

	@Timed
    @GET
    public String getTest() throws Exception
    {
		return "TEST";
    }
}
