package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		
		int[] iArr = {1, 2, 3, 4, 5};
		
		for(int i=0; i<iArr.length; i++) { // 반복횟수: 5 == 배열의 크기 -> 배열의 크기만큼 반복문이 수행됨
			System.out.println(iArr[i]);
		}
		
		//향상된 for문 이용가능 (어떤 배열같은 존재에 0번 인덱스에서부터 마지막인덱스 까지 순차적으로 접근할 목적)
		/*
		 * for(순차적으로접근한값을담을 변수선언 : 순차적으로접근할 배열명 ) { // 반복횟수 == 배열의크기
		 * 		반복적으로 실행할 내용
		 * }
		 */
		
		//배열의 자료형이 인트자료형이라면 변수는 int로!
		//    int : int[] 
		for(int i : iArr ) { //출력순서 iArr[0] -> iArr[1] -> . . . -> iArr[마지막]
			System.out.println(i);
		}
		//어디에도 인덱스 수 에관해 제시가 되어있지않기때문에 인덱스활용은 못함
		
		
		
		
		
		
		
		
		
		
		
		Phone[] arr = new Phone[3];
		/*
		 */
		arr [0] = new Phone("갤럭시", "샘성", 1500000, "노트20");
		arr [1] = new Phone("아이폰", "사과", 1300000, "11pro");
		arr [2] = new Phone("벨벳폰", "엘지", 900000, "1");
		int total = 0;

		/*for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			total += arr[i].getPrice();
		}*/
	// => 향상된 for문 활용!
		for(Phone p : arr) {
			System.out.println(p.information());
		}
		
		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가 : " + total / arr.length + "원");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("찾고자하는 핸드폰 : ");
		String name = sc.nextLine();

		// 모든 핸드폰의 이름과 비교하여 일치하는 경우 해당 폰의 가격 출력
		/*
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i].getName())
					|| arr[i].getBrand().equals(name)
						|| arr[i].getSeries().equals(name)) {
				System.out.println("가격: " + arr[i].getPrice()+"원");
			}
		}
		*/
		for(Phone p : arr) {
			if(name.equals(p.getName())
					|| name.equals(p.getBrand())
						|| name.equals(p.getSeries())) {
				System.out.println("가격: " + p.getPrice() +"원");
			}
		}

		
	}

}


