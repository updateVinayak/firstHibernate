package com.inheritance.joined;

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
	
		VehicleJoined inheritanceBasic =  new VehicleJoined();
		inheritanceBasic.setVehicleName("Basic Vehicle");
		
		TwoWheelerJoined twoWheelerInheritanceBasic = new TwoWheelerJoined();
		twoWheelerInheritanceBasic.setVehicleName("Bike");
		twoWheelerInheritanceBasic.setHandle("Yamaha");
		
		
		FourWheelJoined fourWheelerInheritanceBasic = new FourWheelJoined();
		fourWheelerInheritanceBasic.setVehicleName("Car");
		fourWheelerInheritanceBasic.setStearingWheel("Maruti");
		
		session.save(inheritanceBasic);
		session.save(twoWheelerInheritanceBasic);
		session.save(fourWheelerInheritanceBasic);		
		
		session.getTransaction().commit();
		
		session.close();

	
		
	}
}
