package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * 배열 복사
	 * -얕은 복사 : 배열의 주소만을 복사 int[] copy = origin;
	 * -깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부값들을 복사
	 * 				for문 방법 / 
	 * 
	 */
	
	public void method1() {
		
		int[] origin = {1,2,3,4,5}; //원본 배열
		
		System.out.println("원본 배열 출력");   //처음 세팅해놓은 원본 배열을 먼저 출력해보겠다.
		for(int i=0; i<origin.length; i++) {   // origin의 i번째 인덱스를 출력하겠다.      
			System.out.print(origin[i] + " ");        
		}
		// 복사본 배열
		int[] copy = origin;  //origin에있는걸 copy에 그대로 복사시킴.
		
		System.out.println("\n복사본 배열 출력");
		for(int i =0 ; i<copy.length; i++ ) {
			System.out.print(copy[i] + " ");  //copy배열의 i번째 인덱스 출력
			
		}
		
		// 복사된 copy 배열을 이용해서 2번 인덱스값을 99로 수정
		copy[2] = 99;
		System.out.println("\n== 복사본 배열 값 변경 후 ==");
		
		System.out.println("원본 배열 출력");
		
		for(int i =0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
			 
		}
		
		System.out.println("\n복사본 배열 출력");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		//원본 배열까지 같이 변경되는 것 처럼 보이는 이유가 
		//원본배열이든 복사본 배열이든 같은 곳을 참조하고있기때문!
		//즉 같은 주소값을 가지고 있었기 때문!
		
		System.out.println("\n원본 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : " + copy.hashCode());
		
		//이게 바로 얕은 복사!: 주소값만 복사하는 개념 == 같은 주소값 == 같은 곳을 참조함
		
	}
	
	public void method2() {
		/*
		 * 1. for문 방법
		 * 아예 새로운 배열을 생성한 후 각 인덱스별 내부 값을 일일히 집어넣는 방법
		 */
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[5];
		
		for(int i=0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		
		//잘 복사 됐는지 확인
		for(int i=0; i<copy.length; i++) { 
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n==복사본배열 변경 후 ==");
		//원본 배열 출력
		System.out.println("원본 배열 출력  ");
		for(int i = 0; i<origin.length; i++ ) {
			System.out.print(origin[i]+ " ");
		}
		//복사본 배열 출력
		System.out.println("\n복사본 배열 출력");
		for(int i =0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : " + copy.hashCode());
		
	}
	
	public void method3() {
		//2. 새로운 배열 생성한 후 System 클래스에서 arraycopy( ) 메소드를 이용한 복사
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; //넉넉하게 크게 생성
		
		//System.arraycopy(원본배열명, 복사를 시작할 인덱스, 복사본 배열명, 복사본배열에 복사될 시작인덱스. 복사할갯수);
		System.arraycopy(origin, 0, copy, 0, origin.length);
		
		System.out.println("복사본 배열 출력");
		for(int i=0; i<copy.length; i++ ) {
			System.out.print(copy[i]+ " ");
		}
		
		System.out.println("\n원본 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : " + copy.hashCode());
		
	}
	
	public void method4() {
		// 3. Arrays  클래스에서 제공하는 copyOf() 메소드 사용
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 = Arrays.copyOf(원본배열명, 복사할갯수);
		int[] copy = Arrays.copyOf(origin, 10);
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		/*
		 * System.arraycopy 메소드 - 몇번 인덱스부터 몇개를 어느 위치의 인덱스에 복사할 건지 다 직접 지정 가능
		 * 
		 * Arrays.copyOf 메소드 - 무조건 원본배열의 0번 인덱스부터 복사가 진행됨(내가 제시한 갯수만큼)
		 * 						그리고 내가 제시한 갯수만큼이 곧 복사본 배열의 크기로 지정됨
		 * 
		 * 
		 */
		
	}
	
	public void method5() {
		//4. clone() 메소드 사용
		// 인덱스 직접 지정 x , 복사할 갯수 지정 x     원본 배열 통째로 복사
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 해쉬코드 : " + origin.hashCode());
		System.out.println("복사본 해쉬코드 : "  + copy.hashCode());
	}
	
	

}
