package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		
		Car c = new Car("벤틀리",12.5, "세단", 4);
		Ship s = new Ship("낚시배", 0.1, "어선", 1);
		Airplane a = new Airplane("비행기", 0.021, "제트기", 16, 4);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		c.howToMove();
		s.howToMove();
		a.howToMove();
		/*
		 * 상속의 특징
		 - 클래스간의 상속은 단일 상속만 가능(부모는 하나)
		 - 명시되어있진 않지만 모든 클래스 (자바에서 제공하는 클래스, 내가만든 클래스) object클래스를 상속받고있음
		 => 즉,  object 클래스가 제공하고잇는 메소드 같은 것들을 마음대로 쓸수있음!
		 => 뿐만아니라 마음에 안들면 내 입맛대로 재정의(오버라이딩) 가능
		 */
	}

}
