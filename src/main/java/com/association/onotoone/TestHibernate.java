package com.association.onotoone;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		
		UserOneToOne user = new UserOneToOne();
		user.setUserName("Vinayak");
		
		VehicleOneToOne vahicle = new VehicleOneToOne();
		vahicle.setVahicleName("Car");
		
		user.setVahicle(vahicle);
		
		
		session.save(user);
		session.save(vahicle);
		session.getTransaction().commit();
		
		session.close();

	}
}
