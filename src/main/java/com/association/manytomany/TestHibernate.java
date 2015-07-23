package com.association.manytomany;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
	
		UserMToM user = new UserMToM();
		user.setUserName("Vinayak");
		
		VehicleMToM vahicle1 = new VehicleMToM();
		vahicle1.setVahicleName("Car");
		
		VehicleMToM vahicle2 = new VehicleMToM();
		vahicle2.setVahicleName("Jeep");
	
		
		user.getVahicles().add(vahicle1);
		user.getVahicles().add(vahicle2);
		vahicle1.getUsers().add(user);
		//vahicle1.getUsers().add(user1);
		
		/*
		user1.getVahicles().add(vahicle1);
		user1.getVahicles().add(vahicle2);*/
		vahicle2.getUsers().add(user);
		//vahicle2.getUsers().add(user1);
		
		session.save(vahicle1);
		session.save(vahicle2);
		
		session.save(user);
		//session.save(user1);
		
		
		session.getTransaction().commit();
		
		session.close();

	}
}
