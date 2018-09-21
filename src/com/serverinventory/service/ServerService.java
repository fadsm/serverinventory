package com.serverinventory.service;

import com.serverinventory.entities.Server;
import com.serverinventory.facade.Facade;

import java.util.List;

public class ServerService {
	
	public void add(Server server) throws ServiceException {
		if (server.getName() == null) {
			throw new ServiceException("You cannot add a server without name. The name field is currently empty");
		}
				
		new Facade().saveServer(server);
	}

    public List<Server> list() {

		return new Facade().getServers();
    }

	public void edit(Server server) throws ServiceException {
		if (server.getName() == null) {
			throw new ServiceException("Could not edit. Server name not found.");
		}
		
		new Facade().updateServer(server);
		
	}

	public void remove(Server server) throws ServiceException{
		if (server.getName() == null) {
			throw new ServiceException("Could not delete. Server name not found.");
		}
		
		new Facade().deleteServer(server);
	}
}
