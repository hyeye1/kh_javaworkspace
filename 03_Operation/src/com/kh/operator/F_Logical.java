package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * * 논리 연산자 
	 * - 두 개의 논리값을 연산하는 연산자
	 * - 논리값 (논리연산자) 논리값	=> 논리값
	 * 
	 * 논리값 && 논리값 : 왼쪽, 오른쪽 둘 다 true일 경우 => true
	 * 논리값 || 논리값 : 왼쪽, 오른쪽 둘 중에 하나라도 true일 경우 => true
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 양수"이면서(이고)" 짝수인지 확인하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 한 개 입력 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 num값이 양수이면서 짝수입니까? 
		boolean result = (num > 0) && (num % 2 == 0);
		// && 의미 : 그리고, ~이고, ~이면서
		
		System.out.println("사용자가 입력한 값이 양수면서 짝수입니까 : " + result);
		
	}
	
	public void method2() {
		// 사용자가 입력한 정수값이 1 이상 100 이하의 값인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 한 개 입력 : ");
		int num = sc.nextInt();
		
		// 사용자가 입력한 정수값이 1이상"이고" 100이하인지
		//boolean result = (1 <= num <= 100);
		boolean result = (num >= 1) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까 : " + result);
		
		/*
		 * && (and) : 두개의 조건이 모두 true여야만  && 연산의 결과값이 최종적으로 true
		 * 			    둘 중 하나라도 false가 된다면 && 연산의 결과값은 false
		 */
	}
	
	public void method3() {
		
		// 사용자가 입력한 값이 y"이거나(또는)" Y인지 확인하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("계속 하시려면 y 또는 Y를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 사용자가 입력한 값이 y 또는 Y인지
		//boolean result = 'y' == ch == 'Y';
		boolean result = (ch == 'y') || (ch == 'Y');
		// || (or) : 또는, ~이거나
		
		System.out.print("사용자가 입력한 값이 y또는 Y입니까 : " + result);
		
		/*
		 * || (or) : 두 개의 조건 중 하나라도 true가 있다면 최종 결과값 true
		 *           두 개의 조건 모두 false일 경우 최종 결과값 false
		 */
		
	}
	
	/*
	 * && : 두 개의 조건이 모두 true여야 결과값이 true이다. (AND) 
	 * 
	 * true && true		=> true
	 * true && false 	=> false
	 * false && true	=> false
	 * false && false	=> false
	 * 
	 * => && 연산자를 기준으로 앞의 결과가 false값이 나온다면 뒤의 조건은 궂이 연산하지도 않는다.
	 * 
	 * || : 두 개의 조건이 하나라도 true면 결과값이 true이다. (OR)
	 * 
	 * true || true 	=> true
	 * true || false	=> true
	 * false || true	=> true
	 * false || false	=> false
	 * 
	 * => || 연산자를 기준으로 앞의 결과가 true값이 나온다면 뒤의 조건은 궂이 연산하지도 않는다.
	 * 
	 */
	public void method4() {
		
		int num1 = 10;
		
		boolean result1 = (num1 < 5) && (++num1 > 0);
		
		System.out.println("result1 : " + result1);
		System.out.println("&& 연산 후 num1 : " + num1);
		
		
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		
		System.out.println("result2 : " + result2);
		System.out.println("|| 연산 후 num2 : " + num2);
		
	}
	
	
	
	
	
	

}





