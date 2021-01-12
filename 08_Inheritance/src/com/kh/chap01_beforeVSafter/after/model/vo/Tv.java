package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product{
	
	private int inch;
	
	public Tv() {}
	
	public Tv(String pName, String pCode, String brand, int price, int inch) {
		super(pName, pCode, brand, price);
		this.inch = inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return super.information() +", inch: " + inch;
	}

}
