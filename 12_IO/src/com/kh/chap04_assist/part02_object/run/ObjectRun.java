package com.kh.chap04_assist.part02_object.run;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;

public class ObjectRun {

	public static void main(String[] args) {
		
		ObjectDao od = new ObjectDao();
		od.fileSave("phoneObject.txt");

	}

}
