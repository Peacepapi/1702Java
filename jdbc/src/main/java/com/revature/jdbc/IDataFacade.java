package com.revature.jdbc;

import java.util.List;

public interface IDataFacade {

	public Artist findArtist(int id);
	public List<Artist> getAll();
	public Album insert(Album album);
	public Album findAlbum(int id);
	
}
