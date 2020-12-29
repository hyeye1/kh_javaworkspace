package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * < 반복문 >
	 * 프로그램 흐름을 제어하는 제어문 중 하나
	 * 어떤 실행코드를 반복적으로 수행시켜줌
	 * 
	 * 크게 두가지 종류로 나뉨 (for문 / while문(do-while문))
	 * 
	 * * for문
	 * 
	 * for(초기식; 조건식; 증감식) { // 반복횟수를 지정하기 위해 제시하는 것들
	 * 		반복적으로 실행시키고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문이 시작될 때 "초기에 단 한번만 실행되는 구문"
	 *          (보통 반복문에서 사용될 변수를 선언 및 초기화 구문) ex) int i=0;
	 *          
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 *          조건식이 true일 경우 반복문 실행
	 *          조건식이 false가 되는 순간 반복문 멈추고 빠져나옴
	 *          (보통 초기식에 제시한 변수를 가지고 조건식을 작성함) ex) i<10;
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 *          (보통 초기식에 제시한 변수를 가지고 증감식을 작성함) ex) i++
	 * 
	 * for문을 만나는 순간
	 * 초기식 --> 조건식 검사 --> true일 경우 코드 실행 --> 증감식
	 *      --> 조건식 검사 --> true일 경우 코드 실행 --> 증감식
	 *      --> 다시 조건식 --> true일 경우 코드 실행 --> 증감식
	 *      ------------ 이 내용이 계속 반복 --------------
	 *      --> 다시 조건식 --> false일 경우 코드 실행x -------> 반복문 빠져나옴
	 * 
	 */
	
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력하고시품..
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for(int i=1; i<=5; i++) { // i값이 1에서부터 5보다 작거나 같을때까지 1씩 증가할 동안 반복 수행 (5회)
			System.out.println("안녕하세요");
		}
		
		for(int i=0; i<5; i++) { // i값이 0에서부터 4까지 1씩 증가할 동안 반복 수행 (5회)
			System.out.println("반갑습니다");
		}
		
		// int i=10; i<15; i++
		// int i=10; i<=14; i++
		
		
		// 젤 단순하게 반복되는 횟수를 지정하는 표현법
		// int i=0; i<반복시키고자하는횟수; i++
		
	}
	
	public void method2() {
		
		// "다시만나요" 5번 출력
		// i값이 1에서부터 10까지 매번 2씩 증가하는 동안 반복 수행
		// 1 3 5 7 9	(5회)
		for(int i=1; i<=10; i+=2) {
			System.out.println("다시만나요");
		}
		
	}
	
	public void method3() {
		// 10회 반복 실행
		for(int i=1; i<=10; i++) {
			System.out.println(i); // 반복문 안에서 초기식에 제시된 변수를 이용하는 경우가 빈번해질 예정
		}
		
		// 1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<11; i++) {
			System.out.print(i + "\t"); // \t  ==  tab
		}
		
		
	}
	
	public void method4() {
		// 위와 같이
		// 1 2 3 .... 8 9 10   출력  (10회 반복)
		
		// 아래의 반복문을 가지고 위의 출력
		for(int i=0; i<10; i++) {
			System.out.print(i + 1 + " ");
		}
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반복시키고자하는 횟수(정수) : ");
		int count = sc.nextInt();
		
		// 1에서부터 10까지 1씩 증가 => 10회
		// 0에서부터 9까지 1씩 증가 => 10회
		
		// 1에서부터 count까지 1씩 증가 => count회
		// 0에서부터 count-1까지 1씩 증가 => count회
		
		if(count > 0) { // 잘 입력했을 경우
			
			for(int i=1; i<=count; i++) {
				System.out.print(i + " ");
			}
			
		}else { // 잘못 입력했을 경우
			System.out.println("양수만을 입력해야됩니다. 잘못입력하셨습니다.");			
		}
		
	}
	
	
	public void method6() {
		// 반대로도 가능
		// 5회반복 => i값이 5에서부터 1까지 매번 1씩 감소하는 동안 반복 (5 4 3 2 1)
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method7() {
		// 1부터 10 사이의 홀수만을 출력
		// 1 3 5 7 9
		
		// 1에서부터 10까지 매번 2씩 증가하는 동안 반복 => 1 3 5 7 9 (5회)
		/*
		for(int i=1; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		*/
		
		// 1에서부터 10까지 매번 1씩 증가하는 동안 반복 => (10회)
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	public void method8() {
		// 1에서 10까지 매번 1씩 증가하는 값 총합 구하기
		//int sum = 1+2+3+4+5+6+7+8+9+10;
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * sum += 4;
		 * .....
		 * sum += 9;
		 * sum += 10;
		 * 
		 * 규칙 => 누적해서 더하고자하는 값이 1에서 부터 10까지 매번 1씩 증가되는 값!
		 * 
		 */
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1에서 부터 10까지의 총 합계 : " + sum);
		
		
	}
	
	
	public void method9() {
		// 1에서부터 사용자가 입력한 수까지의 합계를 구하시오
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * .....
		 * sum += num;
		 * 
		 */
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i; // sum = sum + i;
		}
		
		// 최종 출력 : "1에서 부터 xx까지의 총 합계 : xxx"
		System.out.println("1에서 부터 " + num + "까지의 총 합계 : " + sum);
		
	}
	
	
	public void method10() {
		
		// 1부터 어떤 매번 달라지는 랜덤값(1~10사이의 랜덤한 숫자) 까지의 총합계
		
		/*
		 * Math 클래스에서 정의되어있는 random() 메소드를 호출해서 매번 다른 랜덤값 얻어올 수 있음!
		 * Math.random() 호출시 => 0.0 ~ 0.9999999999... 사이의 랜덤값 발생 (0.0 <= 랜덤값 < 1.0)
		 * 
		 */
		
		//int random = Math.random(); // double형이라서 안됨
					// 0.0 <=  < 1.0		-->	0.0 ~ 0.99999999..
		
		//int random = Math.random() * 10;
					// 0.0 <=  < 10.0		--> 0.0 ~ 9.99999999..
		
		//int random = Math.random() * 10 + 1;
					// 1.0 <=  < 11.0		--> 1.0 ~ 10.9999999..
		
		int random = (int)(Math.random() * 10 + 1);
					// 1  <=   < 11			--> 1 ~ 10
		
		System.out.println("현재 발생된 랜덤값 : " + random);
		
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		// 1에서부터 xx까지의 총 합계 : xxx
		System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
		
	}
	
	
	public void method11() {
		
		// 사용자에게 문자열을 입력받아서 
		// 각 인덱스별 한 문자를 매번 뽑아서 출력
		// 예를 들어서 "apple"		=> a p p l e
		/*
		 * String str = "apple";
		 * 
		 * a --> str.charAt(0) 출력
		 * p --> str.charAt(1) 출력
		 * p --> str.charAt(2) 출력
		 * l --> str.charAt(3) 출력
		 * e --> str.charAt(4) 출력
		 * 
		 * apple 길이 : 5		strawberry 길이 : 10		kiwi 길이 : 4
		 * 01234			0123456789			  	0123
		 * 
		 * 아! 마지막인덱스 수 == 문자열의 길이-1 == 문자열.length()-1
		 * 
		 * 0번인덱스에서부터 마지막인덱스(문자열.length()-1)까지 매번 1씩 증가할 때 마다 반복 수행
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
		//System.out.println("문자열의 길이 : " + str.length());
		//for(int i=0; i<=str.length()-1; i++) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
			
		}
		
	}
	
	
	public void method12() {
		// 구구단 중에 2단 출력
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 * 
		 */
		
		System.out.println("==== 2단 ====");
		for(int su=1; su<=9; su++) {
			//System.out.println("2 x " + su + " = " + 2*su);
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
		
	}
	
	public void method13() {
		// 2단부터 9단까지 모두 출력
		
		/*
		System.out.println("==== 2단 ====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
		System.out.println();
		
		System.out.println("==== 3단 ====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", 3, su, 3*su);
		}
		System.out.println();
		
		System.out.println("==== 4단 ====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", 4, su, 4*su);
		}
		.....
		*/
		
		for(int dan=2; dan<=9; dan++) {
			
			System.out.println("==== " + dan + "단 ====");
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println();
		
		}
	}
	
	
	public void method14() {
		// 1에서 부터 5까지 1씩 증가하는 값을 출력하는걸   3번 반복
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		
		for(int i=1; i<=3; i++) { // 행을 지정해주는 for문
			
			for(int j=1; j<=5; j++) { // 열을 지정해주는 for문
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
		
	}
	
	public void method15() {
		// *****
		// *****
		// *****
		// *****
		
		//System.out.print("*")
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	public void method16() {
		//		  i  j
		// 1***   1행 1열일 경우 1 출력
		// *2**   2행 2열일 경우 2 출력
		// **3*   3행 3열일 경우 3 출력
		// ***4   4행 4열일 경우 4 출력
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if(i == j) { // 숫자출력
					System.out.print(i);
				}else { // * 출력
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
			
	}
	
	public void method17() {
		// 0시 0분 ~ 23시 59분  까지 출력
		
		// 0시 0분
		// 0시 1분
		// ...
		// 0시 59분
		
		// 1시 0분
		// 1시 1분
		// ....
		// 1시 59분
		
		// 2시 0분
		// 2시 1분
		// ... 
		// 2시 59분
		
		// .... 
		
		// 23시 0분
		// 23시 1분
		// ..
		// 23시 59분
		
		// 시간은 0시 ~ 23시까지 1씩 증가		 => 바깥쪽 for문
		// 분은 매시간마다 0분 ~ 59분까지 1씩 증가 => 안쪽 for문
		
		for(int hour=0; hour<24; hour++) {
			
			for(int min=0; min<60; min++) {
				System.out.println(hour + "시 " + min + "분");
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
