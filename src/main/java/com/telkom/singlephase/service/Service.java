package com.telkom.singlephase.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/")
public class Service {

	@POST
	@Path("/processBalanceTopUp")
	public void processBalanceTopUp(String body) 
	{
		
	}
}
