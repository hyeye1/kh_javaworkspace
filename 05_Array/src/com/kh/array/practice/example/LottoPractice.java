package com.kh.array.practice.example;

public class LottoPractice {
	
	public static void main (String[] args) {
		//랜덤숫자 이용해서 
		//로또번호 6자리 중복없이 출력
		// 결과물은 [ 3, 45, 33, 21, 44, 22 ] 
		

		
		
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
			System.out.printf("결과물은 [ %d, %d, %d, %d, %d, %d ]입니다.", num[0], num[1], num[2], num[3], num[4], num[5]);	
			
			}
			
			
			
		
		
		
			
				
				
			
		
		
	}

