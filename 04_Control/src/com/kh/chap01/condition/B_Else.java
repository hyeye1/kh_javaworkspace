package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	
	/*
	 * * if-else ��
	 * 
	 * if(���ǽ�) {
	 * 		���� �ڵ�1;
	 * }else {
	 * 		���� �ڵ�2;
	 * }
	 * 
	 * ���ǽ��� ����� true�� ��� �����ڵ�1���� �����ϰ� if-else�� ��ü�� ��������
	 * ��, ���ǽ��� false�� ��� ������ �����ڵ�2�� ������
	 * 
	 * 
	 * * if-else if��
	 * ���� �� ������� �������� ������ ������ ���
	 * 
	 * if(���ǽ�1) {
	 * 		���� �ڵ�1;
	 * }else if(���ǽ�2) {
	 * 		���� �ڵ�2;
	 * }else if(���ǽ�3) {
	 * 		���� �ڵ�3;
	 * }[else {
	 * 		���� ���ǵ��� �� false�� ��� �ݵ�� ������ �ڵ�;
	 * }]
	 * 
	 * ���ǽ�1�� ����� true�� ��� �����ڵ�1���� �����ϰ� ��������
	 * ��, false�� ��� ���ǽ�2 ����
	 * ���ǽ�2�� ����� true�� ��� �����ڵ�2���� �����ϰ� ��������
	 * ��, false�� ��� ���ǽ�3 ���� 
	 * .....
	 * �������� else���� ���õǾ����� ��� ���� ���ǵ��� �� false�ϰ�� ������ else���� ����
	 * 
	 */

	public void method1() {
		// ����ڰ� �Է��� �������� ¦��/Ȧ�� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
		
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}else if(num == 0) {
			System.out.println("0�̴�");
		}else {
			System.out.println("������");
		}
		
	}
	
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� (������) : ");
		int age = sc.nextInt();
		
		// ���(0�̻� 13����) / û�ҳ�(13�ʰ� 19����) / ����(19�ʰ�)
		/*
		if(age >= 0 && age <= 13) {
			System.out.println("���");
		}else if(age > 13 && age <= 19) {
			System.out.println("û�ҳ�");
		}else if(age > 19) {
			System.out.println("����");
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
		*/
		
		if(age < 0) { // ���ε� ������ �Է����� ��� => �߸� �Է����� ���
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			
		}else { // �� �Է����� ��� => 0�̻��� ���� �� �Է��ߵ�
			
			if(age <= 13) {
				System.out.println("���");
			}else if(age <= 19) {
				System.out.println("û�ҳ�");
			}else {
				System.out.println("����");
			}		
			
		}
		
		
	}
	
	
	public void method4() {
		// ����ڿ��� ������ �Է¹޾Ƽ�
		// �������� ����� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		// 90�� �̻��� ���   "A���"���
		// 90�� �̸� 80�� �̻��� ��� "B���"���
		// 80�� �̸� 70�� �̻��� ��� "C���"���
		// 70�� �̸� 60�� �̻��� ��� "D���"���
		// 60�� �̸��� ���   "F���"���
		
		String grade = ""; // ������� ���� ����
		
		if(score >= 90) {
			grade = "A���";
		}else if(score >= 80) {
			grade = "B���";
		}else if(score >= 70) {
			grade = "C���";
		}else if(score >= 60) {
			grade = "D���";
		}else {
			grade = "F���";
		}
		
		// ����� ������ xx���̰�, ����� xxx�Դϴ�.
		System.out.println("����� ������ " + score + "���̰�, ����� " + grade + "�Դϴ�.");		
		
	}
	
	
	public void method5() {
		// ����ڿ��� �̸��� �Է¹��� ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		// �� �̸��� "������" ��ġ�� ��� => "�����Դϴ�."
		//			 ��ġ���� ���� ��� => "������ �ƴմϴ�. ���ư��ּ���"
		/*
		if(name == "������") {
			System.out.println("�����Դϴ�. �������.");
		}else {
			System.out.println("������ �ƴմϴ�. ���ư��ּ���.");
		}
		*/
		// �⺻�ڷ����鳢�� ����񱳽� == �Ǵ� != ���� �� �񱳰� ��!
		// ��, String�� �⺻�ڷ����� �ƴ� �����ڷ���(��Ư)��!! => ����񱳿����� ����� ������� ����
		// => ���ڿ� ���� ������ϰ��� �Ѵٸ� ���ڿ�.equals(���ϰ����ϴ¹��ڿ�) �޼ҵ带 �̿��ؾߵ�!
		if(name.equals("������")) {
			System.out.println("�����Դϴ�. �������.");
		}else {
			System.out.println("������ �ƴմϴ�. ���ư��ּ���.");
		}
		
		
	}
	
	
	
	
	
	
	
}
