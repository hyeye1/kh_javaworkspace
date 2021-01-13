package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		// 위의 사용 데이터를 참고하여 각각 초기화
		
		Circle[] arrC = new Circle[2];
		Rectangle[] arrR = new Rectangle[2];
		
		arrC[0] = new Circle(1, 2, 3); 
		arrC[1] = new Circle(3, 3, 4);
		
		arrR[0] = new Rectangle(-1, -2, 5, 2);
		arrR[1] = new Rectangle(-2, 5, 2, 8);
		
		
		// 각 도형의 draw 메소드 실행 --> 향상된 for문 이용해서     ==> 향상된 포문??
		
		System.out.println("===== circle =====");
		for(int i=0; i<arrC.length; i++) {
			arrC[i].draw();
		}
		
		System.out.println("===== rectangle =====");
		for(int i=0; i<arrR.length; i++) {
			arrR[i].draw();
		}
	}

}
