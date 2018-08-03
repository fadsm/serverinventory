package com.serverinventory.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.serverinventory.entities.Cluster;

public class ClusterDao implements Dao<Cluster> {

	public static Connection c = new Connection();
	
	@Override
	public void add(Cluster cluster) {
		
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.persist(cluster);
		em.getTransaction().commit();
		
	}

	@Override
	public void edit(Cluster cluster) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Cluster cluster) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cluster> toList() {
		// TODO Auto-generated method stub
		return null;
	}

}
