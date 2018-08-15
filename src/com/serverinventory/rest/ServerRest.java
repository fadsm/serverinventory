package com.serverinventory.rest;

import javax.ws.rs.Path;

import com.serverinventory.entities.Server;
import com.serverinventory.facade.Facade;

import io.swagger.annotations.Api;

@Path("/serverrest")
@Api("/serverrest")
public class ServerRest {
	
	public void add(Server server) {
		try {
			Facade fac = new Facade();
			fac.saveServer(server);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
