package com.revature.jdbc;

import org.junit.Test;

public class SimpleInsertTest {

	@Test
	public void insert(){
		Artist artist = new Artist(278, "The Dan Band");
		try {
			// idc how.. just persist my object into 
				// whatever datastore you got going on over there
			new ArtistDAO().save(artist);
		} catch (Exception e) {
			e.printStackTrace();
			org.junit.Assert.fail();
		}
	}
	
}
