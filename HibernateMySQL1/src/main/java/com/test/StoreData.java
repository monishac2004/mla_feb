package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class StoreData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction t = session.beginTransaction();
		/*
		Movie obj = new Movie();
		
		obj.setM_name("ddlg");
		obj.setM_director("Mon");
	
		
		session.persist(obj);
		*/
		
		Movie dt = session.get(Movie.class, 1);
		
		System.out.println(dt.getId()+" "+dt.getM_name()+" "+dt.getM_director());
		
		dt.setM_name("HTML");
		dt.setM_director("Mon");
		
		
		session.persist(dt);
		
		t.commit();
		
		Query<Movie> q = session.createQuery("from Movie");
		/*
		List<Movie> list = q.list();
		
		for(Movie b : list)
		{
			System.out.println(b.getId()+" "+b.getM_name()+" "+b.getM_director());
		}
		*/
		//session.remove(dt);
		
		
		
		System.out.println("Done.");
		

	}

}
