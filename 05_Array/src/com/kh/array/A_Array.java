package com.kh.array;

import java.util.Scanner;

public class A_Array {
	
	/*
	����: �ڷ����� �� "�ϳ�"���� ���� �� �ִ� ��
			ex. int a = 10;
					a = 20; => 10�� 20���� ���������
	
	�迭: ���� �ڷ����� ���� "������"�� ���� �� �ִ� ��
			�� �渶�� �ε����� ������(�ε��� 0���ͽ���)
			ex. int[] b = new int[5]; // int b��� �迭�� �����ش�, 
		
	
	 */
	
	public void method1() {
		
		// * �迭�� �� ����ұ�?
		
		/*
		// ex. �������� ������ ���α׷����� �ϰԵɶ�:
		// 0, 1, 2, 3, 4, �����͸� ����ϱ� ���ؼ�
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// ����� ��? �ϳ��ϳ��� ����ؾ� �ȴ�.
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		//==> �ݺ��� �̿�ȵ�; �ֳĸ� ������ �̸��� �� �ٸ��� ������ num + i ��� ������ ǥ�����ټ� ���� 
		
		//�� �հ踦 ���Ҷ�? ���������� �ݺ��� �ȵ�
		int sum = num1 + num2 + num3 + num4 + num5;
		System.out.println("�� �հ� : " + sum);
		*/

		//�迭�� ������ ���α׷����ϱ�
		/*
		1. �迭 ���� (�������� ������ ������ �迭�� ����ž�!)
			�ڷ��� �迭�� []; 
			�ڷ��� [] �迭��;

		int arr[]; 
		or   
		int[] arr;

		int a ; // ��������
		 */
		/*
		 2. �迭 �Ҵ�
			�� �迭�� �� ���� ������ �����Ұ��� ũ�⸦ �����ϴ� ����  == �� ������ŭ ���� ���������.
			�迭�� = new �ڷ���[];
		arr = new int[5];
		 */
			
		//*3. �迭 ����� ���ÿ� �Ҵ� 	
		 int[] arr = new int[5];
		 
		 /*
		  3. �� �ε����� �� ����
		  	 �迭��[�ε���] = ��;
		  */
		 /*
		 arr[0] = 0;
		 arr[1] = 1;
		 arr[2] = 2;
		 arr[3] = 3;
		 arr[4] = 4;
		 */
		 //�迭�� ���� ū �����̶�� �Ѵٸ�, �ݺ����� Ȱ���� �� �ִ�.
		 //for(int i=0; i<=4; i++) { //0�������� 4(�������ε���==�迭��ũ�� -1)���� �Ź� 1�� �����ϴ� ���� �ݺ� ����
		 //for(int i=0; i<=arr.length-1; i++) {
		 for(int i=0; i<arr.length; i++) {
			 arr[i] = i;
		 }
		 
		 //System.out.println(arr[0]);
		 for(int i=0; i<arr.length; i++) {
			 System.out.println(arr[i]);
		 }

	}
	
	public void method2() {
		
		int i = 10;
		
		int [] iArr = new int[5];
		System.out.println("i : " + i);
		System.out.println("iArr : " + iArr);
		System.out.println("iArr�� �ؽ��ڵ� : " +iArr.hashCode());
		
		double[] dArr = new double[3];
		
		System.out.println("dArr : " + dArr);
		System.out.println("dArr�� �ؽ��ڵ� : " + dArr.hashCode());
		
		/*
		 ���� ���� �ٷ� ���� �� �ִ� ������ �Ϲ� ������� ����ϰ�
		 �ּҰ��� ����ִ� ������ �������� ��� ǥ���Ѵ�
		 
		 �⺻�ڷ��� ( boolean, char, byte, short, int, long, float, double)���� ������ ����
		 => �Ϲ� ���� => ���� ���� �ٷ� ���� �� �ִ� ����
		 
		 �� �� �ڷ��� (int[], double[], char[], short[], String ... , Scanner, Class)���� ����� ����
		 => ���� ����(���۷��� ����) => �ּҰ��� ����ִ� ���� 
 
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; 
		double[] dArr = new double[5];
		
		System.out.println("iArr�迭�� ũ�� : " + iArr.length);
		System.out.println("dArr�迭�� ũ�� : " + dArr.length);
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		
		/*
		 * ������ �ε����� ���� �������� �ʾ������� �ұ��ϰ� ���� �������!
		 * ��? heap�� ���� �� ������ ������ �� ����!
		 * => jvm�� �⺻������ �ʱ�ȭ�� ��������
		 */
		
	}
	
	public void method4() {
		
		int[] iArr = new int[5];
		
		/*
		 * iArr[0] = 1;
		 * iArr[1] = 2;
		 * iArr[2] = 3;
		 * iArr[3] = 4;
		 * iArr[4] = 5;
		 */
		
		
		//�� ���Կ�
		for(int i =0; i<iArr.length; i++) {
			iArr[i] = i + 1;
		}
		
		//�� �հ� ���Ұ� ���
		int sum = 0;
		
		/*
		 sum += iArr[0];
		 sum += iArr[1];
		 .
		 .
		 .
		 */
		for(int i=0; i<iArr.length; i++) {
			sum += iArr[i];
			System.out.print(iArr[i] + " ");
		}
		
		System.out.println("\n�� �հ� : " + sum);
		
		System.out.println(iArr); //�ּҰ�
		System.out.println(iArr.hashCode()); // hashCode == �ּҰ��� 10��������
		
		
	}
	
