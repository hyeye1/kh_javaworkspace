package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	
	/*
	 * switch문과 if문과의 차이점
	 * if문은 (조건식) => 조건식 복잡하게도 기술가능, 범위 제시 가능
	 * switch 조건식x => 확실한 값의 조건만 기술 (동등비교 같이 수행)
	 * 
	 * * switch문
	 * 
	 * switch(동등비교할대상자) {
	 * case 값1: 실행코드1; break;
	 * case 값2: 실행코드2; break;
	 * case 값3: 실행코드3; break;
	 * .....
	 * default: 위의 값들이 다 일치하지 않을경우 실행 코드; 
	 * }
	 * 
	 * * switch문의 주의사항
	 * break를 만나야 switch 블럭을 빠져나갈 수 있음
	 * 
	 */
	
	public void method1() {
		// 1~3사이의 정수를 입력받아
		// 1인 경우 "빨간불입니다" 출력
		// 2인 경우 "파란불입니다" 출력
		// 3인 경우 "초록불입니다" 출력
		// 잘못입력햇을경우 "잘못입력하셨습니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(1~3) : ");
		int num = sc.nextInt();
		
		/*
		if(num == 1) {
			
		}else if(num == 2) {
			
		}else if(num == 3) {
			
		}else {
			
		}*/

		/*
		switch(num) {
		case 1: System.out.println("빨간불입니다."); break; // num == 1
		case 2: System.out.println("파란불입니다."); break; // num == 2
		case 3: System.out.println("초록불입니다."); break; // num == 3
		default: System.out.println("잘못입력하였습니다"); 
		}
		*/
		
		
		String result = "";
		switch(num) {
		case 1: result = "빨간불"; break; // num == 1
		case 2: result = "파란불"; break; // num == 2
		case 3: result = "초록불"; break; // num == 3
		default: System.out.println("잘못입력하였습니다"); return;
		}
		
		// return; => return만나는 순간 뭐가됐든 현재 이 메소드 자체를 빠져나간다
		
		System.out.println(result + "입니다.");
		
	}
	
	
	public void method2() {
		
		// 사용자에게 과일(사과, 바나나, 복숭아)을 입력받아
		// 각 과일마다의 가격을 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구매할 과일(사과,바나나,복숭아) 입력 : ");
		String fruit = sc.nextLine();
		
		
		int price = 0;
		
		switch(fruit) {
		case "사과": price = 1000; break;
		case "바나나": price = 3000; break;
		case "복숭아": price = 5000; break;
		default: System.out.println("저희 가게에서 판매하는 과일이 아닙니다. 안녕히 가세요"); return;
		}
		
		System.out.println(fruit + "의 가격은 " + price + "원 입니다.");
		
	}
	
	// break없이 switch문을 쓰는 경우
	public void method3() {
		
		// 등급별 권한
		// 3등급(매니저)   => 나 읽기 권한 있어. 나 글쓰기 권한 있어. 나 관리 권한 있어. 
		// 2등급(일반회원) => 나 읽기 권한 있어. 나 글쓰기 권한 있어.
		// 1등급(새싹회원) => 나 읽기 권한 있어.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("등급(1/2/3) 입력 : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3: System.out.println("나 관리 권한 있어.");
		case 2: System.out.println("나 글쓰기 권한 있어.");
		case 1: System.out.println("나 읽기 권한 있어.");
		}
		
		
	}
	
	public void method4() {
		// 사용자에게 1월~12월 사이의 월을 입력받아
		// 해당 달의 마지막 날짜(30/31/28일또는29일) 를 출력
		
		// 1, 3, 5, 7, 8, 10, 12월 => "해당 달은 31일까지입니다."
		// 4, 6, 9, 11월 => "해당 달은 30일까지입니다."
		// 2월 => "해당 달은 28일 또는 29일까지입니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월 ~ 12월까지 중 하나를 입력하세요(정수) : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: 
		case 3: 
		case 5:
		case 7: 
		case 8:
		case 10:
		case 12: System.out.println("해당 달은 31일 까지입니다."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("해당 달은 30일 까지입니다."); break;
		case 2: System.out.println("해당 달은 28일 또는 29일 까지입니다."); break;
		default: System.out.println("반드시 1월 ~ 12월까지를 입력해야됩니다.");
		}
		
	}
	
	
	
	

}
