package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		// 모든 클래스는 object를 상속받고 있다.
		// 즉, 최상위 클래스는 항상 Object
		// == Object에 있는 메소드들은 다 갖다 쓸 수 있음
		// == 맘에 안들면 재정의도 가능함! (오버라이딩)
		
		Book bk1 = new Book("수학의 정석", "나수학", 10000);
		Book bk2 = new Book("수학의 정석", "나수학", 10000);
		
		System.out.println(bk1==bk2); //false 내용물은 같을 수 있으나 주소값이 다르다. 단순히 == 비교는 주소값비교 왜냐? 그냥 bk1을 출력해보면 주소값이나옴
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode()); // 이 해쉬코드라는 메소드는 북클래스의 부모인 Object메소드에 있음 -> 마우스 가져다 대면 주소나옴 java.lang.Objec.hashCode()
		//출력문안에 어떤 레퍼런스를 출력하고자 할 때 jvm이 자동으로
		// 해당 레퍼런스 .toString() 메소드를 호출함 -> information() 썼던 메소드 역할
		System.out.println(bk1.toString());
		// vo 클래스에서 작성해야될것
		//필드부 기본생성자 매개변수생성자 setter getter toString.
	}

}
