package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class ClassRun {
	
	public static void main(String[] args) {
		
		// ���ε��� ���������� �����ϴ� ���α׷� 
		// �̸�(String name), ����(int age), ����(char gender), ��ȭ��ȣ(String phone), �̸���(String email)
		// Person�̶�� Ŭ������ ���� ��� ������ ������ �� �ִ� ����� ���� �ڷ���(������ �ڷ��� == �������� �ڷ����� �������� ������ ������ �� �ִ�) ����� ����!
		
		//person p => name: null / age: 0/ gender:' '/ phone: null/ email: null
		Person p = new Person();
		
		p.setName("�踻��");
		p.setAge(34);
		p.setGender('F');
		p.setPhone("010-1111-2222");
		p.setEmail("malsoon@gmail.com");
		
		System.out.println(p.getName());
		System.out.println(p.getGender());
		System.out.println(p.getEmail());
		
		
		//1. product ��ü ����
		
		//2. setter �޼ҵ带 ���� 
		//   pname �ʵ忡�� ������ ���
		//   price �ʵ忡�� 1300000 
		//   brand �ʵ忡�� "����"
		Product pd = new Product();
		
		pd.setpName("������");
		pd.setPrice(1300000);
		pd.setBrand("����");
		
		System.out.println(pd.getBrand()+"��ǰ�� "+pd.getpName()+"�� "+pd.getPrice()+"�� �Դϴ�.");
		System.out.println(pd.getpName());
		System.out.println(pd.getPrice());
		System.out.println(pd.getBrand());
		
	}

}
