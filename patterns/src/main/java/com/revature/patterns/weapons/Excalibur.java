package com.revature.patterns.weapons;

import com.revature.patterns.Weapon;

/**
 * Singleton always returns same object every time
 * 
 * 1. Saves memory
 * 2. Only ever need that 
 * 		one object.. typically stateless objects
 * @return
 */
public class Excalibur implements Weapon {

	/**
	 *  1. singleton object of itself
	 */
	private static Excalibur instance;
	
	/**
	 * 2. private constructor
	 */
	private Excalibur(){}

	/**
	 * 3. Public static getter method for instance
	 * @return
	 */
	public static synchronized Excalibur getExcalibur(){
		// check if instance is null, make a new one
		if (instance == null)
			instance = new Excalibur(); // first time
		// else return same one
		return instance;
	}
	
	public void attack() {
		System.out.println("Excalibur!!!!");
	}

}
