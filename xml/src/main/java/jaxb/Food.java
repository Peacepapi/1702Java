package jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="food") //name of root tag
public class Food {

	private int code;
	private String type;
	private int weight;
	private String color;

	@XmlAttribute(name="code") // name="attribute name in xml"
	public void setCode(int code) {
		this.code = code;
	}
	@XmlElement
	public void setColor(String color) {
		this.color = color;
	}
	@XmlElement(name="type")
	public void setType(String type) {
		this.type = type;
	}
	@XmlElement(name="weight")
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getColor() {
		return color;
	}
	
	public String getType() {
		return type;
	}	

	public int getWeight() {
		return weight;
	}
	public int getCode() {
		return code;
	}
	@Override
	public String toString() {
		return "Food [code=" + code + ", type=" + type + ", weight=" + weight + ", color=" + color + "]";
	}
	public Food(int code, String type, int weight, String color) {
		super();
		this.code = code;
		this.type = type;
		this.weight = weight;
		this.color = color;
	}
	public Food() {
		super();
	}
	
}
