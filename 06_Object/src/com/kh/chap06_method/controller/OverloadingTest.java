package com.kh.chap06_method.controller;

public class OverloadingTest {
	
	//오버로딩 : 한 클래스 내에 같은 이름의 메소드명으로 여러개 정의할 수 있는 방법
	
	public void test() {
	
	}
	
	public void test(int a) {
		// 매개변수
	}
	
	public void test(int a, String s) {
		
	}
	
	public void test(String s, int a) {
		
	}
	
	public void test(int a, int b) {
		
	}
	
	//public void test(int c, int d) {
	//	
	//}       -> error : 매개변수명과는 상관없이 자료형의 갯수와 순서 중복안됨
	
	//public int test(int a, int b) {
		//
	//} -> error: 반환형도 상관없이 

}
