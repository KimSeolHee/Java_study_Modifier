package com.iu.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		//클래스 메서드는 클래스.클래스 메서드
		//싱글톤 - (디자인패턴, MVC2)
		
		Iu iu = Iu.getInstance();
		
		iu.setName("IU");
		iu.setAge(10);
		
		System.out.println(iu.getAge());
		System.out.println(iu.getName());
		System.out.println(iu);
		System.out.println("====================");
		
		Iu iu2 = Iu.getInstance();
		
		System.out.println(iu.getAge());
		System.out.println(iu.getName());
		System.out.println(iu);
	}

}
