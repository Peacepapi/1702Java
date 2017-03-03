package com.revature.xml;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String isbn;
	private String title;
	private List<String> authors = new ArrayList<>();
	private String publisher;
	private int year;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Book(String isbn, String title, List<String> authors, String publisher, int year) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.publisher = publisher;
		this.year = year;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", authors=" + authors + ", publisher=" + publisher
				+ ", year=" + year + "]";
	}
	
	
	
}
