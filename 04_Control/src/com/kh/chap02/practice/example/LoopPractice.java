package com.kh.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 잘 입력했을 경우 	
			
			for (int i = 1; i <= user; i++) {
				System.out.print(i + " ");
			}
			
		} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	public void practice2() {
		
		Scanner sc = new Scanner(System.in);

		// 우선 무한 반복 돌려놓고
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. 잘 입력했을 경우 		=> 정상적인 결과 출력 후 반복문 종료
				
				for (int i = 1; i <= user; i++) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우) => 다시 반복문 실행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}

	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int user = sc.nextInt();

		if (user >= 1) { // 1_1. 잘 입력했을 경우
			
			for (int i = user; i >= 1; i--) {
				System.out.print(i + " ");
			}
			
		} else {// 1_2. 그게 아닐 경우 (잘못 입력햇을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}

	public void practice4() {
		Scanner sc = new Scanner(System.in);

		// 우선 무한 반복 돌려놓고
		while (true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int user = sc.nextInt();
			
			if (user >= 1) { // 1_1. 잘 입력했을 경우 		=> 정상적인 결과 출력 후 반복문 종료
				
				for (int i = user; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
				
			} else { // 1_2. 그게 아닐 경우 (잘못 입력햇을 경우) => 다시 반복문 실행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
			}
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) { // i값이 1에서부터 사용자가 입력한 수까지 1씩 증가하는 동안 반복
			
			// 매번 sum 변수에 누적해서 더해줌
			sum += i; 
			
			// 뿐만아니라 출력도 해줄꺼임 .. 근데 문제에서 요구한 대로 출력하고자 한다면
			if(i < num) { // i 값이 num보다 작을 때 까지는 해당 숫자 뒤에 + 붙여가면서 출력
				System.out.print(i + " + ");
			}else { // 그게 아닐 경우(즉, i값이 num이 될 경우 그땐 마지막으로 = 붙여서 출력
				System.out.print(i + " = ");
			}
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 >= 1 && num2 >= 1) { // 1_1. 두 수 모두 잘 입력했을 경우 
			
			int min = Math.min(num1, num2);	// 두 수 중 작은 값 담기
			int max = Math.max(num1, num2); // 두 수 중 큰 값 담기
			
			for(int i = min; i <= max; i++) { // i가 min에서부터 max까지 1씩 증가하는동안 반복
				System.out.print(i + " ");
			}	
			
		} else { // 1_2. 그게 아닐 경우 (잘못입력했을 경우)
			System.out.println("1 이상의 숫자를 입력해주세요.");
			
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		// 우선 무한 반복 돌려놓고
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			
			if(num1 >= 1 && num2 >= 1) { // 1_1. 두 수 모두 잘 입력했을 경우 	=> 정상적인 결과 출력 후 반복문 빠져나감
				
				int min = Math.min(num1, num2);	// 두 수 중 작은 값 담기
				int max = Math.max(num1, num2); // 두 수 중 큰 값 담기
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				
				break; 
				
			} else {// 1_2. 그게 아닐 경우 (잘못입력했을 경우) => 다시 반복문 수행
				System.out.println("1 이상의 숫자를 입력해주세요.");
				
				
			}
		}
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if(num >= 2 && num <= 9) { // 1_1. 잘 입력했을 경우 => 사용자가 입력한 단에서부터 9단까지 출력
			
			
			for(int i = num; i < 10; i++) {						// 단을 지정하는 for문	(사용자가 입력한 수부터 9까지 1씩 증가)
				System.out.printf("===== %d단 =====\n", i);
				
				for(int j = 1; j <= 9; j++) {					// 곱해지는 수를 지정하는 for문	
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				
				System.out.println();
			}		
			
			
		} else { // 1_2. 그게 아닐 경우 (즉, 잘못입력했을 경우)
			System.out.println("2~9사이의 숫자만 입력해주세요.");
			
		}
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		// 우선 무한 반복 돌려놓고
		while(true) {			
			
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) { // 1_1. 잘 입력했을 경우 => 사용자가 입력한 단에서부터 9단까지 출력
				
				for(int i = num; i <= 9; i++) {					// 단을 지정하는 for문
					System.out.printf("===== %d단 =====\n", i);
					
					for(int j = 1; j <= 9; j++) {				// 곱해지는 수를 지정하는 for문
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}	
				break;
				
			} else { // 1_2. 그게 아닐 경우 (즉, 잘못입력했을 경우)
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int start = sc.nextInt();
		
		System.out.print("공차 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<10; i++) { // 0에서부터 9까지 매번 1씩 증가하는동안 반복(10회)
			
			System.out.print(start + " ");
			//start = start + num;
			start += num;
			
		}
		
		
		
	}

	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			// 1. 연산자 입력받기 (+, -, *, /, %) + exit
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine(); // "+", "-", "*", ... , "exit" , "^"
			
			// >> 사용자가 혹시라더 exit라는 문자열을 입력했을 경우 => "프로그램을 종료합니다"출력 후 반복문 빠져나가기
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 2. 두개의 정수 입력받기
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			sc.nextLine();
			
			// >> / 또는 % 연산기호를 입력했고 뿐만아니라 두번째 정수가 0일 경우 
			//    => "0으로 나눌 수 없습니다. 다시 입력해주세요" 출력 후 반복문 다시 실행
			if(op.equals("/") || op.equals("%") && num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				continue;
			}
			
			// 3. 산술연산하기 => 산술연산한 결과 바로 출력 x => 결과를 변수에 기록해둘 것
			int result = 0; // 산술연산한 결과를 담아둘 변수
			
			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": result = num1 / num2; break;
			case "%": result = num1 % num2; break;
			// >> 혹시라도 없는 연산기호를 입력했을 경우 => "없는 연산자입니다. 다시입력해주세요"출력 후 반복문 다시실행
			default: System.out.println("없는 연산자입니다. 다시 입력해주세요.\n"); continue;
			}
			
			// 4. 산술연산 결과 출력  (ex)  xx 연산기호 xx = xx
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);			
			
		}
	
		
		
	}
	
	
	
	
}








