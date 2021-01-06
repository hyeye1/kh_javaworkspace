package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {
	
	public static void main(String[] args) {
		
		// 국민들의 인적사항을 관리하는 프로그램 
		// 이름(String name), 나이(int age), 성별(char gender), 전화번호(String phone), 이메일(String email)
		// Person이라는 클래스로 위의 모든 값들을 보관할 수 있는 사용자 정의 자료형(나만의 자료형 == 여러개의 자료형의 여러개의 값들을 보관할 수 있는) 만들고 오자!
		
		//person p => name: null / age: 0/ gender:' '/ phone: null/ email: null
		Person p = new Person();
		
		p.setName("김말순");
		p.setAge(34);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("malsoon@gmail.com");
		
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getEmail());
		
		
		//1. product 객체 생성
		
		//2. setter 메소드를 통해 
		//   pname 필드에는 갤럭시 담기
		//   price 필드에는 1300000 
		//   brand 필드에는 "샘송"
		Product p1 = new Product();
		
		p1.setpName("갤럭시");
		p1.setPrice(1300000);
		p1.setBrand("샘송");
		
		System.out.println(p1.getBrand()+"제품의 "+p1.getpName()+"는 "+p1.getPrice()+"원 입니다.");
		System.out.println(p1.getpName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getBrand());
		
		
		Product p2 = new Product();
		
		p2.setpName("아이폰");
		p2.setPrice(1500000);
		p2.setBrand("사과");
		
		//사과제품은 얼마입니당
		System.out.printf("%s제품의 %s은 %d입니다.", p2.getBrand(), p2.getpName(), p2.getPrice());
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
