package com.deloitte.cms.dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility2;

public class CustomerDAOImpl implements CustomerDAO {
	Configuration configuration=new Configuration().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	Session session; 
	@Override
	public List<Customer> getAllCustomers() {
		
		//List<Customer> allCustomers = new ArrayList<Customer>();
		session = factory.openSession();
		return session.createQuery("from com.deloitte.cms.model.Customer").list();
		//Criteria criteria = session.createCriteria(Customer.class);
		//criteria.add(Restrictions.gt("billAmount",5000));
		//criteria.add(Restrictions.like("customerAddress","Hyderabad"));
		//return criteria.list();
		/*Query query = session.createQuery("from com.deloitte.cms.model.Customer");
		Iterator<Customer> iterator = query.iterate();
		while(iterator.hasNext())
		{
			Customer customer  = iterator.next();
			allCustomers.add(customer);
		}
		return allCustomers;*/
		
}

	@Override
	public boolean insertCustomer(Customer customer) {
		// TODO Auto-generated method stub
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		return true;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
		return true;
		
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
		
		return true;
		
	}

	@Override
	public Customer searchCustomerById(int customerId) {
		
		session = factory.openSession();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer = (Customer) session.get(Customer.class,customerId);
		session.close();
		return customer;
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		
		// TODO Auto-generated method stub
		session = factory.openSession();
		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer = (Customer) session.get(Customer.class,customerId);
		session.close();
		if(customer == null)
			return false;
		else
			return true;
		
	}

}
