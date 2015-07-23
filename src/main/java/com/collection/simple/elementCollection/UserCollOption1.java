package com.collection.simple.elementCollection;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity
public class UserCollOption1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	@ElementCollection
	@JoinTable(name = "User_address", joinColumns = @JoinColumn(name = "address_id"))
	private Set<AddressCollOption1> listOfAddress = new HashSet<AddressCollOption1>();

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

	public Set<AddressCollOption1> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Set<AddressCollOption1> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

}
