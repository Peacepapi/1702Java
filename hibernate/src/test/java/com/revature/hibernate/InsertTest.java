package com.revature.hibernate;

import java.util.Date;

import org.junit.Test;

public class InsertTest {

	@Test
	public void insert(){
		HeroDAO dao = new HeroDAOImpl();
		dao.create(new Hero("Spiderman",
				2700, 700, 99, new Date()));
		dao.create(new Hero("Superman",
				2700, 700, 99, new Date()));
		dao.create(new Hero("Batman",
				2700, 700, 99, new Date()));
		dao.create(new Hero("Wonder Woman",
				2700, 700, 99, new Date()));
		System.out.println("Success!");
	}
	
}
