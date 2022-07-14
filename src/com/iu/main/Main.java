package com.iu.main;

import com.iu.animal.Cat;
import com.iu.animal.Human;
import com.iu.animal.Zoo;

public class Main {
	
	public static void main(String[] args) {
		
		Human human = new Human();
//		human.age = 560;
		human.setAge(160);
		human.info();
		
		//static 선언시 메서드 영역에 미리 생성되어 객체 선언없이 부를수있다.
		//사용: 클래스명.멤버변수명||클래스명.멤버메서드명()
		System.out.println(Zoo.title);
		Zoo.info();
		
		Zoo zoo = new Zoo();
		
//		zoo.price = 10000;  //에러! final로 지정되어 변경 불가.
		
		
//		Cat cat = new Cat();
//		cat.sound();
//		cat.age(5);
		
		
	}

}
