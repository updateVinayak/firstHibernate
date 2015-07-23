package com.inheritance.singleTableStrategy;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Car")
public class FourWheelerInheritanceBasic extends VehicleInheritanceBasic{
	
	private String stearingWheel;

	public String getStearingWheel() {
		return stearingWheel;
	}

	public void setStearingWheel(String stearingWheel) {
		this.stearingWheel = stearingWheel;
	}
	
	

}
