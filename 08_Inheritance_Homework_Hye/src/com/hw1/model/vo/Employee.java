package com.hw1.model.vo;

public class Employee extends Person {
	private int salary; //�޿�
	private String dept; // �μ�
	
	public Employee() {}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height,weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	@Override
	public String information() {
		return super.information() + ", salary: " + salary + ", dept: "+ dept;
	}

}
