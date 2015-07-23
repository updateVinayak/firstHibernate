package com.compositePrimaryKey.option1;

import org.hibernate.Session;

import com.simplecollection.example.Address;
import com.simplecollection.example.UserInfo;

import firstHibernate.HibernateUtil;

public class TestHibernate {
	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		UserIdOption1 userId = new UserIdOption1();
		userId.setFirstName("Vinayak");
		userId.setLastName("Sawant");
		
		UserOption1 user = new UserOption1();
		user.setId(userId);
		user.setAge(34);
		user.setPhoneNumber(981);
		
		
	
		
		
		session.save(user);
		session.getTransaction().commit();
		
		session.close();

		
		
	}

}
