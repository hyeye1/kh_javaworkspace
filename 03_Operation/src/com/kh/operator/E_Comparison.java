package com.kh.operator;

import java.util.Scanner;

public class E_Comparison {
	
	/*
	 * * �񱳿����� (���迬����)
	 * - ���׿����� (�� ���� ���ϴ� ������) 
	 * - �񱳿����� ������ ������� ����(true/false)
	 *   �񱳿��꿡 �ش��ϴ� ���ǿ� �����ϸ� true(��) / �������� ������ false(����)
	 *   => �Ŀ� ���ǹ����� ���� ����
	 * 
	 * a < b 	: a�� b���� �۽��ϱ�? 
	 * a > b	: a�� b���� Ů�ϱ�?
	 * a <= b   : a�� b���� �۰ų� �����ϱ�?
	 * a >= b 	: a�� b���� ũ�ų� �����ϱ�?
	 * 
	 * a == b   : a�� b�� ��ġ�մϱ�?
	 * a != b   : a�� b�� ��ġ���� �ʽ��ϱ�?
	 */
	
	public void method1() {
		
		int a = 10;
		int b = 25;
		
		System.out.println("a > b : " + (a > b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		
		// ������� + �񱳿���
		
		// ��Ѱ��� 2�� �������� ������ ��������/�ƴϳ�
		// ��, 2�� ������ ���� ���������� 0�̳� / 1�̳�
		// �� ������ ¦������/Ȧ������ �Ǻ�����
		
		System.out.println("a�� ¦���Դϱ� : " + (a % 2 == 0));
		System.out.println("a�� Ȧ���Դϱ� : " + (a % 2 == 1));
		
	}
	
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		// ����ڿ��� ������ �Է¹��� ��
		System.out.print("������ �Ѱ� �Է� : ");
		int num = sc.nextInt();
		
		// �ش� ���� ������� ���
		System.out.println("����ڰ� �Է��� ���� ����Դϱ� : " + (num > 0));
		
		// �ش� ���� ¦������ ���
		System.out.println("����ڰ� �Է��� ���� ¦���Դϱ� : " + (num % 2 == 0));
		
		
	}
	
	

}
