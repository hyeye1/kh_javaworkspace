package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * * 삼항 연산자 : 3개의 항목을 가지고 연산하는 연산자
	 * 
	 * [표현식] 조건식 ? 조건식이 참일경우의 결과값 : 조건식이 거짓일경우의 결과값
	 * 
	 */

	public void method1() {
		// 사용자에게 입력받은 정수값이 양수인지 아닌지 판별 후 그에 해당하는 결과값 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		/*
		// 조건식 ? 참일경우의 결과값 : 거짓일경우의 결과값
		String result = (num > 0) ? "양수이다" : "양수가 아니다";
		// xx은(는) xxxxx
		System.out.println(num + "은(는) " + result);	
		*/
		
		System.out.println(num + "은(는) " + (num > 0 ? "양수이다" : "양수가 아니다"));
		
	}
	
	public void method2() {
		
		// 사용자가 입력한 정수값이 짝수인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수이다" : "홀수이다";
		
		System.out.println(num + "은(는) " + result);
		
	}
	
	public void method3() {
		
		// 사용자가 입력한 영문자가 대문자인지 아닌지 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "대문자이다" : "대문자가 아니다";
		System.out.println(ch + "은(는) " + result);
		
	}
	
	
	public void method4() {
		// 삼항 연산자 중첩 사용
		
		// 사용자가 입력한 정수값이 양수인지, 음수인지, 0인지 정확히 판별 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "양수이다" : (num == 0 ? "0이다" : "음수이다"));
		System.out.println(num + "은(는) " + result);
		
	}
	
	public void method5() {
		// 두 정수값과 + 또는 -의 문자를 하나 입력받아
		// +일 경우 두 정수값의 덧셈 연산결과, -일 경우 두 정수값의 뺄셈 연산결과, 잘못입력햇을경우 "잘못입력했습니다."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자 입력(+ or -) : ");
		char op = sc.nextLine().charAt(0);
									// "30"
		String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "잘못입력했습니다"));
		
		
		System.out.println("결과 : " + result);
		
		
	}
	
	
	
}





