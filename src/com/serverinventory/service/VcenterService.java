package com.serverinventory.service;

import java.util.List;

import com.serverinventory.entities.Vcenter;
import com.serverinventory.facade.Facade;

public class VcenterService {
	
	public void add(Vcenter vcenter) throws ServiceException {
		if (vcenter.getName() == null) {
			throw new ServiceException("You cannot add a vcenter without name. The name field is currently empty");
		}
				
		new Facade().saveVcenter(vcenter);
	}

    public List<Vcenter> list() {

		return new Facade().getVcenters();
    }

	public void edit(Vcenter vcenter) throws ServiceException {
		if (vcenter.getName() == null) {
			throw new ServiceException("Could not edit. Vcenter name not found.");
		}
		
		new Facade().updateVcenter(vcenter);
		
	}

	public void remove(Vcenter vcenter) throws ServiceException{
		if (vcenter.getName() == null) {
			throw new ServiceException("Could not delete. Vcenter name not found.");
		}
		
		new Facade().deleteVcenter(vcenter);
	}

}
