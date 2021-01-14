package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle {
	
	private int tire; //타이어 갯수
	private int wing; // 날개 갯수
	
	public Airplane () {}
	
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);
		this.tire = tire;
		this.wing = wing;
	}
	
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	
	@Override //1. 남에게 알려주는 목적 2. 오버라이딩인데 틀리게 쓰진않았는지 체크가능 
	public String toString() {
		return super.toString() + ", tire: " +tire + ", wing: " +wing;
	}
	
	@Override //어노테이션 -> 나 여기 밑에 재정의한거야 라고 알려줌  
	public void howToMove() { //-> 오버라이드 된 언오테이션을 붙여준경우 메소드 이름 동일하게 작성해야함
		System.out.println("바퀴로 가다가 날개로 난다");
	}

} 
