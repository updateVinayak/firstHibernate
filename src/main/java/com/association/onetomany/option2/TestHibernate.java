package com.association.onetomany.option2;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		
		UserOneToManyOption2 user = new UserOneToManyOption2();
		user.setUserName("Vinayak");
		
		VehicleOneToManyOption2 vahicle1 = new VehicleOneToManyOption2();
		vahicle1.setVahicleName("Car");
		
		VehicleOneToManyOption2 vahicle2 = new VehicleOneToManyOption2();
		vahicle2.setVahicleName("Jeep");
		
		user.getVahicles().add(vahicle1);
		user.getVahicles().add(vahicle2);
		vahicle1.setUser(user);
		vahicle2.setUser(user);
		
		
		session.save(user);
		session.save(vahicle1);
		session.save(vahicle2);
		
		session.getTransaction().commit();
		
		session.close();

	}
}
