package com.kh.example.run;

import com.kh.example.model.vo.Dog;

public class ExampleRun2 {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.setKind("���޶�Ͼ�");
		d1.setName("����");
		d1.setAge(3);
		d1.setColor("ũ�����̺�");
		
		Dog d2 = new Dog();
		
		d2.setKind("��ī���ĴϿ�");
		d2.setName("��ġ");
		d2.setAge(11);
		d2.setColor("����");
		
		System.out.println(d1.information());
		System.out.println();
		System.out.println(d2.information());
		
	}

}
