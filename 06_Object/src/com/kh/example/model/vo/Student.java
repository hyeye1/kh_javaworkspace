package com.kh.example.model.vo;

public class Student {
	
	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	
	public void setGender (char gender) {
		this.gender = gender;
	}
	
	
	public int getGrade() {
		return grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	
	public String getName() {
		return name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String information() {
		return "성적 : " + grade + "\n반 : " + classroom + "\n이름 : " + name + "\n키 : " + height + "\n성별 : " + gender ;
	}

}
