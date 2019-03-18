package com.marlabs.withannotation;



import java.io.File;
import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerIMP implements CustomerIN  {
	
	private static Configuration configuration = null;
	private static SessionFactory sessionfactory = null;
	
	
	static {
		configuration = new Configuration();
		configuration.configure(new File("hibernate.cfg.xml"));
		sessionfactory = configuration.buildSessionFactory();
	}
	
	
	@Override
	public void SaveCustomer(CustomerA customer) {
		Session session = null;
		try {
			session = sessionfactory.openSession();
			Transaction transaction = session.beginTransaction();
			Serializable id =session.save(customer);
			System.out.println("CUstomer inserted Successfully"+ id );
			transaction.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			try {
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void GetCustomer(int customerId) {
		Session session=null;
		try {
			session = sessionfactory.openSession();
			//Customer customer = (Customer)session.load(Customer.class, customerId);
			CustomerA customer = (CustomerA) session.get(CustomerA.class, customerId);
			System.out.println(customer.getCustomerCity());
			System.out.println(customer);
		}catch(HibernateException e)
		{
			e.printStackTrace();

		}finally {
			try {
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void UpdateCustomer(CustomerA customer) {
		Session session = null;
		try {
			session = sessionfactory.openSession();
			Transaction t = session.beginTransaction();
			session.update(customer);
			t.commit();
			System.out.println("User Detail Updated");
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(session != null) {
					session.close();
				}
				
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
				
		
	}

	@Override
	public void DeleteCustomer(CustomerA customer) {
		Session session = null;
		try {
			session = sessionfactory.openSession();
			Transaction t = session.beginTransaction();
			session.delete(customer);
			t.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(session != null) {
					session.close();
				}
			}catch(HibernateException e) {
				e.printStackTrace();
			}
		}
		
	}

}
