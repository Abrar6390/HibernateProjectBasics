package com.model.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HiberMain {

	public static void main(String[] args) {
	
		
		Configuration cfg=new Configuration();
		cfg.configure("com/tut/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		
		SimpleHiber simpleHiber=new SimpleHiber();
		simpleHiber.setId(101);
		simpleHiber.setName("Khan Abrar");
		simpleHiber.setCity("Mumbai ");
		
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.persist(simpleHiber);
		tx.commit();
		session.close();
		
	}

}
