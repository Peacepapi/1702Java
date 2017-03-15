package com.revature.hibernate;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Skill {

	@Id
	@Column
	private int pk;
	@Column
	private String skillType;
	// M-M
	@ManyToMany(mappedBy="skills")
	private Set<Person> personsHoldingSkill;
	
}
