package com.serverinventory.testing;

import org.junit.Test;

import com.serverinventory.dao.ClusterDao;
import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;
import com.serverinventory.service.ServerService;
import com.serverinventory.service.ServiceException;

public class TestingServerOnly {

	@Test
	public void addServerOnly() throws ServiceException	{
		
		Server s = new Server();
		
		
		s.setID(null);
		s.setName("im-cw-ws-666");
		s.setIp("10.10.200.20");
		s.setOperatingSystem("Windows Server 2019");
		s.setSystem("Genesys");
		s.setSubSystem("SBC");
		
		Cluster c = new Cluster();
		
		ClusterDao cd = new ClusterDao();
		
		c = cd.findCluster(4);
		
		s.setCluster(c);
		
		new ServerService().add(s);
		
	}
}
