package com.revature.xml;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class BookParser {

	public static Book readBook(String xml) {
		Book book = new Book();
		try {
			InputStream instream = DOMExample.class.getClassLoader().getResourceAsStream(xml);

			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(instream);

			book.setIsbn(document.getDocumentElement().getAttribute("isbn"));
			NodeList bookDetails = document.getDocumentElement().getChildNodes();
			for (int i = 0; i < bookDetails.getLength(); i++) {
				Node node = bookDetails.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					switch (node.getNodeName()) {
					case "authors": {
						for(int x=0;x<node.getChildNodes().getLength();x++){
							//each author
							if(node.getChildNodes().item(x).getNodeName().equals("author"))
								book.getAuthors().add(node.getChildNodes().item(x).getTextContent());
						}
						break;
					}
					case "publishing": {
						for(int x=0;x<node.getChildNodes().getLength();x++){
							//each element
							if(node.getChildNodes().item(x).getNodeName().equals("publisher"))
								book.setPublisher(node.getChildNodes().item(x).getTextContent());
							if(node.getChildNodes().item(x).getNodeName().equals("year"))
								book.setYear(Integer.parseInt(node.getChildNodes().item(x).getTextContent()));
						}
						break;
					}
					case "title":{
						book.setTitle(node.getTextContent());
					}
					default:
						break;
					}
				}
			}

		} catch (Exception e) {}
		return book;
	}

}
