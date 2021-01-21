package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
	
	// ���α׷� <-- ����(�Է�)
	public void fileRead() {
		
		// FileInputStream (���) : ���ϰ� ���� ����� ���
		// ObjectInputStream (����) : ��ü������ �о���̱� ���� ���Ǵ� ������Ʈ��
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phoneObject.txt"))){
			
		
				Phone ph = (Phone)ois.readObject();
				System.out.println(ph);
				
				// ��ӱ����� �Ǿ��ִ� ����Ŭ�������� ������ ���� catch�� ������ �ڽĸ���, �Ŀ��θ�
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}
}

	

