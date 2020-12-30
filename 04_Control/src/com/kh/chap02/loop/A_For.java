package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 * < �ݺ��� >
	 * ���α׷� �帧�� �����ϴ� ��� �� �ϳ�
	 * � �����ڵ带 �ݺ������� ���������
	 * 
	 * ũ�� �ΰ��� ������ ���� (for�� / while��(do-while��))
	 * 
	 * * for��
	 * 
	 * for(�ʱ��; ���ǽ�; ������) { // �ݺ�Ƚ���� �����ϱ� ���� �����ϴ� �͵�
	 * 		�ݺ������� �����Ű���� �ϴ� �ڵ�;
	 * }
	 * 
	 * - �ʱ�� : �ݺ����� ���۵� �� "�ʱ⿡ �� �ѹ��� ����Ǵ� ����"
	 *          (���� �ݺ������� ���� ������ ���� �� �ʱ�ȭ ����) ex) int i=0;
	 *          
	 * - ���ǽ� : "�ݺ����� ����� ����"�� �ۼ��ϴ� ����
	 *          ���ǽ��� true�� ��� �ݺ��� ����
	 *          ���ǽ��� false�� �Ǵ� ���� �ݺ��� ���߰� ��������
	 *          (���� �ʱ�Ŀ� ������ ������ ������ ���ǽ��� �ۼ���) ex) i<10;
	 * 
	 * - ������ : �ݺ����� �����ϴ� ���� ���� ���� ��Ű�� ����
	 *          (���� �ʱ�Ŀ� ������ ������ ������ �������� �ۼ���) ex) i++
	 * 
	 * for���� ������ ����
	 * �ʱ�� --> ���ǽ� �˻� --> true�� ��� �ڵ� ���� --> ������
	 *      --> ���ǽ� �˻� --> true�� ��� �ڵ� ���� --> ������
	 *      --> �ٽ� ���ǽ� --> true�� ��� �ڵ� ���� --> ������
	 *      ------------ �� ������ ��� �ݺ� --------------
	 *      --> �ٽ� ���ǽ� --> false�� ��� �ڵ� ����x -------> �ݺ��� ��������
	 * 
	 */
	
	public void method1() {
		// "�ȳ��ϼ���"�� 5�� �ݺ��ؼ� ����ϰ��ǰ..
		/*
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ��ϼ���");
		*/
		
		for(int i=1; i<=5; i++) { // i���� 1�������� 5���� �۰ų� ���������� 1�� ������ ���� �ݺ� ���� (5ȸ)
			System.out.println("�ȳ��ϼ���");
		}
		
		for(int i=0; i<5; i++) { // i���� 0�������� 4���� 1�� ������ ���� �ݺ� ���� (5ȸ)
			System.out.println("�ݰ����ϴ�");
		}
		
		// int i=10; i<15; i++
		// int i=10; i<=14; i++
		
		
		// �� �ܼ��ϰ� �ݺ��Ǵ� Ƚ���� �����ϴ� ǥ����
		// int i=0; i<�ݺ���Ű�����ϴ�Ƚ��; i++
		
	}
	
	public void method2() {
		
		// "�ٽø�����" 5�� ���
		// i���� 1�������� 10���� �Ź� 2�� �����ϴ� ���� �ݺ� ����
		// 1 3 5 7 9	(5ȸ)
		for(int i=1; i<=10; i+=2) {
			System.out.println("�ٽø�����");
		}
		
	}
	
	public void method3() {
		// 10ȸ �ݺ� ����
		for(int i=1; i<=10; i++) {
			System.out.println(i); // �ݺ��� �ȿ��� �ʱ�Ŀ� ���õ� ������ �̿��ϴ� ��찡 ������� ����
		}
		
		// 1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<11; i++) {
			System.out.print(i + "\t"); // \t  ==  tab
		}
		
		
	}
	
	public void method4() {
		// ���� ����
		// 1 2 3 .... 8 9 10   ���  (10ȸ �ݺ�)
		
		// �Ʒ��� �ݺ����� ������ ���� ���
		for(int i=0; i<10; i++) {
			System.out.print(i + 1 + " ");
		}
		
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ݺ���Ű�����ϴ� Ƚ��(����) : ");
		int count = sc.nextInt();
		
		// 1�������� 10���� 1�� ���� => 10ȸ
		// 0�������� 9���� 1�� ���� => 10ȸ
		
		// 1�������� count���� 1�� ���� => countȸ
		// 0�������� count-1���� 1�� ���� => countȸ
		
		if(count > 0) { // �� �Է����� ���
			
			for(int i=1; i<=count; i++) {
				System.out.print(i + " ");
			}
			
		}else { // �߸� �Է����� ���
			System.out.println("������� �Է��ؾߵ˴ϴ�. �߸��Է��ϼ̽��ϴ�.");			
		}
		
	}
	
	
	public void method6() {
		// �ݴ�ε� ����
		// 5ȸ�ݺ� => i���� 5�������� 1���� �Ź� 1�� �����ϴ� ���� �ݺ� (5 4 3 2 1)
		for(int i=5; i>=1; i--) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method7() {
		// 1���� 10 ������ Ȧ������ ���
		// 1 3 5 7 9
		
		// 1�������� 10���� �Ź� 2�� �����ϴ� ���� �ݺ� => 1 3 5 7 9 (5ȸ)
		/*
		for(int i=1; i<=10; i+=2) {
			System.out.print(i + " ");
		}
		*/
		
		// 1�������� 10���� �Ź� 1�� �����ϴ� ���� �ݺ� => (10ȸ)
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	public void method8() {
		// 1���� 10���� �Ź� 1�� �����ϴ� �� ���� ���ϱ�
		//int sum = 1+2+3+4+5+6+7+8+9+10;
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * sum += 2;
		 * sum += 3;
		 * sum += 4;
		 * .....
		 * sum += 9;
		 * sum += 10;
		 * 
		 * ��Ģ => �����ؼ� ���ϰ����ϴ� ���� 1���� ���� 10���� �Ź� 1�� �����Ǵ� ��!
		 * 
		 */
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum += i;
		}
		
		System.out.println("1���� ���� 10������ �� �հ� : " + sum);
		
		
	}
	
	
	public void method9() {
		// 1�������� ����ڰ� �Է��� �������� �հ踦 ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		/*
		 * int sum = 0;
		 * 
		 * sum += 1;
		 * .....
		 * sum += num;
		 * 
		 */
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			sum += i; // sum = sum + i;
		}
		
		// ���� ��� : "1���� ���� xx������ �� �հ� : xxx"
		System.out.println("1���� ���� " + num + "������ �� �հ� : " + sum);
		
	}
	
	
	public void method10() {
		
		// 1���� � �Ź� �޶����� ������(1~10������ ������ ����) ������ ���հ�
		
		/*
		 * Math Ŭ�������� ���ǵǾ��ִ� random() �޼ҵ带 ȣ���ؼ� �Ź� �ٸ� ������ ���� �� ����!
		 * Math.random() ȣ��� => 0.0 ~ 0.9999999999... ������ ������ �߻� (0.0 <= ������ < 1.0)
		 * 
		 */
		
		//int random = Math.random(); // double���̶� �ȵ�
					// 0.0 <=  < 1.0		-->	0.0 ~ 0.99999999..
		
		//int random = Math.random() * 10;
					// 0.0 <=  < 10.0		--> 0.0 ~ 9.99999999..
		
		//int random = Math.random() * 10 + 1;
					// 1.0 <=  < 11.0		--> 1.0 ~ 10.9999999..
		
		int random = (int)(Math.random() * 10 + 1);
					// 1  <=   < 11			--> 1 ~ 10
		
		System.out.println("���� �߻��� ������ : " + random);
		
		
		int sum = 0;
		
		for(int i=1; i<=random; i++) {
			sum += i;
		}
		
		// 1�������� xx������ �� �հ� : xxx
		System.out.println("1�������� " + random + "������ �� �հ� : " + sum);
		
	}
	
	
	public void method11() {
		
		// ����ڿ��� ���ڿ��� �Է¹޾Ƽ� 
		// �� �ε����� �� ���ڸ� �Ź� �̾Ƽ� ���
		// ���� �� "apple"		=> a p p l e
		/*
		 * String str = "apple";
		 * 
		 * a --> str.charAt(0) ���
		 * p --> str.charAt(1) ���
		 * p --> str.charAt(2) ���
		 * l --> str.charAt(3) ���
		 * e --> str.charAt(4) ���
		 * 
		 * apple ���� : 5		strawberry ���� : 10		kiwi ���� : 4
		 * 01234			0123456789			  	0123
		 * 
		 * ��! �������ε��� �� == ���ڿ��� ����-1 == ���ڿ�.length()-1
		 * 
		 * 0���ε����������� �������ε���(���ڿ�.length()-1)���� �Ź� 1�� ������ �� ���� �ݺ� ����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		//System.out.println("���ڿ��� ���� : " + str.length());
		//for(int i=0; i<=str.length()-1; i++) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
			
		}
		
	}
	
	
	public void method12() {
		// ������ �߿� 2�� ���
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * 2 x 3 = 6
		 * ...
		 * 2 x 8 = 16
		 * 2 x 9 = 18
		 * 
		 */
		
		System.out.println("==== 2�� ====");
		for(int su=1; su<=9; su++) {
			//System.out.println("2 x " + su + " = " + 2*su);
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
		
	}
	
	public void method13() {
		// 2�ܺ��� 9�ܱ��� ��� ���
		
		/*
		System.out.println("==== 2�� ====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", 2, su, 2*su);
		}
		System.out.println();
		
		System.out.println("==== 3�� ====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", 3, su, 3*su);
		}
		System.out.println();
		
		System.out.println("==== 4�� ====");
		for(int su=1; su<=9; su++) {
			System.out.printf("%d x %d = %d\n", 4, su, 4*su);
		}
		.....
		*/
		
		for(int dan=2; dan<=9; dan++) {
			
			System.out.println("==== " + dan + "�� ====");
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println();
		
		}
	}
	
	
	public void method14() {
		// 1���� ���� 5���� 1�� �����ϴ� ���� ����ϴ°�   3�� �ݺ�
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		// 1 2 3 4 5 
		
		for(int i=1; i<=3; i++) { // ���� �������ִ� for��
			
			for(int j=1; j<=5; j++) { // ���� �������ִ� for��
				System.out.print(j + " ");
			}
			System.out.println();
			
		}
		
	}
	
	public void method15() {
		// *****
		// *****
		// *****
		// *****
		
		//System.out.print("*")
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
	
	public void method16() {
		//		  i  j
		// 1***   1�� 1���� ��� 1 ���
		// *2**   2�� 2���� ��� 2 ���
		// **3*   3�� 3���� ��� 3 ���
		// ***4   4�� 4���� ��� 4 ���
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if(i == j) { // �������
					System.out.print(i);
				}else { // * ���
					System.out.print("*");
				}
				
			}
			System.out.println();
			
		}
			
	}
	
	public void method17() {
		// 0�� 0�� ~ 23�� 59��  ���� ���
		
		// 0�� 0��
		// 0�� 1��
		// ...
		// 0�� 59��
		
		// 1�� 0��
		// 1�� 1��
		// ....
		// 1�� 59��
		
		// 2�� 0��
		// 2�� 1��
		// ... 
		// 2�� 59��
		
		// .... 
		
		// 23�� 0��
		// 23�� 1��
		// ..
		// 23�� 59��
		
		// �ð��� 0�� ~ 23�ñ��� 1�� ����		 => �ٱ��� for��
		// ���� �Žð����� 0�� ~ 59�б��� 1�� ���� => ���� for��
		
		for(int hour=0; hour<24; hour++) {
			
			for(int min=0; min<60; min++) {
				System.out.println(hour + "�� " + min + "��");
			}
			
			System.out.println();
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
