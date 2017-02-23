package com.revature.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

public class SimpleTransactionTest {

	@Test
	public void test() {
		Connection conn = null;
		try {
			conn = ConnectionFactory.getConnection();
			// transactions are wrapped into the connection
			conn.setAutoCommit(false); // enables transaction
			PreparedStatement stmt1 = conn.
					prepareStatement("INSERT INTO ARTIST(NAME)"
							+ " VALUES('Def Lepperd')");
			PreparedStatement stmt2 = conn.
					prepareStatement("INSERT INTO ARTIST(NAME)"
							+ " VALUES('Lady Gaga')");
			stmt1.executeUpdate(); 
			if(true) throw new RuntimeException();
			stmt2.executeUpdate();
			conn.commit(); // everything was successful
		} catch (Exception e) {
			e.printStackTrace();
			if (conn != null)
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
		}
		
	}
	
}







