package com.kh.chap06_method.run;

import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.NonStaticMethodTest;
import com.kh.chap06_method.controller.OverloadingTest;
import com.kh.chap06_method.controller.StaticMethodTest;

public class MethodRun {
	
	public static void main(String[] args) {
		/*
		NonStaticMethodTest ns = new NonStaticMethodTest();
		
		// 1. �Ű������� ��ȯ���� ���� �޼ҵ� ȣ��
		ns.method1();
		
		// 2. �Ű������� ������ ��ȯ���� �ִ� �޼ҵ� ȣ�� 
		//String name = ns.method2();
		//System.out.println(name + "�� ȯ���մϴ�^^");
		
		// 3. �Ű������� ������ ��ȯ���� ���� �޼ҵ�
		ns.method3("ȫ�浿", 10);
		
		
		//4. �Ű������� ��ȯ���� �Ѵ� �ִ� �޼ҵ�
		int result = ns.method4(10, 20);
		System.out.println("10 + 20 = " + result);
		
		System.out.println("10 + 20 = " + ns.method4(10, 20));
		
		
		User u = new User("user01", "pass01", "ȫ�浿");
		System.out.println(u.information());
		
		ns.method5(u);
		System.out.println(u.information());
		*/
		
		StaticMethodTest.method1();
		
		System.out.println(StaticMethodTest.method2());
		System.out.println(Math.random());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		StaticMethodTest.method3(name, age);
		
		int result = StaticMethodTest.method4(20,10, 'x');
		System.out.println("��� : " + result);
		
		NonStaticMethodTest ns = new NonStaticMethodTest();
		
		User u = new User("user01", "pass01", "ȫ�浿");
		System.out.println(u.information());
		
		ns.method5(u);
		System.out.println(u.information());
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(5,"����");
	}

}
