package com.compositePrimaryKey.option3;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

@Entity
public class UserOption3 {

	@EmbeddedId
	private UserIdOption3 userId;
	
	@OneToOne
	@MapsId("addId")
	@JoinColumn(name="Address_id")
	private AddressOption3 address;

	public UserIdOption3 getUserId() {
		return userId;
	}

	public void setUserId(UserIdOption3 userId) {
		this.userId = userId;
	}

	public AddressOption3 getAddress() {
		return address;
	}

	public void setAddress(AddressOption3 address) {
		this.address = address;
	}
	
	
	
}
