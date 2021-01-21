package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
	
	// 프로그램 <-- 파일(입력)
	public void fileRead() {
		
		// FileInputStream (기반) : 파일과 직접 연결된 통로
		// ObjectInputStream (보조) : 객체단위로 읽어들이기 위해 사용되는 보조스트림
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneObject.txt"))){
			
		
				Phone ph = (Phone)ois.readObject();
				System.out.println(ph);
				
				// 상속구조로 되어있는 예외클래스들을 가지고 다중 catch블럭 쓸때는 자식먼저, 후에부모
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}

	

