package com.inheritance.singleTableStrategy;

import org.hibernate.Session;
import org.omg.PortableServer.ForwardRequestHelper;

import com.association.manytomany.UserMToM;
import com.association.manytomany.VehicleMToM;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		

		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
	
		VehicleInheritanceBasic inheritanceBasic =  new VehicleInheritanceBasic();
		inheritanceBasic.setVehicleName("Basic Vehicle");
		
		TwoWheelerInheritanceBasic twoWheelerInheritanceBasic = new TwoWheelerInheritanceBasic();
		twoWheelerInheritanceBasic.setVehicleName("Bike");
		twoWheelerInheritanceBasic.setHandle("Yamaha");
		
		
		FourWheelerInheritanceBasic fourWheelerInheritanceBasic = new FourWheelerInheritanceBasic();
		fourWheelerInheritanceBasic.setVehicleName("Car");
		fourWheelerInheritanceBasic.setStearingWheel("Maruti");
		
		session.save(inheritanceBasic);
		session.save(twoWheelerInheritanceBasic);
		session.save(fourWheelerInheritanceBasic);		
		
		session.getTransaction().commit();
		
		session.close();

	
		
	}
}
