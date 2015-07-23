package com.inheritance.tablePerClass;

import javax.persistence.Entity;

@Entity
public class FourWheelTablePerClass extends VehicleTablePerClass{

	private String stearingWheel;

	public String getStearingWheel() {
		return stearingWheel;
	}

	public void setStearingWheel(String stearingWheel) {
		this.stearingWheel = stearingWheel;
	}

	
}
