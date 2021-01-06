package com.kh.chap04_field.model.vo;

// fieldRun과 다르게  같은 패키지에 있을땐?

public class Test {
	
	public static void main(String[] args) {
		
		
		//========FieldTest 2 테스트 ===========
		FieldTest2 f2 = new FieldTest2();
		
		//public = 어디서든 접근가능
		System.out.println(f2.pub);
		
		//protected => 같은 패키지 접근가능 다른패키지는 상속구조에서만 접근가능
		System.out.println(f2.pro); // 같은패키지 접근가능
		
		// default => 같은 패키지에서만 접근가능
		System.out.println(f2.def); // 같은패키지 접근가능
		
		// private => 같은 클래스에서만 접근가능
		//System.out.println(f2.pri); // getter메소드로 만 가능
	}

}
