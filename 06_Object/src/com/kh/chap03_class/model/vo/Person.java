package com.kh.chap03_class.model.vo;

public class Person {
	
	// �ʵ��
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	// �����ں�
	
	
	// �޼ҵ��
	// * setter�޼ҵ� ( ���ް� �޾Ƽ� �� �ʵ忡 ���� �����ִ�) 
	
	public void setName(String name) { 
		this.name = name; // �ʵ�ο� �ִ� name�� �ش� �Ű����� name����  �����ϰڴ�.
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
	
	//getter �޼ҵ�
	
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
