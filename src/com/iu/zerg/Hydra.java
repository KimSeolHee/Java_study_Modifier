package com.iu.zerg;

import com.iu.unit.Attacker;
import com.iu.unit.Unit;

public class Hydra extends Unit implements Attacker {

	public void move() {
		System.out.println("이동중..🏃‍♂️🏃‍♂️🏃‍♂️");
	}
	
	public void attack() {
		System.out.println("⚔공격!!⚔");
	}
}
