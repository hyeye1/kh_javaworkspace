package com.kh.chap04_field.model.vo;

// 필드들의 접근제한자

public class FieldTest2 {
	
	/*
	 * 필드에서 사용가능한 접근제한자 4가지
	 
	 (+)public		 => 어디서든 (같은 패키지, 다른 패키지) 직접 접근 가능한 범위
	 (#)protected 	 => 같은 패키지 직접 접근가능 + 만약 다른패키지라면 상속구조(부모자식간의 관계)에서는 직접접근가능
	 (~)default	 => 같은 패키지에서만 직접 접근가능
	 (-)private 	 => only 해당 이 클래스에서만 접근가능  
	 
	 */
	
	public String pub = "public"; 
	protected String pro = "protected";
	/*default*/ String def = "default";
	private String pri = "private";
	
	public static String sta = "fieldTest2 static변수";
}
