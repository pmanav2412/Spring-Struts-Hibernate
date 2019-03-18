package com.marlabs.catche;

import java.io.File;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SecondLevelCacheExample {

	private static Configuration configuration = null;
	private static SessionFactory sf = null;
	
	
	static {
		configuration = new Configuration();
		configuration.configure(new File("hibernate.cfg.xml"));
		sf = configuration.buildSessionFactory();
	}

	public static void main(String[] args) {
		System.out.println("I am Second Level Cache Example");

		try {
			Session session = sf.openSession();
			// Customer customer = (Customer)session.load(Customer.class, customerId);

//===========================================================
			System.out.println("first time fatching the data");
			Customercache customer = (Customercache) session.get(Customercache.class, 9);
			System.out.println(customer);
//===========================================================
			System.out.println("first time fatching the data");
			Customercache customer1 = (Customercache) session.get(Customercache.class, 9);
			System.out.println(customer1);
//===========================================================
			session.close();

			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Session session1 = sf.openSession();
//===========================================================
			System.out.println("first time fatching the data");
			Customercache customer2 = (Customercache) session1.get(Customercache.class, 9);
			System.out.println(customer2);
//===========================================================
			session1.close();

		} catch (HibernateException e) {
			e.printStackTrace();

		}

	}
}
