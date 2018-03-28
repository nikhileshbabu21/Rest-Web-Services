package com.marlabs.rest;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;



@Path("/jsonServices")
public class StudentService {

	@GET
	@Path("/print/{name}/{email}/{password}")
	@Produces(MediaType.APPLICATION_JSON)
	public Student produceJSON(@PathParam("Name") String name, @PathParam("Email") String email, @PathParam("Password") String password) {

		Student st = new Student(email, name, "1234");
		return st;
	}

	@POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON(Student student) {
		String output = "";
		// String output = student.toString();
		ObjectMapper mapper = new ObjectMapper();

		try {
			// convert user object to json string, and save to a file
			mapper.writeValue(new File("user.json"), student);

			// display to console
			output = mapper.writeValueAsString(student);
			System.out.println("777:" + output);
			output = student.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return Response.status(200).entity(output).build();
	}

} // producing is done why creating object and consuming is done by creating model

//
//@POST
//@Path("/post")
//@Consumes(MediaType.APPLICATION_JSON)
//public Response createTrackInJSON(Track track) {
//
//	String result = "Track saved : " + track;
//	return Response.status(201).entity(result).build();
//	