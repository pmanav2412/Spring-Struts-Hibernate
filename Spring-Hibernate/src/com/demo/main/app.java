package com.demo.main;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.User;



public class app {
	public static void main(String[] args) {
		try {
		SessionFactory factory =  new Configuration().configure(new File("src/hibernate.cfg.xml")).buildSessionFactory();
		//	SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction txn = session.beginTransaction();
		
		User u1 = new User("Ravi", 24,8000.0, 392000);
		User u2 = new User("Niyanta", 28,1000.0, 12233);
		
		session.save(u1);
		session.save(u2);
		txn.commit();
		System.out.println("Saved");
		session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
