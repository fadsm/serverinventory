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

import com.serverinventory.entities.Cluster;
import com.serverinventory.service.ClusterService;
import com.serverinventory.service.ServiceException;

import io.swagger.annotations.Api;

@Path("/clusterrest")
@Api("/clusterrest")
public class ClusterRest {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void add(Cluster cluster) {
		try {
			new ClusterService().add(cluster);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void edit(Cluster cluster) {
		try {
			new ClusterService().edit(cluster);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void remove(Cluster cluster) {
		try {
			new ClusterService().remove(cluster);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cluster> list() {

		List<Cluster> clusters = new ClusterService().list();
		return clusters;
	}
}
