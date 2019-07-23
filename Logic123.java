package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Logic123 {
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		
		Object o=session.get(Address.class, new Integer(100));
		Address a=(Address)o;
		
		System.out.println(a.getCity());
		Person p=a.getP();
		
		System.out.println(p.getPersonname());
		
		session.close();
		System.out.println("one to one is done");
		sf.close();

		
	}


}
