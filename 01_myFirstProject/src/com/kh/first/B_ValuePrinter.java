package com.kh.first;

/*
 * ** ��Ģ  **
 * 1. Ŭ������ => �빮�ڷ� ����
 * 2. ��Ű���� => �ҹ��ڷ� ���� 
 * 3. �޼ҵ�� => �ҹ��ڷ� ����
 * 4. ������ => �ҹ��ڷ� ����
 * 
 * ���������� ���Ѿߵɰ�! : �׻� �ǹ��ְ�����! �������θ�! �� �ܾ���� ù ���ڴ� �빮�ڷ�! == ��Ÿǥ���
 * 
 * ex) Ŭ������ Valueprinter	=> ValuePrinter
 *     �޼ҵ�� testprint		=> testPrint
 * 
 */

public class B_ValuePrinter { // ����Ŭ������(��Ű������ ����) : com.kh.first.ValuePrinter
	
	
	// ���1 : �ڹٿ��� ����ϴ� ������ ����ϴ� ���
	public void printValue() {
		
		// 1. ���� (true/false) => ����ǥ ����
		System.out.println(true);
		System.out.println(false);
		
		// 2. ���ڰ� (������/�Ǽ���) => ����ǥ ����
		System.out.println(10);
		System.out.println(12.14);
		//    ������� �� ����� ���
		System.out.println(1235 + 124);
		
		// 3. ����(�ѱ���)�� => Ȭ����ǥ �̿�
		System.out.println('a');
		System.out.println('��');
		//System.out.println('������');
		
		// 4. ���ڿ�(��������)�� => �ֵ���ǥ �̿�
		System.out.println("������");
		System.out.println("�ȳ��ϼ���");
		System.out.println("10");
		
		//    ���ڿ��� �׿��� ������ �������� ���� --> �ϳ��� ���ڿ�ȭ ��! (���̾����鼭 ���ڿ��� �ǹ���)
		System.out.println("����" + 'a');
		System.out.println(23 + "�ݰ����ϴ�" + 123);
		System.out.println("�ٽø�����" + 1 + 2);		
		
	}
	
	
	// ���2. ���ڿ��� ���ڰ��� ���������� ��� ��� ���
	public void sumStringNumber() {
		
		System.out.println(9 + 9);		// 18
		System.out.println(9 + "9");	// "99"
		System.out.println("9" + 9);	// "99"
		System.out.println("9" + "9");	// "99"
		
		System.out.println(9 + 9 + 9);		// 18 + 9 	=> 27
		System.out.println(9 + 9 + "9");	// 18 + "9" => "189"
		System.out.println(9 + "9" + 9);	// "99" + 9	=> "999"
		System.out.println("9" + 9 + 9);	// "99" + 9 => "999"
		System.out.println("9" + (9 + 9));	// "9" + 18	=> "918"
		
		// ����Ǵ� ������ �����ض�!
	}
	
	
	
	

}









