package com.kh.run;

// ����(import)
import com.kh.first.A_MethodPrinter;

public class RunA { // ���ุ�� ����ϴ� ����� Ŭ����
	
	public static void main(String[] args) {
		
		System.out.println("���α׷� ����!");
		
		// ���� ���� �޼ҵ带 ȣ�� ���ָ��!! ( �޼ҵ��(); )
		// helloPrint(); --> �⺻������ ���� �� Ŭ�������� ���� �޼ҵ带 ã�� ������
		
		// �ٸ� Ŭ������ �ִ� �޼ҵ带 �����ϰ��� �Ѵٸ� ��� �ؾߵɱ�?
		
		// 1) ������ �޼ҵ尡 �����ִ� Ŭ������ ���� "����(new)" ����ߵ�!
		// [ǥ����] Ŭ������ �뺯���̸� = new Ŭ������();
		//A_MethodPrinter a = new A_MethodPrinter();
		// ������!! ��? ���� ��Ű�������� �ش� Ŭ������ ã�� ������ �߻��ϴ� ����
		
		// �ذ���1. �ش� Ŭ������ ���Ű���� �����ִ��� Ǯ Ŭ������(��Ű������ �������̸�)�� ����ϴ� ���
		//com.kh.first.A_MethodPrinter a = new com.kh.first.A_MethodPrinter();
		
		// �ذ���2. �׳� Ŭ�������� ������ �����ϵ� ��, �� Ŭ������ � ��Ű���� �����ִ��� "����"�ϴ� ���
		A_MethodPrinter a = new A_MethodPrinter();
		
		
		// 2) ���� �� �޼ҵ� ����(ȣ��)
		// [ǥ����] �뺯���̸�.�����Ҹ޼ҵ��();
		
		/*
		a.helloPrint();
		a.seeYouPrint();
		a.goodByePrint();
		*/
		
		a.helloPrint();
		
	}

}
