package com.model.main;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberDemo {

	public static void main(String[] args) {
		System.out.println("hello world");
		Configuration cfg = new Configuration();
		cfg.configure("com/tut/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println("hello");

	}

}
