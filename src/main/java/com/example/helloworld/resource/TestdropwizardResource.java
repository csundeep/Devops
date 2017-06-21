package com.example.helloworld.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/1.0/test")
public class TestdropwizardResource {

	public TestdropwizardResource() {

	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello(@QueryParam("name") String name) {
		return "Hi  " + name;
	}

}
