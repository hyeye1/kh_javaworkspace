package com.kh.chap02.practice.example;

public class ForStarPractice {
	
	public static void main(String[] args) {
		/*
		for(int i = 1; i<5; i++) {
			for(int j = 1; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		/*
		System.out.println("*");
		System.out.println("*"+"*");
		System.out.println("*"+"*"+"*");
		System.out.println("*"+"*"+"*"+"*");
		*/
		/*String star = "*";
		for(int i = 1; i<5; i++) {
			for(int j = 4; j<5; j++) {
							
				System.out.print(star);

			}
			star += "*";
			System.out.println();
			
		}
		for(int i = 0; i<4; i++) {
			
			for(int j=0; j<i+1; j++) {
			
				System.out.print("*");
			}
			System.out.println();
		}
		
		 */
		
		//*
		//**
		//***
		//****
		/*
			for(int i=4; i>0; i--) { 
				for(int j=1; j<i+1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			*/
		/* 호연오빠 코드
		for(int i = 0 ; i<4; i++ ) {
            for(int j = 3 ; j>=0 ; j-- ) {
               if(j>=i) {
                  System.out.print("*");
               } else {
                  System.out.print(" ");
               }
            }
            System.out.println("");
            
         }
         */
		//
			
		for(int i=4; i>0; i--) {
			for(int j=0; j<5; j++) {
				if(i<=j) {
					System.out.print("*");		
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		

		}
	}
}
