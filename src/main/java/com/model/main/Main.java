package com.model.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure("com/tut/hibernate.cfg.xml");
	SessionFactory  sessionFactory=configuration.buildSessionFactory();
  
	Student student=new Student();
	student.setId(101);
	student.setName("Abrar");
	
	
	Certificate certificate=new Certificate();
	certificate.setCourse("bca");
	certificate.setDuretion("3 year");
	student.setCerti(certificate);
	
	Student student1=new Student();
	student1.setId(102);
	student1.setName("Khan");
	
	
	Certificate certificate1=new Certificate();
	certificate1.setCourse("BscIT");
	certificate1.setDuretion("3 year");
	student1.setCerti(certificate1);
	
	Session session=sessionFactory.openSession();
	Transaction tx=session.beginTransaction();
	session.save(student);
	session.save(student1);
	
	tx.commit();
	sessionFactory.close();
	}

}
