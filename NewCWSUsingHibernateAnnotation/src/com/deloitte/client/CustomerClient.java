package com.deloitte.client;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient {
	

	public static void main(String[] args) {
		
		CustomerDAO customerDAO = new CustomerDAOImpl();
		//select
		/*Customer allcustomers = new Customer();
		Customer result = customerDAO.getAllCustomers();
		System.out.println(result);*/
		
		//insert
		Customer customer1 = new Customer(12,"Vijay","Chennai",6780);
		boolean result1 = customerDAO.insertCustomer(customer1);
		System.out.println(result1);
		
		//update
		/*Customer customer1 = new Customer();
		customer.setCustomerId();
		customer.setCustomerName("Vijay");
		customer.setCustomerAddress("Chennai");
		customer.setBillAmount(7645);*/
		Customer customer2 = new Customer(18,"Virat","Punjab",7645);
		boolean result2 = customerDAO.updateCustomer(customer2);
		System.out.println(result2);
		//delete
		int customerId1 = 10;
		boolean result3 =  customerDAO.deleteCustomer(customerId1);
		System.out.println(result3);
		
		//search
		int customerId2 = 1;
		Customer result4 = customerDAO.searchCustomerById(customerId2);
		System.out.println(result4);
		
		//exist
		int customerId = 100;
		boolean result5 = customerDAO.isCustomerExists(customerId);
		System.out.println(result5);
	}

}
