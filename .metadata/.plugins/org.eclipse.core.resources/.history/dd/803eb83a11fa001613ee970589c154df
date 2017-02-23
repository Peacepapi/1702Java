package com.revature.jdbc;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SimpleGetAllTest {

	@Test
	public void test(){
		List<Artist> all;
		try {
			all = new ArtistDAO().getAll();
			for(Artist a : all) System.out.println(a);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
		
	}
	
}
