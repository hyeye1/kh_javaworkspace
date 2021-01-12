package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {
	
	private String pName;
	private String pCode;
	private String brand;
	private int price;
	private String mobileAgency;
	
	public SmartPhone() {}
	public SmartPhone(String pName, String pCode, String brand, int price, String mobileAgency) {
		this.pName = pName;
		this.pCode = pCode;
		this.brand = brand;
		this.price = price;
		this.mobileAgency = mobileAgency;
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
	public void setAllInOne(String mobileAgency) {
		this.mobileAgency = mobileAgency;
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
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return "상품명 : " + pName + ", 상품고유코드 : " + pCode + ", 브랜드명 : " 
	+ brand + ", 가격: " + price + ", 통신사 : " + mobileAgency ;
	}
	

}
