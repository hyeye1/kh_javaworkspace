package com.kh.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	/*
	 * RuntimeException
	 * - ���α׷������ �߻��Ǵ� ���ܵ� (���������� ���������� ����! ����ó�� �� �ʿ����)
	 * 
	 * RuntimeException
	 * - IndexOutOfBoundsException: �߸��� �ε��� ������ ���������� �߻��Ǵ� ���� => �������� �Ǽ�
	 * - ClassCastException : ����� �� ���� ����ȯ�� ������� ��� �߻��Ǥ��� ���� => �������� �Ǽ�
	 * - NullPointerException : ���۷����� ���� null�ӿ��� �ұ��ϰ� ���������� �߻��ϴ� ����
	 * - ArithmeticException : ������ ���꿡�� �θ� 0�ΰ�� �߻��Ǵ� ����
	 * - NegativeArraySizeException : �迭ũ�⸦ �����ϴ� ������ �迭�� ũ�⸦ ������ �������� ��� �߻��Ǵ� ����
	 * - . . .
	 * 
	 * => �̷��� RuntimeException ������ �ֵ��� ����� ���� �����ϱ� ������
	 * �ƽθ� ������ü�� �߻��� �ȵǰԲ� ���ǹ����� ����� �ذᰡ���ϱ�� ��!
	 * ���� ����ó��(���ܰ� �߻������� �ǻ��� ������ ����)�� �ʿ����!
	 * 
	 *
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : �����⿬�꿡�� �θ� 0�ΰ�� �߻�
		
		// ����ڿ��� �ΰ��� �������� �Է¹޾Ƽ� ���������� ���� => ��� ���
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ����(0����) : ");
		int num2 = sc.nextInt();
		
		/*// �ذ��� 1. ���ʿ� ������ü�� �߻��� �� ���� if������ ���ǰ˻� �Ŀ� ����(����ó���� �ƴ�)
		if(num2 != 0) {
			int result = num1 / num2;
			System.out.println("������ ������ : " + result );
		} else {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		*/
		
		// �ذ��� 2. ����ó���� �ذ� (����ó�� == ���ܰ� �߻����� ���� ����ؼ� ������ ������ �����صδ°�)
		try {
			int result = num1 / num2; //ArithmeticException ���ܰ� �߻��� �� �ִ� ����
			System.out.println("������ ������ : " + result);
		} catch(ArithmeticException e) { // �Ƹ�����ƽ �ͼ����� �߻��Ǵ� ���� ����ä�� 
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}
		
		/*
		 * try ~ catch�� 
		 * try{
		 * 	   ���ܰ� �߻��� ���� ����;
		 * } catch (�߻��ɿ���Ŭ���� �Ű�����){
		 * 	  �ش� ���ܰ� �߻��Ǵ� ��� ������ ����;
		 * }
		 *
		 */
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
	
	public void method2() {
		
		System.out.print("����(0����) �Է�: ");
		 
		try {
			int num = sc.nextInt();
			System.out.println("������ ������ : " + 10/num);
		} catch(InputMismatchException e) {
			System.out.println("������ �ƴ� ���� �Է��ϼ̽��ϴ�.");
		} catch(ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�");
	}
	public void method3() {
		//NegativeArraySizeException : �迭�� ũ�⸦ ������ ���������� �߻��Ǵ� ����
		//ArrayIndexOutOfBoundsException : �迭�� �������� �ε����� ���������� �߻��Ǥ��� ����
		
		System.out.print("�迭�� ũ��: ");
		int size = sc.nextInt();
		
		//int[] arr = new int[size]; // NegativeArraySizeException 
		
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		
		} catch(NegativeArraySizeException e) {
			System.out.println("�迭�� ũ��� ������ �� �� �����ϴ�.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("100�̻��� ���� �Է��ϼ���.");
		}
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100�� �ε��� �� : " + arr[100]);
		}catch(RuntimeException e) { // �������� �����ؼ� �θ�Ŭ������ �ۼ��ϸ� �� �޾��� �� ����
			System.out.println("���");
		}
		System.out.println("���α׷��� �����մϴ�.");
		
	}
	/*
	 * if������ ����ó�� == ���ʿ� ���� ��ü�� �߻��� �ȵǰԲ� �����ڰ� �ҽ��ڵ�� �ڵ鸵�ϴ� ��(���� ó���ƴ�)
	 * ����ó�� ���� ö == ���ܰ� �߻����� ���� ����ؼ� �׶� ������ ������ ������ �δ� ��
	 * 
	 * (�������)
	 * ������ ������ ��� => ���ǹ����� �ذ�
	 * ������ �����Ѱ�� => ����ó�� �������� �ذ�
	 * 
	 * RuntimeException �迭�� ����� ���� ������ ��Ȳ�� ��κ��̰� ���� ���ǹ����� �ذ����ִ°��� �������
	 */

}
