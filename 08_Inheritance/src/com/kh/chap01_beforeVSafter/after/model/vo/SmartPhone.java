package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
	
	private String mobileAgency;
	
	public SmartPhone() {}
	
	public SmartPhone(String pName, String pCode, String brand, int price, String mobileAgency) {
		super(pName, pCode, brand, price);
		this.mobileAgency = mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return super.information() +", mobileAgency: " + mobileAgency;
	}

}
