package com.model.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AnsAndQues {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure("com/model/main/hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		
		Ques q=new Ques();
		q.setQuesId(10145678);
		q.setQues("what is string1");
		
		Answ ans1=new Answ();
		ans1.setAnsId(20288);
		ans1.setAns("String is a Syynchronized2...");
		ans1.setQues(q);
		
		Answ ans2=new Answ();
		ans2.setAnsId(303456);
		ans2.setAns("String is thread Safe3..");
		ans2.setQues(q);
		
		Answ ans3=new Answ();
		ans3.setAnsId(40445);
		ans3.setAns("String is Non primitive Data Type4...");
		ans3.setQues(q);
		
		List<Answ> list=new ArrayList<>();
		list.add(ans1);
		list.add(ans2);
		list.add(ans3);
		
		Session session2=factory.openSession();
		Transaction tx=session2.beginTransaction();
		
		q.setAnsws(list);
		session2.persist(q);
		session2.persist(ans1);
		session2.persist(ans2);
        session2.persist(ans3);	
        
        tx.commit();
        session2.close();
	}

}
