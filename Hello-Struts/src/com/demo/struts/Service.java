package com.demo.struts;



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
//			User user  = new User();
//				user.setEmail(em);
//				user.setPassword(p);
//				session.save(user);
//				t.commit();
//				System.out.println("haaaaaasssssssss savvvvvvvvvveddd");
		
				
				
				
				
				
				Query q = session.createQuery("FROM User WHERE email=:myemail and password=:mypassword");
			    q.setParameter("myemail", em);
				q.setParameter("password", p);
		
			    List<Object[]> Ulist = q.list();
			    for(Object[] u: Ulist) {
			    	System.out.println(u[0] + "   ewr   " + u[1]);
			    }
			session.close();
			
			return true;
			}catch(HibernateException e) {
				e.printStackTrace();
				return false;
			}
			
		
	}

}
