package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "chinook";
	private static final String password = "p4ssw0rd";

	public static Connection getConnection() throws Exception{
		// 1. Load the driver
		Class.forName("oracle.jdbc.OracleDriver");  		
		// 2. Open a connection 
		return DriverManager.getConnection(url, user, password);
	}
	
}




