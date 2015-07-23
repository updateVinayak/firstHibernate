package com.secondlevel.cache;

import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibenrate {
	
	public static void main(String[] args) {
		
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		

		
		UserCache user1 = (UserCache) session.get(UserCache.class, 41);
		//UserCache user2 = (UserCache) session.get(UserCache.class, 1);
		
		user1.setFirstName("Update");
		
		
		UserCache user3 = (UserCache) session.get(UserCache.class, 41);
		
		
		session.getTransaction().commit();
		
		session.close();

		
		
		Session session2 = HibernateUtil.getSessionFactory().openSession(); 
		session2.beginTransaction();
		

		
		UserCache user4 = (UserCache) session2.get(UserCache.class, 41);
		//UserCache user2 = (UserCache) session.get(UserCache.class, 1);
		
		user4.setFirstName("Update22");
		
		
		UserCache user5 = (UserCache) session2.get(UserCache.class, 41);
		
		
		session2.getTransaction().commit();
		
		session2.close();

		
		
		
		
	}

}
