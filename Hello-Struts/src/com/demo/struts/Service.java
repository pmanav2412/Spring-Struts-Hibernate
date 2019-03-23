package com.demo.struts;



import java.util.ArrayList;
import java.util.List;



import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.demo.hbm.HibernateUtil;



public class Service {
	
	static boolean service(String p, String em) {
		Session session = HibernateUtil.getSessionFactory().openSession();
//		Transaction t = session.beginTransaction();
		
			try {
			User user  = new User();
//				user.setEmail(em);
//				user.setPassword(p);
//				session.save(user);
//				t.commit();
//				System.out.println("haaaaaasssssssss savvvvvvvvvveddd");
				Query query = session.createQuery("SELECT e.password,e.email FROM User e");
//			     Query q = session.createQuery("From User");
				List<Object[]> list = query.list();	
				for (Object[] emp_fields : list) {
					System.out.println(emp_fields[0] + "\t" + emp_fields[1] + "\t");
					}
				System.out.println("Size" + list.size());
			session.close();
			
			return true;
			}catch(HibernateException e) {
				e.printStackTrace();
				return false;
			}
			
		
	}

}
