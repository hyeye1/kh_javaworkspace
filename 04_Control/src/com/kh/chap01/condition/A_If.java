package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * 프로그램은 기본적으로 위에서 아래로 순차적으로 진행
	 * 단, 이 순차적인 흐름을 바꾸고자 할때 "제어문"을 통해 제어할 수 있음
	 * 
	 * 선택적으로 실행 => 조건문
	 * 반복적으로 실행 => 반복문
	 * 그 외의 흐름 제어 => 분기문
	 * 
	 * * 조건문
	 * "조건식"을 통해 참이냐 거짓이냐를 판단해서 해당 조건이 만족하는 경우 그에 해당하는 실행문 실행
	 * 
	 * => 조건식의 결과는 true/false 여야됨
	 * => 보통 조건식에서는 비교연산자(대소, 동등) / 논리연산자(&&, ||)를 사용
	 * 
	 * 조건문은 크게 if문과 switch문으로 나뉨
	 * 
	 * if문에서는 다시 3가지로 나뉨
	 * 1. 단독 if문
	 * 2. if-else문
	 * 3. if-else if문
	 * 
	 * 
	 * * 단독 if문
	 * 
	 * 실행할 코드;
	 * 실행할 코드;
	 * 
	 * if(조건식) {
	 * 		실행할 코드;
	 * 		실행할 코드;
	 * }
	 * 
	 * => 조건식의 결과 참(true)이면 중괄호 안의 코드 실행
	 * => 조건식의 결과 거짓(false)이면 중괄호 안의 코드 무시하고 넘어감
	 * 
	 */
	
	public void method1() {
		
		// 실습문제 1. 사용자가 입력한 정수값이 양수인지 아닌지 판별 후 "양수다" / "양수가 아니다"
		// 실습문제 2. 						정확히  판별 후 "양수다" / "0이다" / "음수다" 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num == 0) {
			System.out.println("0이다");
		}
		
		if(num < 0) {
			System.out.println("음수다");
		}
		
	}
	
	
	public void method2() {
		// 실습문제 3. 사용자가 입력한 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("입력한 숫자는 짝수입니다.");
		}
		
		if(num % 2 == 1) {
			System.out.println("입력한 숫자는 홀수입니다.");
		}
		
	}
	
	public void method3() {
		
		// 실습문제 6. 사용자가 입력한 나이값을 가지고 어린이/청소년/성인 으로 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이(정수만) : ");
		int age = sc.nextInt();
		
		// 어린이(13세 이하), 청소년(13세 초과 ~ 19세 이하), 성인(19세 초과)
		
		String result = ""; // 결과값을 담기 위한 변수를 만들어둠! (초기화도 해둠)
		
		if(age >= 0 && age <= 13) {
			result = "어린이";
		}
		
		if(age > 13 && age <= 19) {
			result = "청소년";
		}
		
		if(age > 19) {
			result = "성인";
		}
		
		System.out.println(result);
		
	}
	
	public void method4() {
		
		// 실습문제 8. 사용자에게 입력받은 주민번호를 가지고 남자/여자 판별 후 출력
		
		// 1. 사용자에게 주민번호 입력받기  => ex) "850918-2456147"
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 입력(- 포함) : ");
		String personId = sc.nextLine(); // "850918-2456147"
		
		// 2. 입력받은 주민번호로 부터 성별에 해당하는 문자(7번인덱스) 하나만을 뽑아놓기 => ex) '2'
		char ch = personId.charAt(7); // '2'
		
		// 3. 문자가 '1' 또는 '3'일 경우 => 남자 출력
		if(ch == '1' || ch == '3') {
			System.out.println("남자");
		}
		//    문자가 '2' 또는 '4'일 경우 => 여자 출력
		if(ch == '2' || ch == '4') {
			System.out.println("여자");
		}
		//    문자가 '1','2','3','4' 모두 아닐 경우 => 잘못입력했습니다 출력
		if(ch != '1' && ch != '2' && ch != '3' && ch != '4'){
			System.out.println("잘못입력하셨습니다");
		}
		
	}
	
	
	
	
	
	

}
