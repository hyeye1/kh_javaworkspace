package com.kh.variable;

public class D_Casting {
	
	// ����ȯ : ���� �ڷ����� �ٲٴ� �� 
	/*
	 * * ��ǻ�Ϳ����� �� ó�� ��Ģ
	 * 1. ���� ������(=)�� �������� ���ʰ� �������� ���� �ڷ����̿��ߵȴ�.
	 *    => ��, ���� �ڷ����� �ش��ϴ� ���� ���� ������! 
	 *    => �ٸ� �ڷ����� ���� �����ϰ��� �Ѵٸ� "����ȯ"�� �ʼ�!!
	 *    
	 *    �ڷ��� ������ = (�ڷ���)��;
	 *    
	 * 2. ���� �ڷ��������� ������ ����, �Ӹ� �ƴ϶� �������� ���� �ڷ������� ����!
	 *    �� + (�ڷ���)��
	 * 
	 * * ����ȯ ����
	 * 1. �ڵ� ����ȯ => �ڵ����� ����ȯ�� ����Ǳ� ������ ���� ���� ����ȯ �� �ʿ� ����
	 * 
	 * 2. ����(�����) ����ȯ => �ڵ� ����ȯ�� ���� �ʾ� ���� ���� ����ȯ�� �ؾߵ�
	 *    [ǥ����]   (�ٲ��ڷ���)��
	 *    
	 *    (�ٲ��ڷ���)�� cast������ ��, ����ȯ ������ ��� ��
	 * 
	 * * ���ǻ���
	 * - boolean�� ����ȯ�� �Ұ� (��, true �Ǵ� false������ ���� �� ����)
	 */
	
	// �ڵ� ����ȯ
	public void autoCasting() {
		
		/*
		 * * �ڵ� ����ȯ
		 * ����� ���� �ڷ����� ū �ڷ��� ���� ����(����, ��� ��)��
		 * �ڵ����� ���� �ڷ����� ū �ڷ����� ��ȯ��
		 */
		
		// 1. int(4byte) --> double(8byte)
		int i1 = 10;
		double d1 = /*(double)*/i1; // 10 => 10.0
		
		System.out.println("d1 : " + d1);
		
		
		int i2 = 12;
		double d2 = 3.3;
		
		double result = /*(double)*/i2 + d2; // 12.0 + 3.3 => 15.3
		
		System.out.println("result : " + result);
		
		
		// int(4byte) --> long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		System.out.println("l3 : " + l3);
		
		int i4 = 22345;
		long l4 = 154678795L;
		
		long result2 = /*(long)*/i4 + l4;
		
		System.out.println("result2 : " + result2);
		
		
		// Ư�� 3. long(8byte) --> float(4byte) 
		// float�� long�� ���� ���� �� �ִ� ���� ������ �� ŭ
		long l5 = 10000000000L;
		float f5 = /*(float)*/l5; // 10000000000.0
		System.out.println("f5 : " + f5);
		
		// char => 0~65xxx
		// Ư�� 4. char(2byte) <--> int(4byte)
		char ch = 65; // 'A'
		System.out.println("ch : " + ch);
		
		//ch = -65; // �������� ���� �Ұ� 
		
		int num = 'A';
		System.out.println("num : " + num);
		
		// �� ���ڸ����� ������ ���ڰ� ����������!
		// �ƽ�Ű�ڵ�ǥ(0~127, ����/����/Ư������), �����ڵ�ǥ(0~65xxx, ����/����/Ư������/�ѱ�)
		
		System.out.println((int)'��');
		
		//int sum = 'A' + 10;
		char sum = 'A' + 10;
		System.out.println("sum : " + sum);
		
		
		// Ư�� 5. byte, short ���� ����
		byte b1 = 1;
		byte b2 = 10;
		
		//byte result3 = b1 + b2; // ���� �߻� => byte�� short�� ����� ������ int(4byte)�� ó��
		byte result3 = (byte)(b1 + b2); // => ������ ����ȯ �ϸ� ���� ����
		System.out.println("result3 : " + result3);	
		
	}
	
	
	// ��������ȯ
	public void forceCasting() {
		
		// ��������ȯ : ū ũ���� �ڷ����� ���� ũ���� �ڷ������� �ٲٴ°� 
		
		// double(8byte) --> float(4byte)
		float f = 4.0f;
		System.out.println("f : " + f);
		
		double d2 = 4.0;
		float f2 = (float)d2;
		System.out.println("f2 : " + f2);
		
		// double(8byte) --> int(4byte)
		double d3 = 10.89;
		int i3 = (int)d3;
		System.out.println("i3 : " + i3);
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + dNum; // 10.0 + 5.89 => 15.89 double��
		
		// �ذ���1. ���� ����� int������ ��������ȯ
		int iSum = (int)(iNum + dNum); // (int)15.89 => 15
		System.out.println("iSum : " + iSum);
		// �Ǽ����� ���������� ��������ȯ�� => ������ �ս��� �߻��� �� ����!! 
		
		// �ذ���2. dNum���� int������ ��������ȯ
		int iSum2 = iNum + (int)dNum; // 10 + 5 => 15 int��
		System.out.println("iSum2 : " + iSum2);
		
		// �ذ���3. �׳� �������� double�� ���
		double dSum = iNum + dNum;
		System.out.println("dSum : " + dSum);
		
		
		
		
		
	}
	
	
	
	

}
