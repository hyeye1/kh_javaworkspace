package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		// ��� Ŭ������ object�� ��ӹް� �ִ�.
		// ��, �ֻ��� Ŭ������ �׻� Object
		// == Object�� �ִ� �޼ҵ���� �� ���� �� �� ����
		// == ���� �ȵ�� �����ǵ� ������! (�������̵�)
		
		Book bk1 = new Book("������ ����", "������", 10000);
		Book bk2 = new Book("������ ����", "������", 10000);
		
		System.out.println(bk1==bk2); //false ���빰�� ���� �� ������ �ּҰ��� �ٸ���. �ܼ��� == �񱳴� �ּҰ��� �ֳ�? �׳� bk1�� ����غ��� �ּҰ��̳���
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode()); // �� �ؽ��ڵ��� �޼ҵ�� ��Ŭ������ �θ��� Object�޼ҵ忡 ���� -> ���콺 ������ ��� �ּҳ��� java.lang.Objec.hashCode()
		//��¹��ȿ� � ���۷����� ����ϰ��� �� �� jvm�� �ڵ�����
		// �ش� ���۷��� .toString() �޼ҵ带 ȣ���� -> information() ��� �޼ҵ� ����
		System.out.println(bk1.toString());
		// vo Ŭ�������� �ۼ��ؾߵɰ�
		//�ʵ�� �⺻������ �Ű����������� setter getter toString.
	}

}
