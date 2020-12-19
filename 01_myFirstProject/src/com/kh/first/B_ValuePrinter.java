package com.kh.first;

/*
 * ** 원칙  **
 * 1. 클래스명 => 대문자로 시작
 * 2. 패키지명 => 소문자로 시작 
 * 3. 메소드명 => 소문자로 시작
 * 4. 변수명 => 소문자로 시작
 * 
 * 공통적으로 지켜야될것! : 항상 의미있게짓자! 영문으로만! 각 단어마다의 첫 문자는 대문자로! == 낙타표기법
 * 
 * ex) 클래스명 Valueprinter	=> ValuePrinter
 *     메소드명 testprint		=> testPrint
 * 
 */

public class B_ValuePrinter { // 실제클래스명(패키지까지 포함) : com.kh.first.ValuePrinter
	
	
	// 기능1 : 자바에서 취급하는 값들을 출력하는 기능
	public void printValue() {
		
		// 1. 논리값 (true/false) => 따옴표 없이
		System.out.println(true);
		System.out.println(false);
		
		// 2. 숫자값 (정수값/실수값) => 따옴표 없이
		System.out.println(10);
		System.out.println(12.14);
		//    산술연산 한 결과도 출력
		System.out.println(1235 + 124);
		
		// 3. 문자(한글자)값 => 홑따옴표 이용
		System.out.println('a');
		System.out.println('강');
		//System.out.println('강보람');
		
		// 4. 문자열(여러글자)값 => 쌍따옴표 이용
		System.out.println("강보람");
		System.out.println("안녕하세요");
		System.out.println("10");
		
		//    문자열과 그외의 값들의 덧셈연산 가능 --> 하나의 문자열화 됨! (연이어지면서 문자열로 되버림)
		System.out.println("하이" + 'a');
		System.out.println(23 + "반갑습니다" + 123);
		System.out.println("다시만나요" + 1 + 2);		
		
	}
	
	
	// 기능2. 문자열과 숫자간의 덧셈연산한 결과 출력 기능
	public void sumStringNumber() {
		
		System.out.println(9 + 9);		// 18
		System.out.println(9 + "9");	// "99"
		System.out.println("9" + 9);	// "99"
		System.out.println("9" + "9");	// "99"
		
		System.out.println(9 + 9 + 9);		// 18 + 9 	=> 27
		System.out.println(9 + 9 + "9");	// 18 + "9" => "189"
		System.out.println(9 + "9" + 9);	// "99" + 9	=> "999"
		System.out.println("9" + 9 + 9);	// "99" + 9 => "999"
		System.out.println("9" + (9 + 9));	// "9" + 18	=> "918"
		
		// 연산되는 순서를 생각해라!
	}
	
	
	
	

}









