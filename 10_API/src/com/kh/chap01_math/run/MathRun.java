package com.kh.chap01_math.run;

public class MathRun {

	public static void main(String[] args) {
		
		// Math 클래스(수학과 관련)에 제공하고있는 유용한 기능들을 살펴보자
		
		// 파이 => 상수필드
		System.out.println("파이 : " + Math.PI);
		
		// 올림 : ceil 이라는 메소드를 통해 알아낼 수 있다
		// Math.ceil(double) : double
		double num1 = 4.349;
		System.out.println("올림 : " + (int)Math.ceil(num1));
		
		// 반올림:  Math.round(double) : long
		System.out.println("반올림 : " + Math.round(num1));
		
		// 버림: 
		// Math.floor(double) : double
		System.out.println("버림 : " + Math.floor(num1));
		
		// 절대값:
		int num2 = -10;
		System.out.println("절대값 : " + Math.abs(num2));
		
		// 최소값
		System.out.println("최소값 : " + Math.min(5, 10));
		
		// 최대값
		System.out.println("최대값 : " + Math.max(5, 10));
		
		// 제곱근(루트)
		System.out.println("4의 제곱근: " + Math.sqrt(4));
		
		// 제곱
		System.out.println("2의 10제곱: " + Math.pow(2, 10));
		
		
		
		/*
		 * Math 특징
		 * java.lang.Math 특징
		 * 모든 필드 => 상수필드 
		 * 모든 메소드 => static메소드
		 * 
		 * 모든게 다 static이기 때문에 Math. 로 다 접근가능(객체생성 필요없음) 
		 * => 생성자 아싸리 private == 생성불가
		 * 
		 * 프로그램 실행과 동시에 단한번 메모리 영역에 올려놓고 재사용하는 개념 =- 싱글톤패턴
		 * 
		 */
		
	
	
	
	
	
	
	}

}
