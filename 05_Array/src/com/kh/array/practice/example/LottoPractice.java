package com.kh.array.practice.example;

public class LottoPractice {
	
	public static void main (String[] args) {
		//�������� �̿��ؼ� 
		//�ζǹ�ȣ 6�ڸ� �ߺ����� ���
		// ������� [ 3, 45, 33, 21, 44, 22 ] 
		

		
		
		int[] num = new int[6];
		
		
			
			for(int i = 0 ; i<6; i++) {
				int random = (int)(Math.random() *45 + 1);
				num[i] = random;
				
				for(int j = 0; j<i; j++) {
					if(num[j]==num[i]) {
						i--;
					}
				}
				
				
	
			}
			System.out.printf("������� [ %d, %d, %d, %d, %d, %d ]�Դϴ�.", num[0], num[1], num[2], num[3], num[4], num[5]);	
			
			}
			
			
			
		
		
		
			
				
				
			
		
		
	}
