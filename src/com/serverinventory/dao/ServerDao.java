package com.serverinventory.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.serverinventory.entities.Server;

public class ServerDao implements Dao<Server>{

	public static Connection c = new Connection();
	
	public void add(Server server) {
	
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.persist(server);
		em.getTransaction().commit();
			
	}

	@Override
	public void edit(Server server) {
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.merge(server);
		em.getTransaction().commit();
		
	}

	@Override
	public void remove(Server server) {
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.remove(server);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Server> toList() {
		EntityManager em = Connection.getInstance().createEntityManager();
		Query q = em.createQuery("select s from Server s");
		return q.getResultList();
	}

}
