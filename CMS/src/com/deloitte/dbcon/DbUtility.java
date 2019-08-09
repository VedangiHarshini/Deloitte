package com.deloitte.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {
	public static Connection getMyConnection() {
		Connection connection = null;
	
     
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 connection = 
				 DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;		
	}  
     
}
