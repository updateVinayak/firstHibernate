package com.association.onetomany.option2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class VehicleOneToManyOption2 {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	private String vahicleName;
	
	@ManyToOne
	@JoinColumn(name="User_id")
	private UserOneToManyOption2 user;

	public UserOneToManyOption2 getUser() {
		return user;
	}

	public void setUser(UserOneToManyOption2 user) {
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
