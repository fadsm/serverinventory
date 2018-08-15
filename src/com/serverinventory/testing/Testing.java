package com.serverinventory.testing;

import java.util.ArrayList;

import org.junit.Test;

import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;
import com.serverinventory.entities.Vcenter;
import com.serverinventory.facade.Facade;


public class Testing {

	@Test
	public void attemptToAdd() {
		
		Server s = new Server();
		
		s.setID(null);
		s.setName("mz-cw-ap-021");
		s.setIp("10.215.215.10");
		s.setOperatingSystem("Windows 2012 R2");
		s.setSystem("Genesys");
		s.setSubSystem("Genesys Mobile Services 2");
		
		
		Cluster c = new Cluster();
		
		c.setId(null);
		c.setName("Next Cloud Camada 1");
		
				
		
		Vcenter v = new Vcenter();
		
		v.setId(null);
		v.setName("IM-VV-AP-118");
		v.setVersion("10.215.12.12");
		
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
		
		Facade fac = new Facade();
		
		fac.saveServer(s);
		
				
	}

}
