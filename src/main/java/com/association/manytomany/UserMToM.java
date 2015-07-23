package com.association.manytomany;


import java.util.ArrayList;
import java.util.Collection;

import javassist.expr.NewArray;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserMToM {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
	private String userName;

	@ManyToMany
	private Collection<VehicleMToM> vahicles = new ArrayList<VehicleMToM>();

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

	public Collection<VehicleMToM> getVahicles() {
		return vahicles;
	}

	public void setVahicles(Collection<VehicleMToM> vahicles) {
		this.vahicles = vahicles;
	}

	
	
	
}
