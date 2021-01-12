package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		//desktop객체생성
		//pName, pCode, brand, price, allinone
		Desktop d = new Desktop("삼성데스크탑", "d-01", "삼성", 2000000, true);
		//tv객체생성
		//pName, pCode, brand, price, inch
		Tv t = new Tv("올레드티비", "t-01", "LG", 3500000, 60);
		
		//smartphone객체생성
		//pName, pCode, brand, price, mobileAgency
		SmartPhone s = new SmartPhone("아이폰", "s0-01", "애플", 1500000, "kt");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		/*
		 * 상속
		 * 
		 * 세 클래스에 공통적인 필드와 메소드들이 존재한다.
		 * 1. 코드중복제거
		 * 2. 유지보수에 용이 : 각 클래스에 찾아가서 수정해주지않아도됨
		 * 
		 * 상속(부모-자식)관계로 정의해서 적용시킴.
		 * -> 공통적인 필드와 공통적인 메소드를 부모클래스로 정의를 해두고
		 * => 각 클래스들마다 따로 필요한 필드들로만 자식ㄱ클래스로 정의해놓는다.
		 * 
		 * 
		 */

	}

}
