package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	
	//���α׷� --> ���� ( ���)!
	
	public void fileSave() {
		// 1. FileWriter ��ü����(������ ������ ��������鼭 ����/ ������ �׳ɿ���)
		FileWriter fw = null;
		try {
			fw= new FileWriter("b_char.txt");
			
			// 2. write() �޼ҵ� ����ؼ� ������ ���
			fw.write("��! ��մ� ��");
			fw.write('A');
			fw.write(' ');
			fw.write("\n");
			
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
			
		} catch(IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				//3. �پ� �ڿ� �ݳ�
				fw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//���α׷� <-- ����(�Է�)
	public void fileRead() {
		
		// fileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է¹ޱ�
		
		FileReader fr = null;
		try {
			fr = new FileReader("b_char.txt");
			
			int value =0;
			while((value = fr.read()) != -1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
