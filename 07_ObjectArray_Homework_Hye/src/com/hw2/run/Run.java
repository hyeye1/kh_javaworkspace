package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		// �ִ� 10���� �л� ������ ����� �� �ְ� �迭�� �Ҵ��Ѵ�.
		Student arr[] = new Student[10];
		
		// while���� ����Ͽ� �л����� ������ ��� �Է� �ް�
		Scanner sc = new Scanner(System.in);
		
		boolean b= true;
		int total = 0;
		int count = 0;
		
		while(b){
			for(int i = 0; i<=count; i++) {
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				
				System.out.print("�������� : ");
				int kor = sc.nextInt();
				
				System.out.print("�������� : ");
				int eng = sc.nextInt();
				
				System.out.print("�������� : ");
				int math = sc.nextInt();
				sc.nextLine();
				
			
				System.out.print("��� �߰��Ͻðڽ��ϱ�(Y/N)?  ");
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
		// �� �� �߰� �� ������ ī��Ʈ��
		
		// ��� �߰��� ������ �����, ��ҹ��� ������� ��y���̸� ��� ��ü �߰�
		
		// 3�� ������ �л� ������ �Է� �޾� �� ��ü�� ������
		
		// ���� ��ϵ� �л����� ������ ���� ����� ����
		
		// �л����� ������ ��� ��� (��� ����)
		
	}
}
