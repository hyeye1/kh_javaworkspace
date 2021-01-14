package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성 적용시키기전 (ElectronicRun은 납품업체)
public class ElectronicController1 {
	
	//용산전자상가 새로차린가게
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	public void insert(Desktop d) {
		// Desktop d = new Desktop("삼성 ~ 데탑~ 12000 ~ 지포스) 내부적으로 작성되어있음
		desk = d;
	}
	//메소드명은 같아도 매개변수가 다르기에 공존가능> 오버로딩
	public void insert(NoteBook n) {
		note = n;
	}
	
	public void insert(Tablet t) {
		tab = t;
	}
	
	// 필드부가 프라이빗이기에 돌려주는 메소드만들어줌
	public Desktop selectDesktop() {
		return desk;  // desk의 자료형은 Desktop
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
	//기능처리용 클래스이기때문에  setter getter로 사용하지않는다
	//하지만, 이름만 다를뿐 생긴 포멧은 똑같음 setter-> 입력용 getter-> 출력용






}
