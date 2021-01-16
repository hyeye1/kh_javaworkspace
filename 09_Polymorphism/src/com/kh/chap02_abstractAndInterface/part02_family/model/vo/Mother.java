package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
	//인터페이스 클래스는 상속받는다는 표현보단 '구현' 이라는 표현을 사용한다. 
	
	private String babyBirth; // 아기의 탄생: 출산, 입양, 없음
	
	public Mother() {}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		return "mother[" + super.toString() + ", babyBirt : " + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		// 엄마가 밥먹으면 => 몸무게 10 증가
		
		super.setWeight(super.getWeight() + 10);
		
		// 건강도는 기존의 몸무게에 10 감소
		
		super.setHealth(super.getHealth() - 10);
		
	}
	

	@Override
	public void sleep() {
		// 건강도 10 증가
		super.setHealth(super.getHealth() + 10);
		
	}
	

}
