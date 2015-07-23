package com.inheritance.joined;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class FourWheelJoined extends VehicleJoined{
	
	private String stearingWheel;

	public String getStearingWheel() {
		return stearingWheel;
	}

	public void setStearingWheel(String stearingWheel) {
		this.stearingWheel = stearingWheel;
	}
	
	

}
