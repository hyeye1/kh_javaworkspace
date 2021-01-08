package com.kh.example.run;

import com.kh.example.model.vo.Dog;

public class ExampleRun2 {
	
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		
		d1.setKind("포메라니안");
		d1.setName("망고");
		d1.setAge(3);
		d1.setColor("크림세이블");
		
		Dog d2 = new Dog();
		
		d2.setKind("코카스파니엘");
		d2.setName("망치");
		d2.setAge(11);
		d2.setColor("브라운");
		
		System.out.println(d1.information());
		System.out.println();
		System.out.println(d2.information());
		
	}

}
