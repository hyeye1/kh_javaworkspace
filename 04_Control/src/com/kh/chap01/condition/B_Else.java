package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * * if-else 문
	 * 
	 * if(조건식) {
	 * 		실행 코드1;
	 * }else {
	 * 		실행 코드2;
	 * }
	 * 
	 * 조건식의 결과가 true일 경우 실행코드1만을 수행하고 if-else문 자체를 빠져나감
	 * 단, 조건식이 false일 경우 무조건 실행코드2를 수행함
	 * 
	 * 
	 * * if-else if문
	 * 같은 비교 대상으로 여러개의 조건을 제시할 경우
	 * 
	 * if(조건식1) {
	 * 		실행 코드1;
	 * }else if(조건식2) {
	 * 		실행 코드2;
	 * }else if(조건식3) {
	 * 		실행 코드3;
	 * }[else {
	 * 		위의 조건들이 다 false일 경우 반드시 실행할 코드;
	 * }]
	 * 
	 * 조건식1의 결과가 true일 경우 실행코드1만을 수행하고 빠져나감
	 * 단, false일 경우 조건식2 실행
	 * 조건식2의 결과가 true일 경우 실행코드2만을 수행하고 빠져나감
	 * 단, false일 경우 조건식3 실행 
	 * .....
	 * 마지막에 else문이 제시되어있을 경우 위의 조건들이 다 false일경우 무조건 else구문 실행
	 * 
	 */

	public void method1() {
		// 사용자가 입력한 정수값이 짝수/홀수 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}else if(num == 0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}
		
	}
	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 (정수만) : ");
		int age = sc.nextInt();
		
		// 어린이(0이상 13이하) / 청소년(13초과 19이하) / 성인(19초과)
		/*
		if(age >= 0 && age <= 13) {
			System.out.println("어린이");
		}else if(age > 13 && age <= 19) {
			System.out.println("청소년");
		}else if(age > 19) {
			System.out.println("성인");
		}else {
			System.out.println("잘못입력하셨습니다");
		}
		*/
		
		if(age < 0) { // 나인데 음수로 입력했을 경우 => 잘못 입력했을 경우
			System.out.println("잘못입력하셨습니다.");
			
		}else { // 잘 입력했을 경우 => 0이상의 값을 잘 입력했둠
			
			if(age <= 13) {
				System.out.println("어린이");
			}else if(age <= 19) {
				System.out.println("청소년");
			}else {
				System.out.println("성인");
			}		
			
		}
		
		
	}
	
	
	public void method4() {
		// 사용자에게 점수를 입력받아서
		// 점수별로 등급을 나눠 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		// 90점 이상일 경우   "A등급"출력
		// 90점 미만 80점 이상일 경우 "B등급"출력
		// 80점 미만 70점 이상일 경우 "C등급"출력
		// 70점 미만 60점 이상일 경우 "D등급"출력
		// 60점 미만일 경우   "F등급"출력
		
		String grade = ""; // 결과값을 담을 변수
		
		if(score >= 90) {
			grade = "A등급";
		}else if(score >= 80) {
			grade = "B등급";
		}else if(score >= 70) {
			grade = "C등급";
		}else if(score >= 60) {
			grade = "D등급";
		}else {
			grade = "F등급";
		}
		
		// 당신의 점수는 xx점이고, 등급은 xxx입니다.
		System.out.println("당신의 점수는 " + score + "점이고, 등급은 " + grade + "입니다.");		
		
	}
	
	
	public void method5() {
		// 사용자에게 이름을 입력받은 후
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		// 그 이름이 "강보람" 일치할 경우 => "본인입니다."
		//			 일치하지 않을 경우 => "본인이 아닙니다. 돌아가주세요"
		/*
		if(name == "강보람") {
			System.out.println("본인입니다. 어서오세요.");
		}else {
			System.out.println("본인이 아닙니다. 돌아가주세요.");
		}
		*/
		// 기본자료형들끼리 동등비교시 == 또는 != 으로 잘 비교가 됨!
		// 단, String은 기본자료형이 아닌 참조자료형(종특)임!! => 동등비교연산자 제대로 적용되지 않음
		// => 문자열 간의 동등비교하고자 한다면 문자열.equals(비교하고자하는문자열) 메소드를 이용해야됨!
		if(name.equals("강보람")) {
			System.out.println("본인입니다. 어서오세요.");
		}else {
			System.out.println("본인이 아닙니다. 돌아가주세요.");
		}
		
		
	}
	
	
	
	
	
	
	
}
