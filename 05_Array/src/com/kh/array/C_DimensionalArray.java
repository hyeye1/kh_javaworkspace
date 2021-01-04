package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	
	// ������ �迭 : ������ �迭 �������� �ϳ��� ���� ��
	
	
	public void method1() {
		
		int[] iArr = new int[3];
		
		/*
		 1. ������ �迭 ����
		 [ǥ����]
		 1) �ڷ��� �迭�� [][] ;
		 2) �ڷ���[] �迭��[];
		 3) �ڷ���[][] �迭��;
		 
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 2. ������ �迭 �Ҵ�(ũ������)
		 [ǥ����]
		 �迭�� = new �ڷ���[��ũ��][��ũ��];
		 */
		arr3 = new int [2][3];
		
		/*
		 3. ������ �迭 ����� ���ÿ� �Ҵ�
		 [ǥ����]
		 �ڷ���[][] �迭�� = new �ڷ��� [��ũ��][��ũ��];
		 */
		int[][] arr = new int [3][5];
		
		System.out.println(arr); //---> stack�� �ִ� �ּҰ�
		System.out.println(arr[0]); //--> heap�� ù��° ���� �ּҰ�
		System.out.println(arr[0][0]);//--> �� ù��° �� �ּҰ� �� ù��° �ε���

		System.out.println("���� ���� : " + arr.length);
		//�� �ະ ���� ���̸� �˰��� �Ѵٸ� 
		System.out.println("0���� ���� ���� : " + arr[0].length);
		System.out.println("1���� ���� ���� : " + arr[1].length);
		
		/* �����
		 * *****
		 * *****
		 * *****
		 * 
		 * �ٱ��� for��-> ���� ����
		 * ���� for��-> ���� ����
		 */
		
		for(int i = 0 ; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) { 
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method2() {
		int[][] arr = new int[3][5];
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 */
		
		int value = 1;
		for(int i=0; i<arr.length; i++) { //���� �����ϴ� for��
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]= value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				//System.out.printf("%-2d", arr[i],arr[j]);
			}
			System.out.println();
		}
		
		
	}
	
	public void method3() {
		//������ �迭�� ����, �Ҵ� �� �ʱ�ȭ���� �ѹ��� ������
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void method4() {
		//�����迭
		//���� �����������Ϥ� �� �࿡ ���� ���� ������ �������� ���� ����
		//�������迭 == ������ �迭�� ������ ��������
		// ��, �����ִ� ������ �迭�� ���̰� �� ���� �ʿ�� ����
		
		//���� �������� ���� ��� heap���ִ� ���� ���� null�̴�.(�ּҰ�����������������)
		
		int[][] arr = new int[3][]; //���� �迭 �Ҵ� 
		System.out.println(arr);
		System.out.println(arr[0]);
		//System.out.println(arr[0].length);
		//arr[0][1] = 10;
		
		arr[0] = new int[2];      //ù��° ���� ���ڽ� �ΰ�����!
		arr[1] = new int[1];      //�ι�° ���� ���ڽ� �ϳ�����!
		arr[2] = new int[3];      //����° ���� ���ڽ� ��������!
		/*
		 * 1 2 
		 * 3 
		 * 4 5 6 
		 * 
		 */
		
		int value = 1;
		
		
		for(int i=0; i<arr.length; i++) {
				
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	
	public void method5() {
		//�����迭�� �Ҵ�� ���ÿ� �ʱ�ȭ �ѹ��� ������
		int[][]arr= {{1,2},{3},{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		//�������� �������� �Է¹ް� ���
		
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				if(i == 0) { 
					System.out.print("���� ���� : ");
				}else {
					System.out.print("���� ���� : ");
				}
				arr[i][j] = sc.nextDouble();
				
				
			}
			
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				System.out.print("�������� : ");
			}else {
				System.out.print("�������� : ");
			}
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
		}
		
		
		
	}
	

}
