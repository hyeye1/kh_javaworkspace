package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		//desktop��ü����
		//pName, pCode, brand, price, allinone
		Desktop d = new Desktop("�Ｚ����ũž", "d-01", "�Ｚ", 2000000, true);
		//tv��ü����
		//pName, pCode, brand, price, inch
		Tv t = new Tv("�÷���Ƽ��", "t-01", "LG", 3500000, 60);
		
		//smartphone��ü����
		//pName, pCode, brand, price, mobileAgency
		SmartPhone s = new SmartPhone("������", "s0-01", "����", 1500000, "kt");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		/*
		 * ���
		 * 
		 * �� Ŭ������ �������� �ʵ�� �޼ҵ���� �����Ѵ�.
		 * 1. �ڵ��ߺ�����
		 * 2. ���������� ���� : �� Ŭ������ ã�ư��� �����������ʾƵ���
		 * 
		 * ���(�θ�-�ڽ�)����� �����ؼ� �����Ŵ.
		 * -> �������� �ʵ�� �������� �޼ҵ带 �θ�Ŭ������ ���Ǹ� �صΰ�
		 * => �� Ŭ�����鸶�� ���� �ʿ��� �ʵ��θ� �ڽĤ�Ŭ������ �����س��´�.
		 * 
		 * 
		 */

	}

}
