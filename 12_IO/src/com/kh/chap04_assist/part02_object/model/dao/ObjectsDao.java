package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	//���α׷� --> ����(���)
	public void fileSave(String fileName) {
		
		/*
		Phone[] arr = new Phone[3];
		arr[0] = new Phone("����", 1000000);
		arr[1] = new Phone("�Ｚ", 2000000);
		arr[2] = new Phone("����", 1500000);
		*/
		
		// ArrayListŬ������ Phone�� ������ �� �ֵ��� ��ü ����(���׸�����ؼ�)
		ArrayList<Phone> phoneList = new ArrayList<>();
		
		phoneList.add(new Phone("����", 1000000));
		phoneList.add(new Phone("�Ｚ", 2000000));
		phoneList.add(new Phone("����", 1500000));
				
		System.out.println(phoneList);
		
		// FileOutputStream
		// ObjectOutputStream
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
			
			/*
			for(int i =0; i<arr.length;i++) {
				oos.writeObject(arr[i]);
			}
			*/
			for(int i=0; i<phoneList.size(); i++) {
				oos.writeObject(phoneList.get(i));
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) { 	
			e.printStackTrace();
		}

	}
	
	// ���α׷� <-- ����(�Է�)
	public void fileRead() {
		
		// FileInputStream +objectInputStream
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phones.txt"))){
			
			while(true) {
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
				System.out.println(ois.readObject());
			}
			
		} catch (FileNotFoundException e) { // ĳġ���� �ۼ��Ǿ��ִٴ°͸����ε� ����ó���� �Ȱ�
			e.printStackTrace(); //������ �ۼ����������� ��� ������ �߻��ߴ��� �� �� ����.
			// ��� ������ �������� �����ؼ� ������ִ°� print ����ϴ� stacktrace��� ������ ������ 
			//���������� ������ ��𼭳����� �˷��ִ� ����
		} catch (EOFException e) {
			//e.printStackTrace();
			System.out.println("������ �� �о����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); // 
		}
		
		System.out.println("���α׷��� ����˴ϴ�.");
				
	} 
	
	/*
	 * ������Ʈ��
	 - Buffered InputStream/ OutputStream /Reader/Writer : ���۶�� ������ �����������ν� ������ ����½� ���ۿ� �����͸� ��Ƽ� �Ѳ�����
	 										������� �ϰԲ� ���ֱ⶧���� �ӵ���� ����.
	 - Object InputStream/OutputStream					 : ��ü��ü�� ������� �� �ְԲ� �����ִ� ��Ʈ��( �� ����ȭó���� ���־����)
	 - Data InputStream/OutputStream					 : �⺻�ڷ����� �����͸� ����°����ϰ� ������					
	 */

}
