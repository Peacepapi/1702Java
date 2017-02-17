package com.revature.patterns;

import com.revature.patterns.weapons.Excalibur;
import com.revature.patterns.weapons.Longsword;
import com.revature.patterns.weapons.MachineGun;
import com.revature.patterns.weapons.Sword;

/**
 * Makes weapons
 * @author Patrick
 *	
 *	1. Complex instantiation logic
 *	2. Abstract concrete classes away
 *	3. Promotes loose-coupling (decouple)
 */
public class WeaponFactory {
	
	// Factory methods
	public static Weapon getMedievalWeapon(){
		//return new Sword(); // doesn't matter the concrete class
		return new Longsword();
	}
	
	public static Weapon getModernWeapon(){
		return new MachineGun();
	}
}








