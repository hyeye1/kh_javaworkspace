package com.kh.chap03_wrapper.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {
	
	public static void main(String[] args) {
		/*
		 * Java.util.Date;
		 * 
		 * 날짜와 시간에 대한 정보를 담을 수 있는 클래스
		 * 자바개발초창기에 급하게만든 완성도가 높진않은 클래스
		 * 다국적으로 쓰기도 적합하지않다.
		 * 
		 */
		// 기본생성자를 통해 date객체 생성=> 현재 날짜 및 시간을 가지고옴(시스템날짜)
		Date today = new Date();
		System.out.println("기본생성자: " +  today);
		
		//내가 원하는 날짜 (2020년 6월 19일)
		//1) 매개변수생성자를 통해
		Date date1 = new Date(2020, 06, 19); //deprecated: 권장 ㄴ
		//  내부적으로 내가 전달한 년도  +1900 => 세팅하고자 하는 연도 -1900
		// 			   내가 전달한 달 +1 => 월 -1
		Date date2 = new Date(2020-1900, 6-1, 19, 19, 15, 30);
		System.out.println("매개변수생성자 : " + date2);
		
		// " 2020 년 06월 19일 19시 15분 30초"
		// 내 입맛대로 형식을 지정한 문자열을 받고자할때
		// java.text.SimpleDateFormat 
		
		//1. 형식을 지정하면서 SimpleDateFormat 객체생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		//2. sdf객체에서 제공하는 format메소드 호출시 date 객체 정달 => 포맷지정된 String 돌아옴
		// sdf.format(Date객체) : String
		String formatDate = sdf.format(date2);
		System.out.println(formatDate);
		
	}
	
	
}
