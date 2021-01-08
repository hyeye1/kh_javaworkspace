package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {
	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("김말순");
		u1.setAge(20);
		u1.setGender('F');
		
	//	System.out.printf("userId : %s, userPwd : %s, userName : %s, age : %d, gender : %c", 
	//			u1.getUserId(), u1.getUserPwd(), u1.getUserName(), u1.getAge(), u1.getGender());
		
		System.out.println(u1.information());
		
		// 2. 매개변수 생성자로 객체 생성과 동시에 각 필드에 값담기
		User u2 = new User("user02", "pass02", "홍길동");
		
		System.out.println(u2.information());
		
		// 3. 매개변수 5개 자리 생성자로 객체 생성과 동시에 각 필드에 값담기
		User u3 = new User("user03", "pass03", "강개순", 19, 'F');
		
		System.out.println(u3.information());
		
	}
							
}
