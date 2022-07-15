package com.iu.main;

import com.iu.terran.Marine;

public class Main {
	
	public static void main(String[] args) {
		Marine marine = new Marine();
		
		marine.setHp(10);
		System.out.println(marine.getHp());
		
		marine.setWeapon("검");
		System.out.println(marine.getWeapon());
		
		marine.info();
		marine.move();
		
	}

}
