package com.deloitte.app;
import java.io.ObjectOutputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import com.deloitte.model.Customer;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;
import com.deloitte.myappexceptions.NegativeBillAmountException;


public class CustomerApp {
	public static void main(String[] args) throws FileNotFoundException, IOException, NegativeBillAmountException, InvalidCustomerIdException {
		Customer c = null;
		try {
		 c = new Customer(1,"Harshini","Banglore",2000);
		 ObjectOutputStream stream = 
				 new ObjectOutputStream(
					new BufferedOutputStream(
						new FileOutputStream(
							new File("record.txt"))));
		 stream.writeObject(c);
		System.out.println(c.getCustomerName()+"your record saved");
		stream.close();
		}
		
		catch(InvalidCustomerNameException e1)
		{
			System.out.println(e1);
		}
		
	}

}
