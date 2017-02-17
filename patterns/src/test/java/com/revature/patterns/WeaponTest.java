package com.revature.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.patterns.weapons.Excalibur;

public class WeaponTest {

	@Test
	public void test() {
		// invoke factory method
		// no new keyword.. no reference Sword class
		Weapon one = WeaponFactory.getMedievalWeapon();
		one.attack();
		Weapon two = WeaponFactory.getModernWeapon();
		two.attack();
		
	}

}
