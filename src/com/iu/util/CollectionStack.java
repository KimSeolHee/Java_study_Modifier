package com.iu.util;

import java.util.Scanner;

public class CollectionStack implements Collection {
	
	Scanner sc = new Scanner(System.in);
	// 1. com.iu.util CollectionStack클래스 생성
	// 인터페이스 구현 메서드는 add remove가 구현 오버라이딩
	
	
	// add메서드는 숫자 배열받고 새로운 숫자를 추가한다. 어디에 추가? 무조건 0번인덱스에
	// remove메서드가 호출되면 삭제한다.어디를? 0번인덱스를 삭제한다.
	// 추가는 아무거나 입력받아서 숫자 추가

	@Override
	public int[] add(int[] numbers) {
		//2.숫자입력받기(배열에 넣을)
		System.out.println("배열을 넣을 숫자를 입력해주세요.");
		int num = sc.nextInt();
		
		//3. 배열길이를 늘려 입력받은 숫자를 0번 인덱스에 넣기
		int [] copyNums = new int[numbers.length+1];
		
		boolean flag = true;
		for(int i = 0;i < numbers.length;i++) {
			if(flag) {
				copyNums[i] = num;
				flag = !flag;
				break;
			}
			
			int index = 0;
			copyNums[i] = numbers[index];
			
			index++;
		}
		numbers = copyNums;
		
		return numbers;
	}

	
	// remove메서드가 호출되면 삭제한다.어디를? 0번인덱스를 삭제한다.
	// stack.remove(numbers) -> {2,3}
	
	@Override
	public int[] remove(int[] numbers) {
		int [] minusNums = new int[numbers.length-1];
		boolean flag = true;
		for(int i = 0;i<numbers.length;i++) {
			if(flag) {
				minusNums[i] = numbers[i];  
			}
			numbers = minusNums;
		}
		
		return numbers;
	}

}
