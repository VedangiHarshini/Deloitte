package com.deloitte.customer.db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.deloitte.dbcon.DbUtility;

public class CustomerJDBCOperations3 {

	public static void printCustomerRecords() throws ClassNotFoundException, SQLException {
		Connection connection = DbUtility.getMyConnection();
		System.out.println("Connected");
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
public static void deleteCustomerRecordsThruPS() throws ClassNotFoundException, SQLException {
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter customer name which is to be deleted");
			String customerName = sc.next();
			Connection connection = DbUtility.getMyConnection();
			System.out.println("Connected");
			PreparedStatement statement =
					connection.prepareStatement("delete from hr.customer where customerName =(?)");
			statement.setString(1,customerName);
			int noOfRecords =statement.executeUpdate();
			System.out.println(noOfRecords +" row deleted");
}
public static void insertCustomerRecordsThruPS() throws ClassNotFoundException, SQLException {
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter customer id");
	int customerId = sc.nextInt();
	System.out.println("Enter customer name");
	String customerName = sc.next();
	System.out.println("Enter customer address");
	String customerAddress = sc.next();
	System.out.println("Enter bill amount");
	int billAmount = sc.nextInt();
	
	Connection connection = DbUtility.getMyConnection();
	System.out.println("Connected");
	PreparedStatement statement =
			connection.prepareStatement("insert into hr.customer values(?,?,?,?)");
	statement.setInt(1, customerId);
	statement.setString(2, customerName);
	statement.setString(3, customerAddress);
	statement.setInt(4, billAmount);
	int noOfRecords =statement.executeUpdate();
	System.out.println(noOfRecords +" row inserted");
}

}

