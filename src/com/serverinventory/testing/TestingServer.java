package com.serverinventory.testing;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.serverinventory.dao.Facade;
import com.serverinventory.entities.Server;

public class TestingServer {
	
	@Test
	public void attemptCreateNewServer(){
					
		Server s = new Server();
		
		s.setID(null);
		s.setName("mz-cw-ap-021");
		s.setIp("10.215.215.10");
		s.setOperatingSystem("Windows 2012 R2");
		s.setSystem("Genesys");
		s.setSubSystem("Genesys Mobile Services 2");
		
		Facade.getServerDaoInstace().add(s);
	
		assertEquals(true, s.getID() != null);
 
	}

}
