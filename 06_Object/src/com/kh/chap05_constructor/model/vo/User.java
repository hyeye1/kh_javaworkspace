package com.kh.chap05_constructor.model.vo;

public class User {
	
	// 아이디, 비밀번호, 이름, 나이, 성별
	// String   String String  int  char
	
	private String userId; // 객체 찍어낼때마다 각각 다르게 담아둘 틀만 만듬(1)
	private String userPwd; 
	private String userName; 
	private int age; 
	private char gender;
	
	//생성자부
	/*
	 public 클래스명([매개변수, 매개변수, . . ]) {
	 
	 }
	 
	 -생성자를 작성하는 목적
	 1. 객체를 생성해주기위한 목적
	 2. 매개변수로 전달받은 값들을 해당 필드에 바로 초기화까지 할 목적
	 
	 -생성자를  작성시 주의사항
	 1. 반드시 생성자명은 클래스명과 동일해야함
	 2. 반환형이 존재하지 않음 (메소드와 유사해서 헷갈릴 수 있음)
	 3. 기본생성자는 샐략시 기본적으로 jvm이 자동으로 만들어주나, 
	 	매개변수생성자가 명시적으로 작성되어있을 경우 자동으로 만들어주지 않음
	 	즉, 어찌됐던간에 기본생성자는 항상 기본으로 작성하는 습관을 들이자!
	 
	 */

	public User() {//우리가 직접 작성하지않으면 JVM이 알아서 생성해줌
		// 기본생성자 (매개변수 없는 생성자)
		// 단지 객체 생성만을 목적으로 할 때 사용
		// 기본생성자를 생략하는 경우 => 오류? => x
		//						    => jvm이 자동으로 만들어줌 
		
	}
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		//나머지필드들은 JVM의 초기값으로 되어있다.
	}
	
	public User(String userId, String userPwd, String userName, int age, char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
	}

	
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
