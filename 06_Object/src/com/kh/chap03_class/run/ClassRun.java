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
		Product p1 = new Product();
		
		p1.setpName("������");
		p1.setPrice(1300000);
		p1.setBrand("����");
		
		System.out.println(p1.getBrand()+"��ǰ�� "+p1.getpName()+"�� "+p1.getPrice()+"�� �Դϴ�.");
		System.out.println(p1.getpName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getBrand());
		
		
		Product p2 = new Product();
		
		p2.setpName("������");
		p2.setPrice(1500000);
		p2.setBrand("���");
		
		//�����ǰ�� ���Դϴ�
		System.out.printf("%s��ǰ�� %s�� %d�Դϴ�.", p2.getBrand(), p2.getpName(), p2.getPrice());
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
