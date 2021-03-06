package com.revature.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMExample {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		InputStream instream = DOMExample.class
				.getClassLoader()
				.getResourceAsStream("book.xml");
		
		//DocumentBuilderFactory -> DocumentBuilder -> Document
		DocumentBuilderFactory factory = 
				DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = 
				factory.newDocumentBuilder();
		Document document = builder.parse(instream);
		
		// traverse tree
		String book = document.getDocumentElement().getNodeName();
		String isbn = document.getDocumentElement().getAttribute("isbn");
		System.out.println(book + " has isbn: " + isbn);
		
		// get authors
		NodeList authors = document.getElementsByTagName("author");
		for(int i=0; i<authors.getLength(); i++){
			Node author = authors.item(i);
			System.out.println("Author is: " + author.getTextContent());
		}
	}
	
}







