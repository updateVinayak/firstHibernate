package com.compositePrimaryKey.option3;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		AddressOption3 address = new AddressOption3();
		address.setZip("400103");
		
		UserIdOption3 userId = new UserIdOption3();
		userId.setUserId(1);
		
		
		UserOption3 user = new UserOption3();
		user.setUserId(userId);
		user.setAddress(address);
		
		
		session.save(user);
		session.getTransaction().commit();
		
		session.close();

	}
}
