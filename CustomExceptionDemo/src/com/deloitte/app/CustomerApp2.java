package com.deloitte.app;
import java.io.ObjectInputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.deloitte.model.Customer;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;
import com.deloitte.myappexceptions.NegativeBillAmountException;


public class CustomerApp2 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Customer c ;
		try {
		 c = new Customer();
		 ObjectInputStream stream = 
				 new ObjectInputStream(
					new BufferedInputStream(
						new FileInputStream(
							new File("record.txt"))));
		c = (Customer)stream.readObject();
		
		stream.close();
		System.out.println(c);
		}
		
		catch(InvalidCustomerNameException e1)
		{
			System.out.println(e1);
		}
		
	}
}
