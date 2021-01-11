package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student arr[] = new Student[10];
		
		// while문을 사용하여 학생들의 정보를 계속 입력 받고
		Scanner sc = new Scanner(System.in);
		
		boolean b= true;
		int total = 0;
		int count = 0;
		
		while(b){
			for(int i = 0; i<=count; i++) {
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				sc.nextLine();
				
			
				System.out.print("계속 추가하시겠습니까(Y/N)?  ");
				String answer = sc.nextLine();
				if(answer.equals("Y") || answer.equals("y")) {
					b=true;
					count ++;
					
					
				} else {
					b=false;
					
				}
				arr[i] = new Student(grade, classroom, name, kor, eng, math);				
				total = arr[i].getKor() + arr[i].getEng() + arr[i].getMath();
				arr[i].setSum(total / 3);
				
				
				
		}
	}

		for(int i=0; i<=count; i++) {
			System.out.println(arr[i].information());

		}
		// 한 명씩 추가 될 때마다 카운트함
		
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
		
		// 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
		
		// 현재 기록된 학생들의 각각의 점수 평균을 구함
		
		// 학생들의 정보를 모두 출력 (평균 포함)
		
	}
}
