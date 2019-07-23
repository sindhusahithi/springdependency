package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Person p=new Person();
		p.setPersonid(111);
		p.setPersonage(24);
		p.setPersonname("abc");
		
		Address ad=new Address();
		ad.setStreetno(123);
		ad.setCity("hyderabad");
		ad.setState("Telangana");
	    ad.setP(p);
		
		Transaction ts=session.beginTransaction();
		session.save(ad);
		ts.commit();
		
		session.close();
		System.out.println("one to one is done");
		sf.close();
		
	}
	

}
