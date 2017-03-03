package com.revature.xml;

import org.junit.Test;

import org.junit.Assert;

public class BookTest {

	@Test
	public void test() {
		Book book = BookParser.readBook("book.xml");
		System.out.println(book);
		Assert.assertNotNull(book);
	}
	
}
