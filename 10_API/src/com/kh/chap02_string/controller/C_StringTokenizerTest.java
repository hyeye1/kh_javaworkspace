package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method() {
		
		String str = "java,oracle,jdbc,html,server,Spring";
		
		//구분자를 제시해서 해당 문자열 분리시키는 방법
		
		//방법1. 분리된 문자열들을 String[] 차곡차곡담아서 관리하고자 할 때
		//       문자열.split(String 구분자) : String[]
		String[] arr = str.split(",");
		
		//for(int i=0; i<arr.length; i++) {
		//	System.out.println(arr[i]);
		//}
		
		for( String s : arr ) {
			System.out.println(s);
		}
		
		System.out.println("=========");
		
		// 방법2. 분리된 각각의 문자열들을 토큰으로 취급하고 싶을때
		// 		  java.util.StringTokenizer 클래스를 이용하는방법
		// 		  StringTokenizer stn = new StringTokenizer(분리시키고자하는 문자열, 구분자);
		//StringTokenizer stn = new StringTokenizer();
		
	}

}
