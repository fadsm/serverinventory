package com.serverinventory.service;

import com.serverinventory.dao.ServerDao;
import com.serverinventory.entities.Server;

public class ServerService {
	
	public void add(Server server) {
		if (server.getName() == null) {
			//error
		}
		new ServerDao().add(server);
	}

}
