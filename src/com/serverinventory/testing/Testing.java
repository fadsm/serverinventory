package com.serverinventory.testing;

import java.util.ArrayList;

import org.junit.Test;

import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;
import com.serverinventory.entities.Vcenter;
import com.serverinventory.service.ServerService;
import com.serverinventory.service.ServiceException;


public class Testing {

	@Test
	public void attemptToAdd() throws ServiceException {
		
		Server s = new Server();
		
		s.setID(null);
		s.setName("im-cw-ws-666");
		s.setIp("10.10.200.20");
		s.setOperatingSystem("Windows Server 2019");
		s.setSystem("Genesys");
		s.setSubSystem("SBC");
		
		
		Cluster c = new Cluster();
		
		c.setId(null);
		c.setName("Next Cloud Camada 6");
								
		Vcenter v = new Vcenter();
		
		v.setId(null);
		v.setName("IM-VV-AP-063");
		v.setVersion("10.100.0.10");
		
		//adiciona vcenter ao cluster
		c.setVcenter(v);
		
		//adiciona lista de servidores ao cluster
		c.setServers(new ArrayList<Server>());
		c.getServers().add(s);
		
		//seta o cluster do servidor
		s.setCluster(c);
		
		//adiciona lista de clusters no vcenter
		v.setClusters(new ArrayList<Cluster>());
		v.getClusters().add(c);
		
		
		//Instancia facade e chama o serverdao atrav�s dele
		new ServerService().add(s);
				
	}

}
