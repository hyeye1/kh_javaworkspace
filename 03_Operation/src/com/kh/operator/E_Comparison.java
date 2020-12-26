package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	
	/*
	 * * 비교연산자 (관계연산자)
	 * - 이항연산자 (두 값을 비교하는 연산자) 
	 * - 비교연산을 수행한 결과값은 논리값(true/false)
	 *   비교연산에 해당하는 조건에 만족하면 true(참) / 만족하지 않으면 false(거짓)
	 *   => 후에 조건문에서 쓰일 예정
	 * 
	 * a < b 	: a가 b보다 작습니까? 
	 * a > b	: a가 b보다 큽니까?
	 * a <= b   : a가 b보다 작거나 같습니까?
	 * a >= b 	: a가 b보다 크거나 같습니까?
	 * 
	 * a == b   : a랑 b랑 일치합니까?
	 * a != b   : a랑 b랑 일치하지 않습니까?
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		
		// 산술연산 + 비교연산
		
		// 어떠한값을 2로 나눴을때 나누어 떨어지냐/아니냐
		// 즉, 2로 나눴을 때의 나머지값이 0이냐 / 1이냐
		// 를 가지고 짝수인지/홀수인지 판별가능
		
		System.out.println("a가 짝수입니까 : " + (a % 2 == 0));
		System.out.println("a가 홀수입니까 : " + (a % 2 == 1));
		
	}
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자에게 정수값 입력받은 후
		System.out.print("정수값 한개 입력 : ");
		int num = sc.nextInt();
		
		// 해당 값이 양수인지 출력
		System.out.println("사용자가 입력한 값은 양수입니까 : " + (num > 0));
		
		// 해당 값이 짝수인지 출력
		System.out.println("사용자가 입력한 값은 짝수입니까 : " + (num % 2 == 0));
		
		
	}
	
	

}
