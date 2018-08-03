package com.serverinventory.testing;

import org.junit.Test;

import com.serverinventory.dao.Facade;
import com.serverinventory.entities.Cluster;

public class TestingCluster {

	@Test
	public void attemptToCreateCluster(){
		
		Cluster c = new Cluster();
		
		c.setId(null);
		c.setName("Next Cloud Camada 1");
		
		Facade.getClusterDaoInstance().add(c);
	}
	
}
