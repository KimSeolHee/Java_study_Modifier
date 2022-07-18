package com.iu.main;

import com.iu.util.CollectionStack;

public class Main {
	
	public static void main(String[] args) {
		//test data set
		int [] numbers = {1,2,3};
		
		// 1. com.iu.util CollectionStack클래스 생성
		// 인터페이스 구현 메서드는 add remove가 구현 오버라이딩
		// add메서드는 숫자 배열받고 새로운 숫자를 추가한다 아무거나 어디에 추가? 무조건 0번인덱스에
		// stack.remove(numbers) -> {4,1,2,3}
		// remove메서드가 호출되면 삭제한다.어디를? 0번인덱스를 삭제한다.
		// stack.add(numbers) -> {2,3}
		// 추가는 아무거나 입력받아서 숫자 추가
		
		//2. 패키지 같고 다른 클래스 CollectionQue
		//메서드는 add -내용이 다름 새로운 숫자 인덱스0번에 추가
		// que.add(numbers) -> {4,1,2,3}
		//remove하면 마지막 인덱스 번호를 삭제함.
		// que.add(numbers) -> {1,2}
		
		//3.CollectionSet
		//add - 새로운 숫자 추가 마지막에 추가
		// set.add(numbers) -> {1,2,3,4}
		//단, 중복되지 않는 숫자만 추가
		//remove-삭제할 숫자를 입력받아서 일치하는 숫자를 삭제
		// set.add(numbers) -> {2,3}
		
		
		CollectionStack stack = new CollectionStack();

		int [] numBox = stack.add(numbers);
		for(int i= 0;i<numbers.length;i++) {
			System.out.println(numBox[i]);
		}
		
		int [] numBox2 =stack.remove(numbers);
		for(int i= 0;i<numbers.length-1;i++) {
			System.out.println(numBox2[i]);
		}
		
	}

}
