package com.association.onotoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class VehicleOneToOne {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int vehicleId;
	
	private String vahicleName;

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
