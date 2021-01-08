package com.kh.chap06_method.controller;

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;

public class NonStaticMethodTest {
	
	/*
	 * �޼ҵ�
	 
	 ����������[�����] ��ȯ�Ұ��� �ڷ��� �޼ҵ��([�Ű�����, �Ű�����, ...]) {
	 		�޼ҵ� ����(ȣ��)�� ������ �ڵ�;
	 		. . .
	 		[return ��ȯ��;]
	 }
	  */
	 //1. �Ű����� ���� ��ȯ�������� �޼ҵ�
	 public void method1() {
		 System.out.println("�Ű������� ���� ��ȯ���� ���� �޼ҵ�");
	 }
	
	 //2. �Ű����� ���� ��ȯ���� �ִ� �޼ҵ�
	 
	 public String method2() {
		 System.out.println("�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�");
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("�̸� : ");
		 return sc.nextLine();
	 }
	 
	 //3. �Ű������ְ� ��ȯ���� ���� �޼ҵ�
	 public void method3(String name, int age) {
		 
		 System.out.println("�Ű������� ������ ��ȯ���� ���� �޼ҵ�");
		 System.out.printf("%s���� ���̴� %d�� �Դϴ�. \n", name, age);
	 }
	 
	 //4. �Ű������ְ� ��ȯ���� �ִ� �޼ҵ�
	 public int method4(int num1, int num2) {
		 System.out.println("�Ű������� ��ȯ�� �Ѵ� �ִ� �޼ҵ�");
		 return num1 + num2;
	 }
	 
	 //**�߰�** �Ű������� ��ü�� ���޹��� �� ����
	 public void method5(User u) {
		 u.setAge(20);
	 }
	

}
