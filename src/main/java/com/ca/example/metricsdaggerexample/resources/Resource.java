
package com.ca.example.metricsdaggerexample.resources;

import com.codahale.metrics.annotation.Timed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class Resource {

	@Timed
	@GET
	public String getTest() throws Exception
    {
		return "TEST";
    }
}
