package com.kh.example.model.vo;

public class Dog {
	
	/*
	 * ������ ���� �̸� ���� �л���
	 * 
	 * -kind : String
	 * -name : String
	 * -age : int
	 * -color : String 
	 * 
	 * +set: void
	 * +get: �� �ڷ���
	 * +information() : String
	 * 
	 * +main
	 */
	
	private String kind;
	private String name;
	private int age;
	private String color;
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public String getKind() {
		return kind;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getColor() {
		return color;
	}
	
	public String information() {
		return "���� : " + kind + "\n�̸� : " + name + "\n���� : " + age +"\n�� ���� : " + color ; 
	}
	
	

}
