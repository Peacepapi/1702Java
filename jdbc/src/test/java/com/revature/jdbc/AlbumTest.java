package com.revature.jdbc;

import org.junit.Assert;
import org.junit.Test;

public class AlbumTest {

	@Test
	public void test(){
		Album a;
		try {
			a = new AlbumDAO().findOne(55);
			System.out.println(a.getTitle() + " by " + 
								a.getArtist().getName());
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
}
