package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;

public class Client {
	public static void main(String[] args) {
		//Customer customer = new Customer(9,"Preethi","Agra",1000);
		Configuration configuration=new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		//Customer customer = new Customer(1,"Akhila","Tirupati",5000);
		PremiumCustomer customer = new PremiumCustomer(12,"Akshara","Delhi",8000);
		customer.setRewardPoints(522);
		session.save(customer);
		transaction.commit();
		//session.close();
		factory.close();
		System.out.println(customer.getCustomerName() +" your record is saved");
	}

}
