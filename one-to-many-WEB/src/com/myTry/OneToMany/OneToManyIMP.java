package com.myTry.OneToMany;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyIMP {
	private static Configuration configuration;
	private static SessionFactory sf;
	static{
		
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
		try {
			Stock stock = new Stock();
			stock.setStockCode("A101");
			stock.setStockName("Apple");
			

			SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
			Date d = new Date();
			String s = df.format(d);
			
			StockDetails sd = new StockDetails();
			sd.setDate(s);
			sd.setPriceOpen(new Float(23.09));
			sd.setPriceClose(new Float(45.98));
			sd.setPriceChange(new Float(20.0));
			sd.setRecordId(11);
			sd.setVolume(23L);
			StockDetails sd1 = new StockDetails(12, 345.98F, 565.98F, 132.0F, (long) 67.0, s);
		

			sd.setStock(stock);
			sd1.setStock(stock);
			stock.getStockDailyRecords().add(sd);
			stock.getStockDailyRecords().add(sd1);
			
			
			session.persist(stock);
//			session.save(sd);
//			session.save(sd1);
//			session.save(sd2);
			
			t.commit();
			
			session.close();
		}catch(HibernateException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
