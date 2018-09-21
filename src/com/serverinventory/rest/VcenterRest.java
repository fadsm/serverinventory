package com.serverinventory.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.serverinventory.entities.Vcenter;
import com.serverinventory.service.ServiceException;
import com.serverinventory.service.VcenterService;

import io.swagger.annotations.Api;

@Path("/vcenterrest")
@Api("/vcenterrest")
public class VcenterRest {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(Vcenter vcenter) {
		try {
			new VcenterService().add(vcenter);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void edit(Vcenter vcenter) {
		try {
			new VcenterService().edit(vcenter);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Vcenter vcenter) {
		try {
			new VcenterService().remove(vcenter);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Vcenter> list() {

		List<Vcenter> vcenters = new VcenterService().list();
		return vcenters;
	}
}
