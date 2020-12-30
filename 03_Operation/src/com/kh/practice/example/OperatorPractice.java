package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	// �ǽ����� 1
	// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : " );
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����." : "����� �ƴϴ�";
		System.out.println(result);
		
	}
	
	// �ǽ����� 2
	// Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, 
	// ����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����  : ");
		int num = sc.nextInt();
		
		String result = num > 0 ? "�����" : (num < 0 ? "������" : "0�̴�");
		System.out.println(result);
	}
	
	
	// �ǽ����� 3
	// Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();

		String result = num % 2 == 0 ? "¦����" : "Ȧ����";
		System.out.println(result);
	}
	
	
	// �ǽ����� 4
	// ��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް� 
	// 1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���.
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();

		System.out.println("1�δ� ���� ���� : " + candy / people);
		System.out.println("���� ���� ���� : " + candy % people);
	}
	
	
	// �ǽ����� 5
	// Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
	// �� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int classNum = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		String student = (gender == 'M') ? "���л�" : "���л�";
	
		System.out.println();
		System.out.println(	grade + "�г� " + classNum + "�� " + num + "�� " 
						+ name + " " + student + "�� ������ " + score + "�̴�.");
	}
	
	
	// �ǽ����� 6
	// ���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����, 
	// ����(19�� �ʰ�)���� ����ϼ���.
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = (age <= 13) ? "���" : (age <= 19 ? "û�ҳ�" : "����");
		System.out.println(result);
	}
	
	
	// �ǽ����� 7
	/*
	����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�, 
	�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
	�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ� 
	�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���
	*/
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int kor = sc.nextInt();
		System.out.print("���� : ");
		int eng = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();

		System.out.println();		
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		// int / int�� �ϰԵǸ� �� ��� ���� int�� �ް� �ȴ�. �Ҽ��� ǥ���� ������� ������ �ս��� �߻��Ѵ�.
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		
		String result = (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) ? "�հ�" : "���հ�";
		System.out.println(result);
		
	}
	

	// �ǽ����� 8
	// �ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (- ����) :  ");
		String str = sc.nextLine();
		
		char pId = str.charAt(7);
		
		String gender = (pId == '1' || pId == '3') ? "���� " : 
						(pId == '2' || pId == '4') ? "����" : "�߸� �Է��ϼ̽��ϴ�";
		System.out.println(gender);
		
	}
	
	
	// �ǽ����� 9
	/*
	Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
	�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
	�ƴϸ� false�� ����ϼ���.
	(��, num1�� num2���� �۾ƾ� ��)
	*/
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("����1 : ");
		int num1 = sc.nextInt();

		System.out.print("����2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է� : ");
		int input = sc.nextInt();
		
		System.out.println((input <= num1) || (input > num2));
	}

	
	// �ǽ����� 10
	// 3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();

		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();

		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();

		boolean isTrue = (num1 == num2) && (num2 == num3);
		System.out.println(isTrue);

	}
	
}
