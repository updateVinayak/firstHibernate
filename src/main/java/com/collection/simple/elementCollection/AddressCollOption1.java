package com.collection.simple.elementCollection;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Embeddable
public class AddressCollOption1 {

	private String street;
	
	private String flatNumber;

	private String zip;
	
	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}


	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	
	
	

}
