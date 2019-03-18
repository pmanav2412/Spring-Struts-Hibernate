package com.marlabs.hql;

import java.io.File;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HQLExample {

	private static Configuration configuration = null;
	private static SessionFactory sf = null;

	static {
		configuration = new Configuration();
		configuration.configure(new File("hibernate.cfg.xml"));
		sf = configuration.buildSessionFactory();
	}

	public static void save() {
		Session session = null;
		try {
			session = sf.openSession();
			Transaction t = session.beginTransaction();
			Employee employee = new Employee();
			employee.setDepartmentNumber(24);
			employee.setEmpName("Rashmi");
			employee.setEmpSalary(727274.98);
			session.save(employee);
			t.commit();
			session.close();
			System.out.println("employee saved");
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static void GetAllData() {
		Session session = null;
		try {
			session = sf.openSession();
			Transaction t = session.beginTransaction();
			
//// ALL FIELDS
//			Query q = session.createQuery("FROM Employee");
//			List<Employee> data = new ArrayList<Employee>();
//			data = q.list();
//			for (Employee employee : data) {
//				System.out.println(employee);
//			}
			
//
/// SELECTED FIELDS
//			Query query = session.createQuery("SELECT e.empNumber,e.empSalary,e.empName FROM Employee e");
//			List<Object[]> list = query.list();
//			for (Object[] emp_fields : list) {
//				System.out.println(emp_fields[0] + "\t" + emp_fields[1] + "\t" + emp_fields[2]);
//				}
			
			
			
			
//// Group BY QUERY
//				Query GroupBy = session
//					.createQuery("SELECT Count(e.empName),e.empName FROM Employee e Group By e.empName");
//				List<Object[]> list1 = GroupBy.list();
//				for (Object[] g : list1) {
//					System.out.println(g[0] + "\t" + g[1] + "\t");
//					}
				
				
/////// Prepared statement like or   set parameter type query:
//			Query preparedst = session
//					.createQuery("SELECT e.empName,e.empNumber,e.empSalary FROM Employee e WHERE e.empNumber=?");
//			preparedst.setParameter(0, 1);
//			List<Object[]> list2 = preparedst.list();
//			for (Object[] pr : list2) {
//					System.out.println(pr[0] + "\t" + pr[1] + "\t");
//					}
			
			Query preparedst1 = session
					.createQuery("SELECT e.empName,e.empNumber,e.empSalary FROM Employee e WHERE e.empNumber=:number");
			preparedst1.setInteger("number", 1);
			List<Object[]> list3 = preparedst1.list();
			for (Object[] pr : list3) {
				System.out.println(pr[0] + "\t" + pr[1] + "\t");
			}
			
			
//			Query query = session.createQuery("UPDATE Employee SET empSalary = :salary" + " WHERE empName = :name");
//			query.setParameter("salary", 1111.00);
//			query.setParameter("name", "Manav");
//			int i = query.executeUpdate();
//			System.out.println(i);
//			t.commit();

			session.close();
				

		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("main starst....");
		GetAllData();
		// save();
		System.out.println("main ends....");
	}

}
