package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{
	private boolean penFlag;
	
	public Tablet() {}
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
	public boolean isPenFlag() {     // boolean자료형에는 get이아니라 is로 작성
		return penFlag;
	}
	
	@Override
	public String toString() {
		return super.toString() +", penFlag: " + (penFlag? "있음" : "없음"); //삼항연산자: 간단한 조건식 가능  (조건식? 참일경우 : 거짓일경우)
	}
	

}
