package com.kh.chap04_assist.part01_buffered.run;

import com.kh.chap04_assist.part01_buffered.model.dao.BufferedDao;

public class BufferedRun {

	public static void main(String[] args) {
		/*
		 * 
		 * ������Ʈ��
		   �Ϲ� ��ݽ�Ʈ��(�ܺθ�ü�� ���� ���� �Ǿ��ִ� ���)������
		   �����ߴ� ������ �������شٰų�
		   ��ݽ�Ʈ�������� �������� �ʴ� �߰����� �޼ҵ带 Ȱ���Ҷ� ���
		   ������Ʈ�� �ܵ���� �Ұ� (�ܵ� ��ü�����Ұ�)
		   
		   ������Ʈ�� ������ = new ������Ʈ��(��ݽ�Ʈ����ü); --> ��ݽ�Ʈ����ü�� �Ѱ��ָ鼭 �������־����
		  
		   > BufferedXXX : �ӵ������ ���� �� ����!!
		   					��? ���۰����� �����ؼ� �ѹ��� ��Ƴ��ٰ� �Ѳ����� �Է¹� ��� ����
		   					
		  
		  
		 */
		
		BufferedDao bd = new BufferedDao();
		//bd.fileSaver();
		bd.fileRead();
		
	}

}
