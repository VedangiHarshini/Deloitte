package com.deloitte.client;
import java.sql.SQLException;
import java.util.Scanner;
import com.deloitte.customer.db.CustomerJDBCOperations;
import com.deloitte.customer.db.CustomerJDBCOperations3;

public class Client3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("\n MENU");
		System.out.println("\n1.Display All Customers");
		System.out.println("\n2. Insert Customers details");
		System.out.println("\n3. Insert Customers details from User");
		System.out.println("\n4. Insert Customers details from User through PS");
		System.out.println("\n5. Delete Customers details from User through PS");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your choice :");
		int option = scanner.nextInt();
		if(option == 1)
			CustomerJDBCOperations3.printCustomerRecords();
		if(option == 2)
			CustomerJDBCOperations3.insertCustomerRecords();
		if(option == 3)
			CustomerJDBCOperations3.insertCustomerRecords1();
		if(option == 4)
			CustomerJDBCOperations3.insertCustomerRecordsThruPS();
		if(option == 5)
			CustomerJDBCOperations3.deleteCustomerRecordsThruPS();
		
		
	}

}
