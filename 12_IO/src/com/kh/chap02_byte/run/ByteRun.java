package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {

	public static void main(String[] args) {
		/*
		 * " ����Ʈ ��� ��Ʈ�� " �� ������ ������ ����� �غ���
		 * 
		 * ����Ʈ ��Ʈ��: �����͸� 1����Ʈ �����θ� ������� �� �ִ� ���! (����) ���(OutputStream)/�Է�(InputStream)
		 * ��� ��Ʈ��: �ܺθ�ü�� ���������� ����Ǵ� ���
		 * 
		 * ����Ʈ��ݽ�Ʈ��: �ܺθ�ü�� �����ϰ� �� �ܺθ�ü�� ���������� ����Ǵ� 1����Ʈ ������ ��θ� ����ڴ�!
		 * 
		 * XXXInputStream: XXX ��ü�κ��� �����͸� �Է¹޴� ���(�ܺθ�ü�� ���� �����͸� �о���ڴ� �������ڴ�)
		 * xxxOutputStream : xxx  ��ü�� �����͸� ��¹޴� ��� (�ܤ��θ�ü�κ��� �����͸� �������ڴ�)
		 * 
		 * File Input/Output Stream        => �ܺθ�ü�� ������ ����
		 * Audio Input/Output Stream       => �ܺθ�ü�� ������� ����
		 * Piped Input/Output Stream       => �ܺθ�ü�� �Ǵٸ� ���μ����� ����
		 */
		
		FileByteDao fb = new FileByteDao();
		//fb.fileSave();
		fb.fileRead();
		 
	}

}
