package com.mycompany.camel.spring.dm;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;



@Path("/")
public class InputDataEndpoint {
	
	public InputDataEndpoint() {
		
	}
	
	@POST
	@Path("/weather")
	@Consumes("application/json")
	@Produces("application/json")
	public String getWeather(String data) {
		System.out.println("Called the frontend Service - in getWeather : " + data);
		return "";
	}
}
