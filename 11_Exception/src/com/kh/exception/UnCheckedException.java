package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	/*
	 * RuntimeException
	 * - 프로그램실행시 발생되는 예외들 (문법적으로 문제되지는 않음! 예외처리 할 필요없음)
	 * 
	 * RuntimeException
	 * - IndexOutOfBoundsException: 잘못된 인덱스 값으로 접근했을때 발생되는 예외 => 개발자의 실수
	 * - ClassCastException : 허용할 수 없는 형변환이 진행됐을 경우 발생되ㅏ는 예외 => 개발자의 실수
	 * - NullPointerException : 레퍼런스가 아직 null임에도 불구하고 접근했을때 발생하는 예외
	 * - ArithmeticException : 나누기 연산에서 부모가 0인경우 발생되는 예외
	 * - NegativeArraySizeException : 배열크기를 지정하는 과정에 배열의 크기를 음수로 지정했을 경우 발생되는 예외
	 * - . . .
	 * 
	 * => 이러한 RuntimeException 관련한 애들은 충분히 예측 가능하기 때문에
	 * 아싸리 예외자체가 발생이 안되게끔 조건문으로 충분히 해결가능하기는 함!
	 * 굳이 예외처리(예외가 발생했을때 실생할 내용을 정의)할 필요없이!
	 * 
	 *
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : 나누기연산에서 부모가 0인경우 발생
		
		// 사용자에게 두개의 정수값을 입력받아서 나눗셈연산 진행 => 결과 출력
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수(0제외) : ");
		int num2 = sc.nextInt();
		
		/*// 해결방법 1. 애초에 예외자체가 발생할 일 없게 if문으로 조건검사 후에 실행(예외처리가 아님)
		if(num2 != 0) {
			int result = num1 / num2;
			System.out.println("나눗셈 연산결과 : " + result );
		} else {
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		*/
		
		// 해결방법 2. 예외처리로 해결 (예외처리 == 예외가 발생했을 때를 대비해서 실행할 내용을 정의해두는것)
		try {
			int result = num1 / num2; //ArithmeticException 예외가 발생될 수 있는 구문
			System.out.println("나눗셈 연산결과 : " + result);
		} catch(ArithmeticException e) { // 아리스메틱 익셉션이 발생되는 순간 낚아채서 
			System.out.println("0으로는 나눌 수 없습니다.");
		}
		
		/*
		 * try ~ catch문 
		 * try{
		 * 	   예외가 발생할 만한 구문;
		 * } catch (발생될예외클래스 매개변수){
		 * 	  해당 예외가 발생되는 경우 실행할 구문;
		 * }
		 *
		 */
		
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public void method2() {
		
		System.out.print("정수(0제외) 입력: ");
		 
		try {
			int num = sc.nextInt();
			System.out.println("나눗셈 연산결과 : " + 10/num);
		} catch(InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력하셨습니다.");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("프로그램이 종료되었습니다");
	}
	public void method3() {
		//NegativeArraySizeException : 배열의 크기를 음수로 지정했을때 발생되는 예외
		//ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스로 접근했을때 발생되ㅏ는 예외
		
		System.out.print("배열의 크기: ");
		int size = sc.nextInt();
		
		//int[] arr = new int[size]; // NegativeArraySizeException 
		
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		
		} catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수로 할 수 없습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("100이상의 수를 입력하세요.");
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100번 인덱스 값 : " + arr[100]);
		}catch(RuntimeException e) { // 다형성을 적용해서 부모클래스로 작성하면 다 받아줄 수 있음
			System.out.println("노노");
		}
		System.out.println("프로그램을 종료합니다.");
		
	}
	/*
	 * if문으로 조건처리 == 애초에 예외 자체가 발생이 안되게끔 개발자가 소스코드로 핸들링하는 것(예외 처리아님)
	 * 예외처리 구문 철 == 예외가 발생했을 때를 대비해서 그때 실행할 내용을 정의해 두는 것
	 * 
	 * (권장사항)
	 * 예측이 가능한 경우 => 조건문으로 해결
	 * 예측이 물가한경우 => 예외처리 구문으로 해결
	 * 
	 * RuntimeException 계열은 충분히 예측 가능한 상황이 대부분이고 따라서 조건문으로 해결해주는것이 권장사항
	 */

}
