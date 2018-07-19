package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@Path("/hello")  // This means that with respect to my project URL if i give "/hello" then it should point to this location. Annotation is form of  asyntactical meta data. It can be added to the java code and executed while running the program.
public class Hello {
    // GET reads the resource
	@GET
	@Produces(MediaType.TEXT_XML)	//specify which kind of resource is going to come
	public String sayHello() {
        String resource = "<? xml version='1.0' ?>"+"<hello>Hi Neha, This is hello from XML</hello>";
		return resource;
		
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)	//specify which kind of resource is going to come
	public String sayHelloJSON() {
		return "Hello";
		
	}
	@GET
	@Produces(MediaType.TEXT_HTML)	//specify which kind of resource is going to come
	public String sayHelloHTML() {
		String resource = "<h1>Hi Neha, This is hello from HTML</h1>";
		return resource;
		
	}
}
