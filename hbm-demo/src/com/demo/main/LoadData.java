package com.demo.main;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.model.Employee;

public class LoadData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Configuration config = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory factory = config.buildSessionFactory();
			Session session = factory.openSession();
			
			Query query = session.createQuery("from Employee");
			List<Employee> list = query.list();
			for(Employee emp : list) {
				System.out.println(emp);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
