package com.revature.hibernate;

import org.junit.Test;
import java.util.*;

public class CrtieriaTest {

	@Test
	public void test(){
		List<Hero> heroes = new HeroDAOImpl().assemble();
		for(Hero h : heroes){
			System.out.println(h);
		}
	}
	
}
