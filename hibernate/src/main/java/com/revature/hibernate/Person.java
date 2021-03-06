package com.revature.hibernate;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@Column(name="PERSON_ID")
	private int id; 
	
	@OneToOne(cascade=CascadeType.REMOVE,
			fetch=FetchType.EAGER) 
	private Laptop laptop;

	// 1-M (this class -> that class)
	@OneToMany(mappedBy="owner") 
	private Set<Pencil> pencils = 
			new HashSet<Pencil>();
	// M-M
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="PERSON_SKILL")
	private Set<Skill> skills;
	
	
}





