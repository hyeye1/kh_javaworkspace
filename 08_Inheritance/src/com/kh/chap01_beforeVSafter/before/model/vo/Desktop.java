package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
	
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	private boolean allInOne;
	
	public Desktop() {
		
	}
	
	public Desktop(String pName, String pCode, String brand, int price, boolean allInOne) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.allInOne = allInOne;
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
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public String information() {
		return "상품명 : " + pName + ", 상품고유코드 : " + pCode + ", 브랜드명 : " 
	+ brand + ", 가격: " + price + ", 일체 여부 : " + allInOne ;
	}
	
	
	

}
