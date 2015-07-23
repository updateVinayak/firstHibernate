package com.association.onetomany.option1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VehicleOneToMany {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	private String vahicleName;
	
	@ManyToOne
	private UserOneToMany user;
	
	

	public UserOneToMany getUser() {
		return user;
	}

	public void setUser(UserOneToMany user) {
		this.user = user;
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
