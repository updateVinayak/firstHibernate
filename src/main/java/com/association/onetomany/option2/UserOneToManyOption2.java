package com.association.onetomany.option2;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class UserOneToManyOption2 {


	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="User_id")
	private int userId;
	
	private String userName;

	@OneToMany(mappedBy="user")	
	private Set<VehicleOneToManyOption2> vahicles = new HashSet<VehicleOneToManyOption2>();

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

	public Set<VehicleOneToManyOption2> getVahicles() {
		return vahicles;
	}

	public void setVahicles(Set<VehicleOneToManyOption2> vahicles) {
		this.vahicles = vahicles;
	}

	
	
	

	
}
