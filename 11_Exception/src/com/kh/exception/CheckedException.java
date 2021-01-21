package com.kh.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {
	
	/*
	 * CheckedException은 반드시 예외처리를 해줘야하는 예외들
	 * 언제어디서 예외가 발생될지 예측 불가기 때문에 미리 예외처리 구문을 작성해둬야한다
	 * 주로 외부 매개체와 입출력을 할 때 발생
	 * 
	 */
	public void method1() throws IOException {
		/*
		try {
			method2();
		} catch (IOException e) {
			System.out.println("예외발생!");
		}
		*/
		method2();
	}
	
	public void method2()  throws IOException{
		
		// 키보드로 값 입력받는 방법 BufferedReader
		// Scanner말고 BufferedReador도 가능
		// 단, 문자열로만 가능하다.
		
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.print("아무 문자열을 입력해주세요 : ");
		 try {
			 String str = br.readLine(); // 이 메소드 실행시 IOException이 발생할 수도 있음!
			 							 // 컴파일 에러로 알려줌 ! => 반드시 예외처리(예외발생시 실행할 내용 정의) 해야됨!
			 System.out.println(str);
		 }catch(IOException e) {
			 System.out.println("예외발생!!");
		 }
		 
		 // 2. throw : 떠넘기는 방법 (위임하는 방법)
		 //				지금 여기서 당장 예외처리를 하지 않고 이 메소드를 호출한 곳으로 예외처리를 떠넘기겠다!!
	
		 System.out.println("프로그램이 종료되었습니다.");
	}
	
	/*
	 * 
	 * 							예외발생 시점				예외처리
	 * RuntimeException			런타임 에러(컴파일에러x)		세모		=> 개발자 케바케(조건문/예외처리) unCheckedException
	 * RuntimeException외 		컴파일 에러 					필수		=> 반드시 예외처리				CheckedException
	 * 
	 */
}
