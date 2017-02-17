package com.revature.patterns;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.patterns.weapons.Excalibur;

public class ExcaliburTest {

	static Excalibur excalibur; 
	static Excalibur excalibur2;
	
	@Test
	public void test() throws InterruptedException {
		// anonymous class
		Thread t1 = new Thread(new Runnable(){
			public void run() {
				excalibur = Excalibur.getExcalibur();
			}
			
		});
		Thread t2 = new Thread(new Runnable(){
			public void run() {
				excalibur2 = Excalibur.getExcalibur();
			}
			
		});
		// new Excalibur(); private constructor!! cannot call here
		t1.start(); t2.start();
		t1.join(); t2.join();
		System.out.println(excalibur);
		System.out.println(excalibur2);
		assertEquals(excalibur, excalibur2);
	}

}






