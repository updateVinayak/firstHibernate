package com.compositePrimaryKey.option2;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		UserIdOption2 userId = new UserIdOption2();
		userId.setFirstName("Vinayak");
		userId.setLastName("Sawant");
		
		UserOption2 user = new UserOption2();
		user.setFirstName("Vinayak");
		user.setLastName("Sawant");
		user.setAge(34);
		user.setPhoneNumber(981);
		
		
	
		
		
		session.save(user);
		session.getTransaction().commit();
		
		session.close();

		

	}
}
