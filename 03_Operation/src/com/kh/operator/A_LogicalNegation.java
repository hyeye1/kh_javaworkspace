package com.kh.operator;

public class A_LogicalNegation {
	
	public void method() {
		/*
		 *  * ������������ (!) - ���׿�����
		 *    !���� => ����
		 *    
		 *    ����(true/false)�� �ݴ�� �ٲ��ִ� ������
		 */
		
		System.out.println("true�� ���� : " + !true);
		System.out.println("false�� ���� : " + !false);
		
		boolean b = true;
		boolean b2 = !b;
		
		System.out.println("b2 : " + b2);
		
	}

}
