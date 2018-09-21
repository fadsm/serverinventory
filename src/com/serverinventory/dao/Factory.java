package com.serverinventory.dao;

import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;
import com.serverinventory.entities.Vcenter;

public class Factory {

	
	static public Dao<Server> getServerDaoInstace() {
		return new ServerDao();
	}
	
	static public Dao<Cluster> getClusterDaoInstance() {		
		return new ClusterDao();
	}
	
	static public Dao<Vcenter> getVcenterDaoInstance() { return new VcenterDao(); }
	
}
