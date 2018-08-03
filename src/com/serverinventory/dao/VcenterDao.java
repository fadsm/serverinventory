package com.serverinventory.dao;

import java.util.List;

import javax.persistence.EntityManager;

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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Vcenter vcenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vcenter> toList() {
		// TODO Auto-generated method stub
		return null;
	}

}
