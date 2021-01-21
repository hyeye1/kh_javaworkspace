package com.kh.chap04_assist.part02_object.model.vo;

import java.io.Serializable;

public class Phone implements Serializable{ //직렬화 선언
	
	private String brand;
	private int price;
	
	//기본생성자
	public Phone() {}
	
	public Phone(String brand, int price) {
		this.brand = brand;
		this.price = price;
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
	
	public String toString() {
		return "Phone[brand=" + brand +", price=" + price + "]";
	}
	

}
