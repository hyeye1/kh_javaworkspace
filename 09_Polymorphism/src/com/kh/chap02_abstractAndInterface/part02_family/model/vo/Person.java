package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person {
	
	private String name;
	private double weight;
	private int health;
	
	// 생성자
	public Person() {}
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	
	@Override
	public String toString() {
		return "name: " +name+ ", weight: " +weight+ ", health: " + health;
	}
	//추상메소드 추가
	//public abstract void eat();
	//public abstract void sleep();
}