	/*
	 * �޸𸮿��� �� stack heap static ������ �ִ�
	 * �⺻�ڷ����̾ƴ� �� ���� �ڷ����� �ּҰ��� ���� �ڽ�/ stack��
	 *
	 * new�� ������ ���� heap�� ���� ������� (int���� 5����/4����Ʈ/4����Ʈ/4/4/4/)
	 * �ּҰ��� ���(���� �Ѵ� , �ؼ� ������������θ�)
	 * 
	 *  
	 */
	

	
	//�迭�� ����ū ����
	public void method5() {
		
		int[] iArr = new int[5]; //int �迭�� ����� 5���� ���� ����
		
		//���� �迭�� 2, 4, 6, 8, 10 �� ����ʹٸ�?
		int value = 2; //ó���� 2 ���� �������
		for(int i=0; i<iArr.length; i++) {
			iArr[i] = value; //���������� ���鼭 (�ݺ��ϸ鼭) �ε����� ���ڸ� ��´�. 
			value += 2;  // i�� value�� �����ϰ�=> 2 ������Ű�� �� �����ϰ� 2������Ű�� �ݺ�
		}
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		System.out.println(iArr); //���ڷ� ����? hashCode
		System.out.println("iArr�� �ؽ��ڵ� �� :  " + iArr.hashCode());
		
		//iArr[5] = 12;
		// �迭�� ���� ū ����
		// �ѹ� ������ �迭�� ũ��� ������ �Ұ��ϴ�
		// => �迭�� ũ�⸦ �����ϰ��� �Ѵٸ� ��¿������ �ٽ� �������� �Ѵ�.
		iArr = new int[7];
		
		System.out.println("====���� �� ====");
		System.out.println("iArr�� �ؽ��ڵ� ��: " + iArr.hashCode());
			// iArr�̶�� �迭�� �ٽ� new(����) �Ǿ���, ������ �迭���� �������. �� �ε����� ���� �ٽ� 0���� �ʱ�ȭ
			// ������ �迭���� ���ο� �迭�� ����ʰ� ���ÿ� ������ ������ ��������, �޸𸮾ȿ� �����ִ� ���� �ڵ����� �����ȴ�.
			// -> �ڹ��� Ư¡�� �ϳ� : �ڵ� �޸𸮰��� (garbage collection)
		
			// ���� ����Ǿ��ִ� ������ ������ �Ѵٸ�?
			iArr = null;
					
			System.out.println(iArr);
			
			
			/*
			String str = null;
			int i = 0;
			double d = 0.0;
			*/

		
	}
	
	public void method6() {
		
		int num = 10; 
		
		int[] arr = new int [3];
		
		arr[0] = 100;
		System.out.println(arr[0]);
		
		for(int i=0; i<arr.length;i++) {
			arr[i] = 100;
		}
		
		arr = new int[5];
		
	}
		
	public void method7() {
		int [] arr = new int[10];
		
		//0�� �ε����������� ������ �ε������� 51~100������ ������
		for(int i = 0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 50 + 51);
		}
		for(int i = 0; i<arr.length; i++) {
			// arr[x] : 57
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
	}
	
	public void method9() {
		double[] arr = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		double[] heights = new double[3];
		
		for(int i = 0; i<arr.length; i++) {
			
			System.out.print("Ű �Է�: ");
			heights[i] = sc.nextDouble();
			
		}
		
		double sum = 0;
		for(int i = 0 ; i<heights.length; i++) {
			System.out.println(heights[i]);
			sum += heights[i];
		}
		
		//System.out.println("������ Ű�� �� �հ� : " + sum);
		//System.out.println("������ Ű�� ��� : " + sum/heights.length);
		
		System.out.printf("������ Ű�� �� �հ� : %.1f\n", sum);
		System.out.printf("������ Ű�� ���: %.1f\n", sum/heights.length);
	}	
	
	public void method10() {
		
		//����ڿ��� ���ڿ� �Է¹��� ��
		//�� ���ڵ��� char�迭�� ���
		
		//1. ����ڿ��� ���ڿ� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		//2. char�迭 �����صα� (�迭 ũ�� === ���ڿ��� ���̸�ŭ)
		char[] arr = new char[str.length()];
		
		//3. ���ڿ����� �� �ε����� ���ڸ� �̾Ƽ� char�迭�� �� �ε����� ���
		/*
		 * arr[0] = str.charAt(0);
		 * arr[1] = str.charAt(1);
		 * arr[�������ε���] = str.charAt(�������ε���);
		 * 
		 */
		for(int i = 0; i<str.length(); i++) {
			arr[i] = str.charAt(i);
			
		}
		

		//4. char�迭�� �� �ε����� �� ����ִ��� ����غ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method11() {
		//�迭�� ������ϴ� ������ ���������� ���
		//�� �ε����� ���� ����ä�� �迭�� ������ �� �ִ� ���
		
		//�迭����� ���ÿ� �Ҵ�
		int[] arr = new int[4];
		//�� �ε����� �� �ʱ�ȭ(����)
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		//�迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ ���� �ѹ��� ������
		int[] arr1 = new int[] {1, 2, 3, 4,}; //ù��° ���
		int[] arr2 = {1, 2, 3, 4}; //�ι�° ���
		
		System.out.println(arr == arr1);
		System.out.println(arr1 == arr2);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}