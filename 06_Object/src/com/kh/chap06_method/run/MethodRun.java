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
		
		// 1. 매개변수와 반환값이 없는 메소드 호출
		ns.method1();
		
		// 2. 매개변수는 없지만 반환값이 있는 메소드 호출 
		//String name = ns.method2();
		//System.out.println(name + "님 환영합니다^^");
		
		// 3. 매개변수는 있지만 반환값이 없는 메소드
		ns.method3("홍길동", 10);
		
		
		//4. 매개변수와 반환값ㄷ 둘다 있는 메소드
		int result = ns.method4(10, 20);
		System.out.println("10 + 20 = " + result);
		
		System.out.println("10 + 20 = " + ns.method4(10, 20));
		
		
		User u = new User("user01", "pass01", "홍길동");
		System.out.println(u.information());
		
		ns.method5(u);
		System.out.println(u.information());
		*/
		
		StaticMethodTest.method1();
		
		System.out.println(StaticMethodTest.method2());
		System.out.println(Math.random());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		StaticMethodTest.method3(name, age);
		
		int result = StaticMethodTest.method4(20,10, 'x');
		System.out.println("결과 : " + result);
		
		NonStaticMethodTest ns = new NonStaticMethodTest();
		
		User u = new User("user01", "pass01", "홍길동");
		System.out.println(u.information());
		
		ns.method5(u);
		System.out.println(u.information());
		
		OverloadingTest ot = new OverloadingTest();
		ot.test();
		ot.test(10);
		ot.test(5,"ㅎㅎ");
	}

}
