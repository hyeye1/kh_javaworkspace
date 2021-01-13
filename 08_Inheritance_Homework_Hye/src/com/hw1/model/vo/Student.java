package com.hw1.model.vo;

public class Student extends Person {
	
	private int grade; //학년
	private String major; //전공
	
	public Student() {}
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		super.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	@Override
	public String information(){
		return super.information() + ", grade: "+grade + ", major: "+ major;
	}
}
