package com.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


public class CustDao {
	
	public static SessionFactory getDBSession() 
	{
		SessionFactory session = null;
		try {
			
			Configuration cfg = new Configuration();
			
			cfg.configure("hibernate.cfg.xml");
			
			session = cfg.buildSessionFactory();
			
			//session = sf.openSession();
					
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return session;
	}
	
	public void saveCustomer(Customer cst)
	{
		Session session = CustDao.getDBSession().openSession();
		Transaction t = session.beginTransaction();
		//CustDao.getDBSession().persist(cst);
		session.persist(cst);
		t.commit();
		
		//CustDao.getDBSession().close();
	}
	
	public List<Customer> getAllCustomers()
	{
		//List<Customer> list = new ArrayList<>();
		Session session = CustDao.getDBSession().openSession();
		Query<Customer> q = session.createQuery("from Customer");
		
		List<Customer> list = q.list();
		
		return list;
	}
	
	public void updateCustomer(Customer cst)
	{
		Session session  = CustDao.getDBSession().openSession();
		
		Transaction t = session.beginTransaction();
		
		Customer obj = session.find(Customer.class, cst.getC_id());
		
		obj.setC_name(cst.getC_name());
		obj.setC_city(cst.getC_city());
		
		session.persist(obj);
		
		t.commit();
	}
	
	public void deleteCustomer(Customer cst) {
		
		Session session = CustDao.getDBSession().openSession();
		
		session.remove(cst);
		
		session.beginTransaction().commit();
		
		session.close();
	}
}
