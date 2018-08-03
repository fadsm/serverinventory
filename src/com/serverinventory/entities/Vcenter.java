package com.serverinventory.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vcenter {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	String name;
	String version;
	
	
	@OneToMany(mappedBy="vcenter")
	private List<Cluster> clusters;


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


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public List<Cluster> getClusters() {
		return clusters;
	}


	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}
	
}
