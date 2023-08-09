package com.model.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LoginMain {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SessionFactory factory = new Configuration().configure("com/tut/hibernate.cfg.xml").buildSessionFactory();

	public static void loginAndRegister() throws NumberFormatException, IOException {
		System.out.println("press 1 for login\nand 2 for register");
		int loginregister = Integer.parseInt(br.readLine());
		if (loginregister == 1) {
			System.out.println("login....");
			   login();
		}
			   else {
				   if(loginregister == 2)
				System.out.println("register..."); 
			    registeration();
	
			   }
	}

	public static void registeration() throws NumberFormatException, IOException {

		UserLogin userLogin = new UserLogin();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		System.out.println("enter your userId");

		userLogin.setUserId(Integer.parseInt(br.readLine()));
		int userId = userLogin.getUserId();
		System.out.println("enter your userName");
		userLogin.setUserName(br.readLine());
		userLogin.getUserName();
		System.out.println("enter your gmail");
		userLogin.setEmailId(br.readLine());
		userLogin.getEmailId();
		System.out.println("enter your password");
		userLogin.setUserPassword(br.readLine());

		UserLogin user = (UserLogin) session.get(UserLogin.class, userId);
		if (user == null) {

			session.persist(user);
			tx.commit();
			session.close();
			factory.close();
			System.out.println("register succsessfully");

		} else {
			System.out.println(" Allready registred");
			registeration();
		}

	}

		public static String login() throws IOException {
			  
			UserLogin userLogin = new UserLogin();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			System.out.println("enter your userId");
             
			userLogin.setUserId(Integer.parseInt(br.readLine()));
			int userId = userLogin.getUserId();
			System.out.println("enter your userName");
			userLogin.setUserName(br.readLine());
			String userName = userLogin.getUserName();
			System.out.println("enter your gmail");
			userLogin.setEmailId(br.readLine());
			String userEmail = userLogin.getEmailId();
			System.out.println("enter your password");
			userLogin.setUserPassword(br.readLine());
			 String userPassword= userLogin.getUserPassword();
			   UserLogin user= (UserLogin) session.get(UserLogin.class, userId);
			   if(user.getUserId()==userId)
				   if(user.getUserName().equalsIgnoreCase(userName))
					   if (user.getEmailId().equals(userEmail))
						   if (user.getUserPassword().equals(userPassword))
							   return "login succsessfully";
							
						   else 
							   return "password not match";
					   else 
						  return "email not match ";
				   else 
					   return "user name worng";
			   else
				    return "login faild";

		}
		
		public static void main(String[] args) throws NumberFormatException, IOException {
			loginAndRegister();
		}
	
}
	
	

