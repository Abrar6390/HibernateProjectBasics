package com.model.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class EmployeeMain {

	public static void main(String[] args) {
		
	  Configuration cfg=new Configuration();
	  cfg.configure("com/tut/hibernate.cfg.xml");
	 SessionFactory session1=cfg.buildSessionFactory();
	 
		Employee emp=new Employee();
		emp.setId(02);
		emp.setEmp_Name("Mushahid");
		emp.setQulification("Bca");
		
		Room room=new Room();
		room.setName("Ayaz Siddique");
		room.setMobile("9511100809");
		room.setCourse("BSc.IT");
		
		Session session=session1.openSession();
		session.save(emp);
		session.save(room);
		Transaction tx=session.beginTransaction();
		tx.commit();
		session.close();
		System.out.println("Done...👍👍👍👍");
	}

}
