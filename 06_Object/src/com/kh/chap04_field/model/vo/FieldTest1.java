package com.kh.chap04_field.model.vo;

// 필드 필드  변수

/*
 * 
 * 클래스 == "필드" + 생성자 + 메소드의 조합
 * 
 * >> 변수작성 위치에 따른 구분
 * 전역변수 : 해당 클래스 영역에 바로 선언하는 변수 => 클래스 내 어디서든 사용가능
 * 지역 변수 : 클래스 영역 내의 어떤 특정한 구역({}) 에 선언하는 변수 => 그 지역에서만 사용 가능
 * 			특정 구역 == 메소드영역, 제어문(if, for . .) 영역 등
 * 
 * 1. 전역 변수
 * 
 *  - 멤버변수(==인스턴스 변수)
 *    생성 시점 : new 연산자를 통해서 해당 객체 생성시 => 메모리 상에 만들어짐
 *    소멸 시점 : 해당 객체 소멸시 같이 소멸
 *   
 *  - 클래스 변수 (== static 변수) : static 이라는 예약어가 붙은 변수
 *    생성 시점 : 프로그램 실행(해당 객체 생성이 안되도)과 동시에 무조건 메모리상(static영역에 할당)에 만들어짐
 *    소멸 시점 : 프로그램이 종료될때 소멸 
 * 
 * 
 * 2. 지역 변수  
 *	   생성 시점 : 이 지역변수가 속해있는 특정구역({})이 실행 (호출)시 메모리 상에 만들어짐(ex 메소드 호출시)
 *	   소멸 시점 : 해당 특정 구역 ({}) 종료시 소멸 (ex 메소드 종료시) 
 */
public class FieldTest1 { // 변수 선언 위치에 따른 구분을 보기 위한 클래스(전역, 지역, 매개)
	
	//멤버변수 == 인스턴스 변수 == 필드
	private int global;
	
	//매개 변수 있는 메소드
	public void test (int num) {
		// 매개변수 ( 메소드 호출시 전달되는 값을 담기위한 변수 ) == 지역변수
		
		// 이 구역 안에 선언한 변수 == 지역변수 => 지역변수에는 접근제한자 붙이는거 아님!
		int local=10; // 선언과동시에 초기화하는 습관들이기
		
		// 멤버 변수 출력
		// jvm이 기본값으로라도 초기화를 해준다
		System.out.println(global);
		
		// 지역 변수 출력
		// 내가 직접 초기화 해줘야한다
		System.out.println(local);
		
		// 매개 변수 출력
		// 이 메소드 호출시 전달값이 초기화 된다
		System.out.println(num);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


