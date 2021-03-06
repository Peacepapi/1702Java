package com.revature.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Data Access Object - design pattern
 * 	--isolate the database access logic in one place
 * 	--cohesion.. classes have only one role
 * 
 * 1. CRUD methods for your domain object
 * 2. Outside of DAO is concerned with only domain objects.. not SQL!
 *
 */
public class ArtistDAO {

	private Connection conn;

	public ArtistDAO(Connection conn) {
		this.conn = conn;
	}

	public void save(Artist artist) throws Exception{ //would handle SQLExceptions here
		String sql = "INSERT INTO ARTIST(ARTISTID, NAME) VALUES(?, ?)";
		// pre-compile the SQL statement in Java
		PreparedStatement stmt = conn.prepareStatement(sql);
		// bind values safely to the placeholder ??s
		stmt.setString(2, artist.getName());
		stmt.setInt(1, artist.getArtistId());
		//INSERT INTO ARTIST(ARTISTID, NAME) VALUES(5, 'Dan')
		stmt.executeUpdate();
	}
	
	public Artist findOne(int id) throws Exception{
		String sql = "SELECT ARTISTID, NAME FROM ARTIST WHERE ARTISTID = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, id);
		// rows returned by database are stored in ResultSet object
		ResultSet rs = stmt.executeQuery(); 
		// iterate over the ResultSet and snatch values
		Artist artist = new Artist();
		while(rs.next()){ 
			// points the next row, returns true/false if there is a row
			// object-relational mapping
			artist.setArtistId( rs.getInt("ARTISTID") );
			artist.setName( rs.getString("NAME") );
		}
		return artist;
	}
	
	public List<Artist> getAll() throws Exception{
		String sql = "SELECT ARTISTID, NAME FROM ARTIST";
		// compiled by database
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql); 
		List<Artist> list = new ArrayList<Artist>();
		while(rs.next()){ 
			list.add( new Artist(rs.getInt("ARTISTID"), 
					rs.getString("NAME")) );
		}
		return list;
	}
	
	public Artist insert(Artist artist) throws Exception{
		// 1. not specifying artistid
		String sql = "INSERT INTO ARTIST(NAME) VALUES(?)";
		String[] allGeneratedColumns = {"ARTISTID"}; 
		// Statement initialized knowing the generated key columns
		PreparedStatement stmt = conn.prepareStatement(sql, allGeneratedColumns);
		stmt.setString(1, artist.getName());
		stmt.executeUpdate();
		// 2. Extract generated primary key
		ResultSet generatedValues = stmt.getGeneratedKeys();
		while(generatedValues.next()){
			artist.setArtistId( generatedValues.getInt(1) );
		}
		return artist;
	}
}