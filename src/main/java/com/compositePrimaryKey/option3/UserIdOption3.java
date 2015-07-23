package com.compositePrimaryKey.option3;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class UserIdOption3 implements Serializable{
	
	private Integer userId;
	
	private Integer addId;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getAddId() {
		return addId;
	}

	public void setAddId(Integer addId) {
		this.addId = addId;
	}

	
	
	

}
