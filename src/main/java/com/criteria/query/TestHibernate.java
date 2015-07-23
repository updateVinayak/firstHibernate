package com.criteria.query;

import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import firstHibernate.HibernateUtil;

public class TestHibernate {

	
	public static void main(String[] args) {
		

		

		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession(); 
		session.beginTransaction();  
	
		/*
		Department dept1 = new Department();
		
		dept1.setDepartmentName("Account");
		
		Employee empl1 = new Employee();
		empl1.setFirstName("Vinayak");
		empl1.setLastName("Sawant");
		empl1.setAge(35);
		empl1.setPhoneNumber("3128607894");
		empl1.setDepartment(dept1);
		
		Employee empl2 = new Employee();
		empl2.setFirstName("Utkarsha");
		empl2.setLastName("Sawant");
		empl2.setDepartment(dept1);
		empl2.setAge(32);
		empl1.setPhoneNumber("9820433678");
		
		
		Address address1 = new Address();
		address1.setEmployee(empl1);
		address1.setFlatNo("610");
		address1.setStreet("eksar");
		address1.setZip("400103");
		
		Address address2 = new Address();
		address2.setEmployee(empl1);
		address2.setFlatNo("603");
		address2.setStreet("I.C.Colny");
		address2.setZip("400103");
		
		empl1.getAddresses().add(address1);
		empl1.getAddresses().add(address2);
		
		Address address3 = new Address();
		address3.setEmployee(empl2);
		address3.setFlatNo("710");
		address3.setStreet("Yogi Nagar");
		address3.setZip("400091");
		
		empl2.getAddresses().add(address3);
		
		
		dept1.getEmployees().add(empl1);
		dept1.getEmployees().add(empl2);
		
		session.save(dept1);
		session.save(empl1);
		session.save(empl2);	
		session.save(address3);
		session.save(address1);
		session.save(address2);
		*/
		
		Criteria cri = session.createCriteria(Department.class);
		
		cri.add(Restrictions.eq("departmentId", 1));
		
		cri.createCriteria("employees").add(Restrictions.eq("employeeId", 2))
			.createCriteria("addresses").add(Restrictions.eq("addressId", 6));
			
		
		/*List<Department> deps =  cri.list();
		
		System.out.println(deps.size());*/
		
		/*for(Department dep : deps){
			Set<Employee> employees = dep.getEmployees();
			
			for(Employee emp : employees){
				System.out.println("size of address for employee " + emp.getEmployeeId());
				System.out.println(emp.getAddresses().size());
			}
		}*/
		
		//Simple Equal case with join
		Criteria crie = session.createCriteria(Department.class).createCriteria("employees").add(Restrictions.eq("firstName", "Utkarsha"));
		//System.out.println(crie.list().size());
		
		
		//Simple AND condition
		crie = null;
		crie = session.createCriteria(Department.class).createCriteria("employees").add(Restrictions.and(Restrictions.eq("firstName", "Utkarsha"), Restrictions.eq("lastName", "Sawant")));
		//System.out.println(crie.list().size());
		
		
		//Simple OR condition
		crie = null;
		crie = session.createCriteria(Department.class).createCriteria("employees").add(Restrictions.or(Restrictions.eq("firstName", "Utkarsha"), Restrictions.eq("lastName", "Sawant")));
		//System.out.println(crie.list().size());
		
		
		//Simple greater than condition
		crie = null;
		crie = session.createCriteria(Department.class).createCriteria("employees").add(Restrictions.gt("age", 30));
		//System.out.println(crie.list().size());

		
		//Simple less than
		crie = null;
		crie = session.createCriteria(Department.class).createCriteria("employees").add(Restrictions.lt("age", 35));
		System.out.println(crie.list().size());

		
		
		session.getTransaction().commit();
		session.close();

	
		
	
		
	}

}
