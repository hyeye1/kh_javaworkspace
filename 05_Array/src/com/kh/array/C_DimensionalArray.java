package com.kh.array;

import java.util.Scanner;

public class C_DimensionalArray {
	
	// 이차원 배열 : 일차원 배열 여러개를 하나로 묶은 것
	
	
	public void method1() {
		
		int[] iArr = new int[3];
		
		/*
		 1. 이차원 배열 선언
		 [표현법]
		 1) 자료형 배열명 [][] ;
		 2) 자료형[] 배열명[];
		 3) 자료형[][] 배열명;
		 
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 2. 이차원 배열 할당(크기지정)
		 [표현법]
		 배열명 = new 자료형[행크기][열크기];
		 */
		arr3 = new int [2][3];
		
		/*
		 3. 이차원 배열 선언과 동시에 할당
		 [표현법]
		 자료형[][] 배열명 = new 자료형 [행크기][열크기];
		 */
		int[][] arr = new int [3][5];
		
		System.out.println(arr); //---> stack에 있는 주소값
		System.out.println(arr[0]); //--> heap에 첫번째 행의 주소값
		System.out.println(arr[0][0]);//--> 그 첫번째 행 주소값 속 첫번째 인덱스

		System.out.println("행의 길이 : " + arr.length);
		//각 행별 열의 길이를 알고자 한다면 
		System.out.println("0행의 열의 길이 : " + arr[0].length);
		System.out.println("1행의 열의 길이 : " + arr[1].length);
		
		/* 별찍기
		 * *****
		 * *****
		 * *****
		 * 
		 * 바깥쪽 for문-> 행의 갯수
		 * 안쪽 for문-> 열의 갯수
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
		for(int i=0; i<arr.length; i++) { //행을 지정하는 for문
			
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
		//이차원 배열의 선언, 할당 및 초기화까지 한번에 끝내기
		int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void method4() {
		//가변배열
		//행은 정해져있으니ㅏ 각 행에 대한 열의 객수가 정해지지 않은 상태
		//이차원배열 == 일차의 배열을 여러개 묶은상태
		// 즉, 묶여있는 일차원 배열의 길이가 꼭 같을 필요는 없음
		
		//열이 존재하지 않을 경우 heap에있는 행의 값은 null이다.(주소가아직존재하지않음)
		
		int[][] arr = new int[3][]; //가변 배열 할당 
		System.out.println(arr);
		System.out.println(arr[0]);
		//System.out.println(arr[0].length);
		//arr[0][1] = 10;
		
		arr[0] = new int[2];      //첫번째 행의 열박스 두개생성!
		arr[1] = new int[1];      //두번째 행의 열박스 하나생성!
		arr[2] = new int[3];      //세번째 행의 열박스 세개생성!
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
		//가변배열의 할당과 동시에 초기화 한번에 끝내기
		int[][]arr= {{1,2},{3},{4,5,6}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method6() {
		//국어점수 영어점수 입력받고 출력
		
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				if(i == 0) { 
					System.out.print("국어 점수 : ");
				}else {
					System.out.print("영어 점수 : ");
				}
				arr[i][j] = sc.nextDouble();
				
				
			}
			
		}
		
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				System.out.print("국어점수 : ");
			}else {
				System.out.print("영어점수 : ");
			}
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
		}
		
		
		
	}
	

}
