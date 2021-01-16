package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	
	// String은 사실 클래스이다=> 불변클래스: 변하지않는 클래스
	// 						수정하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않는다
	
	// 1. 생성자를 통해 문자열 담기
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1 == str2); // false
		
		System.out.println(str1);
		System.out.println(str2/*.toString*/);
		// toString() => String 클래스에 이미 오버라이딩 되어있음 (실제 담겨있는 문자열 반환)
		
		System.out.println(str1.equals(str2)); // 실제 담겨있는 문자열 비교
		//equals() => String 클래스에 이미 오버라이딩 되어있음(주소값 비교아닌 실제 담긴 문자열간 비교)
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() => String 클래스에 이미 오버라이딩 되어있음 (주소값 기반이아닌 실제 문자열 기반으로 해쉬코드 값을 만들어서 반환)
		//하지만 주소값은다름!!!! 
		//확인하려면? System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		
	}
	
	public void method2() {
		
		String str2 = "hello";
		String str1 = "hello";
	}

}
