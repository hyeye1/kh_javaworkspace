package com.kh.chap02_string.controller;

import java.util.Scanner;

public class B_StringMethodTest {
	
	// ���ڿ��� ���õ� ������ �޼ҵ�
	public void method() {
		
		String str1 = "Hell World";
		
		// 		�޼ҵ�(�Ű�����) : ��ȯ��
		
		// 1. ���ڿ�.charAt(int index) : char
		// ���ڿ����� ���޹��� index ��ġ�� ����
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		
		// 2. ���ڿ�.concat(String str) : String
		//		���ڿ��� ���޵� ���ڿ��� �ϳ��� ���ļ� ����
		String str2 = str1.concat("!!!");
		System.out.println("str2: " + str2);
		
		//3. ���ڿ�.length(): int
		// int a = str1.length();
		System.out.println(" str�� ����: " + str1.length());
		
		//4. ���ڿ�.substring(int beginIndex) : String
		//   ���ڿ��� beginIndex ��ġ�������� �������� ���ڿ��� �����ؼ� ����
		//   ���ڿ�.substring(int beginIndex, int endIndex) : String
		//   ���ڿ��� beginIndex��ġ������Ÿ endIndex-1 ��ġ������ ���ڿ��� �����ؼ� ����
		System.out.println(str1.substring(0, 6)); // 0���ε��� ����<= <6����
		System.out.println(str1.substring(6)); // 6�� �ε������� ����
		
		
		//5. ���ڿ�.replace(char old, char new) : String
		//   ���ڿ������� old���ڸ� new���ڷ� ��ȯ�� ���ڿ� ����
		String str3 = str1.replace('1', 'c');
		System.out.println("str3 : " + str3);
		
		//6. ���ڿ�.trim() : String
		//   ���ڿ��� �� �� ������ ������ ���ڿ� ����
		String str4 = "      Ja    va    ";
		System.out.println("trim() : " + str4.trim());
		
		//7. ���ڿ�.toUpperCase(): String => ���ڿ��� �� �빮�ڷ� ������ ����
		//   ���ڿ�.toLowerCase(): String => ���ڿ��� �� �ҹ��ڷ� ������ ����
		System.out.println("upper : " + str1.toUpperCase());
		System.out.println("lower : " + str1.toLowerCase());
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		char a = sc.nextLine().toLowerCase().charAt(0);
			// �޼ҵ� ���̾ ȣ�� == �޼ҵ� ü�̴�
		//if(a == 'y') {
		//	
		//}
		
		/*
		 * char[] arr = new char[str1.length()];
		 * for(int i=0; i<arr.length; i++){
		 * 		arr[i] = str1.charAt(i);
		 * }
		 */
		//8. ���ڿ�.toCharArray() : char[]
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		
		//char[] => String
		char [] arr2 = {'a', 'p', 'p', 'l' ,'e'};
		//9. static valueOf(char[] data) : String
		// ���޵� char[]�� ��� ���ڵ��� �ϳ��� ���ڿ��� ���� ����
		System.out.println(String.valueOf(arr2));
	}
}
