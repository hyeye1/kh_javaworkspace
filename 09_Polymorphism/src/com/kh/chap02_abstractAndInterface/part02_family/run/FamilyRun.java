package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public class FamilyRun {
	
	public static void main(String[] args) {
		/* 
		Person p1 = new Mother("김엄마", 50, 70, "출산");
		Person p2 = new Baby ("강아기", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("=======다음날 =======");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		Basic b1 = new Mother("김엄마", 50, 70, "출산");
		Basic b2 = new Baby("강아기", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		/*
		 * extends 일반클래스 --> extends 추상클래스 --> implements 인터페이스
		 * ----------------------------------------------------------->>
		 *    					강제성이 더 짙어짐 (규약이 쎄짐)
		 *  클래스간:                  클래스 extends 클래스(단일상속)								화살표: 실선
		 *  클래스와 인터페이스간:      클래스 implements 인터페이스, 인터페이스,. . (다중상속가능)		화살표: 점선
		 *  인터페이스와 인터페이스 간: 인터페이스 extends 인터페이스, 인터페이스 , . .					화살표: 실선
		 *
		 */

	}

}
