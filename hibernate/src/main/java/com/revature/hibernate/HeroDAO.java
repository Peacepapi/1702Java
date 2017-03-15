package com.revature.hibernate;

import java.util.List;

public interface HeroDAO {

	public void create(Hero hero);
	public Hero findOne(int pk);
	public void update(Hero hero);
	public void delete(Hero hero);
	public List<Hero> findAll();
	
	// HQL -- Hibernate Query Language
	public Hero findByName(String name);
	
	// Criteria -- programmatic SQL queries
	public List<Hero> assemble(); // assemble the world's finest heroes
	
	// Native SQL query
	public List<Hero> findHighLevel();
	
	// Criteria
	public int highestHp();
	
}
