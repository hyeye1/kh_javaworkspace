package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
	/*1.3 ���� �л� ������ ����� �� ��
		�� ��ü �迭�� �Ҵ��ϰ� �Ʒ��� ��
		�뵥���͸� �����Ͽ� 3 ���� �л� ��
		ü ���� �� �ݺ����� ���� ���
		2.
		�ִ� 10 ���� ��� ������ �����
		�� �ְ� ��ü �迭�� �Ҵ��ϰ� �ݺ�
		���� ����Ͽ� Ű����� ��� ������
		�Է� �޵��� ����
		2
		�� ������ ��� ������ �Է� �޾�
		�� ��ü�� �����ϰ� ������� ��ϵ�
		������� ���� ���
		*/
		
		// 3���� �л� ������ ����� �� �ְ� ��ü �迭 �Ҵ� (Student[])
		// ���� ��뵥���� �����Ͽ� 3���� �л� ���� �ʱ�ȭ
		// ���� �л� ���� ��� ���
		Student[] arrS = new Student[3];
		arrS[0] = new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�");
		arrS[1] = new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		arrS[2] = new Student("������", 23, 167.0, 45.0, 4, "��������а�");
		
		for(int i = 0; i<arrS.length; i++) {
			System.out.println(arrS[i].information());
		}
		
		System.out.println();
		// �ִ� 10���� ��� ������ ����� �� �ְ� �迭�� �Ҵ� (Employee[])
		// ������� ������ Ű����� ��� �Է� �ް� --> while(true) ���� �ݺ����� ����
		// �Է¹��� �������� ������ �Ű����� �����ڸ� �̿��Ͽ� ��ü�迭�� ��ü ����
		// �� �� �߰� �� ������ ī��Ʈ��
		Scanner sc = new Scanner(System.in);
		
		Employee[] arrE = new Employee[10];
		
		int count = 0;
		while(true) {
			
			System.out.print("�̸�: ");
			String name = sc.nextLine();
			
			System.out.print("����: ");
			int age = sc.nextInt();
			
			System.out.print("����: ");
			double height = sc.nextDouble();
			
			System.out.print("������: ");
			double weight = sc.nextDouble();
			
			System.out.print("�޿�: ");
			int salary = sc.nextInt();
			sc.nextLine();
			
			System.out.print("�μ�: ");
			String dept = sc.nextLine();
			
			
			arrE[count++] = new Employee(name, age, height, weight, salary, dept);
			

			System.out.print("��� �߰��Ͻðڽ��ϱ�(Y/N)? ");
			char answer = sc.nextLine().charAt(0);
			if(answer=='Y'|| answer=='y') {	
			} else if(answer=='N' || answer=='n') {
				break;
			}
			
			
		}
		
		// ��� �߰��� ������ �����, ��ҹ��� ������� ��y���̸� ��� ��ü �߰�
		// ��n���� ��� �� �̻� �׸� �Է� �޵���..
		
		// �迭�� ��� ������� ������ ��� ���
		for(int i= 0; i<count; i++) {
			System.out.println(arrE[i].information());
		}
		
		

	}

}
