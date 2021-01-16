package com.kh.chap03_wrapper.run;

public class WrapperRun {

	public static void main(String[] args) {
		/*
		 * // Wrapper 클래스
		 *=> 기본자료형을 객체로 포장해주는 클래스들을 래퍼클래스라고함
		 *
		 *
		 *		기본자료형		wrapper클래스
		 *		  boolean <---> Boolean
		 *		  char    <---> Character
		 *		  byte	  <---> Byte
		 *		  short   <---> Short
		 *		   int    <---> Integer
		 *		  long    <---> Long
		 *		  float   <---> Float
		 *		 double   <---> Double
		 *
		 *
		 */
		int num1 = 10;
		int num2 = 15;
		
		//System.out.println(num1.equals(num2));
		//System.out.println(num1.hashCode());
		
		// 기본자료형 ==> Wrapper 자료형 Boxing
		Integer i1 = num1;
		Integer i2 = num2;
		
		System.out.println(i1.equals(i2));
		
		// Wrapper 자료형 ==> 기본자료형 unboxing
		int num3 = i1;
		int num4 = i2; 
			
		System.out.println("===========");
		
		//기본자료형 <---> String
		
		String str1 = "10";
		String str2 = "15.3";
		
		System.out.println(str1 + str2);
		
		// 1, String => 기본자료형 : 파싱한다.
		int i = Integer.parseInt(str1); // "10" => 10
		double d = Double.parseDouble(str2); // "15.3" => 15.3
		
		System.out.println( i+d );
		
		//2. 기본자료형 ==> String
		// 		10     ==> "10"
		//     15.3    ==> "15.3"
		
		// String.valueOf(변환할기본자료형) : String
		String strI = String.valueOf(i); 
		String strD = String.valueOf(d);
		
		
		
		
	}

}
