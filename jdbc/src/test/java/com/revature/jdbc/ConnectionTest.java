package com.revature.jdbc;

import org.junit.Test;
import static org.junit.Assert.*; // static import

public class ConnectionTest {

	@Test
	public void test(){
		try {
			assertNotNull(ConnectionFactory.getConnection());
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}
	
}
