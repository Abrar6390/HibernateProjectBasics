package com.model.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetAndLoadMeth {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("com/tut/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		SimpleHiber student =(SimpleHiber)session.load(SimpleHiber.class, 101);
		System.out.println(student.getId()+ ":"+student.getName()+":"+student.getCity());
        
		SimpleHiber student1 =(SimpleHiber)session.load(SimpleHiber.class, 102);
		System.out.println(student1.getCity());
		session.close();
		sessionFactory.close();
	}
}
