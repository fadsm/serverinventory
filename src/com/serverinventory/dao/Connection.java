package com.serverinventory.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connection {
	
	static private EntityManagerFactory emf = Persistence.createEntityManagerFactory("serverinventory");
	
	static public EntityManagerFactory getInstance() {
		return emf;
	}

}
