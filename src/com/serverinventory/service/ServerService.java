package com.serverinventory.service;

import com.serverinventory.entities.Server;
import com.serverinventory.facade.Facade;

public class ServerService {
	
	public void add(Server server) throws ServiceException {
		if (server.getName() == null) {
			throw new ServiceException("You cannot add a server without name. The name field is currently empty");
		}
				
		new Facade().saveServer(server);
	}

}
