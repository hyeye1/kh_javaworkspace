package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	/*
	 * 세클래스가 공통적으로 가지고있는 요소 기입
	 */
	
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	
	public Product() {}
	
	public Product(String pName, String pCode, String brand, int price) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String pName() {
		return pName;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpCode() {
		return pCode;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public String information() {
		return "brand: " + brand + ", pCode: " + pCode + ", pName: " + pName +", price: " + price;
	}

}
