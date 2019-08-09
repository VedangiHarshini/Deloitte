package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.deloitte.cms.model.Customer;

public class Client {
	public static void main(String[] args) {
		//Customer customer = new Customer(9,"Preethi","Agra",1000);
		Configuration configuration=new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Customer customer = (Customer)session.get(Customer.class,9);
		customer.setCustomerName("Mounika");
		customer.setCustomerAddress("Ooty");
		System.out.println(customer);
		//session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println(customer.getCustomerName() +" your record is saved");
	}

}
