package com.test;

import java.util.List;

import org.apache.catalina.User;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String simplePlainTextResponse()
	{
		return "This is simple Restful web servivce Plain text Response";
	}
	
	@GET
	@Produces
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit") String card)
	{
		return "<html><body> <h1> Simple RestAPI HTML Response card no : " +card+ "</h1> </body></html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg )
	{
		return msg;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUsersData()
	{
		UserDetails u1 = new UserDetails(1, "Mon" , "C", "mon@c.com", 237834673 );
		UserDetails u2 = new UserDetails(1, "Min" , "B", "moin@b.com", 223582358 );		
		UserDetails u3 = new UserDetails(1, "pan" , "L", "pan@l.com", 223565673 );
		return List.of(u1,u2,u3);
	}
}
