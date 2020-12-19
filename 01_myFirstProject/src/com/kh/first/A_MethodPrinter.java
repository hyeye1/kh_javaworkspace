package com.kh.first; // 패키지 선언부

public class A_MethodPrinter {
	
	// 클래스 영역 안에 여러개의 메소드 를 정의해둘 수 있음!!
	// 각 기능별로 "일반메소드" 여러개 정의해보자!
	// 일반메소드 : public void 메소드명() { 소스코드; }
	
	// 기능1 : "안녕하세요~" 라는 구문을 출력시켜주는 역할 수행
	public void helloPrint() { // 메소드명은 소문자로 시작!
		System.out.println("안녕하세요~");
		seeYouPrint();
		//goodByePrint();
	}
	
	// 기능2 : "다시만나요~" 라는 구문을 출력시켜주는 역할 수행
	public void seeYouPrint() {
		System.out.println("다시만나요~");
		goodByePrint();
		
	}
	
	// 기능3 : "잘가요~" 라는 구문을 출력시켜주는 역할 수행
	public void goodByePrint() {
		System.out.println("잘가요~");
	}
	
	/*
	 * 해당 클래스에 main메소드가 없기때문에 곧바로 실행불가!!
	 * 
	 * => 실행용 클래스(메인메소드를 가지고있는 클래스)를 별도로 만들어서 
	 *    내가 실행하고자 하는 메소드만을 호출해가면서 실행할꺼임!
	 */

}



