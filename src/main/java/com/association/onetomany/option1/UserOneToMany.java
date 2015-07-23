package com.association.onetomany.option1;


import java.util.ArrayList;
import java.util.Collection;

import javassist.expr.NewArray;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserOneToMany {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;

	@OneToMany	
	@JoinTable(name="User_vehicle", joinColumns=@JoinColumn(name="user_id"),
		inverseJoinColumns=@JoinColumn(name="vehicle_id")
	)
	private Collection<VehicleOneToMany> vahicles = new ArrayList<VehicleOneToMany>();

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

	public Collection<VehicleOneToMany> getVahicles() {
		return vahicles;
	}

	public void setVahicles(Collection<VehicleOneToMany> vahicles) {
		this.vahicles = vahicles;
	}

	
	
	
}
