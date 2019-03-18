package com.demo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//Configuration config = new Configuration().configure("hibernate.cfg.xml");
			Configuration config = new AnnotationConfiguration().configure();
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			Employee emp = new Employee("James", 25, 10000.0);
			Employee emp2 = new Employee("Bond", 28, 8000.0);
			session.save(emp);
			session.save(emp2);
			transaction.commit();
			System.out.println("Saved!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
