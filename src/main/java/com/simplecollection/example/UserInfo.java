package com.simplecollection.example;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserInfo {

	@Id @GeneratedValue
	private int userId;
	
	private String userName;
	
	//@ElementCollection : this will create a simple collection with address class.
	// this will create a table with name Userinfo_Address (both the classes) to store the address
	// this new table is having refernce of user and the column name is userinfo_userid (table_tableid)
	// please note there is no mapping at  the  address side. this is the most simple mapping of collection saving
	// @ElementCollection(fetch=FetchType.EAGER) this is eager fetching
	@ElementCollection
	private Set<Address> addresses = new HashSet<Address>();


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



	public Set<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
	
	
	
}
