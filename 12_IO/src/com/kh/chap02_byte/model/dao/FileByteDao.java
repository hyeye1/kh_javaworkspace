package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException; //filenotfoundException�� �θ�� ioException
import java.io.FileOutputStream; // ����°��õ� ��Ʈ���� ���ִ� ��Ű�� => java.io
import java.io.IOException;

// DAO(Data Access Object) : �����Ͱ� �����Ǿ��ִ� ������ ���������ؼ� �����͸� �ְ�޴� Ŭ����

public class FileByteDao {
	
	
	// ���α׷��������� ���� �� �������� �ܺθ�ü�� (����ϱ�����)
	// ���α׷� (�ڹ� �Ǵ� �޸� ) --> �ܺθ�ü(����)
	// ��� : ���α׷� ���� �����͸� ���Ϸ� �������� ��, ���Ϸ� �����Ű�ڴ�.
	public void fileSave() {
		
		// FileOutputStream(1����Ʈ¥�� ���� ���) : "����"�� �����͸� 1����Ʈ ������ ����ϴ� ��Ʈ��
		
		FileOutputStream fout = null; // Ư������ ���� ������ ���� �ֵ��� �ٱ��� ���� �ۼ��ϰ� �ȿ��� ��ü���� �Ϸ��ϱ�

		try {
			// ��ü�������ָ� -> ������ ���ڴٴ� �� (�������� ��θ� ����ٴ� ��) ��, ��Ʈ���� ����°���
			// 1. FileOutputStream ��ü���� == �ش� ���ϰ� ���� ����Ǵ�  ��θ� ����ڴ�.
			//   �ش� ������ �������������� �ڵ����� ��������鼭 ��ο� ����ǰ�/ �����ϴ� �����̸� �ٷ� ��� ����
			fout = new FileOutputStream("a_byte.txt"/*, true*/); // ���� �����ϰ��� �ϴ� ���ϸ��� �Ű������� �Է� 
																			  // ���̾ ����ϰ�ʹٸ� true�Է�!!
																			  // true���ۼ��� => ������� (�⺻��false)
																			  // ture �ۼ���   => �̾ �ۼ��ȴ�.
			
			// 2. ��ΰ� ����� ������ ���� ���� ��η� ������ ����ϱ� write( ) �޼ҵ��� (����ϴٴ� �ǹ�)
			//    1����Ʈ ���� : -128 ~ 127 ������ ���� (��, ���Ͽ� ��ϵǱ�δ� �ش� ������ ������ ���ڰ� ��ϵȴ�)
			//                  ����, ������ �Ұ��ϴ� ( �ƽ�Ű�ڵ�ǥ�� ������ ������������, 0 ~ 127 ������ ����) 
			fout.write(97); // a_byte�� �ԷµȰ� Ȯ���غ��� 97�� a�� �ǹ��ϱ⿡  a�� ��ϵǾ��ִ�. 
			fout.write('b');
			//fout.write('��'); //int�� char�� �����Ӱ� �ڵ�����ȯ ����, �ѱ��� �ƽ�Ű�ڵ�ǥ���� ����⶧���� ���ڰ� ������ ���(����Ʈ��Ʈ�������δ� �������ִ�)
			
			byte[] bArr = {99, 100, 101};
			fout.write(bArr);
			// write(byte[] arr, int off, int len) : ���޵� �迭�� off�ε����������� len������ŭ ���
			fout.write(bArr, 1, 2); //bArr�� 1���ε������� 2���� ������ ���̴�.

			// 3. ��Ʈ���̿��� �Ϸ������� �ݳ��� ������Ѵ�. (�ݵ��!)
			//fout.close(); //������ Ȥ�ö� ���ܰ� �߻�������� �� ������ ��������ʴ´� ���� �ݵ�ý����ϱ����� finally������� �̵�
			
			
		} catch (FileNotFoundException e) { // FileNotFoundException : �������� �ʴ� ��θ� �������� �� �߻�! 
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
					// �߰��� ���ܰ� �߻��ϴ� ���� catch�������� �Ѿ�� �׷� �׻����� �ڵ�� ��������ʴ´�.	
		} finally { // �׷��� ���� ���� finally
			
				try {
					// � ���ܰ�  �߻��ϴ����� �ݵ�� ������ ���� �ۼ�
					fout.close(); // �ݵ�ý�Ʈ���̿��� �ݳ��Ͽ����ϱ⶧���� finally�ȿ� �ۼ�
					// �׸��� ����ó���� �� �ؾ��Ѵ� 
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	// ���α׷� <-- �ܺθ�ü(����) ; �о���̰ڴ�. �������ڴ�.
	// �Է� : ���Ϸκ��� �����͸� �������ڴ�. �޾ƿ���
	public void fileRead() {
		
		// FileInputStream : �����̶�� �ܺ� ��ü�κ��� �����͸� 1����Ʈ ������ �Է¹޴� ��Ʈ�� 
		
		// 1. FileInputStream ��ü ���� == �ش� ���ϰ��� �Է¿� ������θ� ����ڴ�.
		// �Է��̱⶧���� �ش������� �������������� FileNotFoundException �߻�
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("a_byte.txt"); 
			
			// 2. �ϼ��� ��ηκ��� ������ �Է¹ޱ� (��θ����==��ü�����, so ��θ����ϼ���)
			//   ��, 1byte�����θ� �о�´�. 
			// fin.read(); 
			//System.out.println(fin.read()); //����ϱ����� println����
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//System.out.println(fin.read());
			//(���� �ϳ��� 1����Ʈ ������ �������⶧���� ���� ����ŭ ����� ������Ѵ�.)
			// ������ ���Ͽ� �󸶸�ŭ�� �����Ͱ� �ִ��� �𸥴ٸ�?!
			
			// �ذ���1. ���ѹݺ����� �������� ���ǰ˻�
			/*
			int value = 0;
			while(true) {
				value = fin.read(); // value��� ������ ����س���
				if(value == -1) {// value�� -1�� ��ġ�Ұ�� �ݺ��� �����Ű��
					break;
				}
				System.out.println(value);
			}
			*/
			
			// �ذ���2.
			int value = 0; 
			while( (value = fin.read()) != -1 ) { // ���ǹ��� �������� -1�� �ɶ����� ����
				System.out.println((char)value); // int�� ��µǱ⶧���� ���ڷ� �а�ʹٸ� (char) �� ����ȯ���ֱ�
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 3. �پ� ��Ʈ�� �ݳ��ϱ�
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}
