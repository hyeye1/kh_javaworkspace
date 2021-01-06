package com.kh.chap03_class.model.vo;


//클래스에 작성 가능한 접근제한자는 -> public 과 default(생략)
public class Product {
	//제품명, 제품가격, 제품브랜드
	private String pName;
	private int price;
	private String brand;
	
	//setter 메소드
	
	public void setpName(String pName) {
		this.pName= pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//getter 메소드
	
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getBrand() {
		return brand;
	}
	
	
	
	
	
	
	
	
}
