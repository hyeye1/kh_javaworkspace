package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
			
		//메소드의 매개변수에 다형성(부모타입 레퍼런스로 자식객체를 받아주겠다)을 적용시킬경우
		
		// ElectronicRun: 납품업체! ElectronicController1: 용산전자상가 새로차린가게
		
		/*
		// 1. 다형성 적용 안했을 경우(ElectronicController1)
		ElectronicController1 ec = new ElectronicController1();
		// 생성하는 순간 이 클래스의 필드들이 메모리 영역에 올라감!
		
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "그램", 2000000, 4));
		ec.insert(new Tablet("애플", "아이패드", 800000, false));
		
		// 가게에 있는 제품들을 조회
		Desktop d = ec.selectDesktop(); //데스크탑객체가 반환이 되어 돌아올거기에 받아줄수 있는 변수 세팅
		NoteBook n = ec.selectNoteBook(); // 받아줄 노트북 변수
		Tablet t = ec.selectTablet(); 
		
		// 손님에게 소개시켜주기 (출력해주기)
		System.out.println(d); //레퍼런스만 제시해주어도 출력됨
		System.out.println(n); // println 안에 기본자료형이아니라 참조자료형이면 자동으로
		System.out.println(t); // JVM이 toString메소드을 출력해줌
		*/
		
		// 2. 다형성 적용했을 때 (ElectronicController2)
		
		ElectronicController2 ec = new ElectronicController2();
		
		ec.insert(new Desktop("Samsung", "데탑", 1200000, "Geforce 1070"), 0);
		ec.insert(new NoteBook("LG", "그램", 2000000, 4), 1);
		ec.insert(new Tablet("애플", "아이패드", 800000, false), 2);
		/*
		Desktop d = (Desktop)ec.select(0);
					//electronic -=> desktop 자료형으로 변환시킴
		NoteBook n = (NoteBook)ec.select(1);
		Tablet t = (Tablet)ec.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		//위에꺼를 응용해서 포문으로 출력하기
		// 조회하고자하는 인덱스를 하나하나 출력하는것이아닌
		//한번에 가져오는것!
		
		Electronic[] elec = ec.select();
		
		for(int i=0; i<elec.length; i++) {
			System.out.println(elec[i]);
		}
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식들을 받아줄 수있음
		 * -> 부모타입 하나만으로도 다양한 자식객체들을 다룰 수 있음
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 되면 메소드 갯수가 확 줄어든다.
		 */
	}

}
