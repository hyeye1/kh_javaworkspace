package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		// ���������� � �ܺ� ��ü (����) �� ���ؼ� �����͸� �Է� �� ����ϱ� ���� 
		// ������ ����� �� ���� ������ ��������!!
		// java.io.file Ŭ������ ������ �۾�
		
		try{
			
			// 1. ��������� ���� �������� ä�� ���ϸ� �ۼ��� �⺻������ ���� �� ������Ʈ ������ ���ϻ���
			File f1 = new File("test.txt");
			f1.createNewFile(); // �� �޼ҵ带 �����ؾ߸� ���������� ���������
			
			// 2. ��������� �� ���ϸ� �ۼ��� �ش� �� ��ο� ������ ����
			File f2 = new File("C:\\test1\\test.txt"); // �ذ��� 1 . ��θ� ã�� �� �ְԲ� ������ ������ֱ�
			f2.createNewFile();
			
			//3. �������� �� ���� �����ϱ�
			File testFolder = new File("C:\\test2");
			testFolder.mkdir();
			
			File testFile = new File("C:\\test2\\test.txt");
			testFile.createNewFile();
			
			
			//4. ������ ����������� ���� ������ ���� �����ϱ�(������Ʈ���� ���� ������)
			File folder = new File("test");
			folder.mkdir();
			File file = new File("test\\person.txt");
			file.createNewFile();
			
			// File ��ü���� �����ϴ� �޼ҵ� 
			System.out.println(folder.isFile());
			System.out.println(file.isFile());
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("�������� : " + file.getParent());
			System.out.println("���Ͽ뷮 : " + file.length());
			System.out.println("������ : " + file.getAbsolutePath());
			
		} catch(IOException e ) {
			e.printStackTrace();
		}
		
		
		System.out.println("���α׷��� �����մϴ�.");
		/*
		 * ���α׷����� �����͸� �ܺθ�ü(�����, ����Ŀ, ����, �ý���..) �� ����Ѵٰų� 
		 * �Ǵ� �ܺθ�ü(Ű����, ����ũ, ����, �ý��� ..) �κ��� ������ �Է��� �޾ƿ��� ������ �ϰ��� �Ѵٸ�
		 * �ݵ�� ���α׷��� �ܺθ�ü���� "���"�� �������� ==> "��Ʈ��"
		 * 
		 * ��Ʈ��
		 * �ܹ���: �ϳ��� ��Ʈ������ ������� ���ÿ� x, �Է¿�/��¿� ��Ʈ�� ����
		 * ���Լ���(FiFo) �������� �������̱⶧���� ���� ���� ���� ���� => �ð�����
		 * 
		 * 
		 * 
		 * ��Ʈ���� ����
		 * > ����� ������
		 * - ����Ʈ ��Ʈ�� : 1byte¥���� �Դٰ��� �� �� ���� ������ ������ (��ΰ� ����) => �Է� (inputStream)/���(outputStream)
		 * - ���ڽ�Ʈ�� : 2byte ¥���� �Ӵٰ��� �� �� ���� ������ ������ (��ΰ� ����) => �Է�(reader)/���(writer)
		 * => xxxInputStream/ xxxOutputStream -> �� �θ� : inputStream & OutputStream
		 * => xxxReader/ xxxWriter -> �� �θ� : Reader & Writer
		 * 
		 * >�ܺθ�ü�� �������� ����
		 * - ��ݽ�Ʈ��(�⺻��Ʈ��): �ܺθ�ü�� ���������� �����ϴ� ���
		 * - ������Ʈ��: ��ݽ�Ʈ�������� ������ ������ �������ִ� �뵵 (�ܺθ�ü�� ���������� ����Ǵ� ��ΰ� �ƴϴ�)
		 * 				(�ӵ��� ����Ų�ٰų�, �ڷ����� ���缭 ��ȯ�Ѵٰų� ��� ������ ��ɵ��� �����ϴ� ��Ʈ��)
		 * 				��, ������Ʈ���� �ܵ����� ��� �Ұ�! �ܺθ�ü��  ���������� ����Ǵ� ��ݽ�Ʈ�� �ʼ�!
		 * 
		 * 
		 * 
		 */
	}

}
