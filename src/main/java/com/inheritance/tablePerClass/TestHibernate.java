package com.inheritance.tablePerClass;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {
	
	public static void main(String[] args) {
		

		

		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
	
		VehicleTablePerClass inheritanceBasic =  new VehicleTablePerClass();
		inheritanceBasic.setVehicleName("Basic Vehicle");
		
		TwoWheelTablePerClass twoWheelerInheritanceBasic = new TwoWheelTablePerClass();
		twoWheelerInheritanceBasic.setVehicleName("Bike");
		twoWheelerInheritanceBasic.setHandle("Yamaha");
		
		
		FourWheelTablePerClass fourWheelerInheritanceBasic = new FourWheelTablePerClass();
		fourWheelerInheritanceBasic.setVehicleName("Car");
		fourWheelerInheritanceBasic.setStearingWheel("Maruti");
		
		session.save(inheritanceBasic);
		session.save(twoWheelerInheritanceBasic);
		session.save(fourWheelerInheritanceBasic);		
		
		session.getTransaction().commit();
		
		session.close();

	
		
	
		
	}

}
