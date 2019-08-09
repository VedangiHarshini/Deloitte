package com.deloitte.myappexceptions;

public class InvalidCustomerNameException extends RuntimeException{
	public InvalidCustomerNameException()
	{
		
	}
	public InvalidCustomerNameException(String message)
	{
	super(message);	
	}

}
