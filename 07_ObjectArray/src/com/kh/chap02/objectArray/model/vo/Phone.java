package com.kh.chap02.objectArray.model.vo;

public class Phone {
	
	private String name;
	private String brand;
	private int price;
	private String series;
	
	//�⺻������
	public Phone() {
		
	}
	//����ʵ忡���� �Ű����� ������
	public Phone(String name, String brand, int price, String series) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.series = series;
	}
	
	//setter�޼ҵ�
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
	
	//getter�޼ҵ�
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
	
	//����ʵ带 �ϳ��� ���ڿ��� ���� �����ִ� information�޼ҵ�
	public String information() {
		return "name: " + name + " brand: " + brand + " price: " + price +" series: "+ series;
	}

}
