package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {

	public static void main(String[] args) {
		/*
		 * ���ڱ�ݽ�Ʈ��
		 �ܺθ�ü �����ϰ� �� �ܺθ�ü�� ����������
		 �����͸� 2byte������ ������
		 */
		
		FileCharDao fd = new FileCharDao();
		//fd.fileSave();
		fd.fileRead();
	}

}
