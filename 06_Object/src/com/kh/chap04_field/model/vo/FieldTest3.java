package com.kh.chap04_field.model.vo;

public class FieldTest3 {
	
	//접근제한자[예약어] 자료형 변수명;
	
	//전역변수의 일종인 클래스 변수는 static 예약어가 붙은 변수
	
	public static String sta = "fieldtest3 static변수";
	// 생성 시점 : 프로그램 실행과 동시에 메모리 영역에 생성됨/(굳이 객체 생성을 하지 않아도됨)
	// 소멸 시점 : 프로그램 종료시 소멸된다.
	// => 프로그램 시작부터 끝까지 존재
	
	// "static"이라는 키워드는 공유의 개념이 강하다
	// 프로그램 실행과 동시에 메모리에 올려놓고 공유해서 사용해서 쓴다
	
	
	/*
	 상수필드
	 public static final 자료형 변수명;
	 public final static 자료형 변수명;
	 순서 바꿔도 상관없음!
	 
	 static - 공유의 개념
	 final -  한번 지정된 값 변경 x (상수)
	 
	 프로그램 실행과 동시에 값이 변경되서는 안되는 고정적인값을 메모리상에 올려두고 
	 공유하면서 사용할 목적으로 사용됨
	 */
	
	public static final int NUM = 10; //상수필드 같은 경우에는 무조건 초기화를 해주어야한다.
	
}
