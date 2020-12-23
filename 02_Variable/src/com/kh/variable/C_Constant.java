package com.kh.variable;

public class C_Constant {
	
	public void finalConstant() {
		// 변수 : 새로운 값 담아서 값 변경 가능
		int age = 20;
		System.out.println("age : " + age);
		
		//age = 21;
		age = age + 1;
		System.out.println("변경된 age : " + age);
		
		// 상수 : 새로운 값을 담아서 값 변경 불가
		//		 => 한번 담긴 값 변경 불가 (고정인 값을 담아둘때) 
		// 상수명 권장사항 => 다 대문자
		final String BAN = "I클래스";
		//BAN = "A클래스";
		System.out.println("반 : " + BAN);
		
	}

}
