package firstHibernate;

import java.util.Date;

import org.hibernate.Session;

import com.user.model.Address;
import com.user.model.UserDetails;

public class TestHibernate {

	
	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();  

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
		
		UserDetails userDetails = new UserDetails();
			
		//userDetails.setUserId(5);
		userDetails.setUserName("Vinayak 11");
		userDetails.setHomeAddress(address);
		userDetails.setOfficeAddress(office);
		
		userDetails.setJoinedDate(new Date());
		userDetails.setDescription("Description 1");
		
		session.save(userDetails);
		session.getTransaction().commit();
		
		session.close();
	}
}
