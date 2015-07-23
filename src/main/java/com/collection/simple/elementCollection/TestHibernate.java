package com.collection.simple.elementCollection;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		UserCollOption1 user = new UserCollOption1();
		
		user.setUserName("Vinay");
		
		AddressCollOption1 address1 = new AddressCollOption1();
		address1.setZip("1");
		address1.setFlatNumber("1102");
		address1.setStreet("Yoginamge");
		
		AddressCollOption1 address2 = new AddressCollOption1();
		address2.setZip("3");
		address2.setFlatNumber("11033");
		address2.setStreet("fvfn");
		
		user.getListOfAddress().add(address1);
		user.getListOfAddress().add(address2);
		
		
		session.save(user);
		session.getTransaction().commit();
		
		session.close();

		

	}
}
