package com.serverinventory.facade;

import com.serverinventory.dao.Factory;
import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;
import com.serverinventory.entities.Vcenter;

public class Facade {
	public void saveCluster(Cluster clu) {
		
		Factory.getClusterDaoInstance().add(clu);
	}
	
	public void saveServer(Server ser) {
		
		Factory.getServerDaoInstace().add(ser);
		
	}
	
	public void saveVcenter(Vcenter vcen) {
		
		Factory.getVcenterDaoInstance().add(vcen);
	}
}
