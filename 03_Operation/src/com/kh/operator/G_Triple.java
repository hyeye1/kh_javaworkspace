package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	
	/*
	 * * ���� ������ : 3���� �׸��� ������ �����ϴ� ������
	 * 
	 * [ǥ����] ���ǽ� ? ���ǽ��� ���ϰ���� ����� : ���ǽ��� �����ϰ���� �����
	 * 
	 */

	public void method1() {
		// ����ڿ��� �Է¹��� �������� ������� �ƴ��� �Ǻ� �� �׿� �ش��ϴ� ����� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		/*
		// ���ǽ� ? ���ϰ���� ����� : �����ϰ���� �����
		String result = (num > 0) ? "����̴�" : "����� �ƴϴ�";
		// xx��(��) xxxxx
		System.out.println(num + "��(��) " + result);	
		*/
		
		System.out.println(num + "��(��) " + (num > 0 ? "����̴�" : "����� �ƴϴ�"));
		
	}
	
	public void method2() {
		
		// ����ڰ� �Է��� �������� ¦������ �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "¦���̴�" : "Ȧ���̴�";
		
		System.out.println(num + "��(��) " + result);
		
	}
	
	public void method3() {
		
		// ����ڰ� �Է��� �����ڰ� �빮������ �ƴ��� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		String result = (ch >= 'A' && ch <= 'Z') ? "�빮���̴�" : "�빮�ڰ� �ƴϴ�";
		System.out.println(ch + "��(��) " + result);
		
	}
	
	
	public void method4() {
		// ���� ������ ��ø ���
		
		// ����ڰ� �Է��� �������� �������, ��������, 0���� ��Ȯ�� �Ǻ� �� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է� : ");
		int num = sc.nextInt();
		
		String result = (num > 0 ? "����̴�" : (num == 0 ? "0�̴�" : "�����̴�"));
		System.out.println(num + "��(��) " + result);
		
	}
	
	public void method5() {
		// �� �������� + �Ǵ� -�� ���ڸ� �ϳ� �Է¹޾�
		// +�� ��� �� �������� ���� ������, -�� ��� �� �������� ���� ������, �߸��Է�������� "�߸��Է��߽��ϴ�."
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("������ �Է�(+ or -) : ");
		char op = sc.nextLine().charAt(0);
									// "30"
		String result = (op == '+' ? num1 + num2 + "" : (op == '-' ? num1 - num2 + "" : "�߸��Է��߽��ϴ�"));
		
		
		System.out.println("��� : " + result);
		
		
	}
	
	
	
}





