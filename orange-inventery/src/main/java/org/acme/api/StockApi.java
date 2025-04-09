package org.acme.api;

import java.util.List;

import org.acme.model.Produit;
import org.acme.service.StockService;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/api/stock")
public class StockApi {

	@Inject
	StockService service;
	
	@POST
	public Produit addprd(Produit p)
	{
		p=service.addprd(p);
		return p;
	}
	@GET
	public List<Produit> allprd()
	{
		return service.allprd();
	}
	
	@GET
	@Path("/{id}")
	public Produit findprd(@PathParam("id") long id)
	{
		return service.findPrdbyId(id).orElseThrow();
	}
}
