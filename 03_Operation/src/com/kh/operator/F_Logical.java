package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	
	/*
	 * * �� ������ 
	 * - �� ���� ������ �����ϴ� ������
	 * - ���� (��������) ����	=> ����
	 * 
	 * ���� && ���� : ����, ������ �� �� true�� ��� => true
	 * ���� || ���� : ����, ������ �� �߿� �ϳ��� true�� ��� => true
	 */
	
	public void method1() {
		// ����ڰ� �Է��� �������� ���"�̸鼭(�̰�)" ¦������ Ȯ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �� �� �Է� : ");
		int num = sc.nextInt();
		
		// ����ڰ� �Է��� num���� ����̸鼭 ¦���Դϱ�? 
		boolean result = (num > 0) && (num % 2 == 0);
		// && �ǹ� : �׸���, ~�̰�, ~�̸鼭
		
		System.out.println("����ڰ� �Է��� ���� ����鼭 ¦���Դϱ� : " + result);
		
	}
	
	public void method2() {
		// ����ڰ� �Է��� �������� 1 �̻� 100 ������ ������ Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �� �Է� : ");
		int num = sc.nextInt();
		
		// ����ڰ� �Է��� �������� 1�̻�"�̰�" 100��������
		//boolean result = (1 <= num <= 100);
		boolean result = (num >= 1) && (num <= 100);
		
		System.out.println("����ڰ� �Է��� ���� 1�̻� 100�����Դϱ� : " + result);
		
		/*
		 * && (and) : �ΰ��� ������ ��� true���߸�  && ������ ������� ���������� true
		 * 			    �� �� �ϳ��� false�� �ȴٸ� && ������ ������� false
		 */
	}
	
	public void method3() {
		
		// ����ڰ� �Է��� ���� y"�̰ų�(�Ǵ�)" Y���� Ȯ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Ͻ÷��� y �Ǵ� Y�� �Է��ϼ��� : ");
		char ch = sc.nextLine().charAt(0);
		
		// ����ڰ� �Է��� ���� y �Ǵ� Y����
		//boolean result = 'y' == ch == 'Y';
		boolean result = (ch == 'y') || (ch == 'Y');
		// || (or) : �Ǵ�, ~�̰ų�
		
		System.out.print("����ڰ� �Է��� ���� y�Ǵ� Y�Դϱ� : " + result);
		
		/*
		 * || (or) : �� ���� ���� �� �ϳ��� true�� �ִٸ� ���� ����� true
		 *           �� ���� ���� ��� false�� ��� ���� ����� false
		 */
		
	}
	
	/*
	 * && : �� ���� ������ ��� true���� ������� true�̴�. (AND) 
	 * 
	 * true && true		=> true
	 * true && false 	=> false
	 * false && true	=> false
	 * false && false	=> false
	 * 
	 * => && �����ڸ� �������� ���� ����� false���� ���´ٸ� ���� ������ ���� ���������� �ʴ´�.
	 * 
	 * || : �� ���� ������ �ϳ��� true�� ������� true�̴�. (OR)
	 * 
	 * true || true 	=> true
	 * true || false	=> true
	 * false || true	=> true
	 * false || false	=> false
	 * 
	 * => || �����ڸ� �������� ���� ����� true���� ���´ٸ� ���� ������ ���� ���������� �ʴ´�.
	 * 
	 */
	public void method4() {
		
		int num1 = 10;
		
		boolean result1 = (num1 < 5) && (++num1 > 0);
		
		System.out.println("result1 : " + result1);
		System.out.println("&& ���� �� num1 : " + num1);
		
		
		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		
		System.out.println("result2 : " + result2);
		System.out.println("|| ���� �� num2 : " + num2);
		
	}
	
	
	
	
	
	

}





