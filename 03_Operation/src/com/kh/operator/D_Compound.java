package com.kh.operator;

public class D_Compound {

	/*
	 * * ���մ��Կ����� : ��������ڿ� ���Կ����ڸ� �Բ� ����ϴ� ������
	 * 				   ����ó�� �ӵ��� �ξ� �����Ƿ� ����� ������
	 * 
	 *   += -= *= /= %=
	 *   
	 *   a = a + 3;	   ==   a += 3;
	 *   a = a - 3;	   ==   a -= 3;
	 *   ....
	 * 
	 */
	public void method() {
		
		int num = 12;
		
		System.out.println("���� num : " + num);
		
		// num�� 3���� ��Ű��
		num = num + 3;
		System.out.println("3������Ų num : " + num);
		
		// num�� �ٽ� �� 3 ���� ��Ű��
		num += 3;
		System.out.println("�� 3������Ų num : " + num);
		
		// num�� 5 ���ҽ�Ű��
		num -= 5; // num = num - 5;
		System.out.println("5���ҽ�Ų num : " + num);
		
		// num�� 6�� ������Ű��
		num *= 6; // num = num * 6;
		System.out.println("6�� ������Ų num : " + num);
		
		// num�� 2�� ���ҽ�Ű��
		num /= 2;
		System.out.println("2�� ���ҽ�Ų num : " + num);
		
		// num�� 4�� ���������� ������
		num %= 4;	// num = num % 4;
		System.out.println("num�� 4�� ���� ������ : " + num);
		
			
		String str = "Hello";
		System.out.println("str : " + str);
		
		//str = str + "World";
		str += "World";
		System.out.println("���� str : " + str);
		
	}
	
	
}
