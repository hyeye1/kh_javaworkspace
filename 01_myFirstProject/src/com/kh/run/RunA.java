package com.kh.run;

// 선언문(import)
import com.kh.first.A_MethodPrinter;

public class RunA { // 실행만을 담당하는 실행용 클래스
	
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작!");
		
		// 내가 만든 메소드를 호출 해주면됨!! ( 메소드명(); )
		// helloPrint(); --> 기본적으로 현재 이 클래스에서 저런 메소드를 찾기 때문에
		
		// 다른 클래스에 있는 메소드를 실행하고자 한다면 어떻게 해야될까?
		
		// 1) 실행할 메소드가 속해있는 클래스를 먼저 "생성(new)" 해줘야됨!
		// [표현법] 클래스명 대변할이름 = new 클래스명();
		//A_MethodPrinter a = new A_MethodPrinter();
		// 오류남!! 왜? 같은 패키지내에서 해당 클래스를 찾기 때문에 발생하는 문제
		
		// 해결방법1. 해당 클래스가 어떤패키지에 속해있는지 풀 클래스명(패키지까지 포함한이름)을 사용하는 방법
		//com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// 해결방법2. 그냥 클래스명만을 가지고 생성하되 단, 이 클래스가 어떤 패키지에 속해있는지 "선언"하는 방법
		A_MethodPrinter a = new A_MethodPrinter();
		
		
		// 2) 생성 후 메소드 실행(호출)
		// [표현법] 대변할이름.실행할메소드명();
		
		/*
		a.helloPrint();
		a.seeYouPrint();
		a.goodByePrint();
		*/
		
		a.helloPrint();
		
	}

}
