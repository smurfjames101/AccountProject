package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.AccountService;

@Path("/Account")
public class AccountEndpoint {
	
	@Inject
	private AccountService service;
	
	@Path("/getAllAccounts")
	@GET
	@Produces({"application/json"})
	public String getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@Path("/getAnAccount/{id}")
	@GET
	@Produces({"application/json"})
	public String getAnAccount(@PathParam("id") Long id)
	{
		return service.getAnAccount(id);
	}
	
	@Path("/createAccount")
	@POST
	@Produces({"application/json"})
	public String createAccount(String recipe)
	{
		return service.createAccount(recipe);
	}
	
	@Path("/deleteAccount/{id}")
	@DELETE
	@Produces({"application/json"})
	public String deleteAccount(@PathParam("id") Long id)
	{
		return service.deleteAccount(id);
	}
	
	@Path("/getNAccounts/{n}")
	@GET
	@Produces({"application/json"})
	public String getNAccounts(@PathParam("n") int n)
	{
		return service.getNAccounts(n);
	}
	public void setService(AccountService service) {
		this.service = service;
	}
	@Path("/updateAccount/{id}")
	@PUT
	@Produces({"application/json"})
	public String updateAccount(@PathParam("id") Long id,String account)
	{
		return service.updateAccount(account, id);
	}
	
	
}
