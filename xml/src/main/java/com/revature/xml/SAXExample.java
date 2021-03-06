package com.revature.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXExample {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		InputStream instream = SAXExample.class
				.getClassLoader().getResourceAsStream("book.xml");
		SAXExample.BookHandler handler = new SAXExample.BookHandler();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser parser = factory.newSAXParser();
		parser.parse(instream, handler);
	}
	
	static class BookHandler extends DefaultHandler{
		@Override
		public void startElement(String uri,
				String localName, String qName,
				Attributes attributes)
				throws SAXException {
			System.out.println("<"+qName+">");
			if(qName.equals("book")){
				String isbn = attributes.getValue("isbn");
				System.out.println(isbn);
			}
			
		}
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
			// event fires when text is found between element tags
			// <p>text content</p>
			String str = new String(ch, start, length);
			System.out.println(str);
		}
		
		
		@Override
		public void startDocument() throws SAXException {
			System.out.println("Begin to read document");
		}
		@Override
		public void endDocument() throws SAXException {
			System.out.println("Done reading document");
		}
	}
	
}
