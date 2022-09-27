package com.velocity.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		//step-1
				Configuration configuration1 = new Configuration();				configuration1.configure("hibernate.cfg.xml");
		
		//Configuration
				
				
				//Step-2
				SessionFactory sessionFactory = configuration1.buildSessionFactory();
				
				//Step-3
				Session session = sessionFactory.openSession();
				
				//Step-4
				Transaction transaction = session.beginTransaction();
				
				//Step-5
				Student student = new Student();
				student.setFirstName("Hemangini");
		student.setLastName("Ramteke");
				
				//Step-6
				session.save(student);
				transaction.commit();
				session.close();
				System.out.println("Record saved........");
			}

		
	

}
