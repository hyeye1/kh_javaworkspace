package com.kh.chap03.branch;

public class B_Continue {
	/*
	 * continue : �ݺ��� �ȿ��� ����ϴ±���
	 * 			  continue;�� ������ �Ǹ� �� �ڿ� � ������ �ֵ簣�� �������� �ʰ�
	 * 			   ���� ����� �ݺ������� �ö󰡶�°� �ǹ�
	 * 
	 */

	public void method1() {
		// 1���� 10���� Ȧ������ ���
		/*
		for(int i=1; i<=10; i++) { // �ݺ�Ƚ�� 10ȸ
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		*/
		
		for(int i=1; i<=10; i++) {
			
			// i�� ¦���� ��� => ���� ��¹� ����x �ݺ������� �ٷ� �ö󰡶�
			if(i % 2 == 0) {
				continue;
			}
			
			System.out.print(i + " ");
		}
		
	}
	
	public void method2() {
		// 1���� 100������ �� �հ�
		// ��, 6�� ����� ���� ���� ����
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) {
				continue;
			}
			
			sum += i;
		}
		
		System.out.println("�� �հ� : " + sum);
	}
	
	
	public void method3() {
		// 2�� ~ 9�� ����ϱ� �ϵ�
		// ��, 4�� ��� ���� ���� ����Ͻÿ� 
		
		// �ٱ��� for�� => ���� ����(2�� ~ 9��)
		// ���� for�� => �� �ܸ��� �ݺ������� �������� �� (1~9)
		
		for(int dan=2; dan<=9; dan++) {
			
			if(dan % 4 == 0) {
				continue;
			}			
			
			System.out.println("==== " + dan + "�� ====");
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
	
	
	
}
