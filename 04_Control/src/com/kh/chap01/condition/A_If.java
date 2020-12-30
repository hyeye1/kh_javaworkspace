package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	/*
	 * ���α׷��� �⺻������ ������ �Ʒ��� ���������� ����
	 * ��, �� �������� �帧�� �ٲٰ��� �Ҷ� "���"�� ���� ������ �� ����
	 * 
	 * ���������� ���� => ���ǹ�
	 * �ݺ������� ���� => �ݺ���
	 * �� ���� �帧 ���� => �б⹮
	 * 
	 * * ���ǹ�
	 * "���ǽ�"�� ���� ���̳� �����̳ĸ� �Ǵ��ؼ� �ش� ������ �����ϴ� ��� �׿� �ش��ϴ� ���๮ ����
	 * 
	 * => ���ǽ��� ����� true/false ���ߵ�
	 * => ���� ���ǽĿ����� �񱳿�����(���, ����) / ��������(&&, ||)�� ���
	 * 
	 * ���ǹ��� ũ�� if���� switch������ ����
	 * 
	 * if�������� �ٽ� 3������ ����
	 * 1. �ܵ� if��
	 * 2. if-else��
	 * 3. if-else if��
	 * 
	 * 
	 * * �ܵ� if��
	 * 
	 * ������ �ڵ�;
	 * ������ �ڵ�;
	 * 
	 * if(���ǽ�) {
	 * 		������ �ڵ�;
	 * 		������ �ڵ�;
	 * }
	 * 
	 * => ���ǽ��� ��� ��(true)�̸� �߰�ȣ ���� �ڵ� ����
	 * => ���ǽ��� ��� ����(false)�̸� �߰�ȣ ���� �ڵ� �����ϰ� �Ѿ
	 * 
	 */
	
	public void method1() {
		
		// �ǽ����� 1. ����ڰ� �Է��� �������� ������� �ƴ��� �Ǻ� �� "�����" / "����� �ƴϴ�"
		// �ǽ����� 2. 						��Ȯ��  �Ǻ� �� "�����" / "0�̴�" / "������" 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("�����");
		}
		
		if(num == 0) {
			System.out.println("0�̴�");
		}
		
		if(num < 0) {
			System.out.println("������");
		}
		
	}
	
	
	public void method2() {
		// �ǽ����� 3. ����ڰ� �Է��� �������� ¦������ Ȧ������ �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println("�Է��� ���ڴ� ¦���Դϴ�.");
		}
		
		if(num % 2 == 1) {
			System.out.println("�Է��� ���ڴ� Ȧ���Դϴ�.");
		}
		
	}
	
	public void method3() {
		
		// �ǽ����� 6. ����ڰ� �Է��� ���̰��� ������ ���/û�ҳ�/���� ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����(������) : ");
		int age = sc.nextInt();
		
		// ���(13�� ����), û�ҳ�(13�� �ʰ� ~ 19�� ����), ����(19�� �ʰ�)
		
		String result = ""; // ������� ��� ���� ������ ������! (�ʱ�ȭ�� �ص�)
		
		if(age >= 0 && age <= 13) {
			result = "���";
		}
		
		if(age > 13 && age <= 19) {
			result = "û�ҳ�";
		}
		
		if(age > 19) {
			result = "����";
		}
		
		System.out.println(result);
		
	}
	
	public void method4() {
		
		// �ǽ����� 8. ����ڿ��� �Է¹��� �ֹι�ȣ�� ������ ����/���� �Ǻ� �� ���
		
		// 1. ����ڿ��� �ֹι�ȣ �Է¹ޱ�  => ex) "850918-2456147"
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ �Է�(- ����) : ");
		String personId = sc.nextLine(); // "850918-2456147"
		
		// 2. �Է¹��� �ֹι�ȣ�� ���� ������ �ش��ϴ� ����(7���ε���) �ϳ����� �̾Ƴ��� => ex) '2'
		char ch = personId.charAt(7); // '2'
		
		// 3. ���ڰ� '1' �Ǵ� '3'�� ��� => ���� ���
		if(ch == '1' || ch == '3') {
			System.out.println("����");
		}
		//    ���ڰ� '2' �Ǵ� '4'�� ��� => ���� ���
		if(ch == '2' || ch == '4') {
			System.out.println("����");
		}
		//    ���ڰ� '1','2','3','4' ��� �ƴ� ��� => �߸��Է��߽��ϴ� ���
		if(ch != '1' && ch != '2' && ch != '3' && ch != '4'){
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}
		
	}
	
	
	
	
	
	

}
