package com.collection.list;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
public class UserList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;

	private String userName;

	@ElementCollection
	@JoinTable(name = "User_address1", joinColumns = @JoinColumn(name = "user_id"))
	@GenericGenerator(name="hilo-gen", strategy="hilo" )
	@CollectionId(columns = { @Column(name="address_id") }, generator = "hilo-gen", type = @Type(type = "long"))
	private Collection<AddressList> listOfAddress = new ArrayList<AddressList>();

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

	public Collection<AddressList> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<AddressList> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}

	
	

	


}
