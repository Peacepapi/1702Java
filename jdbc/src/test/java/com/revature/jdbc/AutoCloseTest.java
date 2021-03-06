package com.revature.jdbc;

import org.junit.Test;

public class AutoCloseTest {

	@Test
	public void pre7(){
		DataFacade facade = new DataFacade();
		try{
			facade.findArtist(20);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				facade.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void post7() throws Exception{
		// try-with
		try(DataFacade facade = new DataFacade()){
			facade.findAlbum(10);
		}
	}
	
}










