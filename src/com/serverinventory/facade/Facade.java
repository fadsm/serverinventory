package com.serverinventory.facade;

import com.serverinventory.dao.Factory;
import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;
import com.serverinventory.entities.Vcenter;

import java.util.List;

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

	public List<Server> getServers() {

		return Factory.getServerDaoInstace().toList();
	}
	
	public List<Cluster> getClusters() {

		return Factory.getClusterDaoInstance().toList();
	}
	
	public List<Vcenter> getVcenters() {
		
		return Factory.getVcenterDaoInstance().toList();
	}

	public void updateServer(Server ser) {
		
		Factory.getServerDaoInstace().edit(ser);
	}
	
	public void updateCluster(Cluster clu) {
		
		Factory.getClusterDaoInstance().edit(clu);
	}
	
	public void updateVcenter(Vcenter vcenter) {
		
		Factory.getVcenterDaoInstance().edit(vcenter);
		
	}

	public void deleteServer(Server ser) {
		
		Factory.getServerDaoInstace().remove(ser);
		
	}
	
	public void deleteCluster(Cluster clu) {
		
		Factory.getClusterDaoInstance().remove(clu);
		
	}

	public void deleteVcenter(Vcenter vcenter) {
		
		Factory.getVcenterDaoInstance().remove(vcenter);
		
	}
}
