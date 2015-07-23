package com.association.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class VehicleMToM {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	private String vahicleName;
	
	@ManyToMany(mappedBy="vahicles")
	private Collection<UserMToM> users = new ArrayList<UserMToM>();
		

	public Collection<UserMToM> getUsers() {
		return users;
	}

	public void setUsers(Collection<UserMToM> users) {
		this.users = users;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVahicleName() {
		return vahicleName;
	}

	public void setVahicleName(String vahicleName) {
		this.vahicleName = vahicleName;
	}
	
	
	
	

	
}
