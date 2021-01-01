package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * �迭 ����
	 * -���� ���� : �迭�� �ּҸ��� ���� int[] copy = origin;
	 * -���� ���� : ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���ΰ����� ����
	 * 				for�� ��� / 
	 * 
	 */
	
	public void method1() {
		
		int[] origin = {1,2,3,4,5}; //���� �迭
		
		System.out.println("���� �迭 ���");   //ó�� �����س��� ���� �迭�� ���� ����غ��ڴ�.
		for(int i=0; i<origin.length; i++) {   // origin�� i��° �ε����� ����ϰڴ�.      
			System.out.print(origin[i] + " ");        
		}
		// ���纻 �迭
		int[] copy = origin;  //origin���ִ°� copy�� �״�� �����Ŵ.
		
		System.out.println("\n���纻 �迭 ���");
		for(int i =0 ; i<copy.length; i++ ) {
			System.out.print(copy[i] + " ");  //copy�迭�� i��° �ε��� ���
			
		}
		
		// ����� copy �迭�� �̿��ؼ� 2�� �ε������� 99�� ����
		copy[2] = 99;
		System.out.println("\n== ���纻 �迭 �� ���� �� ==");
		
		System.out.println("���� �迭 ���");
		
		for(int i =0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
			 
		}
		
		System.out.println("\n���纻 �迭 ���");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		//���� �迭���� ���� ����Ǵ� �� ó�� ���̴� ������ 
		//�����迭�̵� ���纻 �迭�̵� ���� ���� �����ϰ��ֱ⶧��!
		//�� ���� �ּҰ��� ������ �־��� ����!
		
		System.out.println("\n���� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �ؽ��ڵ� : " + copy.hashCode());
		
		//�̰� �ٷ� ���� ����!: �ּҰ��� �����ϴ� ���� == ���� �ּҰ� == ���� ���� ������
		
	}
	
	public void method2() {
		/*
		 * 1. for�� ���
		 * �ƿ� ���ο� �迭�� ������ �� �� �ε����� ���� ���� ������ ����ִ� ���
		 */
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[5];
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		//�� ���� �ƴ��� Ȯ��
		for(int i=0; i<copy.length; i++) { 
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n==���纻�迭 ���� �� ==");
		//���� �迭 ���
		System.out.println("���� �迭 ���  ");
		for(int i = 0; i<origin.length; i++ ) {
			System.out.print(origin[i]+ " ");
		}
		//���纻 �迭 ���
		System.out.println("\n���纻 �迭 ���");
		for(int i =0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n���� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �ؽ��ڵ� : " + copy.hashCode());
		
	}
	
	public void method3() {
		//2. ���ο� �迭 ������ �� System Ŭ�������� arraycopy( ) �޼ҵ带 �̿��� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; //�˳��ϰ� ũ�� ����
		
		//System.arraycopy(�����迭��, ���縦 ������ �ε���, ���纻 �迭��, ���纻�迭�� ����� �����ε���. �����Ұ���);
		System.arraycopy(origin, 0, copy, 0, origin.length);
		
		System.out.println("���纻 �迭 ���");
		for(int i=0; i<copy.length; i++ ) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println("\n���� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �ؽ��ڵ� : " + copy.hashCode());
		
	}
	
	public void method4() {
		// 3. Arrays  Ŭ�������� �����ϴ� copyOf() �޼ҵ� ���
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Arrays.copyOf(�����迭��, �����Ұ���);
		int[] copy = Arrays.copyOf(origin, 10);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * System.arraycopy �޼ҵ� - ��� �ε������� ��� ��� ��ġ�� �ε����� ������ ���� �� ���� ���� ����
		 * 
		 * Arrays.copyOf �޼ҵ� - ������ �����迭�� 0�� �ε������� ���簡 �����(���� ������ ������ŭ)
		 * 						�׸��� ���� ������ ������ŭ�� �� ���纻 �迭�� ũ��� ������
		 * 
		 * 
		 */
		
	}
	
	public void method5() {
		//4. clone() �޼ҵ� ���
		// �ε��� ���� ���� x , ������ ���� ���� x     ���� �迭 ��°�� ����
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n���� �ؽ��ڵ� : " + origin.hashCode());
		System.out.println("���纻 �ؽ��ڵ� : "  + copy.hashCode());
	}
	
	

}