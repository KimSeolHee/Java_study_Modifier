package com.iu.ex1;

public class Iu {

	private String name;
	private int age;
	
	private static Iu iu = null;
	
	private Iu() {}
	
	//클래스 메서드가 됌. 객체사용하지 않아도 됌.
	public static Iu getInstance() {
		if(Iu.iu == null) {
			Iu.iu = new Iu();
		}
		return Iu.iu;
	}
	
	//Setter
	//public void set변수명(데이터타입 변수명){}
	
	//Getter
	//public 리턴타입 get변수명(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = 0;
		if(age > 0 && age <=150) {
			this.age = age;
		}
	}
	
}
