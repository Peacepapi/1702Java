package com.revature.hibernate;

import org.junit.*;

public class HighLevelTest {

	@Test
	public void highlvl(){
		System.out.println(new HeroDAOImpl().findHighLevel());
	}
	
}
