package co.com.summan.service_crm.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
public class DealList {

	@GET
	@Path("/")
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})
	public String dealList () {
//	public String dealList (@QueryParam("filter[>CLOSEDATE]") @DefaultValue("") String filyerDate) {
		return null;
	}
}
