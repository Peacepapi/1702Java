package com.revature.jdbc;

import org.junit.Assert;
import org.junit.Test;

public class SimpleProcedureTest {

	@Test
	public void test(){
		try {
			String fullname = new CustomerDAO().getFullname(5);
			System.out.println(fullname);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
}