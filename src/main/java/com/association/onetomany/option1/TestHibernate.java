package com.association.onetomany.option1;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		
		UserOneToMany user = new UserOneToMany();
		user.setUserName("Vinayak");
		
		VehicleOneToMany vahicle1 = new VehicleOneToMany();
		vahicle1.setVahicleName("Car");
		
		VehicleOneToMany vahicle2 = new VehicleOneToMany();
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
