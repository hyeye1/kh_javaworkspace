package com.kh.array.practice.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		//길이가 10인 배열을 선언하고 1부터 10까지의 값을 반복문을 이용하여 순서대로 배열 인덱스에 넣은 후 그 값 출력.
		//ex. 1 2 3 4 5 6 7 8 9 10
	
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice2() {
		// 역순 출력
		
		int[] arr = new int[10];
		
		for(int i = arr.length-1; i>=0; i--) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+" ");
		}
	}
	
	
	public void practice3() {
		//사용자에게 입력받은 정수만큼 배열크기 할당
		//1부터 입력받은 값까지 배열에 초기화 한 후 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	
	public void practice4() {
		String[] fruit = {"사과","귤", "포도", "복숭아", "참외"};
		
		System.out.print(fruit[1]);
	}
	
	
	public void practice5() {
		//문자열을 입력받아서 문자 하나하나 배열에 넣고 검색할 문자가 몇개있는지 개수와  몇번째인덱스에 위치하는지 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] text = new char[str.length()];
		
		System.out.print("문자 : ");
		char cha = sc.nextLine().charAt(0);
		
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			text[i] = str.charAt(i);
			
				if(cha==text[i]) {
					count++;
					System.out.print("인덱스번호 : "+i+" \n");
				}
			}
		System.out.print(cha +" 개수 : " + count);
		}
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		String[] day = {"월","화","수", "목", "금", "토","일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		if(num>=0 && num < 7) {
			System.out.println(day[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int j = 0; //j= 값, i=인덱스번호
		int i = 0;
		for(i=0; i<arr.length; i++) {
			
			System.out.printf("배열 %d 번째 인덱스에 넣을 값 : ", i);
			j = sc.nextInt();			
			arr[i]=j;						
		}
		int sum = 0;
		
		for(i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");	
		}
		
		for(i=0; i<arr.length; i++) {
		sum += arr[i] ;
		}
		
		System.out.print("\n총 합 : "+sum);

	}
	
	public void practice8() {
		//3이상의 홀수 자연수를 입력받기
		//배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값넣기
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>3 && (num%2 == 1)) {
				int[] arr = new int[num];

				for(int i = 0; i<=arr.length/2; i++) {
			
					arr[i] = i+1;
					System.out.print(arr[i]+" ");

				}
				for(int i=arr.length/2; i>0; i--) {
					
					arr[i] = i;
					System.out.print(arr[i]+ " ");
				}
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요: ");
		String str = sc.nextLine();
		
		String[] chicken = {"후라이드", "양념", "간장", "매운 양념"};
		
		boolean isMenu = true;
		
		int i = 0;
		
		for(i =0; i<chicken.length; i++) { 
			
			isMenu = (chicken[i].equals(str));
			
			if(isMenu) {
				System.out.println(str+"치킨 배달 가능");
				break;
			}
		
		}
		if(isMenu==false) {
			System.out.println(str+ "치킨은 없는 메뉴입니다.");
		}
		
	
	
	}
	
	public void practice10() {
		int[] arr = new int [10];
		
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*10+1);
			
			System.out.print(arr[i]+" ");
		}
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String num = sc.nextLine();
		char[] reg = new char[num.length()];
		char[] copy = reg.clone();
		
		for(int i=0; i<8; i++) {
			reg[i] = num.charAt(i);
			
			System.out.print(reg[i]);
		}
		for(int i=8; i<num.length(); i++) {
			
			copy[i]= '*';
			
			System.out.print(copy[i]);
		}
		
		

		
		
		
		
	}
	
	
	
}		

		
		
		
		
		
	
		
		
	
	
	
	
	
	
	
	


