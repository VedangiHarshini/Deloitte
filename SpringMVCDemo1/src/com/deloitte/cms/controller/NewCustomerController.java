package com.deloitte.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDAOImpl;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

@Controller
public class NewCustomerController {
	
	@Autowired
	CustomerService customerService;

	@RequestMapping("/addCustomerr")
	public ModelAndView addCustomerr(Customer customer)
	{
		//CustomerDAO customerDAO = new CustomerDAOImpl();
		customerService.insertCustomer(customer);
		return new ModelAndView("success","add",customer);
		
	}
	@RequestMapping("/updateCustomer")
	public ModelAndView update(Customer customer)
	{
		//CustomerDAO customerDAO = new CustomerDAOImpl();
		customerService.updateCustomer(customer);
		return new ModelAndView("success","update",customer);
		
	}
	@RequestMapping("/searchCustomerByIdForm")
	public ModelAndView searchCustomerByIdForm(Customer customer)
	{
		return new ModelAndView("customerDetailsById","command",new Customer());
		
	}
	
	@RequestMapping("/searchCustomerById")
	public ModelAndView searchCustomerById(Customer customer)
	{
		Customer customer2 = new Customer();
		customer2 = customerService.searchCustomerById(customer.getCustomerId());
		return new ModelAndView("customerDetailsById","command",customer2);
		
	}
	

}
