package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	/*
	 * * while��
	 * 
	 * �ʱ��;
	 * while(���ǽ�) { 
	 * 		�ݺ������� ������ �ڵ�;
	 * 		������;
	 * }
	 * 
	 * �ʱ�� 
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> false�� �ݺ��� stop
	 * 
	 */
	
	public void method1() {
		
		// "�ȳ��ϼ���" 5�� ���
		/*
		for(int i=1; i<=5; i++) {
			System.out.println("�ȳ��ϼ���");
		}
		System.out.println(i);
		*/
		
		int i = 1;
		while(i<=5) {
			System.out.println("�ȳ��ϼ���");
			i++;
		}
		
		System.out.println(i);
		
		// 1 2 3 4 5
		i = 1;
		
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		
	}
	
	
	public void method2() {
		// 1���� 10������ �� �հ�
		
		int sum = 0;
		
		int i = 1;
		while(i<=10) {
			sum += i;
			i++;
		}
		
		System.out.println("�� �հ� : " + sum);
		
	}
	
	public void method3() {
		
		// 1���� ������(1~10����) ������ ���հ�
		int random = (int)(Math.random() * 10 + 1);
		
		int sum = 0;
		int i = 1;
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1�������� " + random + "������ �� �հ� : " + sum);
		
	}
	
	public void method4() {
		// �޴� ����
		Scanner sc = new Scanner(System.in);
		
		//------------------------
		//while(true) {
		for(;true;) {
			System.out.println("\n==== �޴� ====");
			System.out.println("1. �ȳ��ϼ��� 5�� ���");
			System.out.println("2. 1���� 10���� ���հ�");
			System.out.println("3. 1���� ���������� ���հ�");
			System.out.println("0. ���α׷� ����");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: method1(); break;
			case 2: method2(); break;
			case 3: method3(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��߽��ϴ�. �ٽ��Է����ּ���.");
			}
		}
		//-----------------------
		
	}
	
	/*
	 * * do-while��
	 * 
	 * �ʱ��;
	 * do{
	 * 		�ݺ������� ������ �ڵ�;
	 * 		������;
	 * }while(���ǽ�);
	 * 
	 * �ʱ��
	 * 		������ �ڵ� �ѹ� ���� --> ������
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> true�� ���� --> ������
	 * ���ǽ� --> false�� ��������
	 * 
	 * while���� �ٸ����� while���� ó�� ����ɶ��� ���� �˻� �� true���� ���� 
	 * ��, do while���� ù ������ ���� �˻� ���� ������ �ѹ��� �����
	 * 
	 * 
	 */
	
	public void method5() {
		// ���ʿ� ������ ���� �ʾƵ� �ݵ�� �ѹ��� ����
		int num = 1;
		
		do {
			System.out.println(num);
			
		}while(num == 0);
		
	}
	
	public void method6() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i + " ");
			i++;
		}while(i <= 5);
		
	}
	
	public void method7() {
		// 2�� ���
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ....
		// 2 x 9 = 18
		
		System.out.println("=== 2�� ===");
		
		int su = 1;
		
		do {
			System.out.printf("2 x %d = %d\n", su, 2*su);
			su++;
		}while(su <= 9);
		
	}
	

}






