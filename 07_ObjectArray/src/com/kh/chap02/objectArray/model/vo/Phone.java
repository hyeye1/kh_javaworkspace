package com.kh.chap02.objectArray.model.vo;

public class Phone {
	
	private String name;
	private String brand;
	private int price;
	private String series;
	
	//기본생성자
	public Phone() {
		
	}
	//모든필드에대한 매개변수 생성자
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	//setter메소드
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSeries(String series) {
		this.series = series;
	}
	
	//getter메소드
	public String getName() {
		return name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getSeries() {
		return series;
	}
	
	//모든필드를 하나의 문자열로 합쳐 돌려주는 information메소드
	public String information() {
		return "name: " + name + " brand: " + brand + " price: " + price +" series: "+ series;
	}

}
