package com.iu.main;

import com.iu.terran.Marine;
import com.iu.terran.Scv;
import com.iu.unit.Unit;

public class Main {
	
	public static void main(String[] args) {
		Marine marine = new Marine();
		Scv scv = new Scv();
		
		//Marine is a Unit
		//Scv is a Unit
		//아래는 상속관계에서만 가능하다.
		//마린타입은 유닛타입이므로 가능............
		//다형성
		Unit unit = marine;
//		Unit unit = scv;
		
		System.out.println(unit.getHp());
		System.out.println(unit.getColor());
		System.out.println(unit.getName());
//		System.out.println(unit.getWeapon()); 
//		→ Weapon까지 만들어져있지만 unit이 접근가능한건 자신이 알고있는것만 접근가능함.
		
//		marine = (Marine)unit;
//		형변환과 같은 맥락으로 생각하면 된다. 큰타입이 작은타입으로 자동변환은 불가. 강제 형변환 시켜줌
		System.out.println(marine.getWeapon());
		
	}

}
