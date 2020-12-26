package com.kh.operator;

public class D_Compound {

	/*
	 * * 복합대입연산자 : 산술연산자와 대입연산자를 함께 사용하는 연산자
	 * 				   연산처리 속도가 훨씬 빠르므로 사용을 권장함
	 * 
	 *   += -= *= /= %=
	 *   
	 *   a = a + 3;	   ==   a += 3;
	 *   a = a - 3;	   ==   a -= 3;
	 *   ....
	 * 
	 */
	public void method() {
		
		int num = 12;
		
		System.out.println("현재 num : " + num);
		
		// num을 3증가 시키기
		num = num + 3;
		System.out.println("3증가시킨 num : " + num);
		
		// num을 다시 또 3 증가 시키기
		num += 3;
		System.out.println("또 3증가시킨 num : " + num);
		
		// num을 5 감소시키기
		num -= 5; // num = num - 5;
		System.out.println("5감소시킨 num : " + num);
		
		// num을 6배 증가시키기
		num *= 6; // num = num * 6;
		System.out.println("6배 증가시킨 num : " + num);
		
		// num을 2배 감소시키기
		num /= 2;
		System.out.println("2배 감소시킨 num : " + num);
		
		// num을 4로 나눴을때의 나머지
		num %= 4;	// num = num % 4;
		System.out.println("num을 4로 나눈 나머지 : " + num);
		
			
		String str = "Hello";
		System.out.println("str : " + str);
		
		//str = str + "World";
		str += "World";
		System.out.println("최종 str : " + str);
		
	}
	
	
}
