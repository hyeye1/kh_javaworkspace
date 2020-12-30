package com.kh.variable;

public class E_Printf {
	
	public void printfMethod() {
		
		/*
		 * System.out.println(����ϰ����ϴ°�); => �� ��� �� �� �� ����
		 * System.out.print(����ϰ����ϴ� ��);   => �� ��¸� �ϰ� ��
		 * 
		 * System.out.printf("����ϰ����ϴ�����(����)", ������� ����ϰ����ϴ� ��, ��, ��, ...);
		 * => ����(����)�� ���缭 ������ ��¸� �ϰ� ��
		 * 
		 * %d : ����
		 * %f : �Ǽ�
		 * %c : ����
		 * %s : ���ڿ�
		 * 
		 */
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// xx, xx
		System.out.println(iNum1 + ", " + iNum2);
		System.out.printf("%d, %d\n", iNum1, iNum2);
		
		// xx + xx = xxx
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);
		
		System.out.printf("%5d\n", iNum1); // 5ĭ�� ���� �� ���������� (������ ����)
		
		double dNum = 4.57;
		
		System.out.printf("%f\n", dNum); // %f - �Ҽ��� �Ʒ� 6°�ڸ����� ������
		System.out.printf("%.1f\n", dNum); // .1 - �Ҽ��� �Ʒ� �� °�ڸ����� ������ �Ҳ��� ���� (�ݿø�)
		
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%C %S\n", ch, str); // �빮�ڷε� ��°���
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
