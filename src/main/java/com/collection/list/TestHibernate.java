package com.collection.list;

import org.hibernate.Session;

import com.collection.simple.elementCollection.AddressCollOption1;
import com.collection.simple.elementCollection.UserCollOption1;

import firstHibernate.HibernateUtil;

public class TestHibernate {
	
	public static void main(String[] args) {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
		
		UserList user = new UserList();
		
		user.setUserName("Vinay");
		
		AddressList address1 = new AddressList();
		address1.setZip("1");
		address1.setFlatNumber("1102");
		address1.setStreet("Yoginamge");
		
		AddressList address2 = new AddressList();
		address2.setZip("3");
		address2.setFlatNumber("11033");
		address2.setStreet("fvfn");
		
		user.getListOfAddress(). add(address1);
		user.getListOfAddress().add(address2);
		
		
		session.save(user);
		session.getTransaction().commit();
		
		session.close();

		
	}

}
