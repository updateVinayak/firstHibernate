package com.compositePrimaryKey.option1;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class UserOption1 {

	@EmbeddedId
	@AttributeOverride(name="firstName", column=@Column(name="first_name"))
	private UserIdOption1 id;
	
	private Integer age;
	
	private Integer phoneNumber;

	public UserIdOption1 getId() {
		return id;
	}

	public void setId(UserIdOption1 id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
}
