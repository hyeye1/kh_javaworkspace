package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
	
		// FieldTest1 테스트
		//FieldTest1 f1 = new FieldTest1(); //멤버변수 생성시점
		// 위의 객체 생성하는 구문에서 global 이라는 변수가 메모리상에 만들어짐(값 대입된 채로)

		//f1.test(5); //지역변수 생성시점
		// 위의 test메소드 호출하는 구문에 test메소드 안의 지역변수들이 메모리상에 만들어짐
		
		// 지역변수 소멸시점
		// 메소드가 다끝나고 나면 지역 변수들은 메모리상에서 사라짐
		
		//f1=null; //멤버변수 소멸 시점
		//객체가 소멸될때 멤버변수는 메모리상에 사라짐
		
		
		
		//========FieldTest 2 테스트 ===========
		//FieldTest2 f2 = new FieldTest2();
		
		//public = 어디서든 접근가능
		//System.out.println(f2.pub);
		
		//protected => 같은 패키지 접근가능 다른패키지는 상속구조에서만 접근가능
		//System.out.println(f2.pro); 에러뜸=> getter메소드작성하면된다
		
		// default => 같은 패키지에서만 접근가능
		//System.out.println(f2.def); // getter메소드로 사용
		
		// private => 같은 클래스에서만 접근가능
		//System.out.println(f2.pri); // getter메소드로 만 가능
		
		
		
		//============FieldTest3 테스트 ===============
		// static이라는 키워드가 붙은 클래스 변수는 굳이 해당 객체 생성하지않아도 사용가능
		// 왜? 이미 메모리 영역에 생성되어있기 때문에!
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		// 같은변수명 사용가능 (static영역에 자동으로 어떤 클래스꺼인지 내제되어있음)
		// 단 소수점을 찍고 어떤 변수를 부를건지 알려줌
		
		FieldTest3.sta= "ㅋㅋㅋ";
		
		System.out.println(FieldTest3.NUM);
		
		System.out.println(FieldTest3.sta);
		
		System.out.println(Math.PI);
		

	}

	
	
	
	
	
	
	
}
