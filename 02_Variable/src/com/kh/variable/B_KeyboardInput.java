package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	
	// ����ڰ� Ű���带 ���� �Է��� ���� ������ �� ������ ����ϴ� ���
	
	public void inputScanner1() {
		/*
		 * Ű����� �Է��� ���� �������� ���ؼ���
		 * �ڹٿ��� �̹� �����ϰ� �ִ� java.util.Scanner��� Ŭ������ 
		 * ������ �ִ� �޼ҵ���� �̿��ؾ� ��
		 * 
		 * �ٸ� Ŭ������ �ִ� �޼ҵ带 ȣ���ϰ��� �� ��
		 * 1) Ŭ���� ���� (new)
		 * 2) �ش� Ŭ������ �ִ� �޼ҵ� ȣ�� 
		 * 
		 */
		
		//java.util.Scanner sc = new java.util.Scanner(System.in); // --> System.in : �Է¹��� ���� ����Ʈ������ �޾Ƶ��̰ڴٶ�� ��
		Scanner sc = new Scanner(System.in);
		
		// �����ϰ� ������� ����(�̸�, ����, Ű)�� �Է� �ް� �� �Է¹��� ������ ����ϴ� ���α׷�
		// ���� �Է¹ް��� �ϴ� ������ ���� ����ؼ� ����
		System.out.print("����� �̸��� �����Դϱ� : ");
		
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� �޼ҵ� (sc.next(), sc.nextLine())
		//sc.next(); // ��, �̷��Ը� �ۼ��ϸ� �Էµ� ���� ������ ���� ���� ����
		
		//String name = sc.next(); 
		// next() : ����ڰ� �Է��� �� �� ���� �������� ���� �о��! 
		//          (���� �ּҰ��� ������ ���Ե� �������ִ� ���ڿ��� �������� ����!)
		
		String name = sc.nextLine();
		// nextLine() : ����ڰ� �Է��� �� ��δ� �о��!
		
		System.out.print("����� ���̴� ����Դϱ�(���ڸ�) : ");
		int age = sc.nextInt();
		// nextInt() : ����ڰ� �Է��� �� ������ �о��! (������ �ƴ� ���ڵ� ���� �Էµ��� ��� �����߻�)
		
		System.out.print("����� Ű�� �� cm�Դϱ� (�Ҽ��� �Ʒ� ù° �ڸ�����) : ");
		double height = sc.nextDouble();
		// nextDouble() : ����ڰ� �Է��� �� �Ǽ��� �о��! (���ڵ� ���� �Էµ��� ��� �����߻�)
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		
	}
	
	
	public void inputScanner2() {
		
		Scanner sc = new Scanner(System.in);
		
		// �̸�, ����, �ּ�, Ű
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("����(���ڸ�) : ");
		int age = sc.nextInt();
		
		// ���ۿ� �����ִ� '����'�� ����ִ� ������ �ϸ��!!
		sc.nextLine();
		
		/*
		 * sc.nextLine() : ���ۿ��� ���� ������ �� '����'�� ����ִ� ������ ����
		 * �� ���� next~~~() : ���ۿ��� ���� �������� ���� ('����'�� ������� ���� == '����'�� ������ �������� ��)
		 * 
		 * sc.nextInt() �Ŀ� sc.nextLine() �޼ҵ尡 ȣ��ȴٸ� 
		 * ���ۿ� �����ִ� ���Ͷ����� sc.nextLine() �ٷ� ����ǹ���!!
		 * 
		 * ��� : sc.next~~() �޼ҵ� �ڿ� �ٷ� sc.nextLine() �޼ҵ尡 ���� �� ������ ���ۿ� �����ִ� '����'�� ���ִ� ���� �ʿ�!
		 *      ��, �� ���̿� sc.nextLine() �޼ҵ带 �ѹ� �� ȣ��������
		 */
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű(cm) : ");
		double height = sc.nextDouble();
		
		/*
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		*/
		
		// xxx���� xx���̸�, ��� ���� xxxxxxx�̰�, Ű�� xxxxcm�Դϴ�.
		//System.out.println(name + "���� " + age + "���̸�, ��� ���� " + address + "�̰�, Ű�� " + height + "cm�Դϴ�.");
		System.out.printf("%s���� %d���̸�, ��� ���� %s�̰�, Ű�� %.1fcm�Դϴ�.", name, age, address, height);
		
	}
	
	
	public void inputScanner3() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� => sc.nextLine()
		// ���� => sc.nextInt()
		// �Ǽ� => sc.nextDouble()
		
		System.out.print("�̸� : ");
		String name = sc.nextLine(); // "ȫ�浿"
		
		System.out.print("����(��/��) : ");
		//char gender = sc.nextChar(); // nextChar �޼ҵ�� ���� ���� ����
		char gender = sc.nextLine().charAt(0);
		// ����ڰ� �Է��� ���� ���ڿ��� ������ �� �� ���� ���ϴ� �ε����� ���ڰ��� �����ؼ� ���
		// * �ε��� == 0������ ����
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		/*
		 * xxx���� ��������
		 * ���� : x
		 * ���� : xx
		 * Ű : xxxcm
		 */
		System.out.println(name + "���� ��������");
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("Ű : " + height + "cm");
	}
	
	
	/*
	 * * ���� *
	 * 1. �ܼ�â��(�����) ����ϱ� ���� : System.out.println(����ϰ��� �ϴ� ��) �޼ҵ� ȣ��
	 * 2. �ܼ�â��(Ű����) �Է¹ޱ� ���� : Scanner sc = new Scanner(System.in);
	 * 							   sc.nextLine(), sc.next(), sc.nextInt(), sc.nextDouble(), ...
	 * 	  
	 *    '����' ���� �Է¹ޱ� ���� sc.nextLine()�� ���� ���ڿ��� ������ �� ��
	 *    �� �ڿ� .charAt(�����ϰ����ϴ��ε���)�� ���� �ش� �ε����� ���� ���� ���� �� ����
	 *    
	 * * ���ǻ��� *
	 * sc.nextXXX() �޼ҵ� �ڿ� sc.nextLine() �޼ҵ尡 ���� �� ��� 
	 * �� ���� ���ۿ� �����ִ� '����' ����ִ� ������ sc.nextLine() �޼ҵ� �ѹ��� ȣ��
	 * 
	 */
	
	
	
	
	
	
	
	
	
	
	

}
