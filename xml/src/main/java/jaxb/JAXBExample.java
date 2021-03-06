package jaxb;

import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

// Java API for XML Binding
public class JAXBExample {
	
	private static JAXBContext context;
			
	public static void main(String[] args) throws JAXBException {
		context = JAXBContext.newInstance(Food.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		System.out.println(new JAXBExample().getFood(unmarshaller));
		
		Marshaller marshaller = context.createMarshaller();
		new JAXBExample().getXml(marshaller);
	}
	
	public Food getFood(Unmarshaller unmarshaller) throws JAXBException{
		return (Food) unmarshaller.unmarshal(
				this.getClass().getClassLoader()
				.getResourceAsStream("food.xml"));
	}
	
	public void getXml(Marshaller marshaller) throws JAXBException{
		Food food = new Food(555,"Pickles",5,"Green");
		PrintWriter out = new PrintWriter(System.out);
		marshaller.marshal(food, out);
	}
	
}






