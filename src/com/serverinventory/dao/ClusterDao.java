package com.serverinventory.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.serverinventory.entities.Cluster;
import com.serverinventory.entities.Server;

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
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.merge(cluster);
		em.getTransaction().commit();	
	}

	@Override
	public void remove(Cluster cluster) {
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.remove(cluster);
		em.getTransaction().commit();
		
	}

	public List<Cluster> toList() {
		EntityManager em = Connection.getInstance().createEntityManager();
		Query q = em.createQuery("select c from Cluster c");
		return q.getResultList();
}
	
	public Cluster findCluster(int id) {
		
		EntityManager em = Connection.getInstance().createEntityManager();
	    return em.find(Cluster.class, id);
	    
	  }

}
