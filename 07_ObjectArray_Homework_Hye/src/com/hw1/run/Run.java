package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// ��ü�迭�� ũ�� 3���� �Ҵ� �� �� 3���� �����ڸ� ���� �̿��Ͽ� ��ü ���� �� ���
		
		Employee arr[] = new Employee[3];
		arr[0] = new Employee();
		arr[1] = new Employee(1, "ȫ�浿", 19, 'M', "01022223333", "���� ���");
		arr[2] = new Employee(2, "������", "������", "����", 20, 'F', 1000000, 0.01, "01011112222", "���︶��" );
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		System.out.println("=================================================================");
		
		// 3���� ��ü �� ���� ���� �ʵ忡 ���� ���� ���� �� ���
		arr[0] = new Employee(0, "�踻��", "������", "����", 30, 'M', 3000000, 0.2, "01055559999", "���󵵱���");
		arr[1].setDept("��ȹ��");
		arr[1].setJob("����");
		arr[1].setSalary(4000000);
		arr[1].setBonusPoint(0.3);
		
		for(int i=0; i<arr.length-1; i++) {
			System.out.println(arr[i].information());
		}
		
		System.out.println("=================================================================");
		
		// ���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
		// ���� = (�޿� + (�޿� * ���ʽ�����Ʈ)) * 12
		int total = 0;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			total = (arr[i].getSalary()+(int)(arr[i].getSalary()*arr[i].getBonusPoint()))*12;
			System.out.println(arr[i].getEmpName() + "�� ���� : " + total);
			
			sum += total;
		}

		System.out.println("=================================================================");

		// 3���� ������ ���� ����� ���Ͽ� ���
		System.out.println("�������� ������ ��� : " + sum /3 );

	}

}
