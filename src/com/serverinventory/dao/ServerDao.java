package com.serverinventory.dao;

import java.util.List;

import javax.persistence.EntityManager;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Server server) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Server> toList() {
		// TODO Auto-generated method stub
		return null;
	}

}
