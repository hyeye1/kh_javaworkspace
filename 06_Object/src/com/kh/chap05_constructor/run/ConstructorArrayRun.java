package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorArrayRun {
	public static void main(String[] args) {
		
		User[] arr = new User[3];
		
		arr[0] = new User();
		
		arr[0].setUserId("user01");
		arr[0].setUserPwd("pass01");
		arr[0].setUserName("±è¸»¼ø");
		arr[0].setAge(20);
		arr[0].setGender('F');

		
		System.out.println(arr[0].information());
		
	
		arr[1] = new User("user02", "pass02", "È«±æµ¿");
		
		System.out.println(arr[1].information());
		
		arr[2] = new User("user03", "pass03", "°­°³¼ø", 19, 'F');
	
		System.out.println(arr[2].information());
		
	}
							
}
