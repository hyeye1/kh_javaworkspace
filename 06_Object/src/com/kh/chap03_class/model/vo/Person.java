package com.kh.chap03_class.model.vo;

public class Person {
	
	// 필드부
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// 생성자부
	
	
	// 메소드부
	// * setter메소드 ( 전달값 받아서 각 필드에 대입 시켜주는) 
	
	public void setName(String name) { 
		this.name = name; // 필드부에 있는 name에 해당 매개변수 name값을  대입하겠다.
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	//getter 메소드
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
}
