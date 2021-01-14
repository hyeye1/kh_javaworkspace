package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Person;

public class FamilyRun {
	
	public static void main(String[] args) {
		/* 
		Person p1 = new Mother("�����", 50, 70, "���");
		Person p2 = new Baby ("���Ʊ�", 3.5, 70);
		
		System.out.println(p1);
		System.out.println(p2);
		
		p1.eat();
		p2.eat();
		p1.sleep();
		p2.sleep();
		
		System.out.println("=======������ =======");
		System.out.println(p1);
		System.out.println(p2);
		*/
		
		Basic b1 = new Mother("�����", 50, 70, "���");
		Basic b2 = new Baby("���Ʊ�", 3.5, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		b1.sleep();
		b2.sleep();
		
		/*
		 * extends �Ϲ�Ŭ���� --> extends �߻�Ŭ���� --> implements �������̽�
		 * ----------------------------------------------------------->>
		 *    					�������� �� £���� (�Ծ��� ����)
		 *  Ŭ������:                  Ŭ���� extends Ŭ����(���ϻ��)								ȭ��ǥ: �Ǽ�
		 *  Ŭ������ �������̽���:      Ŭ���� implements �������̽�, �������̽�,. . (���߻�Ӱ���)		ȭ��ǥ: ����
		 *  �������̽��� �������̽� ��: �������̽� extends �������̽�, �������̽� , . .					ȭ��ǥ: �Ǽ�
		 *
		 */

	}

}
