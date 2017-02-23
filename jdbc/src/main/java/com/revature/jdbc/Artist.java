package com.revature.jdbc;

/**
 * Chinook 'domain object' for Artist table 
 *
 */
public class Artist {
	
	// Variables need not match the database columns
	private int artistId;
	private String name;
	
	// Getters, setters, no-arg constructor, 2-arg constructor, toString
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Artist(int artistId, String name) {
		super();
		this.artistId = artistId;
		this.name = name;
	}
	public Artist() {
		super();
	}
	
	public Artist(String name) {
		super();
		this.name = name;
	}
	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", name=" + name + "]";
	}
	
	

}
