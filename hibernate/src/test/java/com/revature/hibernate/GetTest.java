package com.revature.hibernate;

import org.junit.Test;

public class GetTest {

	@Test
	public void get(){
		System.out.println(new HeroDAOImpl().findOne(7777));
	}
	
}