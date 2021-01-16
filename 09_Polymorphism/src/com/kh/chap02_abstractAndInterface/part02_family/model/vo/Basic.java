package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public interface Basic {
	
	// 추상클래스 => 일반필드 + 일반메소드 + [추상메소드]
	// 인터페이스 => only 상수 필드 + only 추상메소드
	//(일반클래스가 아니라 interface 클래스를 하면 상수필드와 추상 메소드만 들어갈 수 있다.
	//그래서 public static final 작성 필요 없음 어차피 상수필드
	// abstract도 필요없음 어차피 추상메소드니까
	
	
	//public static final
	/*public abstract*/ void eat();
	void sleep();
	
}
