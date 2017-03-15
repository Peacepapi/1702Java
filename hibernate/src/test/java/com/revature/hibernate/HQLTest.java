package com.revature.hibernate;

import org.junit.*;

public class HQLTest {

	@Test
	public void demo(){
		System.out.println(new HeroDAOImpl().findByName("Bratac"));
	}
	
}
