package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// 프로그램 --> 파일(출력)
	public void fileSave(String fileName) {
		
		Phone ph = new Phone("삼성", 1500000);
		
		// 객체단위를 파일에 출력하고자할때 필요한 스트림
		// FileOutputStream(기반) : 파일에 데이터를 출력하는 기반 스트림
		// ObjectOutputStream(보조) : 객체단위로 출력할때 필요한 보조스트림
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
