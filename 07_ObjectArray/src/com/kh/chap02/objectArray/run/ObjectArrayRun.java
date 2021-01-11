package com.kh.chap02.objectArray.run;

import java.util.Scanner;

import com.kh.chap02.objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		Phone[] arr = new Phone[3];
		
		arr [0] = new Phone("갤럭시", "샘성", 1500000, "노트20");
		arr [1] = new Phone("아이폰", "사과", 1300000, "11pro");
		arr [2] = new Phone("벨벳폰", "엘지", 900000, "1");
		
		int total = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
			total += arr[i].getPrice();
		}
		
		System.out.println("총 가격 : " + total + "원");
		System.out.println("평균가 : " + total / arr.length + "원");
		
		Scanner sc = new Scanner(System.in);

		System.out.print("찾고자하는 핸드폰 : ");
		String name = sc.nextLine();

		// 모든 핸드폰의 이름과 비교하여 일치하는 경우 해당 폰의 가격 출력
		for(int i=0; i<arr.length; i++) {
			if(name.equals(arr[i].getName())
					|| arr[i].getBrand().equals(name)
					|| arr[i].getSeries().equals(name)) {
				System.out.println("가격: " + arr[i].getPrice()+"원");
			}
		}
		
	}

}


