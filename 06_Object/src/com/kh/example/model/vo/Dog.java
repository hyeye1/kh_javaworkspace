package com.kh.example.model.vo;

public class Dog {
	
	/*
	 * 강아지 종류 이름 나이 털색깔
	 * 
	 * -kind : String
	 * -name : String
	 * -age : int
	 * -color : String 
	 * 
	 * +set: void
	 * +get: 각 자료형
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
		return "종류 : " + kind + "\n이름 : " + name + "\n나이 : " + age +"\n털 색깔 : " + color ; 
	}
	
	

}
