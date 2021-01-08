package com.kh.chap06_method.controller;

public class StaticMethodTest {
	
	// 매개변수도 없고 반환값도 없는 메소드
	public static void method1() {
		System.out.println("매개변수와 반환값이 없는 메소드");
	}
	
	// 매개변수 없고 변환값 있는 메소드
	public static String method2() {
		System.out.println("매개변수는 없지만 반환값은 잇는 메소드");
		return "안녕하세요";
	}
	
	//매개변수 있고 반환값은 없는 메소드
	public static void method3(String name, int age) {
		System.out.println(age + "살의 " + name +"님 환영합니다.");
	}
	
	// 매개변수와 반환값 모두 있는 메소드
	public static int method4(int num1, int num2, char op) {
		
		int result = 0;
		if(op == '+') {
			result = num1 + num2;
			
		}else if(op == '-') {
			result = num1 - num2;
			
		}else if(op == '*' || op == 'x') {
			result = num1 * num2;
			
		}else if(op == '/') {
			result = num1 / num2;
			
		}
		return result;
		
		
	}

}
