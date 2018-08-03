package com.serverinventory.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Cluster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	
	@OneToMany(mappedBy="cluster")
	private List<Server> servers;

	@ManyToOne
	Vcenter vcenter;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Server> getServers() {
		return servers;
	}

	public void setServers(List<Server> servers) {
		this.servers = servers;
	}

	public Vcenter getVcenter() {
		return vcenter;
	}

	public void setVcenter(Vcenter vcenter) {
		this.vcenter = vcenter;
	}
}
