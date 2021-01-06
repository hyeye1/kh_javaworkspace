package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 아이디, 비밀번호, 이름, 나이, 성별
	// String   String String  int  char
	
	private String userId; // 객체 찍어낼때마다 각각 다르게 담아둘 틀만 만듬(1)
	private String userPwd; 
	private String userName; 
	private int age; 
	private char gender;
	
	// 전달값 받아서 각 필드에 대입시켜주는 setter메소드 5개 (2)
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// 각 필드값을 돌려주는 getter 메소드 5개(3)
	
	public String getUserId() {
		return userId;
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	// 모든 필드값을 하나의 문자열로 연이어서
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " + userName + ", age : " + age + ", gender : " + gender;
	}

}
