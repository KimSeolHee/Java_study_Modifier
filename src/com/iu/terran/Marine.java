package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit {
	
	private String weapon;
	
	public void move() {
		System.out.println("이동중..🏃‍♂️🏃‍♂️🏃‍♂️");
	}
	
	public void shoot() {
		System.out.println("탕탕🔫🔫");
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
}
