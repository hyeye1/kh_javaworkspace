package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break : break; 를 만나는 순간 "가장 가까운 반복문"을 빠져나가는 구문
	 * 
	 * 주의할점 : switch문 안의 break와는 다른 개념!!
	 * 		   switch문 안의 break는 해당 switch문을 빠져나가는 용도일 뿐
	 * 
	 */
	
	public void method1() {
		// 매번 반복적으로 랜덤값(1~100)을 발생 시킨 후 출력
		// 단, 그 랜덤값이 홀수값일 경우 반복문을 빠져나가게끔 
		
		while(true) {
			
			int random = (int)(Math.random() * 100 + 1);
			
			if(random % 2 == 1) {
				break;
			}
			
			System.out.println(random);
		}
		
		System.out.println("반복문 빠져나왔음");
	}
	
	public void method2() {
		
		// 매번 사용자에게 문자열 입력받은 후 해당 문자열의 길이 출력
		// 단, 사용자가 입력한 문자열이 "exit"과 일치할 경우 반복을 종료하게끔
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			// xxxx의 글자수(길이) : xx
			System.out.println(str + "의 글자수(길이) : " + str.length());
			
		}
		
	}
	
	public void method3() {
		// 매번 반복적으로 사용자에게 1이상의 숫자를 입력받은 후 1~사용자가입력한 수까지 출력
		// 단, 정상적인 수를 입력했을 경우 1~사용자가입력한 수까지 출력후 반복 종료
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // 우선 무한반복으로 돌리기
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) { // 1_1. 잘 입력했을 경우 => 1에서부터 사용자가입력한수까지 출력 후 반복문 빠져나가게끔
				
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break;
				
			}else { // 1_2. 잘못 입력했을 경우 => "잘못입력했습니다. 다시 입력해주세요. " 출력 후 다시 반복문
				System.out.println("잘못입력했습니다. 다시 입력해주세요.");
			}
			
		}
		
	}
	
	
	
	

}
