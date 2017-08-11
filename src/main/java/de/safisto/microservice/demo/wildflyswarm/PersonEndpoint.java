package de.safisto.microservice.demo.wildflyswarm;


import de.safisto.microservice.demo.wildflyswarm.data.Person;

import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import java.util.Arrays;
import java.util.List;

@Path("/person")
public class PersonEndpoint {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{id}")
	public Person getById(@PathParam("id") Integer id) {
		return new Person(1,"Hans", "Wurst");
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/ids")
	public List<Integer> getIds() {
		List<Integer> ids = Arrays.asList(1,2,3);
		return ids;
	}

}