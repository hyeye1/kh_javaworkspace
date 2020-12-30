package com.kh.variable;

// �ٸ� ��Ű����� ������ �̸��� Ŭ������ ���� �� ����!!
public class A_Variable { // com.kh.variable.A_Variable
	
	/*
	 *  * �н���ǥ
	 *  1. ������°� ����
	 *  2. ������ �� ��ߵǴ���
	 *  3. ������ ��� ����Ǵ���
	 *  4. �������� ��� ������ �Ǵ��� (���� ��� ��Ģ == ���ַ̹�)
	 */
	
	public void printVariable() {
		
		System.out.println("== ������� �� ==");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println((100 + 10) * 10 - 10);
		System.out.println(((100 + 10) * 10 - 10) / 10);
		// ������� �� ��µǳ� ���� �ǹ����� �ľ��ϱ� ���..
		
		// 1. ������? => ��� ���� �޸𸮻� ����ϱ� ���� �����̴�. (�ڽ�)
		int point = 100;		// ����Ʈ
		int bonus = 10;			// ���ʽ�
		int personCount = 10;	// ������
		int fees = 10;			// ����
		
		System.out.println("== ������� �� ==");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println((point + bonus) * personCount - fees);
		System.out.println(((point + bonus) * personCount - fees) / personCount);
		
		System.out.println(point);
		
		/*
		 * 2. ������ ����ϴ� ����
		 * -  �켱������ ���� �ǹ̸� �ο��س����� �ϴ� �������� ��� (������ ����)
		 * -  �ѹ� ���� �����صΰ� ��������� ����� �������� ���
		 * -  ���������� �����ϰ� �ϱ����� �������� ���
		 */
		
	}
	
	
	public void declareVariable() {
		
		//System.out.println(point); �ٸ� ������ �ִ� ������ ������ �� ����!
		
		/*
		 * 3. ������ ���� (����� ���� ���� ������ �޸� ������ Ȯ���� ���� ���� == ����(�ڽ�)����� ����)
		 * 
		 * [ǥ����] �ڷ��� ������;
		 * 
		 * * �ڷ��� : � ���� ��Ƴ���, ��������� ũ���� ���� ��Ƴ����� ���� ����(�ڽ�)�� ũ�� �� ����� ���ϴ� �κ�
		 * 
		 * * ��������
		 * - �������� �ݵ�� ù ���ڴ� �ҹ��ڷ�, ���� �ܾ�� ���� �ִ� ��� ��Ÿǥ���
		 * - �ش� ����({})�� ������ ������ �ش� ���������� �� �� ����! (��, �ٸ� �޼ҵ忡���� ���� ����) == ��������
		 * - �ش� ����({})�� ������ ���������� ���� �Ұ� (�ߺ��ƴٴ� ���� �߻� duplicate)
		 */
		
		// 1. ����
		boolean isTrue; 	// 1byte
		
		// 2. ������
		// 2_1. ������
		byte bNum;			// 1byte
		short sNum;			// 2byte 
		int iNum;			// 4byte => �������� �� ���� ��ǥ���� �ڷ���(�⺻��) -21��xxx ~ 21��xx
		long lNum;			// 8byte
		
		// 2_2. �Ǽ���
		float fNum;			// 4byte
		double dNum;		// 8byte => �Ǽ����� �� ���� ��ǥ���� �ڷ���(�⺻��) float���� �� ��Ȯ�� ���� ���� �� �ֱ� ����
		
		// 3. ����(�ѱ���)��
		char ch;			// 2byte 
		
		//---------- ��������� �⺻�ڷ���(8��) ----------
		
		// 4. ���ڿ� (�����ڷ���) => ����� ��Ư 
		String str;
		
		
		/*
		 * * ������ �� ����(���)
		 * 
		 * [ǥ����] ������ = ��;
		 */
		isTrue = true;
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L; 		// long�� ������ �� �������� �ڿ� l �Ǵ� L�� ���δ�! (L�� �� ������)
		fNum = 4.0f;	// �ݵ�� f�� �ٿ����� 
		dNum = 8.0;
		ch = 'A';
		ch = '��';
		//ch = "B";
		str = "ABC";
		str = "B";
		
		// ** ������ ȣ���ؼ� ��䰪�� ���
		// isTrue�� �� : true
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		// sNum, iNum, lNum, fNum, dNum, ch, str
		
		//int iNum;
		int a;
		int b;
		int c;
		
		
	}
	
	public void initVariable() {
		/*
		 * ���� �޼ҵ忡���� ���� ���� �Ŀ� ���� �����ߴٸ�
		 * ������ ������ ����� ���ÿ� �� ����(�ʱ�ȭ)
		 * 
		 * [ǥ����] �ڷ��� ������ = ��;
		 */
		
		// �⺻�ڷ��� 
		// 1. ���� 
		boolean isTrue = false;
		
		// 2_1. ������ (������)
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
				
		// 2_2. ������ (�Ǽ���)
		float fNum = 4.0f;
		double dNum = 8.0;
		
		// 3. ����(�ѱ���)��
		char ch = '��';
		
		// �����ڷ���
		// 4. ���ڿ�
		String str = "I������";
		
		System.out.println("isTrue�� �� : " + isTrue);
		System.out.println("bNum�� �� : " + bNum);
		System.out.println("sNum�� �� : " + sNum);
		System.out.println("iNum�� �� : " + iNum);
		System.out.println("lNum�� �� : " + lNum);
		System.out.println("fNum�� �� : " + fNum);
		System.out.println("dNum�� �� : " + dNum);
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		iNum = 10;
		System.out.println("����� iNum�� �� : " + iNum);
		
		// ����
		// ��û ū ���� ��ƾ߸� �� �� ������ ���� '_'�� �̿��� �� ����
		// ��, ���ڰ����� ���!!
		int etc = 999_999_999;
		System.out.println(etc);
		
		
	}
	
	
	public void namingRule() {
		
		int number;
		
		// 4. ���� ��� ��Ģ (���ַ̹�)
		
		// 1) ������ �ߺ� �Ұ� => �ߺ��� ���� �߻�
		//short number;
		// 2) ��ҹ��ڴ� ����
		short numBer;
		
		// 3) ����� (�̹� �ڹٿ��� ���ǰ� �ִ� Ű�����) ��� �Ұ� => ���� ���� �߻�
		//int public;
		//int class;
		//int void;
		//int true;
		
		// 4) ���� ��� ���� �ϳ�, ���ڷ� �����ϴ°� �ȵ�! => ���ڷ� ���۽� ���� �߻�
		int age1;
		int age2;
		int a1ge;
		//int 1age;
		
		// 5) Ư������ ��� ���� �ϳ�, _ $ �̿��� Ư������ ��� �Ұ� => ���� �߻�
		int number_1;
		int number$1;
		//int number!1;
		//int number~1;
		
		
		// ��Ÿ ǥ��� (Camel Case) �����ּ���!
		String username;
		String userName; // ���� ����
		
		// �ѱ۵� ��밡���ϱ� �ϳ�, �������� ���ּ���!
		int ����;
		int score; // ���� ���� 
		// �ѱ��� ������� �ʴ� ȯ�濡���� ���� ����
		
		
	}
	
	/*
	 * ** ���� **
	 * ���� : ��(���ͷ�)�� ����ϱ� ���� ����
	 * 
	 * ��(���ͷ�) : ���α׷��� �ʿ��� ������� �� / �Ǵ� ����ڰ� ���콺 �Ǵ� Ű����� �Է��� ��
	 */
	
	
	
	

}





