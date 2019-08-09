package com.deloitte.client;
import java.sql.SQLException;
import java.util.Scanner;
import com.deloitte.customer.db.CustomerJDBCOperations;

public class Client {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("\n MENU");
		System.out.println("\n1.Display All Customers");
		System.out.println("\n2 Insert Customers details");
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your choice :");
		int option = scanner.nextInt();
		if(option == 1)
			CustomerJDBCOperations.printCustomerRecords();
		if(option == 2)
			CustomerJDBCOperations.insertCustomerRecords();
		if(option == 3)
			CustomerJDBCOperations.insertCustomerRecords1();
		
	}

}
