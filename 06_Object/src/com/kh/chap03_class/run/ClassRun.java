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
		Product pd = new Product();
		
		pd.setpName("갤럭시");
		pd.setPrice(1300000);
		pd.setBrand("샘송");
		
		System.out.println(pd.getBrand()+"제품의 "+pd.getpName()+"는 "+pd.getPrice()+"원 입니다.");
		System.out.println(pd.getpName());
		System.out.println(pd.getPrice());
		System.out.println(pd.getBrand());
		
	}

}
