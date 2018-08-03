package com.serverinventory.testing;

import org.junit.Test;

import com.serverinventory.dao.Facade;
import com.serverinventory.entities.Vcenter;

public class TestingVcenter {
	
	@Test
	public void attemptToCreateVcenter(){
		
		Vcenter v = new Vcenter();
		
		v.setId(null);
		v.setName("IM-VV-AP-118");
		v.setVersion("10.2.12");
		
		Facade.getVcenterDaoInstance().add(v);
		
	}
	

}
