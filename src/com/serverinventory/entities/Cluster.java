package com.serverinventory.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Cluster {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	
	@JsonManagedReference
	@OneToMany(mappedBy="cluster", cascade = CascadeType.ALL)
	private List<Server> servers;

	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
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
