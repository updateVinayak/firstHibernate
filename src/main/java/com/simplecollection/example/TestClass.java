package com.simplecollection.example;

import org.hibernate.Session;

import com.simplecollection.example.Address;

import firstHibernate.HibernateUtil;

public class TestClass {
	
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		UserInfo user = new UserInfo();
		user.setUserName("Vinayak Sawant");
		
		
		Address address= new Address();
		address.setCity("mumbai");
		address.setPincode("400101");
		address.setState("Maha");
		address.setStreet("IC");
		
		
		
		Address office = new Address();
		office.setCity("Vashi");
		office.setPincode("12344");
		office.setState("Mahara");
		office.setStreet("srsrsr");
		
		user.getAddresses().add(address);
		user.getAddresses().add(office);
		
		session.save(user);
		session.getTransaction().commit();
		
		session.close();

	}

}
