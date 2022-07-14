package com.iu.animal;

public class Zoo {
	
	//멤버변수
	//접근지정자 [그외지정자] 데이터타입 변수명;
	//static으로 선언된건 약간 기울어져있음.
	
	//클래스 변수
	public static String title = "사파리";
	
	//멤버변수
	public final int PRICE = 50000; //객체를 생성해야 사용가능
	//상수에 변수명에 두 단어가 합쳐지면 스네이크 표기법 사용 //MAX_VALUE
	
	
	//멤버메서드 선언
	//접근지정자 [그외지정자] 리턴타입 메서드명(매개변수선언){}

	//클래스메서드
	public static void info() {
		System.out.println("Static Method");
		System.out.println(Zoo.title);
//		System.out.println(price); // 객체가 생성되야 사용가능하지만 info() → main실행 시 객체 생성 전이므로 오류(순서 : static → main → 객체 생성)
	}
	
	//멤버메서드
	public void getPrice() {
//		System.out.println(price);
		//클래스변수 사용
		System.out.println(Zoo.title);
		Zoo.info();
	}
	
	//static메서드엔 멤버변수 or 멤버메서드 사용불가.. why? (순서 : static → main → 객체 생성) 클래스메서드 실행 시 객체 생성 전에 해당 멤버변수 및 메서드가오므로 오류 
	
}
