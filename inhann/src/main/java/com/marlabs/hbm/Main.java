package com.marlabs.hbm;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
		Person person = new Person("Steve", "Balmer");
		session.save(person);

//		Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
//		session.save(employee);

//		Owner owner = new Owner("James", "Gosling", 300L, 20L);
//		session.save(owner);

		
		session.getTransaction().commit();
		session.close();
		System.out.println("Saved...");

	}
}
