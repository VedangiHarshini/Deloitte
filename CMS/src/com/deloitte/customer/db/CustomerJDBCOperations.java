package com.deloitte.customer.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.deloitte.dbcon.DbUtility;

public class CustomerJDBCOperations {

	public static void printCustomerRecords() throws ClassNotFoundException, SQLException {
		Connection connection = DbUtility.getMyConnection();System.out.println("Connected");
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from hr.customer");
		while(res.next())
		{
			System.out.print(res.getString(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.println(res.getString(4));
		}
		connection.close();
	}
	public static void insertCustomerRecords() throws ClassNotFoundException, SQLException {
		Connection connection = DbUtility.getMyConnection();
		System.out.println("Connected");
		Statement statement = connection.createStatement();
		/*int noOfRecords = statement.executeUpdate("delete from hr.customer where customerName = 'Virat'");
		System.out.println(noOfRecords + "  row deleted");*/
		int noOfRecords = statement.executeUpdate("insert into hr.customer values(18,'Virat','Punjab',4000)");
		System.out.println(noOfRecords + "  row inserted");
	}
		public static void insertCustomerRecords1() throws ClassNotFoundException, SQLException {
			
			Connection connection = DbUtility.getMyConnection();
			System.out.println("Connected");
			Statement statement = connection.createStatement();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter customer id");
			int customerId = sc.nextInt();
			System.out.println("Enter customer name");
			String customerName = sc.next();
			System.out.println("Enter customer address");
			String customerAddress = sc.next();
			System.out.println("Enter bill amount");
			int billAmount = sc.nextInt();
			int noOfRecords =statement.executeUpdate("insert into hr.customer values("+customerId+",'" +
					customerName+"','"+customerAddress+"',"+billAmount+")");
			System.out.println(noOfRecords +" row inserted");
			
			

		}
}
