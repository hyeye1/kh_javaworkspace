package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	// ���α׷� --> ����(���)
	public void fileSave(String fileName) {
		
		Phone ph = new Phone("�Ｚ", 1500000);
		
		// ��ü������ ���Ͽ� ����ϰ����Ҷ� �ʿ��� ��Ʈ��
		// FileOutputStream(���) : ���Ͽ� �����͸� ����ϴ� ��� ��Ʈ��
		// ObjectOutputStream(����) : ��ü������ ����Ҷ� �ʿ��� ������Ʈ��
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			oos.writeObject(ph);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
