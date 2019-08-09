package jdbcdemos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demoo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your option : 1.View all\n 2.Insert record");
		int option = sc.nextInt();
		if (option == 1)
			printStudentRecords();
		if(option == 2)
			insertStudentRecords();
		saythanks();
		
	}
		
		private static void saythanks() {
		System.out.println("Thanks for using");
	
		
	}

		private static void printStudentRecords() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded");
		Connection connection = 
		 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		System.out.println("Connected");
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from hr.stud");
		while(res.next())
		{
			System.out.print(res.getString(1)+" ");
			System.out.println(res.getString(2));
		}
		connection.close();
	}
		private static void insertStudentRecords() throws ClassNotFoundException, SQLException {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection connection = 
			 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
			System.out.println("Connected");
			Statement statement = connection.createStatement();
			int noOfRecords = statement.executeUpdate("insert into hr.stud values(18,'Virat')");
			System.out.println(noOfRecords + "  row inserted");
			connection.close();
		}
	
}
