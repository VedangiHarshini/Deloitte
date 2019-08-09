package collectiondemo;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

import com.deloitte.model.Customer;
import com.deloitte.myappexceptions.InvalidCustomerIdException;
import com.deloitte.myappexceptions.InvalidCustomerNameException;
import com.deloitte.myappexceptions.NegativeBillAmountException;


public class Demo8 {
	public static void main(String[] args) throws InvalidCustomerNameException, NegativeBillAmountException, InvalidCustomerIdException {
		List<Customer>customerList = new ArrayList<Customer>();
		Customer c1 = new Customer(1,"Qwerty","Bangalore",2000);
		customerList.add(c1);
		customerList.add(new Customer(2,"Harshi","Delhi",3456));
		customerList.add(new Customer(3,"Kaamy","Agra",9876));
		customerList.add(new Customer(4,"Swathi","Hyderabad",6000));
		customerList.add(new Customer(5,"Preethi","Mumbai",4500));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option");
		int option = sc.nextInt();
		if(option == 1)
			Collections.sort(customerList);
		if(option == 2)
			Collections.sort(customerList,new CustomerBillAmountComparator());
		if(option == 3)
			Collections.sort(customerList,new CustomerAddressComparator());
		if(option == 4)
		{
			Collections.sort(customerList,new Comparator<Customer>()
			{
			public int compare(Customer o1,Customer o2)
			{
				if(o1.getCustomerid() > o2.getCustomerid())
			
				return -1;
			else
				return 0;
			}
			});
			
		
		}
		
		//System.out.println(customerList);
		/*System.out.println("Customer whose bill > 5000");
		Iterator <Customer>iterator = customerList.iterator();
		while(iterator.hasNext())
		{
			Customer cust = iterator.next();
			if(cust.getBillAmount()>5000)
			{
				System.out.println(cust);
			}
		}*/
		/*System.out.println("Customer who lives in Delhi");
		  Iterator <Customer>iterator1 = customerList.iterator();
		while(iterator1.hasNext())
		{
			Customer cust1 = iterator1.next();
			if(cust1.getCustomerAddress() == "Delhi")
			{
				System.out.println(cust1);
			}
		}*/
		
		System.out.println("All customers");
		Iterator <Customer>iterator2 = customerList.iterator();
		while(iterator2.hasNext())
		{
			Customer cust2 = iterator2.next();
				System.out.println(cust2);
		}
	
		
	}

}
