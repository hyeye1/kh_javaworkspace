package com.kh.chap05_constructor.model.vo;

public class User {
	
	// ���̵�, ��й�ȣ, �̸�, ����, ����
	// String   String String  int  char
	
	private String userId; // ��ü �������� ���� �ٸ��� ��Ƶ� Ʋ�� ����(1)
	private String userPwd; 
	private String userName; 
	private int age; 
	private char gender;
	
	// ���ް� �޾Ƽ� �� �ʵ忡 ���Խ����ִ� setter�޼ҵ� 5�� (2)
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
	
	// �� �ʵ尪�� �����ִ� getter �޼ҵ� 5��(3)
	
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
	
	// ��� �ʵ尪�� �ϳ��� ���ڿ��� ���̾
	public String information() {
		return "userId : " + userId + ", userPwd : " + userPwd + ", userName : " + userName + ", age : " + age + ", gender : " + gender;
	}

}
