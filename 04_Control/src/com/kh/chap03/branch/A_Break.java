package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	
	/*
	 * break : break; �� ������ ���� "���� ����� �ݺ���"�� ���������� ����
	 * 
	 * �������� : switch�� ���� break�ʹ� �ٸ� ����!!
	 * 		   switch�� ���� break�� �ش� switch���� ���������� �뵵�� ��
	 * 
	 */
	
	public void method1() {
		// �Ź� �ݺ������� ������(1~100)�� �߻� ��Ų �� ���
		// ��, �� �������� Ȧ������ ��� �ݺ����� ���������Բ� 
		
		while(true) {
			
			int random = (int)(Math.random() * 100 + 1);
			
			if(random % 2 == 1) {
				break;
			}
			
			System.out.println(random);
		}
		
		System.out.println("�ݺ��� ����������");
	}
	
	public void method2() {
		
		// �Ź� ����ڿ��� ���ڿ� �Է¹��� �� �ش� ���ڿ��� ���� ���
		// ��, ����ڰ� �Է��� ���ڿ��� "exit"�� ��ġ�� ��� �ݺ��� �����ϰԲ�
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			// xxxx�� ���ڼ�(����) : xx
			System.out.println(str + "�� ���ڼ�(����) : " + str.length());
			
		}
		
	}
	
	public void method3() {
		// �Ź� �ݺ������� ����ڿ��� 1�̻��� ���ڸ� �Է¹��� �� 1~����ڰ��Է��� ������ ���
		// ��, �������� ���� �Է����� ��� 1~����ڰ��Է��� ������ ����� �ݺ� ����
		
		Scanner sc = new Scanner(System.in);
		
		while(true) { // �켱 ���ѹݺ����� ������
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num >= 1) { // 1_1. �� �Է����� ��� => 1�������� ����ڰ��Է��Ѽ����� ��� �� �ݺ��� ���������Բ�
				
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break;
				
			}else { // 1_2. �߸� �Է����� ��� => "�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���. " ��� �� �ٽ� �ݺ���
				System.out.println("�߸��Է��߽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
		
	}
	
	
	
	

}
