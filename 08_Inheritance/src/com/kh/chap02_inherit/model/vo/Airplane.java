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
	
	public String information() {
		return super.information() + ", tire: " +tire + ", wing: " +wing;
	}
	
	public void howToMove() {
		System.out.println("바퀴로 가다가 날개로 난다");
	}

}
