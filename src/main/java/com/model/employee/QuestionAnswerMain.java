package com.model.employee;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class QuestionAnswerMain {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/model/employee/hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		OneToOneQuestion oneQuestion = new OneToOneQuestion();
		oneQuestion.setQuestionId(110);
		oneQuestion.setQuestion("what is ORM?");

		Answer answer = new Answer();
		answer.setAnswerId(40);
		answer.setAnswer("ORM is a object relational Mapping");
		oneQuestion.setAnswer(answer);

		OneToOneQuestion oneQuestion2 = new OneToOneQuestion();
		oneQuestion2.setQuestionId(222);
		oneQuestion2.setQuestion("what is JPA ?");

		Answer answer2 = new Answer();
		answer2.setAnswerId(505);
		answer2.setAnswer("JPA is a Java persistence API");
		oneQuestion2.setAnswer(answer2);
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(oneQuestion);
	    session.save(oneQuestion2);
		tx.commit();
		session.close();
		sessionFactory.close();
	}

}
