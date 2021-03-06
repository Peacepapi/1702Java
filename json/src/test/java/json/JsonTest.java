package json;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;

public class JsonTest {

	private Artist artist = new Artist(1, "Metallica");
	
	@Test
	public void testJson() throws IOException{
		String json = new JSONConverter().getJSON(artist);
		System.out.println(json);
		Artist a = new JSONConverter().getArtist(json);
		System.out.println(a);
	}
	
}
