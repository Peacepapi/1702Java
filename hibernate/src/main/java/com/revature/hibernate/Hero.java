package com.revature.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
// Java Persistence API (Oracle ORM)

@NamedQueries({
	@NamedQuery(name="findByName", query="from com.revature.hibernate.Hero where name = :param"),
	@NamedQuery(name="findByLevel", query="from Hero where level = :lvl")
})
@NamedNativeQueries({
	@NamedNativeQuery(name="findHighLevel", 
			query="SELECT * FROM HERO WHERE HERO_LEVEL > 85",
			resultClass=com.revature.hibernate.Hero.class)
})
@Entity
@Table(name="HERO")
public class Hero {

	@Id
	@Column(name="HERO_PK")
	@SequenceGenerator(name="hero", sequenceName="HERO_PK_SEQ")
	@GeneratedValue(generator="hero", strategy=GenerationType.SEQUENCE)
	private int pk; 
	@Column(name="HERO_NAME", unique=true)
	private String name; 
	@Column(name="HERO_HP")
	private int hp;	
	@Column(name="HERO_MP")
	private int mp; 
	@Column(name="HERO_LEVEL")
	private int level;
	@Column(name="DATE_CREATED")
	private Date created;
	
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public int getPk() {
		return pk;
	}
	public void setPk(int pk) {
		this.pk = pk;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public Hero(String name, int hp, int mp, int level, Date created) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.level = level;
		this.created = created;
	}
	public Hero() {
		super();
	}
	@Override
	public String toString() {
		return "Hero [pk=" + pk + ", name=" + name + ", hp=" + hp + ", mp=" + mp + ", level=" + level + "]";
	}
	
	
	
}
