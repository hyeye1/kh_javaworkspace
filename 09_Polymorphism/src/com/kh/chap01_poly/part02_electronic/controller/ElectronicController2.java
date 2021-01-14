package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성(부모타입 레퍼런스로 자식객체를 받아주는) 적용시켰을때
public class ElectronicController2 {
	
	private Electronic[] elec = new Electronic[3];  //desktop/ tablet/ notebook담을 수 있는 배열
	
	//desktop/ notebook/ tablet 따로따로 담지않고 모두 담아줄수 있는 부모타입 레퍼런스 -> 다형성
	public void insert(Electronic any, int index) { //매개변수에 인덱스 숫자 변수를 만들기
		elec[index] = any; 
	}
	
	public Electronic select(int index) { //조회하고자하는 인덱스값을 돌려주기 -> 매개변수에 입력
		return elec[index];
	}
	
	//응용포문용
	public Electronic[] select() { //따로따로 조회아니고 통째로 다 가져옴
		return elec;
	}

}
