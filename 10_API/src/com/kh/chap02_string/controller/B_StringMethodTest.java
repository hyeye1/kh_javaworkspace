package com.kh.chap02_string.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	// 문자열과 관련된 유용한 메소드
	public void method() {
		
		String str1 = "Hell World";
		
		// 		메소드(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		// 문자열에서 전달받은 index 위치의 문자
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		
		// 2. 문자열.concat(String str) : String
		//		문자열과 전달된 문자열을 하나로 합쳐서 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2: " + str2);
		
		//3. 문자열.length(): int
		// int a = str1.length();
		System.out.println(" str의 길이: " + str1.length());
		
		//4. 문자열.substring(int beginIndex) : String
		//   문자열의 beginIndex 위치에서부터 끝까지의 문자열을 추출해서 리턴
		//   문자열.substring(int beginIndex, int endIndex) : String
		//   문자열의 beginIndex위치에서부타 endIndex-1 위치까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(0, 6)); // 0번인덱스 부터<= <6까지
		System.out.println(str1.substring(6)); // 6번 인덱스부터 추출
		
		
		//5. 문자열.replace(char old, char new) : String
		//   문자열에서의 old문자를 new문자로 변환한 문자열 리턴
		String str3 = str1.replace('1', 'c');
		System.out.println("str3 : " + str3);
		
		//6. 문자열.trim() : String
		//   문자열의 앞 뒤 공간을 제거한 문자열 리턴
		String str4 = "      Ja    va    ";
		System.out.println("trim() : " + str4.trim());
		
		//7. 문자열.toUpperCase(): String => 문자열을 다 대문자로 변경후 리턴
		//   문자열.toLowerCase(): String => 문자열을 다 소문자로 변경후 리턴
		System.out.println("upper : " + str1.toUpperCase());
		System.out.println("lower : " + str1.toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("종료하시겠습니까? (y/n) : ");
		char a = sc.nextLine().toLowerCase().charAt(0);
			// 메소드 연이어서 호출 == 메소드 체이닝
		//if(a == 'y') {
		//	
		//}
		
		/*
		 * char[] arr = new char[str1.length()];
		 * for(int i=0; i<arr.length; i++){
		 * 		arr[i] = str1.charAt(i);
		 * }
		 */
		//8. 문자열.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		
		//char[] => String
		char [] arr2 = {'a', 'p', 'p', 'l' ,'e'};
		//9. static valueOf(char[] data) : String
		// 전달된 char[]에 담긴 문자들을 하나의 문자열로 합쳐 리턴
		System.out.println(String.valueOf(arr2));
	}
}
