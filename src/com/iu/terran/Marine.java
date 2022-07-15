package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit {
	
	private String weapon;

	public Marine() {
//		super(30); 부모 생성자에 인자값이 들어가는경우 따로 인자값 넣어서 불러줘야한다..
//		super(); //생략되있는 부분이다. 자식 생성자가 생성될때 부모의 생성자도 자동생성.
//		this(); XXX 첫줄이 아니므로..위의 super();도 마찬가지..
		System.out.println("Marine 생성자!");
	}
	
	//오버라이딩
	public void move() {
		System.out.println("이동중..🏃‍♂️🏃‍♂️🏃‍♂️");
	}
	//내용 재정의
	public void info() {
		super.info();
		System.out.println("Marine info");
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
