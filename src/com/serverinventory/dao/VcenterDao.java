package com.serverinventory.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.serverinventory.entities.Vcenter;

public class VcenterDao implements Dao<Vcenter>{

	public static Connection c = new Connection();
	
	@Override
	public void add(Vcenter vcenter) {
		
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.persist(vcenter);
		em.getTransaction().commit();
		
	}

	@Override
	public void edit(Vcenter vcenter) {
		
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.merge(vcenter);
		em.getTransaction().commit();
		
	}

	@Override
	public void remove(Vcenter vcenter) {
		EntityManager em = Connection.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.remove(vcenter);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Vcenter> toList() {
		EntityManager em = Connection.getInstance().createEntityManager();
		Query q = em.createQuery("select v from Vcenter v");
		return q.getResultList();
	}

}
