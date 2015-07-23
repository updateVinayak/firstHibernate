package com.secondlevel.cache;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import firstHibernate.HibernateUtil;

public class TestHibenrateQuery {
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();
		
		Query query = session.createQuery("from UserCache");
		query.setCacheable(true);
		List list =  query.list();	
		
		
		session.getTransaction().commit();
		
		session.close();

		
		
		Session session2 = HibernateUtil.getSessionFactory().openSession(); 
		session2.beginTransaction();
		
		Query query1 = session2.createQuery("from UserCache");
		query1.setCacheable(true);
		list =  query1.list();
		
		session2.getTransaction().commit();
		
		session2.close();
	}

}
