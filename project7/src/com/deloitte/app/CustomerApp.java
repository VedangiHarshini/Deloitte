package com.deloitte.app;

import com.deloitte.model.Customer;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;
import com.deloitte.myappexceptions.NegativeBillAmountException;


public class CustomerApp {
	public static void main(String[] args){
		try {
		Customer c = new Customer(1,"Harshini","Banglore",2000);
		System.out.println(c);
		}
		catch(InvalidCustomerIdException e)
		{
			System.out.println(e);
		}
		catch(InvalidCustomerNameException e1)
		{
			System.out.println(e1);
		}
		catch(NegativeBillAmountException e2)
		{
			System.out.println(e2);
		}
		
		
	}
	

}
