package com.revature.jdbc;

public class Album {

	private int albumId;
	private String title;
	private Artist artist; // HAS-A artist
	
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Artist getArtist() {
		return artist;
	}
	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	public Album(int albumId, String title, Artist artist) {
		super();
		this.albumId = albumId;
		this.title = title;
		this.artist = artist;
	}
	public Album() {
		super();
	}
	@Override
	public String toString() {
		return "Album [albumId=" + albumId + ", title=" + title + ", artist=" + artist + "]";
	}
	
	
	
}
