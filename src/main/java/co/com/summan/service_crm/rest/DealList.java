package co.com.summan.service_crm.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class DealList {

//	@GET
//	@Path("rest/{idUsuario}/{token}/crm.deal.list.json")
//	@Consumes({ MediaType.APPLICATION_XML})
//	@Produces({ MediaType.APPLICATION_XML})
//	public String dealList (@PathParam("idUsuario") String idUsuario , @PathParam("token") String token) {
//		return null;
//	}
	
	@GET
	@Path("rest/{idUsuario}/{token}/user.get.xml")
	@Consumes({ MediaType.APPLICATION_XML})
	@Produces({ MediaType.APPLICATION_XML})
	public String userList (@PathParam("idUsuario") String idUsuario , @PathParam("token") String token) {
		return null;
	}	
}