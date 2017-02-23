package com.revature.jdbc;

import org.junit.Assert;
import org.junit.Test;

public class ArtistTest {

	@Test
	public void test(){
		try{
			Artist artist = new Artist("Kayne West");
			new ArtistDAO().insert(artist);
			System.out.println("Database generated key: " + 
					artist.getArtistId());
		}catch(Exception e){
			e.printStackTrace();
			Assert.fail();
		}
	}
	
}
