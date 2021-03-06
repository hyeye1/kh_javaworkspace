package com.kh.chap02_inherit.model.vo;

public class Vehicle {
	private String name; //이름
	private double mileage; //연비
	private String kind; //종류
	
	public Vehicle() {}
	
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	} 
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	
	public void setKind(String kind) { 
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	
	@Override
	public String toString() {
		return "name: " + name + ", mileage: " + mileage + ", kind: " + kind;
	}
	
	
	public void howToMove() {
		System.out.println("Just move .. somehow...");
	}

}
