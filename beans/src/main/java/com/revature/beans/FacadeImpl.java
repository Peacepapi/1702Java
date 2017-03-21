package com.revature.beans;

public class FacadeImpl {

	private DAO dao;

	// constructor injection
	public FacadeImpl(DAO dao) {
		super();
		this.dao = dao;
		System.out.println("Spring is calling your constructor");
	}

	public FacadeImpl() {
		super();
	}

	// setter injection
	public void setDao(DAO dao) {
		System.out.println("Spring is calling your setter");
		this.dao = dao;
	}

	public void save(String str){
		dao.save(str); 
	}
	
}
