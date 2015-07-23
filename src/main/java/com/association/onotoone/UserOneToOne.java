package com.association.onotoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class UserOneToOne {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;

	@OneToOne
	@JoinColumn(name="v_id")
	private VehicleOneToOne vahicle;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public VehicleOneToOne getVahicle() {
		return vahicle;
	}

	public void setVahicle(VehicleOneToOne vahicle) {
		this.vahicle = vahicle;
	}
	
	
	
}
