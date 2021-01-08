package com.kh.example.run;

import com.kh.example.model.vo.Student;

public class ExampleRun1 {

	public static void main(String[] args) {
		Student s1 = new Student(); 
		
		s1.setGrade(100);
		s1.setClassroom(1);
		s1.setName("È«±æµ¿");
		s1.setHeight(166.6);
		s1.setGender('¿©');
		
		System.out.println(s1.information());

	}

}
