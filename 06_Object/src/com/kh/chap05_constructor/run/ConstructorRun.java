package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {
	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("±è¸»¼ø");
		u1.setAge(20);
		u1.setGender('F');
		
	//	System.out.printf("userId : %s, userPwd : %s, userName : %s, age : %d, gender : %c", 
	//			u1.getUserId(), u1.getUserPwd(), u1.getUserName(), u1.getAge(), u1.getGender());
		
		System.out.println(u1.information());
		
		
	}
							
}
