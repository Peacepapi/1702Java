package com.revature.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pencil {

	@Id
	@Column
	private int pk;
	@Column
	private int num;
	@Column
	private String brand;
	
	// bi-directional relationship
	// M-1
	@ManyToOne(optional=true)
	@JoinColumn(name="PENCIL_OWNER") // generates the FK column
	private Person owner;

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	
}





