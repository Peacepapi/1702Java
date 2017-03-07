package json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONConverter {

	public Artist getArtist(String json) throws JsonParseException, JsonMappingException, IOException{
		return new ObjectMapper().readValue(json, Artist.class);
	}
	
	public String getJSON(Artist artist) throws JsonProcessingException{
		return new ObjectMapper().writeValueAsString(artist);
	}
	
}
