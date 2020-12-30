package com.kh.array;

public class B_ArrayCopy {
	
	/*
	 * 배열 복사
	 * -얕은 복사 : 배열의 주소만을 복사
	 * -깊은 복사 : 동일한 새로운 배열을 하나 생성해서 실제 내부값들을 복사
	 * 
	 */
	
	public void method1() {
		
		int[] origin = {1,2,3,4,5}; //원본 배열
		
		System.out.println("원본 배열 출력");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		// 복사본 배열
		int[] copy = origin;
		
		System.out.println("\n복사본 배열 출력");
		for(int i =0 ; i<copy.length; i++ ) {
			System.out.print(copy[i] + " ");
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
		
		
		
	}
	
	

}
