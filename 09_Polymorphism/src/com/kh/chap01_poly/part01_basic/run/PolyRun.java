package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {

		//명심해둘것
		// = 대입연산자를 기준으로 왼쪽 오른쪽의 자료형은 같아야함
		
		//1. 부모타입 레퍼런스로 부모객체를 다루는 경우
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		Parent p1 = new Parent();
		p1.printParent(); 
		
		//2. 자식타입 레퍼런스로 자식객체를 다루는 경우
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		Child1 c1 = new Child1();
		c1.printParent();
		c1.printChild1();
		//c1 레퍼런스로 Parent, Child1 둘 다 접근 가능
		
		//3. 부모타입 레퍼런스로 자식객체를 다루는 경우( 다형성이 적용된 개념 )
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우");
		Parent p2 = /*(Parent)*/ new Child1();
		//양쪽의 자료형이 다름에도 불구하고 잘 됨! => '자동형변환' 발생
		//상속구조에서는 클래스 형변환이 가능!
		
		p2.printParent(); // p2 라는 레퍼런스로 Parent에만 접근가능..
		((Child1)p2).printChild1();
		
		/*
		 * 클래스간의 형변환 가능(단, 상속구조일때만) 
		 * 
		 * 1. UpCasting
		 * 자식타입=> 부모타입으로 형변환
		 * 생략가능 (자동형변환됨)
		 * 
		 * 
		 * 2. DownCasting
		 * 부모타입 => 자식타입으로 형변환
		 * 생략불가 (명시적(강제) 형변환 해야됨)
		 * 
		 * 
		 * 
		 */
		
		//다형성을 쓰는 이유?
		// Child1 객체 2개와 Child2 객체 2개가 필요함
		//객체배열 이용해서!
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 3, 5);
		
		System.out.println("====== 다형성 접목한 객체 배열 ======");
		// 단, 다형성이 적용되면 부모타입 레퍼런스로 다양한 자식 객체들을 받아줄 수 있음
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child2(2, 3, 5);
		arr[3] = new Child1(2, 1, 5);
		
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		System.out.println("====== 반복문 이용해서 해보기 ======");
		for(int i=0; i<arr.length; i++) {
			//instanceof 연산자
			// 현재 레퍼런스가 실제로 어떤 자식 클래스를 참조하고 있는지 확인할 때 사용
			//if(arr[i] instanceof Child1) {
			//	((Child1)arr[i]).printChild1();
			//}else {
			//	((Child2)arr[i]).printChild2();
			//		}
		arr[i].print();
		// 단, 오버라이딩개념을 접목하면 보다 쉽게 실행가능함
		// 실질적으로 참조하고 있는 자식 클래스의 오버라이딩 된 메소드 찾아가서 알아서 실행된다
		
		
			
		}
	}

}
