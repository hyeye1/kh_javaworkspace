package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * * while문
	 * 
	 * 초기식;
	 * while(조건식) { 
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * }
	 * 
	 * 초기식 
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> false면 반복문 stop
	 * 
	 */
	
	public void method1() {
		
		// "안녕하세요" 5번 출력
		/*
		for(int i=1; i<=5; i++) {
			System.out.println("안녕하세요");
		}
		System.out.println(i);
		*/
		
		int i = 1;
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;
		}
		
		System.out.println(i);
		
		// 1 2 3 4 5
		i = 1;
		
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		
	}
	
	
	public void method2() {
		// 1에서 10까지의 총 합계
		
		int sum = 0;
		
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("총 합계 : " + sum);
		
	}
	
	public void method3() {
		
		// 1부터 랜덤값(1~10사이) 까지의 총합계
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
		
	}
	
	public void method4() {
		// 메뉴 관련
		Scanner sc = new Scanner(System.in);
		
		//------------------------
		//while(true) {
		for(;true;) {
			System.out.println("\n==== 메뉴 ====");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 10까지 총합계");
			System.out.println("3. 1부터 랜덤값까지 총합계");
			System.out.println("0. 프로그램 종료");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력했습니다. 다시입력해주세요.");
			}
		}
		//-----------------------
		
	}
	
	/*
	 * * do-while문
	 * 
	 * 초기식;
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * }while(조건식);
	 * 
	 * 초기식
	 * 		무조건 코드 한번 실행 --> 증감식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> true면 실행 --> 증감식
	 * 조건식 --> false면 빠져나감
	 * 
	 * while문과 다른점은 while문은 처음 수행될때도 조건 검사 후 true여야 실행 
	 * 단, do while문은 첫 실행은 조건 검사 없이 무조건 한번은 실행됨
	 * 
	 * 
	 */
	
	public void method5() {
		// 애초에 조건이 맞지 않아도 반드시 한번은 수행
		int num = 1;
		
		do {
			System.out.println(num);
			
		}while(num == 0);
		
	}
	
	public void method6() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 5);
		
	}
	
	public void method7() {
		// 2단 출력
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ....
		// 2 x 9 = 18
		
		System.out.println("=== 2단 ===");
		
		int su = 1;
		
		do {
			System.out.printf("2 x %d = %d\n", su, 2*su);
			su++;
		}while(su <= 9);
		
	}
	

}






