package com.revature.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AlbumDAO {
	
	private Connection conn;

	public AlbumDAO(Connection conn) {
		this.conn = conn;
	}

	public Album findOne(int id) throws Exception{
		String sql = "SELECT ALBUM.ALBUMID, ALBUM.TITLE,"
				+ " ARTIST.ARTISTID, ARTIST.NAME FROM ALBUM INNER"
				+ " JOIN ARTIST ON ARTIST.ARTISTID = ALBUM.ARTISTID"
				+ " WHERE ALBUMID = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet rs = stmt.executeQuery();
		Album result = new Album();
		while(rs.next()){
			Artist artist = new Artist( rs.getInt("ARTISTID"),
					rs.getString("NAME") );
			result.setArtist(artist);
			result.setAlbumId( rs.getInt("ALBUMID") );
			result.setTitle( rs.getString("TITLE") );
		}
		return result;
	}
	
}






