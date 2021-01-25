package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
	
	private String name;
	private int age;
	private int score;
	
	public Student() {}
	
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	
	/*
	// equals  메소드 재정의: 모든 필드값이 일치하면 true 리턴/ 그게아닐경우 false리턴
	@Override
	public boolean equals(Object obj) {
		// Student객체.equals(비교할Student객체)
		// Student this    비교     Object obj
		Student other = (Student)obj;
		// this             비교   other
		
		// this.name == other.name
		// this.age == other.age
		// this.score == other.score
		
		if(this.name.equals(other.name) && this.age == other.age && this.score == other.score) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	@Override
	public int hashCode() {
		
		return (name+age+score).hashCode();
	}
	*/
	
	

}
