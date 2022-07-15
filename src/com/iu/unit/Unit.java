package com.iu.unit;

public abstract class Unit {

	//클래스간의 공통요소들을 모아놓는다.(부모클래스)
	private String name;
	private int hp;
	private String color;
	
//	public Unit(int hp) {
//		System.out.println("Super 생성자!");
//		this.hp = hp;
//	}
	
	public Unit() {
		System.out.println("Super 생성자!");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//완성되지 않은 메서드
	public abstract void move();
	
// attack();을 상속 받지 않는 애들도 있으므로 인터페이스를 따로 두고 
//	해당 메서드를 사용할 클래스는 인터페이스를 사용하여 구현
//	public abstract void attack();
	
	public void info() {
		System.out.println("Super info");
	}
	
}
