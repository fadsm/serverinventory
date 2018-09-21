package com.serverinventory.service;

import java.util.List;

import com.serverinventory.entities.Cluster;
import com.serverinventory.facade.Facade;

public class ClusterService {
	
	public void add(Cluster cluster) throws ServiceException {
		if (cluster.getName() == null) {
			throw new ServiceException("You cannot add a cluster without name. The name field is currently empty");
		}
				
		new Facade().saveCluster(cluster);
	}

    public List<Cluster> list() {

		return new Facade().getClusters();
    }

	public void edit(Cluster cluster) throws ServiceException {
		if (cluster.getName() == null) {
			throw new ServiceException("Could not edit. Cluster name not found.");
		}
		
		new Facade().updateCluster(cluster);
		
	}

	public void remove(Cluster cluster) throws ServiceException{
		if (cluster.getName() == null) {
			throw new ServiceException("Could not delete. Cluster name not found.");
		}
		
		new Facade().deleteCluster(cluster);
	}

}
