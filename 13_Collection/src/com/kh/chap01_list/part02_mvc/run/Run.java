package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicView;

/*
 * m (model) : �����͸� ����ϴ� ����
 * model.vo/ model.dao
 * v (view) : �ð����� ��� ��� (ȭ��) => ��� �� �Է��� ������ ��Ŭ�������� �ۼ��� ���̴�.
 * c (controller) : 
 * r run : ���ุ ������ �޼ҵ�
 */
public class Run {

	public static void main(String[] args) {
		
		MusicView mv = new MusicView();
		
		mv.mainMenu();
		
		
	}

}
