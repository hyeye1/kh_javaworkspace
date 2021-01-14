package com.kh.chap02_abstractAndInterface.par01_basic.model.vo;

public abstract class Sports {
	
	private int people; // 스포츠에 참여하는 선수 명수
	
	public Sports() {}
	
	public Sports(int people) {
		this.people = people;
	}
	
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	@Override
	public String toString() {
		return "people: " + people;
	}
	
	/*
	 * 몸통부  {} 존재하지않는
	 * 즉 , 미완성 메소드 == 추상메소드
	 * 
	 * 메소드 정의시 abstract 예약어 사용
	 * 
	 * 뿐만아니라 추상메소드가 존재하면 
	 * 이 클래스 또한 무조건 추상클래스로 작성해야한다.
	 * 
	 */
	public abstract void rule(); //_> 대괄호가없는 미완성메소드 : 추상메소드
	//추상메소드(미완성메소드)를 완료하고싶으면 접근제한자와 반환형 사이에 abstract라는 키워드 작성해야함
	
	

}
