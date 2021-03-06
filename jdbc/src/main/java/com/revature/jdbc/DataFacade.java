package com.revature.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Hides complexity of data tier from the business tier
 *
 */
public class DataFacade implements AutoCloseable{
	
	private AlbumDAO albumDAO;
	private ArtistDAO artistDAO;
	private Connection conn;
	
	public DataFacade(){
		try {
			conn = ConnectionFactory.getConnection();
			//////////// ENABLE TRANSACTIONS /////////////
			conn.setAutoCommit(false);
			albumDAO = new AlbumDAO(conn);
			artistDAO = new ArtistDAO(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Artist findArtist(int id) throws Exception {
		return artistDAO.findOne(id);
	}

	public List<Artist> getAll() throws Exception {
		return artistDAO.getAll();
	}

	public Album insert(Album album) {
		try{
			// check if artist exists, true: use it / false: create it
			Artist artist = artistDAO.findOne(album.getArtist().getArtistId());
			if(artist.getArtistId() == 0){ // could not find artist
				artistDAO.insert(album.getArtist());
			}
			//album = albumDAO.insert(album);
			conn.commit();
		}catch(Exception e){
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return album;
	}

	public Album findAlbum(int id) throws Exception {
		return albumDAO.findOne(id);
	}

	/**
	 * Useable with try-with-resources statement.. or just call this method
	 */
	public void close() throws Exception {
		if(conn != null)
			conn.close();
	}


	
}
