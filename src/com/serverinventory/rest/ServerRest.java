package com.serverinventory.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.serverinventory.entities.Server;
import com.serverinventory.service.ServerService;
import com.serverinventory.service.ServiceException;

import io.swagger.annotations.Api;

@Path("/serverrest")
@Api("/serverrest")
public class ServerRest {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(Server server) {
		try {
			new ServerService().add(server);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Server> list() {
		
		//falta adicionar o listar a classe de serviço
		List<Server> servers = new ServerService().list();
		return servers;
	}
}
