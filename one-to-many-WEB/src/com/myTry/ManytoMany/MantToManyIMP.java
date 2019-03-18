package com.myTry.ManytoMany;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MantToManyIMP {
	private static Configuration configuration;
	private static SessionFactory sf;
	static {

		configuration = new Configuration();
		configuration.configure(new File("hibernate.cfg.xml"));
		sf = configuration.buildSessionFactory();

	}

	public static void main(String[] args) {
			saveData();
	}

	public static void saveData() {
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		SimpleDateFormat f = new SimpleDateFormat("MM/dd/yyyy");
		Date d = new Date();
		
		try {
			
			
			StockDetails1 stockDetails1 = new StockDetails1(11, new Float(12), new Float(34), new Float(22), new Long(23), f.format(d) );
			StockDetails1 stockDetails2 = new StockDetails1(12, new Float(122), new Float(340), new Float(218), new Long(23), f.format(d) );
			StockDetails1 stockDetails3 = new StockDetails1(13, new Float(100), new Float(340), new Float(240), new Long(23), f.format(d) );
			
			
			Stock1 stock1 = new Stock1("101", "Apple");
			stock1.getStockDailyRecords().add(stockDetails1);
			stock1.getStockDailyRecords().add(stockDetails2);
			
			
			Stock1 stock2 = new Stock1("102", "Oracle");
			stock2.getStockDailyRecords().add(stockDetails2);
			stock2.getStockDailyRecords().add(stockDetails3);
				
			session.save(stock1);
			session.save(stock2);
			t.commit();
			
			session.close();
			
			
			
			
		}catch(HibernateException e) {
			e.printStackTrace();
		}
	}
}
