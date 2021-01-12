package com.kh.chap01_beforeVSafter.before.model.vo;

public class Tv {
	
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	private int inch;
	
	public Tv() {
		
	}
	
	public Tv(String pName, String pCode, String brand, int price, int inch) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.inch = inch;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String getpName() {
		return pName;
	}
	public String getpCode() {
		return pCode;
	}
	
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public int getInch() {
		return inch;
	}
	public String information() {
		return "상품명 : " + pName + ", 상품고유코드 : " + pCode + ", 브랜드명 : " 
				+ brand + ", 가격: " + price + ", 인치: " + inch ;
	}

}
