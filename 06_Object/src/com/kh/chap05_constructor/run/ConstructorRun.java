package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {
	public static void main(String[] args) {
		
		User u1 = new User();
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("�踻��");
		u1.setAge(20);
		u1.setGender('F');
		
	//	System.out.printf("userId : %s, userPwd : %s, userName : %s, age : %d, gender : %c", 
	//			u1.getUserId(), u1.getUserPwd(), u1.getUserName(), u1.getAge(), u1.getGender());
		
		System.out.println(u1.information());
		
		// 2. �Ű����� �����ڷ� ��ü ������ ���ÿ� �� �ʵ忡 �����
		User u2 = new User("user02", "pass02", "ȫ�浿");
		
		System.out.println(u2.information());
		
		// 3. �Ű����� 5�� �ڸ� �����ڷ� ��ü ������ ���ÿ� �� �ʵ忡 �����
		User u3 = new User("user03", "pass03", "������", 19, 'F');
		
		System.out.println(u3.information());
		
	}
							
}
