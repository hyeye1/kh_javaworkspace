package com.kh.chap06_method.controller;

public class StaticMethodTest {
	
	// �Ű������� ���� ��ȯ���� ���� �޼ҵ�
	public static void method1() {
		System.out.println("�Ű������� ��ȯ���� ���� �޼ҵ�");
	}
	
	// �Ű����� ���� ��ȯ�� �ִ� �޼ҵ�
	public static String method2() {
		System.out.println("�Ű������� ������ ��ȯ���� �մ� �޼ҵ�");
		return "�ȳ��ϼ���";
	}
	
	//�Ű����� �ְ� ��ȯ���� ���� �޼ҵ�
	public static void method3(String name, int age) {
		System.out.println(age + "���� " + name +"�� ȯ���մϴ�.");
	}
	
	// �Ű������� ��ȯ�� ��� �ִ� �޼ҵ�
	public static int method4(int num1, int num2, char op) {
		
		int result = 0;
		if(op == '+') {
			result = num1 + num2;
			
		}else if(op == '-') {
			result = num1 - num2;
			
		}else if(op == '*' || op == 'x') {
			result = num1 * num2;
			
		}else if(op == '/') {
			result = num1 / num2;
			
		}
		return result;
		
		
	}

}
